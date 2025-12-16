package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class o41 {
    @X41.n
    public static final boolean a(@Y61.k Context context, @Y61.k AdResponse<?> adResponse, @Y61.k SizeInfo sizeInfo, @Y61.k p6 p6Var, @Y61.k SizeInfo sizeInfo2) {
        return adResponse.G() || (p6Var.a(context, sizeInfo) && i7.a(context, sizeInfo, sizeInfo2));
    }
}
