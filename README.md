LinkPreview
### This Library will give you details about a URL for example - Title , Image , Description

![image](https://user-images.githubusercontent.com/82146140/141681373-f083e3bf-56f5-443c-ab97-3c2f62f3cd10.png)



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

