package org.threeten.bp.chrono;

import com.yandex.div2.D8;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: JapaneseDate.java */
/* loaded from: classes8.dex */
public final class q extends b<q> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final org.threeten.bp.e f421912e = org.threeten.bp.e.N(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: b, reason: collision with root package name */
    public final org.threeten.bp.e f421913b;

    /* renamed from: c, reason: collision with root package name */
    public transient r f421914c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f421915d;

    /* compiled from: JapaneseDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421916a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421916a = iArr;
            try {
                iArr[ChronoField.f422147x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421916a[ChronoField.f422122D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421916a[ChronoField.f422144u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421916a[ChronoField.f422145v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421916a[ChronoField.f422149z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421916a[ChronoField.f422119A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421916a[ChronoField.f422124F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public q(org.threeten.bp.e eVar) {
        if (eVar.G(f421912e)) {
            throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
        }
        this.f421914c = r.p(eVar);
        this.f421915d = eVar.f421941b - (r0.f421920c.f421941b - 1);
        this.f421913b = eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        org.threeten.bp.e eVar = this.f421913b;
        this.f421914c = r.p(eVar);
        this.f421915d = eVar.f421941b - (r0.f421920c.f421941b - 1);
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    @Override // org.threeten.bp.chrono.b
    public final b A(long j12) {
        return G(this.f421913b.S(j12));
    }

    @Override // org.threeten.bp.chrono.b
    public final b B(long j12) {
        return G(this.f421913b.T(j12));
    }

    @Override // org.threeten.bp.chrono.b
    public final b C(long j12) {
        return G(this.f421913b.V(j12));
    }

    public final org.threeten.bp.temporal.l E(int i12) {
        Calendar calendar = Calendar.getInstance(p.f421909d);
        calendar.set(0, this.f421914c.f421919b + 2);
        calendar.set(this.f421915d, r2.f421942c - 1, this.f421913b.f421943d);
        return org.threeten.bp.temporal.l.d(calendar.getActualMinimum(i12), calendar.getActualMaximum(i12));
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final q w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (q) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        if (m(chronoField) == j12) {
            return this;
        }
        int iOrdinal = chronoField.ordinal();
        org.threeten.bp.e eVar = this.f421913b;
        if (iOrdinal == 19 || iOrdinal == 25 || iOrdinal == 27) {
            int iA2 = p.f421910e.r(chronoField).a(j12, chronoField);
            int iOrdinal2 = chronoField.ordinal();
            if (iOrdinal2 == 19) {
                return G(eVar.S(iA2 - (this.f421915d == 1 ? (eVar.F() - this.f421914c.f421920c.F()) + 1 : eVar.F())));
            }
            if (iOrdinal2 == 25) {
                return H(this.f421914c, iA2);
            }
            if (iOrdinal2 == 27) {
                return H(r.q(iA2), this.f421915d);
            }
        }
        return G(eVar.c(j12, hVar));
    }

    public final q G(org.threeten.bp.e eVar) {
        return eVar.equals(this.f421913b) ? this : new q(eVar);
    }

    public final q H(r rVar, int i12) {
        p.f421910e.getClass();
        if (rVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i13 = (rVar.f421920c.f421941b + i12) - 1;
        org.threeten.bp.temporal.l.d(1L, (rVar.o().f421941b - r0.f421941b) + 1).b(i12, ChronoField.f422122D);
        return G(this.f421913b.Z(i13));
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.d(this);
        }
        if (!l(hVar)) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        ChronoField chronoField = (ChronoField) hVar;
        int iOrdinal = chronoField.ordinal();
        return iOrdinal != 19 ? iOrdinal != 25 ? p.f421910e.r(chronoField) : E(1) : E(6);
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(org.threeten.bp.e eVar) {
        return (q) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f421913b.equals(((q) obj).f421913b);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.c
    public final int hashCode() {
        p.f421910e.getClass();
        return this.f421913b.hashCode() ^ (-688086063);
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (q) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422144u || hVar == ChronoField.f422145v || hVar == ChronoField.f422149z || hVar == ChronoField.f422119A) {
            return false;
        }
        return super.l(hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        if (iOrdinal != 16 && iOrdinal != 17) {
            org.threeten.bp.e eVar = this.f421913b;
            if (iOrdinal == 19) {
                return this.f421915d == 1 ? (eVar.F() - this.f421914c.f421920c.F()) + 1 : eVar.F();
            }
            if (iOrdinal == 25) {
                return this.f421915d;
            }
            if (iOrdinal == 27) {
                return this.f421914c.f421919b;
            }
            if (iOrdinal != 21 && iOrdinal != 22) {
                return eVar.m(hVar);
            }
        }
        throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.c
    /* renamed from: n */
    public final org.threeten.bp.temporal.c r(long j12, org.threeten.bp.temporal.k kVar) {
        return (q) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<q> o(org.threeten.bp.g gVar) {
        return new e(this, gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final j q() {
        return p.f421910e;
    }

    @Override // org.threeten.bp.chrono.c
    public final l r() {
        return this.f421914c;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: s */
    public final c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (q) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    /* renamed from: t */
    public final c r(long j12, org.threeten.bp.temporal.k kVar) {
        return (q) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final c u(org.threeten.bp.temporal.g gVar) {
        return (q) super.u(gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final long v() {
        return this.f421913b.v();
    }

    @Override // org.threeten.bp.chrono.c
    public final c x(org.threeten.bp.temporal.e eVar) {
        return (q) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: z */
    public final b r(long j12, org.threeten.bp.temporal.k kVar) {
        return (q) super.r(j12, kVar);
    }
}
