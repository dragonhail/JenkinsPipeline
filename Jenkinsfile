pipeline{
    agent any
    stages{
        stage("permission"){
            steps{
                sh "chmod +x ./gradlew"
            }
        }
        stage("Compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
        stage("Test"){
            steps{
                sh "./gradlew test"
            }
        }
        stage("Test Coverage"){
            steps{
                sh "./gradlew test jacocoTestCoverageVerification"
                sh "./gradlew test jacocoTestReport"
            }
        }
        stage("Docker Build"){
            steps{
                sh "docker build -t jenkinspipeline ."
            }
        }
    }
}