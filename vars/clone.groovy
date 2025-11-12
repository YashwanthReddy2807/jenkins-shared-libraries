def call(String url,String branch){
  echo "this is cloning the code"
                sh "whoami"
                git url: "${url}" ,branch: "${branch}"
                echo "code clone sucessfully"
                
            }
