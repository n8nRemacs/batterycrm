package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: CpxPromoGeoReducer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p {
    public static final double a(String str) {
        Double dW02;
        if (str == null || (dW02 = C43066x.w0(C43066x.a0(str, ",", ".", false))) == null) {
            return 0.0d;
        }
        return dW02.doubleValue();
    }

    public static final long b(String str) {
        Long lZ02;
        if (str == null || (lZ02 = C43066x.z0(str)) == null) {
            return 0L;
        }
        return lZ02.longValue();
    }

    public static final boolean c(@Y61.k String str) {
        return new C43059p(",|[.]").a(str);
    }
}
