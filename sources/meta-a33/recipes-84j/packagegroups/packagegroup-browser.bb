DESCRIPTION = "Qt5 browser Packagegroup"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

DISTRO_FEATURES:append = " opengl x11"

RDEPENDS:${PN} = "\
	tslib \
	tslib-conf \
	tslib-tests \
	tslib-calibrate \
	chromium-x11 \
	packagegroup-core-x11-base \
	packagegroup-core-x11 \
	xserver-xorg \
	xserver-xorg-utils \
	xserver-xorg-extension-glx \
	xserver-xorg-module-libwfb \
	xserver-xorg-module-exa \
	xf86-video-modesetting \
	xf86-input-evdev \
	twm \
        xterm \
        xclock \
	libgles2-mesa  \
	mesa-megadriver \
	mesa \
"
