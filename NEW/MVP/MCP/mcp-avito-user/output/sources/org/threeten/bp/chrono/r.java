package org.threeten.bp.chrono;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.ChronoField;
import w81.AbstractC49469a;

/* compiled from: JapaneseEra.java */
/* loaded from: classes8.dex */
public final class r extends AbstractC49469a implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final r f421917e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReference<r[]> f421918f;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: b, reason: collision with root package name */
    public final int f421919b;

    /* renamed from: c, reason: collision with root package name */
    public final transient org.threeten.bp.e f421920c;

    /* renamed from: d, reason: collision with root package name */
    public final transient String f421921d;

    static {
        r rVar = new r(-1, org.threeten.bp.e.N(1868, 9, 8), "Meiji");
        f421917e = rVar;
        f421918f = new AtomicReference<>(new r[]{rVar, new r(0, org.threeten.bp.e.N(1912, 7, 30), "Taisho"), new r(1, org.threeten.bp.e.N(1926, 12, 25), "Showa"), new r(2, org.threeten.bp.e.N(1989, 1, 8), "Heisei"), new r(3, org.threeten.bp.e.N(2019, 5, 1), "Reiwa")});
    }

    public r(int i12, org.threeten.bp.e eVar, String str) {
        this.f421919b = i12;
        this.f421920c = eVar;
        this.f421921d = str;
    }

    public static r p(org.threeten.bp.e eVar) {
        if (eVar.G(f421917e.f421920c)) {
            throw new DateTimeException("Date too early: " + eVar);
        }
        r[] rVarArr = f421918f.get();
        for (int length = rVarArr.length - 1; length >= 0; length--) {
            r rVar = rVarArr[length];
            if (eVar.compareTo(rVar.f421920c) >= 0) {
                return rVar;
            }
        }
        return null;
    }

    public static r q(int i12) {
        r[] rVarArr = f421918f.get();
        if (i12 < f421917e.f421919b || i12 > rVarArr[rVarArr.length - 1].f421919b) {
            throw new DateTimeException("japaneseEra is invalid");
        }
        return rVarArr[i12 + 1];
    }

    public static r[] r() {
        r[] rVarArr = f421918f.get();
        return (r[]) Arrays.copyOf(rVarArr, rVarArr.length);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return q(this.f421919b);
        } catch (DateTimeException e12) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e12);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        ChronoField chronoField = ChronoField.f422124F;
        return hVar == chronoField ? p.f421910e.r(chronoField) : super.b(hVar);
    }

    public final org.threeten.bp.e o() {
        int i12 = this.f421919b;
        int i13 = i12 + 1;
        r[] rVarArrR = r();
        return i13 >= rVarArrR.length + (-1) ? org.threeten.bp.e.f421940f : rVarArrR[i12 + 2].f421920c.K(1L);
    }

    public final String toString() {
        return this.f421921d;
    }
}
