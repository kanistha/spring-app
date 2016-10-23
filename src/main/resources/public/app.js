'use strict';
var app = angular.module('myApp', ['ngRoute'])
    .config(function($routeProvider) {
        $routeProvider.when('/home', {
            controller : 'home',
            templateUrl : '/public/home.html'
        }).otherwise({
            controller : '',
            templateUrl: '/static/index.html'
        })
    })
