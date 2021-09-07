# ShowMe-SrinathDev

Step 1. Add the JitPack repository to your build file

/****** In gradle project level ******/

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

/****** In gradle app level ******/

dependencies {
	        implementation 'com.github.srinath-Dev:ShowMe-SrinathDev:1.0'
	}
