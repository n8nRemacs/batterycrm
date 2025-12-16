package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.chrono.c;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import w81.AbstractC49470b;

/* compiled from: ChronoLocalDateTime.java */
/* loaded from: classes8.dex */
public abstract class d<D extends c> extends AbstractC49470b implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<d<?>> {

    /* compiled from: ChronoLocalDateTime.java */
    public class a implements Comparator<d<?>> {
        @Override // java.util.Comparator
        public final int compare(d<?> dVar, d<?> dVar2) {
            d<?> dVar3 = dVar;
            d<?> dVar4 = dVar2;
            int iA2 = w81.d.a(dVar3.u().v(), dVar4.u().v());
            return iA2 == 0 ? w81.d.a(dVar3.v().H(), dVar4.v().H()) : iA2;
        }
    }

    static {
        new a();
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(u().v(), ChronoField.f422148y).w(v().H(), ChronoField.f422129f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && compareTo((d) obj) == 0;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422199b) {
            return (R) u().q();
        }
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.NANOS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f) {
            return (R) org.threeten.bp.e.P(u().v());
        }
        if (jVar == org.threeten.bp.temporal.i.f422204g) {
            return (R) v();
        }
        if (jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422202e) {
            return null;
        }
        return (R) super.f(jVar);
    }

    public int hashCode() {
        return u().hashCode() ^ v().hashCode();
    }

    public abstract h<D> o(org.threeten.bp.o oVar);

    @Override // java.lang.Comparable
    /* renamed from: p */
    public int compareTo(d<?> dVar) {
        int iCompareTo = u().compareTo(dVar.u());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = v().compareTo(dVar.v());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return u().q().l().compareTo(dVar.u().q().l());
    }

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public d i(long j12, ChronoUnit chronoUnit) {
        return u().q().e(super.i(j12, chronoUnit));
    }

    @Override // org.threeten.bp.temporal.c
    public abstract d<D> r(long j12, org.threeten.bp.temporal.k kVar);

    public final long s(org.threeten.bp.q qVar) {
        w81.d.f(qVar, "offset");
        return ((u().v() * 86400) + v().J()) - qVar.f422109c;
    }

    public final org.threeten.bp.d t(org.threeten.bp.q qVar) {
        return org.threeten.bp.d.q(s(qVar), v().f422075e);
    }

    public String toString() {
        return u().toString() + 'T' + v().toString();
    }

    public abstract D u();

    public abstract org.threeten.bp.g v();

    @Override // org.threeten.bp.temporal.c
    public abstract d w(long j12, org.threeten.bp.temporal.h hVar);

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    public d x(org.threeten.bp.e eVar) {
        return u().q().e(eVar.a(this));
    }
}
