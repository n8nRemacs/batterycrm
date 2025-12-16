package com.yandex.mobile.ads.impl;

import android.content.res.TypedArray;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class ii1 {
    @j.P
    public static int a(@j.N TypedArray typedArray) {
        int i12 = typedArray.getInt(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_scale_type, -1);
        int[] iArrB = n6.b(3);
        if (i12 < 0 || i12 >= iArrB.length) {
            return 0;
        }
        return iArrB[i12];
    }
}
