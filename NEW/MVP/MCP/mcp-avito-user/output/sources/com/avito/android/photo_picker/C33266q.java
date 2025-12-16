package com.avito.android.photo_picker;

import com.avito.android.photo_picker.FlashMode;
import kotlin.Metadata;

/* compiled from: FlashMode.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_photo-camera-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33266q {
    @Y61.l
    public static final FlashMode a(@Y61.k String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3551) {
            if (iHashCode != 109935) {
                if (iHashCode == 3005871 && str.equals("auto")) {
                    return FlashMode.Auto.f218747c;
                }
            } else if (str.equals("off")) {
                return FlashMode.Off.f218749c;
            }
        } else if (str.equals("on")) {
            return FlashMode.ForceOn.f218748c;
        }
        return null;
    }
}
