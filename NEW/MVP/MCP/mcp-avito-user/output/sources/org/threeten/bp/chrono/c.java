package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import w81.AbstractC49470b;

/* compiled from: ChronoLocalDate.java */
/* loaded from: classes8.dex */
public abstract class c extends AbstractC49470b implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<c> {

    /* compiled from: ChronoLocalDate.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return w81.d.a(cVar.v(), cVar2.v());
        }
    }

    static {
        new a();
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(v(), ChronoField.f422148y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422199b) {
            return (R) q();
        }
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.DAYS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f) {
            return (R) org.threeten.bp.e.P(v());
        }
        if (jVar == org.threeten.bp.temporal.i.f422204g || jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422202e) {
            return null;
        }
        return (R) super.f(jVar);
    }

    public int hashCode() {
        long jV2 = v();
        return ((int) (jV2 ^ (jV2 >>> 32))) ^ q().hashCode();
    }

    @Override // org.threeten.bp.temporal.d
    public boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).e() : hVar != null && hVar.b(this);
    }

    public d<?> o(org.threeten.bp.g gVar) {
        return new e(this, gVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iA2 = w81.d.a(v(), cVar.v());
        if (iA2 != 0) {
            return iA2;
        }
        return q().l().compareTo(cVar.q().l());
    }

    public abstract j q();

    public l r() {
        return q().h(k(ChronoField.f422124F));
    }

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public c i(long j12, org.threeten.bp.temporal.k kVar) {
        return q().d(super.i(j12, kVar));
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract c r(long j12, org.threeten.bp.temporal.k kVar);

    public String toString() {
        long jM2 = m(ChronoField.f422122D);
        long jM3 = m(ChronoField.f422120B);
        long jM4 = m(ChronoField.f422146w);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(q().l());
        sb2.append(" ");
        sb2.append(r());
        sb2.append(" ");
        sb2.append(jM2);
        sb2.append(jM3 < 10 ? "-0" : "-");
        sb2.append(jM3);
        sb2.append(jM4 < 10 ? "-0" : "-");
        sb2.append(jM4);
        return sb2.toString();
    }

    public c u(org.threeten.bp.temporal.g gVar) {
        return q().d(gVar.a(this));
    }

    public long v() {
        return m(ChronoField.f422148y);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract c w(long j12, org.threeten.bp.temporal.h hVar);

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public c x(org.threeten.bp.temporal.e eVar) {
        return q().d(eVar.a(this));
    }
}
