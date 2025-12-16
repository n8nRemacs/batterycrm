package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class c60 {
    @j.I
    public static int a(@Y61.k x50 x50Var) {
        int iOrdinal = x50Var.ordinal();
        if (iOrdinal == 0) {
            return R.layout.monetization_ads_internal_instream_skin_v1;
        }
        if (iOrdinal == 1) {
            return R.layout.monetization_ads_internal_instream_skin_v2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
