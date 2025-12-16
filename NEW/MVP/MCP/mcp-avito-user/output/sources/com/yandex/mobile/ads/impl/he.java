package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

@X41.i
/* loaded from: classes8.dex */
public final class he {
    @Y61.l
    public static final SizeInfo a(@Y61.k com.yandex.mobile.ads.banner.f fVar) {
        SizeInfo sizeInfoF;
        AdResponse<String> adResponseG = fVar.g();
        if (adResponseG != null && (sizeInfoF = adResponseG.F()) != null) {
            if (sizeInfoF.e() == 0 && sizeInfoF.c() == 0) {
                sizeInfoF = null;
            }
            if (sizeInfoF != null) {
                return sizeInfoF;
            }
        }
        return fVar.i();
    }
}
