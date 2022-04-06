pipeline {
    agent any
    tools {
        maven 'maven-3.6.6'
    }
    stages {
        stage('build') {
            steps {
                echo 'building the application...'
                sh "mvn clean install"
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