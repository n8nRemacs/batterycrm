package org.threeten.bp;

import com.yandex.div2.D8;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49471c;

/* compiled from: ZoneId.java */
/* loaded from: classes8.dex */
class p extends AbstractC49471c {
    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422198a) {
            return null;
        }
        return (R) super.f(jVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return false;
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
    }
}
