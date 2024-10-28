IMAGE_FEATURES = " ssh-server-openssh debug-tweaks"

IMAGE_INSTALL = "packagegroup-core-boot \
		 ${CORE_IMAGE_EXTRA_INSTALL} \
		 kernel-modules \
		 linux-firmware \
		 glmark2 \
		 packagegroup-browser \
"

IMAGE_LINGUAS = " "

inherit core-image
