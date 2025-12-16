package org.threeten.bp;

import androidx.compose.ui.platform.C22491k0;
import com.yandex.div2.D8;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: ZonedDateTime.java */
/* loaded from: classes8.dex */
public final class s extends org.threeten.bp.chrono.h<e> implements org.threeten.bp.temporal.c, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f422114e = 0;
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: b, reason: collision with root package name */
    public final f f422115b;

    /* renamed from: c, reason: collision with root package name */
    public final q f422116c;

    /* renamed from: d, reason: collision with root package name */
    public final o f422117d;

    /* compiled from: ZonedDateTime.java */
    public class a implements org.threeten.bp.temporal.j<s> {
        @Override // org.threeten.bp.temporal.j
        public final s a(org.threeten.bp.temporal.d dVar) {
            return s.C(dVar);
        }
    }

    /* compiled from: ZonedDateTime.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422118a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f422118a = iArr;
            try {
                iArr[ChronoField.f422125G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422118a[ChronoField.f422126H.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a();
    }

    public s(f fVar, o oVar, q qVar) {
        this.f422115b = fVar;
        this.f422116c = qVar;
        this.f422117d = oVar;
    }

    public static s B(long j12, int i12, o oVar) {
        q qVarA = oVar.o().a(d.q(j12, i12));
        return new s(f.H(j12, i12, qVarA), oVar, qVarA);
    }

    public static s C(org.threeten.bp.temporal.d dVar) {
        if (dVar instanceof s) {
            return (s) dVar;
        }
        try {
            o oVarD = o.d(dVar);
            ChronoField chronoField = ChronoField.f422125G;
            if (dVar.l(chronoField)) {
                try {
                    return B(dVar.m(chronoField), dVar.k(ChronoField.f422128e), oVarD);
                } catch (DateTimeException unused) {
                }
            }
            return E(f.B(dVar), oVarD, null);
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
        }
    }

    public static s E(f fVar, o oVar, q qVar) {
        w81.d.f(fVar, "localDateTime");
        w81.d.f(oVar, "zone");
        if (oVar instanceof q) {
            return new s(fVar, oVar, (q) oVar);
        }
        org.threeten.bp.zone.f fVarO = oVar.o();
        List<q> listC = fVarO.c(fVar);
        if (listC.size() == 1) {
            qVar = listC.get(0);
        } else if (listC.size() == 0) {
            org.threeten.bp.zone.e eVarB = fVarO.b(fVar);
            fVar = fVar.L(c.b(0, eVarB.f422254d.f422109c - eVarB.f422253c.f422109c).f421848b);
            qVar = eVarB.f422254d;
        } else if (qVar == null || !listC.contains(qVar)) {
            q qVar2 = listC.get(0);
            w81.d.f(qVar2, "offset");
            qVar = qVar2;
        }
        return new s(fVar, oVar, qVar);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 6, this);
    }

    @Override // org.threeten.bp.chrono.h
    public final org.threeten.bp.chrono.h A(o oVar) {
        w81.d.f(oVar, "zone");
        return this.f422117d.equals(oVar) ? this : E(this.f422115b, oVar, this.f422116c);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final s r(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (s) kVar.a(this, j12);
        }
        ChronoUnit chronoUnit = (ChronoUnit) kVar;
        boolean z12 = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        q qVar = this.f422116c;
        o oVar = this.f422117d;
        f fVar = this.f422115b;
        if (z12) {
            return E(fVar.n(j12, kVar), oVar, qVar);
        }
        f fVarN = fVar.n(j12, kVar);
        w81.d.f(fVarN, "localDateTime");
        w81.d.f(qVar, "offset");
        w81.d.f(oVar, "zone");
        return B(fVarN.s(qVar), fVarN.f421949c.f422075e, oVar);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final s w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (s) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        int iOrdinal = chronoField.ordinal();
        f fVar = this.f422115b;
        o oVar = this.f422117d;
        if (iOrdinal == 28) {
            return B(j12, fVar.f421949c.f422075e, oVar);
        }
        q qVar = this.f422116c;
        if (iOrdinal != 29) {
            return E(fVar.c(j12, hVar), oVar, qVar);
        }
        q qVarW = q.w(chronoField.f422152d.a(j12, chronoField));
        return (qVarW.equals(qVar) || !oVar.o().f(fVar, qVarW)) ? this : new s(fVar, oVar, qVarW);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final s x(e eVar) {
        return E(f.G(eVar, this.f422115b.f421949c), this.f422117d, this.f422116c);
    }

    @Override // org.threeten.bp.chrono.h, w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? (hVar == ChronoField.f422125G || hVar == ChronoField.f422126H) ? ((ChronoField) hVar).f422152d : this.f422115b.b(hVar) : hVar.d(this);
    }

    @Override // org.threeten.bp.chrono.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f422115b.equals(sVar.f422115b) && this.f422116c.equals(sVar.f422116c) && this.f422117d.equals(sVar.f422117d);
    }

    @Override // org.threeten.bp.chrono.h, w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        return jVar == org.threeten.bp.temporal.i.f422203f ? (R) this.f422115b.f421948b : (R) super.f(jVar);
    }

    @Override // org.threeten.bp.chrono.h
    public final int hashCode() {
        return (this.f422115b.hashCode() ^ this.f422116c.f422109c) ^ Integer.rotateLeft(this.f422117d.hashCode(), 3);
    }

    @Override // org.threeten.bp.chrono.h, w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        ChronoUnit chronoUnit = (ChronoUnit) kVar;
        return j12 == Long.MIN_VALUE ? r(Long.MAX_VALUE, chronoUnit).r(1L, chronoUnit) : r(-j12, chronoUnit);
    }

    @Override // org.threeten.bp.chrono.h, w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return super.k(hVar);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.f422115b.k(hVar) : this.f422116c.f422109c;
        }
        throw new DateTimeException(D8.p("Field too large for an int: ", hVar));
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return (hVar instanceof ChronoField) || (hVar != null && hVar.b(this));
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        return iOrdinal != 28 ? iOrdinal != 29 ? this.f422115b.m(hVar) : this.f422116c.f422109c : t();
    }

    @Override // org.threeten.bp.chrono.h
    public final q p() {
        return this.f422116c;
    }

    @Override // org.threeten.bp.chrono.h
    public final o q() {
        return this.f422117d;
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: r */
    public final org.threeten.bp.chrono.h i(long j12, ChronoUnit chronoUnit) {
        return j12 == Long.MIN_VALUE ? r(Long.MAX_VALUE, chronoUnit).r(1L, chronoUnit) : r(-j12, chronoUnit);
    }

    @Override // org.threeten.bp.chrono.h
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f422115b.toString());
        q qVar = this.f422116c;
        sb2.append(qVar.f422110d);
        String string = sb2.toString();
        o oVar = this.f422117d;
        if (qVar == oVar) {
            return string;
        }
        StringBuilder sbB = C22491k0.b(string, '[');
        sbB.append(oVar.toString());
        sbB.append(']');
        return sbB.toString();
    }

    @Override // org.threeten.bp.chrono.h
    public final org.threeten.bp.chrono.c u() {
        return this.f422115b.f421948b;
    }

    @Override // org.threeten.bp.chrono.h
    public final org.threeten.bp.chrono.d v() {
        return this.f422115b;
    }

    @Override // org.threeten.bp.chrono.h
    public final g w() {
        return this.f422115b.f421949c;
    }
}
