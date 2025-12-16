package com.google.android.play.core.assetpacks;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public class AssetPackException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    public AssetPackException(@HY0.a int i12) {
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i12);
        HashMap map = HY0.e.f7274a;
        Integer numValueOf2 = Integer.valueOf(i12);
        super(new Status(i12, String.format(locale, "Asset Pack Download Error(%d): %s", numValueOf, !map.containsKey(numValueOf2) ? "" : androidx.media3.exoplayer.analytics.m.l((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#", (String) HY0.e.f7275b.get(numValueOf2), ")")), null, null));
        if (i12 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
