package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class P {
    public static boolean a(@HY0.b int i12) {
        return i12 == 2 || i12 == 7 || i12 == 3;
    }

    public static boolean b(@HY0.b int i12, @HY0.b int i13) {
        if (i12 == 5) {
            if (i13 != 5) {
                return true;
            }
            i12 = 5;
        }
        if (i12 == 6) {
            if (i13 != 6 && i13 != 5) {
                return true;
            }
            i12 = 6;
        }
        if (i12 == 4 && i13 != 4) {
            return true;
        }
        if (i12 == 3 && (i13 == 2 || i13 == 7 || i13 == 1 || i13 == 8)) {
            return true;
        }
        if (i12 == 2) {
            return i13 == 1 || i13 == 8;
        }
        return false;
    }
}
