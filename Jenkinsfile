pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
                   steps {
                        withMaven(maven : 'mvn-3-5-0') {
                            bat 'mvn clean compile'
                        }
                    }
                }

        stage ('Unit testing Stage') {
                   steps {
                        withMaven(maven : 'mvn-3-5-0') {
                            bat 'mvn test'
                        }
                    }
                }

        stage ('Deployment Stage') {
                   steps {
                        withMaven(maven : 'mvn-3-5-0') {
                            bat 'mvn clean'
                        }
                    }
                }

    }
}