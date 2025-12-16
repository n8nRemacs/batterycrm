package org.threeten.bp;

import com.yandex.div2.D8;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Comparator;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import w81.AbstractC49470b;

/* compiled from: OffsetDateTime.java */
/* loaded from: classes8.dex */
public final class i extends AbstractC49470b implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<i>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f422082d = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: b, reason: collision with root package name */
    public final f f422083b;

    /* renamed from: c, reason: collision with root package name */
    public final q f422084c;

    /* compiled from: OffsetDateTime.java */
    public class a implements org.threeten.bp.temporal.j<i> {
        @Override // org.threeten.bp.temporal.j
        public final i a(org.threeten.bp.temporal.d dVar) {
            return i.o(dVar);
        }
    }

    /* compiled from: OffsetDateTime.java */
    public class b implements Comparator<i> {
        @Override // java.util.Comparator
        public final int compare(i iVar, i iVar2) {
            i iVar3 = iVar;
            i iVar4 = iVar2;
            int iA2 = w81.d.a(iVar3.f422083b.s(iVar3.f422084c), iVar4.f422083b.s(iVar4.f422084c));
            return iA2 == 0 ? w81.d.a(iVar3.f422083b.f421949c.f422075e, iVar4.f422083b.f421949c.f422075e) : iA2;
        }
    }

    /* compiled from: OffsetDateTime.java */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422085a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f422085a = iArr;
            try {
                iArr[ChronoField.f422125G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422085a[ChronoField.f422126H.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        f fVar = f.f421946d;
        q qVar = q.f422108i;
        fVar.getClass();
        new i(fVar, qVar);
        f fVar2 = f.f421947e;
        q qVar2 = q.f422107h;
        fVar2.getClass();
        new i(fVar2, qVar2);
        new a();
        new b();
    }

    public i(f fVar, q qVar) {
        w81.d.f(fVar, "dateTime");
        this.f422083b = fVar;
        w81.d.f(qVar, "offset");
        this.f422084c = qVar;
    }

    public static i o(org.threeten.bp.temporal.d dVar) {
        if (dVar instanceof i) {
            return (i) dVar;
        }
        try {
            q qVarT = q.t(dVar);
            try {
                return new i(f.B(dVar), qVarT);
            } catch (DateTimeException unused) {
                return p(d.p(dVar), qVarT);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
        }
    }

    public static i p(d dVar, o oVar) {
        w81.d.f(dVar, "instant");
        w81.d.f(oVar, "zone");
        q qVarA = oVar.o().a(dVar);
        return new i(f.H(dVar.f421935b, dVar.f421936c, qVarA), qVarA);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 69, this);
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        ChronoField chronoField = ChronoField.f422148y;
        f fVar = this.f422083b;
        return cVar.w(fVar.f421948b.v(), chronoField).w(fVar.f421949c.H(), ChronoField.f422129f).w(this.f422084c.f422109c, ChronoField.f422126H);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? (hVar == ChronoField.f422125G || hVar == ChronoField.f422126H) ? ((ChronoField) hVar).f422152d : this.f422083b.b(hVar) : hVar.d(this);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: c */
    public final org.threeten.bp.temporal.c w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (i) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        int iOrdinal = chronoField.ordinal();
        f fVar = this.f422083b;
        q qVar = this.f422084c;
        return iOrdinal != 28 ? iOrdinal != 29 ? r(fVar.c(j12, hVar), qVar) : r(fVar, q.w(chronoField.f422152d.a(j12, chronoField))) : p(d.q(j12, fVar.f421949c.f422075e), qVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        i iVar2 = iVar;
        q qVar = iVar2.f422084c;
        q qVar2 = this.f422084c;
        boolean zEquals = qVar2.equals(qVar);
        f fVar = iVar2.f422083b;
        f fVar2 = this.f422083b;
        if (zEquals) {
            return fVar2.compareTo(fVar);
        }
        int iA2 = w81.d.a(fVar2.s(qVar2), fVar.s(iVar2.f422084c));
        if (iA2 != 0) {
            return iA2;
        }
        int i12 = fVar2.f421949c.f422075e - fVar.f421949c.f422075e;
        return i12 == 0 ? fVar2.compareTo(fVar) : i12;
    }

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(e eVar) {
        return r(this.f422083b.e(eVar), this.f422084c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f422083b.equals(iVar.f422083b) && this.f422084c.equals(iVar.f422084c);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422199b) {
            return (R) org.threeten.bp.chrono.o.f421908d;
        }
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.NANOS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422202e || jVar == org.threeten.bp.temporal.i.f422201d) {
            return (R) this.f422084c;
        }
        org.threeten.bp.temporal.j<e> jVar2 = org.threeten.bp.temporal.i.f422203f;
        f fVar = this.f422083b;
        if (jVar == jVar2) {
            return (R) fVar.f421948b;
        }
        if (jVar == org.threeten.bp.temporal.i.f422204g) {
            return (R) fVar.f421949c;
        }
        if (jVar == org.threeten.bp.temporal.i.f422198a) {
            return null;
        }
        return (R) super.f(jVar);
    }

    public final int hashCode() {
        return this.f422083b.hashCode() ^ this.f422084c.f422109c;
    }

    @Override // w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return j12 == Long.MIN_VALUE ? r(Long.MAX_VALUE, kVar).r(1L, kVar) : r(-j12, kVar);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return super.k(hVar);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.f422083b.k(hVar) : this.f422084c.f422109c;
        }
        throw new DateTimeException(D8.p("Field too large for an int: ", hVar));
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return (hVar instanceof ChronoField) || (hVar != null && hVar.b(this));
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        q qVar = this.f422084c;
        f fVar = this.f422083b;
        return iOrdinal != 28 ? iOrdinal != 29 ? fVar.m(hVar) : qVar.f422109c : fVar.s(qVar);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final i r(long j12, org.threeten.bp.temporal.k kVar) {
        return kVar instanceof ChronoUnit ? r(this.f422083b.n(j12, kVar), this.f422084c) : (i) kVar.a(this, j12);
    }

    public final i r(f fVar, q qVar) {
        return (this.f422083b == fVar && this.f422084c.equals(qVar)) ? this : new i(fVar, qVar);
    }

    public final String toString() {
        return this.f422083b.toString() + this.f422084c.f422110d;
    }
}
