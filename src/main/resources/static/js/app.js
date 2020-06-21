var app=angular.module("GestMat",[]);
app.controller("Materiels",function($scope,$http){
	$scope.materiels=[];
	$scope.materiel={};
	$scope.listes = [];
	$scope.search=null;
	$scope.update=false;
	$scope.pageCourante="0";
	$scope.filtre=false;
	
	$scope.charger=function(){
		$scope.filtre=false;

		$http.get("/materielsParSearch?search="+$scope.search+"&page="+$scope.pageCourante)
		 .success(function(data){
			  $scope.materiels=data;
			  $scope.pages=new Array(data.totalPages)
		 });
	};
	$scope.listes = function() {
		$http.get("/listes").success(function(data) {
			$scope.listes = data;
			console.log("listes,", $scope.listes);
		});
		console.log("Données", $scope.listes);
	};
	$scope.gotoPage=function(p){
	if($scope.filtre==false){
		$scope.pageCourante=p;
		$scope.charger();
		
	}else{
		$scope.pageCourante=p;
	}
	};
	
	$scope.ajouter=function(m){
		console.log("update: ", $scope.update);
		if($scope.update){
			$http.post("/update", $scope.materiel)
			 .success(function(data){
				 $scope.charger();
				 console.log("modifier: ", $scope.update);
			 });
			$scope.update= false;
			$scope.materiel = {};
			$('#myModal').modal('hide')
		} else {
			$http.post("/ajout", $scope.materiel)
			 .success(function(data){
				$scope.charger();
				console.log("ajouter: ", $scope.ajouter);
			 });
			
			$scope.materiel = {};
			$('#myModal').modal('hide')
		};
	};
	
	$scope.supprimer = function() {
		// boucler sur materiels
		angular.forEach($scope.materiels.content, function(mat) {
			if (mat.isDelete) {
			  $http.get("/delete?id=" + mat.id)
				.success(function(data) {});
			  $scope.charger();
			}
		});

	};
	
	$scope.modifier=function(matModif){
		$scope.update= true;
		$scope.materiel= matModif;
	};
	
});