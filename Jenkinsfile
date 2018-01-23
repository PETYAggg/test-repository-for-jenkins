pipeline {
    agent any

    tools {
        maven 'mvn-3-5-0'

    }
    stages {
        stage ('Compile Stage') {
                   steps {
                            bat "sh mvn clean compile"
                    }
                }

        stage ('Unit testing Stage') {
                   steps {

                             bat( script: "sh mvn test")

                    }
                }

        stage ('Deployment Stage') {
                   steps {

                            bat( script: "sh mvn clean")

                    }
                }

    }
}