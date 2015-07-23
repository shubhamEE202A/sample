SUMMARY = "A development image with Qt embedded and some Syntro apps"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require console-image.bb

PR = "0"

BLUETOOTH_TOOLS = " \
    bluez5 \
 "

FORTRAN_TOOLS = " \
    gfortran \
    gfortran-symlinks \
    libgfortran \
    libgfortran-dev \
 "

QT_TOOLS = " \
    qt4-embedded \
    qt4-embedded-dev\
    qt4-embedded-plugin-mousedriver-tslib \
    tstracker \
 "

SYNTRO = " \
    syntrocore \
    syntrocore-dev \
    syntrolcam \
    syntrolcam-init \
 "

TS_TOOLS = " \
    tslib-calibrate \
    tslib-conf \
    tslib-tests \
 "

IMAGE_INSTALL += " \
    ${BLUETOOTH_TOOLS} \
    ${QT_TOOLS} \
    ${SYNTRO} \
    ${TS_TOOLS} \
    psplash \
    ${FORTRAN_TOOLS} \
 "

export IMAGE_BASENAME = "my-image"

