package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;

/* loaded from: classes8.dex */
public final class r3 {
    @Y61.k
    public static AdInfo a(@Y61.k Context context, @Y61.k AdResponse adResponse, @Y61.k n2 n2Var) {
        String strO = adResponse.o();
        if (strO == null && (strO = n2Var.c()) == null) {
            strO = "";
        }
        SizeInfo sizeInfoF = adResponse.F();
        if (sizeInfoF.e() == 0 || sizeInfoF.c() == 0) {
            sizeInfoF = null;
        }
        return new AdInfo(strO, sizeInfoF != null ? new AdSize(sizeInfoF.c(context), sizeInfoF.a(context)) : null);
    }
}
