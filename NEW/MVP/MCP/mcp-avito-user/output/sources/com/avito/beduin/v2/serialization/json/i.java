package com.avito.beduin.v2.serialization.json;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: PrimitiveFactory.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"json_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {
    public static final <T> T a(@k PU0.j jVar, boolean z12, @k h<T> hVar) throws NumberFormatException {
        String strD = jVar.d();
        if (!z12) {
            return hVar.b(strD);
        }
        if (jVar.b()) {
            return hVar.b(jVar.d());
        }
        if (L.f(strD, "true")) {
            return hVar.d(true);
        }
        if (L.f(strD, "false")) {
            return hVar.d(false);
        }
        double d12 = Double.parseDouble(strD);
        if (!C43066x.q(strD, ".", false)) {
            double d13 = d12 % 1.0d;
            if (d13 != 0.0d && Math.signum(d13) != Math.signum(1.0d)) {
                d13 += 1.0d;
            }
            if (d13 == 0.0d) {
                try {
                    return hVar.a(Long.parseLong(strD));
                } catch (NumberFormatException unused) {
                    return hVar.a((long) d12);
                }
            }
        }
        return hVar.c(d12);
    }
}
