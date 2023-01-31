pipeline {
    agent any 
    stages{
        stage("gradle build"){
            steps {
                withGradle() {
                    sh './gradlew clean build'
                }
            }
        }
    }
}