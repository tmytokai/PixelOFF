# PixelOFF

## Turn your Pixel3 off with one tap !

![screenshot](https://github.com/tmytokai/PixelOFF/blob/master/screenshot.png)

I bought Pixel3.

I like this phone, because it's very fast and smart.
But there is a problem: The power button is too stiff!

Then I looked for screen-off apps. But they needed an admin privilege.
Of course I didn't like it.

So I decided to make a screen-off app for my Pixel3.

## How to build

Instead of building, you could install [this apk](https://github.com/tmytokai/PixelOFF/raw/master/pixeloff.apk) **entirely at your own risk**.

1. git clone https://github.com/tmytokai/PixelOFF.git
1. Put your favorite icon image (SVG format) in [app/src/main/res/](https://github.com/tmytokai/PixelOFF/tree/master/app/src/main/res), rename it to key.svg, then run [mkicon.sh](https://github.com/tmytokai/PixelOFF/blob/master/app/src/main/res/mkicon.sh). For example I'm using [this free icon image](http://icooon-mono.com/11244-%E3%82%AB%E3%82%AE%E3%81%AE%E9%96%89%E3%81%98%E3%81%9F%E9%8C%A0%E3%81%AE%E3%82%A2%E3%82%A4%E3%82%B3%E3%83%B3%E7%B4%A0%E6%9D%90-2/).
1. Run Android Studio, and open the project.
1. Enable USB debugging mode on your phone.
1. Connect the phone to the PC.
1. Push the run button on Android Studio to install PixelOFF.
1. Disnable USB debugging mode on the phone.

## How to use

1. Open Settings > Accessibility > PixelOFF.
1. Turn "Use service" on.
1. Tap PixelOFF to turn the screen off.

