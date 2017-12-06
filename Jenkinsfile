
node {
    stage ('Hello'){
        echo 'Hello World'
    }
    
    stage('Branch') {
        
        def Branch = env.GIT_BRANCH //?: ''
        echo "${Branch}"
    }
    
    stage ('Preparation') {
        
        checkout scm
        //git credentialsId: '23d398e3-c473-4e62-b507-ad04f2952f50', url: 'git@github.com:mllk99/jenkins-workshop.git'
        //sh "git clone git@github.com:mllk99/jenkins-workshop.git"
    }
    
    stage('Build') {
        sh 'docker container run -i --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn clean package'
        archiveArtifacts 'target/gildedrose-*.jar'
    }
    
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts '**/target/surefire-reports/TEST-*.xml'
    }
    
    stage('Javadoc') {
        sh 'docker pull maven:3-jdk-8'
        sh 'docker container run -i --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn site'
        //archiveArtifacts 'target/javadoc/*' 
        archiveArtifacts 'target/gildedrose-*.jar'
        
    }
}
