mkdir ./mipmap-mdpi
convert -scale  48 ./key.svg ./mipmap-mdpi/key.png

mkdir ./mipmap-hdpi
convert -scale  72 ./key.svg ./mipmap-hdpi/key.png

mkdir ./mipmap-xhdpi
convert -scale  96 ./key.svg ./mipmap-xhdpi/key.png

mkdir ./mipmap-xxhdpi
convert -scale 144 ./key.svg ./mipmap-xxhdpi/key.png

mkdir ./mipmap-xxxhdpi
convert -scale 192 ./key.svg ./mipmap-xxxhdpi/key.png

