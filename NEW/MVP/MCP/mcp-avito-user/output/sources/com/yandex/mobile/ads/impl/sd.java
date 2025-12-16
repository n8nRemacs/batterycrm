package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class sd implements p6 {
    @Override // com.yandex.mobile.ads.impl.p6
    public final boolean a(@Y61.k Context context, @Y61.k SizeInfo sizeInfo) {
        return sizeInfo.c(context) >= 0 && sizeInfo.a(context) >= 0;
    }
}
