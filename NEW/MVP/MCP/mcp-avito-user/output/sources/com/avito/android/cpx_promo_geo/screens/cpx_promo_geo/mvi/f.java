package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ts.C48709c;

/* compiled from: CpxPromoGeoActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final C48709c.y a(@Y61.l List<C48709c.y> list, @Y61.l Float f12) {
        Object next;
        C48709c.y yVar = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.b(((C48709c.y) next).f439596a, f12)) {
                    break;
                }
            }
            C48709c.y yVar2 = (C48709c.y) next;
            if (yVar2 != null) {
                return yVar2;
            }
        }
        float fB2 = kotlin.math.b.b((f12 != null ? f12.floatValue() : 0.0f) * 100) / 100.0f;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((C48709c.y) next2).f439596a == fB2) {
                    yVar = next2;
                    break;
                }
            }
            yVar = yVar;
        }
        return yVar;
    }
}
