pipeline {
    agent any
    tools {
        maven 'maven-3.6.6'
    }
    stages {
        stage('build') {
            steps {
                echo 'building the application...'
                sh "maven install"
            }
        }
        stage('test') {
            steps {
                echo 'testing the application...'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploying the application...'
            }
        }
    }
}