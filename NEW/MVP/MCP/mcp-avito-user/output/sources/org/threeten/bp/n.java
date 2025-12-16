package org.threeten.bp;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.D8;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49471c;

/* compiled from: YearMonth.java */
/* loaded from: classes8.dex */
public final class n extends AbstractC49471c implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<n>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f422098d = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: b, reason: collision with root package name */
    public final int f422099b;

    /* renamed from: c, reason: collision with root package name */
    public final int f422100c;

    /* compiled from: YearMonth.java */
    public class a implements org.threeten.bp.temporal.j<n> {
        @Override // org.threeten.bp.temporal.j
        public final n a(org.threeten.bp.temporal.d dVar) {
            return n.o(dVar);
        }
    }

    /* compiled from: YearMonth.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422101a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f422102b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f422102b = iArr;
            try {
                iArr[ChronoUnit.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422102b[ChronoUnit.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f422102b[ChronoUnit.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f422102b[ChronoUnit.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f422102b[ChronoUnit.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f422102b[ChronoUnit.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f422101a = iArr2;
            try {
                iArr2[ChronoField.f422120B.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f422101a[ChronoField.f422121C.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f422101a[ChronoField.f422122D.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f422101a[ChronoField.f422123E.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f422101a[ChronoField.f422124F.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        new a();
        org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
        dVar.m(ChronoField.f422123E, 4, 10, SignStyle.f421960e);
        dVar.c('-');
        dVar.l(ChronoField.f422120B, 2);
        dVar.p();
    }

    public n(int i12, int i13) {
        this.f422099b = i12;
        this.f422100c = i13;
    }

    public static n o(org.threeten.bp.temporal.d dVar) {
        if (dVar instanceof n) {
            return (n) dVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f421908d.equals(org.threeten.bp.chrono.j.i(dVar))) {
                dVar = e.B(dVar);
            }
            ChronoField chronoField = ChronoField.f422123E;
            int iK2 = dVar.k(chronoField);
            ChronoField chronoField2 = ChronoField.f422120B;
            int iK3 = dVar.k(chronoField2);
            chronoField.i(iK2);
            chronoField2.i(iK3);
            return new n(iK2, iK3);
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
        }
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 68, this);
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        if (!org.threeten.bp.chrono.j.i(cVar).equals(org.threeten.bp.chrono.o.f421908d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return cVar.w(p(), ChronoField.f422121C);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422122D) {
            return org.threeten.bp.temporal.l.d(1L, this.f422099b <= 0 ? 1000000000L : 999999999L);
        }
        return super.b(hVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(n nVar) {
        n nVar2 = nVar;
        int i12 = this.f422099b - nVar2.f422099b;
        return i12 == 0 ? this.f422100c - nVar2.f422100c : i12;
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(e eVar) {
        return (n) eVar.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f422099b == nVar.f422099b && this.f422100c == nVar.f422100c;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422199b) {
            return (R) org.threeten.bp.chrono.o.f421908d;
        }
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.MONTHS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f || jVar == org.threeten.bp.temporal.i.f422204g || jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422202e) {
            return null;
        }
        return (R) super.f(jVar);
    }

    public final int hashCode() {
        return (this.f422100c << 27) ^ this.f422099b;
    }

    @Override // org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return j12 == Long.MIN_VALUE ? r(Long.MAX_VALUE, kVar).r(1L, kVar) : r(-j12, kVar);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422123E || hVar == ChronoField.f422120B || hVar == ChronoField.f422121C || hVar == ChronoField.f422122D || hVar == ChronoField.f422124F : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        int i12 = this.f422099b;
        switch (iOrdinal) {
            case 23:
                return this.f422100c;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return p();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return i12;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return i12 < 1 ? 0 : 1;
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
    }

    public final long p() {
        return (this.f422099b * 12) + (this.f422100c - 1);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final n r(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (n) kVar.a(this, j12);
        }
        switch (((ChronoUnit) kVar).ordinal()) {
            case 9:
                return r(j12);
            case 10:
                return s(j12);
            case 11:
                return s(w81.d.i(10, j12));
            case 12:
                return s(w81.d.i(100, j12));
            case 13:
                return s(w81.d.i(1000, j12));
            case 14:
                ChronoField chronoField = ChronoField.f422124F;
                return w(w81.d.h(m(chronoField), j12), chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }

    public final n r(long j12) {
        if (j12 == 0) {
            return this;
        }
        long j13 = (this.f422099b * 12) + (this.f422100c - 1) + j12;
        ChronoField chronoField = ChronoField.f422123E;
        return u(chronoField.f422152d.a(w81.d.c(j13, 12L), chronoField), w81.d.e(12, j13) + 1);
    }

    public final n s(long j12) {
        if (j12 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.f422123E;
        return u(chronoField.f422152d.a(this.f422099b + j12, chronoField), this.f422100c);
    }

    public final long t(org.threeten.bp.temporal.c cVar, ChronoUnit chronoUnit) {
        n nVarO = o(cVar);
        if (chronoUnit == null) {
            chronoUnit.getClass();
            return t(nVarO, chronoUnit);
        }
        long jP2 = nVarO.p() - p();
        switch (chronoUnit.ordinal()) {
            case 9:
                return jP2;
            case 10:
                return jP2 / 12;
            case 11:
                return jP2 / 120;
            case 12:
                return jP2 / 1200;
            case 13:
                return jP2 / 12000;
            case 14:
                org.threeten.bp.temporal.h hVar = ChronoField.f422124F;
                return nVarO.m(hVar) - m(hVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + chronoUnit);
        }
    }

    public final String toString() {
        int i12 = this.f422099b;
        int iAbs = Math.abs(i12);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb2.append(i12);
        } else if (i12 < 0) {
            sb2.append(i12 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i12 + 10000);
            sb2.deleteCharAt(0);
        }
        int i13 = this.f422100c;
        sb2.append(i13 < 10 ? "-0" : "-");
        sb2.append(i13);
        return sb2.toString();
    }

    public final n u(int i12, int i13) {
        return (this.f422099b == i12 && this.f422100c == i13) ? this : new n(i12, i13);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final n w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (n) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        chronoField.i(j12);
        int iOrdinal = chronoField.ordinal();
        int i12 = this.f422100c;
        int i13 = this.f422099b;
        switch (iOrdinal) {
            case 23:
                int i14 = (int) j12;
                ChronoField.f422120B.i(i14);
                return u(i13, i14);
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return r(j12 - m(ChronoField.f422121C));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (i13 < 1) {
                    j12 = 1 - j12;
                }
                int i15 = (int) j12;
                ChronoField.f422123E.i(i15);
                return u(i15, i12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i16 = (int) j12;
                ChronoField.f422123E.i(i16);
                return u(i16, i12);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (m(ChronoField.f422124F) == j12) {
                    return this;
                }
                int i17 = 1 - i13;
                ChronoField.f422123E.i(i17);
                return u(i17, i12);
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
    }
}
