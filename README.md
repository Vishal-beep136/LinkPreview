## LinkPreview [![](https://jitpack.io/v/Vishal-beep136/LinkPreview.svg)](https://jitpack.io/#Vishal-beep136/LinkPreview)

This Library will give you details about a URL for example - Title , Image , Description

![image](https://user-images.githubusercontent.com/82146140/141681373-f083e3bf-56f5-443c-ab97-3c2f62f3cd10.png)

*******************
## Setup

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency

```
implementation 'com.github.Vishal-beep136:LinkPreview:1.0.0'
```




*******************

## Usage
        LinkPrev.getUrlDetails("https://www.youtube.com/watch?v=kJQP7kiw5Fk",
                new LinkPrev.ResultListener() {
                    @Override
                    public void onResultSuccess(Data urlData) {
                        Glide.with(MainActivity.this)
                                .load(urlData.getImageUrl())
                                .into(binding.image);

                        binding.title.setText(urlData.getTitle());
                    }

                    @Override
                    public void onResultFailed(Throwable e) {
                        Log.d("Vishal", "onResultFailed: Error While" + e.getMessage());
                    }
                });



## Output

<img src="https://user-images.githubusercontent.com/82146140/141681373-f083e3bf-56f5-443c-ab97-3c2f62f3cd10.png" width="400px" height="700px">

