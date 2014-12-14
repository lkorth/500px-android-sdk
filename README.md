500px-android-sdk
=================


Installation
------------

1. Clone the repository into your app's directory
    ```bash
    git clone https://github.com/500px/500px-android-sdk.git
    ```

2. Add it as a dependency in your `build.gradle`
    ```groovy
    dependencies {
        compile project(':500px-android-sdk')
    }
    ```

3. Include module in top level `settings.gradle`
    ```groovy
    include ':500px-android-sdk'
    ```

Usage
-----
### User name and password

[Login Activity](https://gist.github.com/3625085) example.

### Browser based OAuth

Start `FiveHundredPxOAuthActivity` with your consumer key and consumer secret

```java
Intent intent = new Intent(this, FiveHundredPxOAuthActivity.class)
        .putExtra(FiveHundredPxOAuthActivity.CONSUMER_KEY, CONSUMER_KEY)
        .putExtra(FiveHundredPxOAuthActivity.CONSUMER_SECRET, CONSUMER_SECRET);
startActivityForResult(intent, FIVE_HUNDRED_PX_REQUEST_CODE);
```

The `AccessToken` will be returned to your `Activity` in `Activity#onActivityResult`
after the user authorizes your app

```java
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == FIVE_HUNDRED_PX_REQUEST_CODE) {
        if (resultCode == Activity.RESULT_OK) {
            AccessToken accessToken = data.getParcelableExtra(FiveHundredPxOAuthActivity.ACCESS_TOKEN);
        }
    }
}
```

Examples
--------
[TroubledPixels](https://github.com/arthurnn/TroubledPixels)
