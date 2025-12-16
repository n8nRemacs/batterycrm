package org.threeten.bp.chrono;

import androidx.compose.ui.platform.C22491k0;
import com.yandex.div2.D8;
import java.util.Comparator;
import org.threeten.bp.chrono.c;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49470b;

/* compiled from: ChronoZonedDateTime.java */
/* loaded from: classes8.dex */
public abstract class h<D extends c> extends AbstractC49470b implements org.threeten.bp.temporal.c, Comparable<h<?>> {

    /* compiled from: ChronoZonedDateTime.java */
    public class a implements Comparator<h<?>> {
        @Override // java.util.Comparator
        public final int compare(h<?> hVar, h<?> hVar2) {
            h<?> hVar3 = hVar;
            h<?> hVar4 = hVar2;
            int iA2 = w81.d.a(hVar3.t(), hVar4.t());
            return iA2 == 0 ? w81.d.a(hVar3.w().H(), hVar4.w().H()) : iA2;
        }
    }

    /* compiled from: ChronoZonedDateTime.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421868a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421868a = iArr;
            try {
                iArr[ChronoField.f422125G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421868a[ChronoField.f422126H.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a();
    }

    public abstract h<D> A(org.threeten.bp.o oVar);

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? (hVar == ChronoField.f422125G || hVar == ChronoField.f422126H) ? ((ChronoField) hVar).f422152d : v().b(hVar) : hVar.d(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        return (jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422201d) ? (R) q() : jVar == org.threeten.bp.temporal.i.f422199b ? (R) u().q() : jVar == org.threeten.bp.temporal.i.f422200c ? (R) ChronoUnit.NANOS : jVar == org.threeten.bp.temporal.i.f422202e ? (R) p() : jVar == org.threeten.bp.temporal.i.f422203f ? (R) org.threeten.bp.e.P(u().v()) : jVar == org.threeten.bp.temporal.i.f422204g ? (R) w() : (R) super.f(jVar);
    }

    public int hashCode() {
        return (v().hashCode() ^ p().f422109c) ^ Integer.rotateLeft(q().hashCode(), 3);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public int k(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return super.k(hVar);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? v().k(hVar) : p().f422109c;
        }
        throw new UnsupportedTemporalTypeException(D8.p("Field too large for an int: ", hVar));
    }

    @Override // org.threeten.bp.temporal.d
    public long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        return iOrdinal != 28 ? iOrdinal != 29 ? v().m(hVar) : p().f422109c : t();
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h<?> hVar) {
        int iA2 = w81.d.a(t(), hVar.t());
        if (iA2 != 0) {
            return iA2;
        }
        int i12 = w().f422075e - hVar.w().f422075e;
        if (i12 != 0) {
            return i12;
        }
        int iCompareTo = v().compareTo(hVar.v());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = q().h().compareTo(hVar.q().h());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return u().q().l().compareTo(hVar.u().q().l());
    }

    public abstract org.threeten.bp.q p();

    public abstract org.threeten.bp.o q();

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public h i(long j12, ChronoUnit chronoUnit) {
        return u().q().f(super.i(j12, chronoUnit));
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract h<D> r(long j12, org.threeten.bp.temporal.k kVar);

    public final long t() {
        return ((u().v() * 86400) + w().J()) - p().f422109c;
    }

    public String toString() {
        String str = v().toString() + p().f422110d;
        if (p() == q()) {
            return str;
        }
        StringBuilder sbB = C22491k0.b(str, '[');
        sbB.append(q().toString());
        sbB.append(']');
        return sbB.toString();
    }

    public D u() {
        return (D) v().u();
    }

    public abstract d<D> v();

    public org.threeten.bp.g w() {
        return v().v();
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract h w(long j12, org.threeten.bp.temporal.h hVar);

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public h<D> x(org.threeten.bp.temporal.e eVar) {
        return u().q().f(eVar.a(this));
    }
}
