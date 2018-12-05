var app = angular.module('brands', [])

app.controller("BrandsController", function ($scope, $http) {

    $scope.getBrands = function () {
        $http.get('/brands').success(function (data, status, headers, config) {
            $scope.brandsList = data;
        })
    };

    $scope.delete = function (id) {
        $http.delete('/brands/delete/' + id).success(function (data, status, headers, config) {
            for (var i = 0; i < $scope.brandsList.length; i++){
                var j = $scope.brandsList[i];
                if (j.id === id){
                    $scope.brandsList.splice(i, 1);
                    break;
                }
            }
        })
    }

    $scope.addBrand = function () {
        $http.post('/brands/add/' + $scope.name).success(function (data, status, headers,config) {
            $scope.brandsList.splice(0, 0, data);
        }).error(function (data, status, headers, config) {
            console.error(status, data, headers);
        });
    }
});