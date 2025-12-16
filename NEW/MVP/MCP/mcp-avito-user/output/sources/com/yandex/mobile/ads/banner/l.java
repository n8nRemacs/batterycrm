package com.yandex.mobile.ads.banner;

import X41.n;
import android.content.Context;
import com.yandex.mobile.ads.impl.ae;
import com.yandex.mobile.ads.impl.ge;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.v11;

/* loaded from: classes8.dex */
public final class l {
    @n
    @Y61.k
    public static final BannerAdSize a(@Y61.k Context context, int i12) {
        v11 v11VarA = q21.b().a(context);
        ge geVarA = ge.a.a(v11VarA != null ? v11VarA.e() : null);
        if (geVarA == null) {
            geVarA = ge.f385727b;
        }
        return new BannerAdSize(i12, ae.a(geVarA).a(context, i12), 4);
    }
}
