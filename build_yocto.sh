#!/bin/sh

set -e

CONFIG_PATH="configs/poky-l19v2-mender.yml"
if [ ! -z "$1" ];then
	kas shell "${CONFIG_PATH}" -c "$1"
else
	kas build "${CONFIG_PATH}"
fi
