package org.threeten.bp.chrono;

import androidx.compose.ui.platform.C22491k0;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.chrono.c;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: ChronoZonedDateTimeImpl.java */
/* loaded from: classes8.dex */
final class i<D extends c> extends h<D> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f421869e = 0;
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: b, reason: collision with root package name */
    public final e<D> f421870b;

    /* renamed from: c, reason: collision with root package name */
    public final org.threeten.bp.q f421871c;

    /* renamed from: d, reason: collision with root package name */
    public final org.threeten.bp.o f421872d;

    /* compiled from: ChronoZonedDateTimeImpl.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421873a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421873a = iArr;
            try {
                iArr[ChronoField.f422125G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421873a[ChronoField.f422126H.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public i(org.threeten.bp.o oVar, org.threeten.bp.q qVar, e eVar) {
        w81.d.f(eVar, "dateTime");
        this.f421870b = eVar;
        w81.d.f(qVar, "offset");
        this.f421871c = qVar;
        w81.d.f(oVar, "zone");
        this.f421872d = oVar;
    }

    public static h B(org.threeten.bp.o oVar, org.threeten.bp.q qVar, e eVar) {
        w81.d.f(eVar, "localDateTime");
        w81.d.f(oVar, "zone");
        if (oVar instanceof org.threeten.bp.q) {
            return new i(oVar, (org.threeten.bp.q) oVar, eVar);
        }
        org.threeten.bp.zone.f fVarO = oVar.o();
        org.threeten.bp.f fVarB = org.threeten.bp.f.B(eVar);
        List<org.threeten.bp.q> listC = fVarO.c(fVarB);
        if (listC.size() == 1) {
            qVar = listC.get(0);
        } else if (listC.size() == 0) {
            org.threeten.bp.zone.e eVarB = fVarO.b(fVarB);
            eVar = eVar.A(eVar.f421865b, 0L, 0L, org.threeten.bp.c.b(0, eVarB.f422254d.f422109c - eVarB.f422253c.f422109c).f421848b, 0L);
            qVar = eVarB.f422254d;
        } else if (qVar == null || !listC.contains(qVar)) {
            qVar = listC.get(0);
        }
        w81.d.f(qVar, "offset");
        return new i(oVar, qVar, eVar);
    }

    public static <R extends c> i<R> C(j jVar, org.threeten.bp.d dVar, org.threeten.bp.o oVar) {
        org.threeten.bp.q qVarA = oVar.o().a(dVar);
        w81.d.f(qVarA, "offset");
        return new i<>(oVar, qVarA, (e) jVar.n(org.threeten.bp.f.H(dVar.f421935b, dVar.f421936c, qVarA)));
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    @Override // org.threeten.bp.chrono.h
    public final h<D> A(org.threeten.bp.o oVar) {
        return B(oVar, this.f421871c, this.f421870b);
    }

    @Override // org.threeten.bp.chrono.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.h
    public final int hashCode() {
        return (this.f421870b.hashCode() ^ this.f421871c.f422109c) ^ Integer.rotateLeft(this.f421872d.hashCode(), 3);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return (hVar instanceof ChronoField) || (hVar != null && hVar.b(this));
    }

    @Override // org.threeten.bp.chrono.h
    public final org.threeten.bp.q p() {
        return this.f421871c;
    }

    @Override // org.threeten.bp.chrono.h
    public final org.threeten.bp.o q() {
        return this.f421872d;
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.c
    /* renamed from: s */
    public final h<D> r(long j12, org.threeten.bp.temporal.k kVar) {
        return kVar instanceof ChronoUnit ? x(this.f421870b.r(j12, kVar)) : u().q().f(kVar.a(this, j12));
    }

    @Override // org.threeten.bp.chrono.h
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f421870b.toString());
        org.threeten.bp.q qVar = this.f421871c;
        sb2.append(qVar.f422110d);
        String string = sb2.toString();
        org.threeten.bp.o oVar = this.f421872d;
        if (qVar == oVar) {
            return string;
        }
        StringBuilder sbB = C22491k0.b(string, '[');
        sbB.append(oVar.toString());
        sbB.append(']');
        return sbB.toString();
    }

    @Override // org.threeten.bp.chrono.h
    public final d<D> v() {
        return this.f421870b;
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.c
    /* renamed from: x */
    public final h w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return u().q().f(hVar.a(this, j12));
        }
        ChronoField chronoField = (ChronoField) hVar;
        int iOrdinal = chronoField.ordinal();
        if (iOrdinal == 28) {
            return r(j12 - t(), ChronoUnit.SECONDS);
        }
        org.threeten.bp.o oVar = this.f421872d;
        e<D> eVar = this.f421870b;
        if (iOrdinal != 29) {
            return B(oVar, this.f421871c, eVar.w(j12, hVar));
        }
        return C(u().q(), eVar.t(org.threeten.bp.q.w(chronoField.f422152d.a(j12, chronoField))), oVar);
    }
}
