'use strict';
app.controller('home', function ($scope, $http) {
        console.log('inside controller');
        $http.get('/user/').then(function (response) {
            //http://rest-service.guides.spring.io/greeting
            $scope.greeting = response.data;
        });
        // $scope.greeting = 'Hmmmmmmmmmmmmmmmmmmm';
    });
