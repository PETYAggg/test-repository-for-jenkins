pipeline {
    agent any

    tools {
        maven 'mvn-3-5-0'

    }
    stages {
        stage ('Compile Stage') {
                   steps {
                            bat "mvn clean compile"
                    }
                }

        stage ('Unit testing Stage') {
                   steps {

                             bat "mvn test"

                    }
                }

        stage ('Integration testing Stage') {
                   steps {

                            bat "mvn clean install"

                    }
                }

        stage ('Deployment Stage') {
                           steps {

                                    bat "mvn clean"

                            }
                        }
    }
}