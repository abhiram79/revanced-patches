package app.revanced.extension.youtube.patches.video;

import app.revanced.extension.youtube.settings.Settings;

@SuppressWarnings("unused")
public class SpoofDeviceDimensionsPatch {
    private static final boolean SPOOF = Settings.SPOOF_DEVICE_DIMENSIONS.get();

    public static int getMinHeightOrWidth(int minHeightOrWidth) {
        return SPOOF ? 64 : minHeightOrWidth;
    }

    public static int getMaxHeightOrWidth(int maxHeightOrWidth) {
        return SPOOF ? 4096 : maxHeightOrWidth;
    }
}
