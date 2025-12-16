package org.threeten.bp;

import androidx.camera.camera2.internal.G;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.D8;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: LocalDate.java */
/* loaded from: classes8.dex */
public final class e extends org.threeten.bp.chrono.c implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final e f421939e = N(-999999999, 1, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final e f421940f = N(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: b, reason: collision with root package name */
    public final int f421941b;

    /* renamed from: c, reason: collision with root package name */
    public final short f421942c;

    /* renamed from: d, reason: collision with root package name */
    public final short f421943d;

    /* compiled from: LocalDate.java */
    public class a implements org.threeten.bp.temporal.j<e> {
        @Override // org.threeten.bp.temporal.j
        public final e a(org.threeten.bp.temporal.d dVar) {
            return e.B(dVar);
        }
    }

    /* compiled from: LocalDate.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421944a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f421945b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f421945b = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421945b[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421945b[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421945b[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421945b[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421945b[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421945b[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f421945b[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f421944a = iArr2;
            try {
                iArr2[ChronoField.f422146w.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f421944a[ChronoField.f422147x.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f421944a[ChronoField.f422149z.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f421944a[ChronoField.f422122D.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f421944a[ChronoField.f422143t.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f421944a[ChronoField.f422144u.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f421944a[ChronoField.f422145v.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f421944a[ChronoField.f422148y.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f421944a[ChronoField.f422119A.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f421944a[ChronoField.f422120B.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f421944a[ChronoField.f422121C.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f421944a[ChronoField.f422123E.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f421944a[ChronoField.f422124F.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    static {
        new a();
    }

    public e(int i12, int i13, int i14) {
        this.f421941b = i12;
        this.f421942c = (short) i13;
        this.f421943d = (short) i14;
    }

    public static e A(int i12, Month month, int i13) {
        if (i13 > 28) {
            org.threeten.bp.chrono.o.f421908d.getClass();
            if (i13 > month.o(org.threeten.bp.chrono.o.r(i12))) {
                if (i13 == 29) {
                    throw new DateTimeException(G.e(i12, "Invalid date 'February 29' as '", "' is not a leap year"));
                }
                throw new DateTimeException("Invalid date '" + month.name() + " " + i13 + "'");
            }
        }
        return new e(i12, month.h(), i13);
    }

    public static e B(org.threeten.bp.temporal.d dVar) {
        e eVar = (e) dVar.f(org.threeten.bp.temporal.i.f422203f);
        if (eVar != null) {
            return eVar;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
    }

    public static e L() {
        return P(w81.d.c(new a.c(o.r()).a().f421935b + r0.f421846b.o().a(r1).f422109c, 86400L));
    }

    public static e N(int i12, int i13, int i14) {
        ChronoField.f422123E.i(i12);
        ChronoField.f422120B.i(i13);
        ChronoField.f422146w.i(i14);
        return A(i12, Month.q(i13), i14);
    }

    public static e O(int i12, Month month, int i13) {
        ChronoField.f422123E.i(i12);
        w81.d.f(month, SelectionType.TYPE_MONTH);
        ChronoField.f422146w.i(i13);
        return A(i12, month, i13);
    }

    public static e P(long j12) {
        long j13;
        ChronoField.f422148y.i(j12);
        long j14 = 719468 + j12;
        if (j14 < 0) {
            long j15 = ((j12 + 719469) / 146097) - 1;
            j13 = j15 * 400;
            j14 += (-j15) * 146097;
        } else {
            j13 = 0;
        }
        long j16 = ((j14 * 400) + 591) / 146097;
        long j17 = j14 - ((j16 / 400) + (((j16 / 4) + (j16 * 365)) - (j16 / 100)));
        if (j17 < 0) {
            j16--;
            j17 = j14 - ((j16 / 400) + (((j16 / 4) + (365 * j16)) - (j16 / 100)));
        }
        int i12 = (int) j17;
        int i13 = ((i12 * 5) + 2) / 153;
        int i14 = ((i13 + 2) % 12) + 1;
        int i15 = (i12 - (((i13 * 306) + 5) / 10)) + 1;
        long j18 = j16 + j13 + (i13 / 10);
        ChronoField chronoField = ChronoField.f422123E;
        return new e(chronoField.f422152d.a(j18, chronoField), i14, i15);
    }

    public static e Q(int i12, int i13) {
        long j12 = i12;
        ChronoField.f422123E.i(j12);
        ChronoField.f422147x.i(i13);
        org.threeten.bp.chrono.o.f421908d.getClass();
        boolean zR2 = org.threeten.bp.chrono.o.r(j12);
        if (i13 == 366 && !zR2) {
            throw new DateTimeException(G.e(i12, "Invalid date 'DayOfYear 366' as '", "' is not a leap year"));
        }
        Month monthQ = Month.q(((i13 - 1) / 31) + 1);
        if (i13 > (monthQ.o(zR2) + monthQ.d(zR2)) - 1) {
            monthQ = Month.f421843c[((((int) 1) + 12) + monthQ.ordinal()) % 12];
        }
        return A(i12, monthQ, (i13 - monthQ.d(zR2)) + 1);
    }

    public static e W(int i12, int i13, int i14) {
        if (i13 == 2) {
            org.threeten.bp.chrono.o.f421908d.getClass();
            i14 = Math.min(i14, org.threeten.bp.chrono.o.r((long) i12) ? 29 : 28);
        } else if (i13 == 4 || i13 == 6 || i13 == 9 || i13 == 11) {
            i14 = Math.min(i14, 30);
        }
        return N(i12, i13, i14);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 3, this);
    }

    public final int C(org.threeten.bp.temporal.h hVar) {
        int iOrdinal = ((ChronoField) hVar).ordinal();
        short s5 = this.f421943d;
        int i12 = this.f421941b;
        switch (iOrdinal) {
            case 15:
                return E().d();
            case 16:
                return ((s5 - 1) % 7) + 1;
            case 17:
                return ((F() - 1) % 7) + 1;
            case 18:
                return s5;
            case 19:
                return F();
            case 20:
                throw new DateTimeException(D8.p("Field too large for an int: ", hVar));
            case 21:
                return androidx.appcompat.app.r.f(s5, 1, 7, 1);
            case 22:
                return ((F() - 1) / 7) + 1;
            case 23:
                return this.f421942c;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                throw new DateTimeException(D8.p("Field too large for an int: ", hVar));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return i12 >= 1 ? i12 : 1 - i12;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return i12;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return i12 >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
    }

    public final DayOfWeek E() {
        return DayOfWeek.h(w81.d.e(7, v() + 3) + 1);
    }

    public final int F() {
        return (Month.q(this.f421942c).d(H()) + this.f421943d) - 1;
    }

    public final boolean G(org.threeten.bp.chrono.c cVar) {
        return cVar instanceof e ? z((e) cVar) < 0 : v() < cVar.v();
    }

    public final boolean H() {
        org.threeten.bp.chrono.o oVar = org.threeten.bp.chrono.o.f421908d;
        long j12 = this.f421941b;
        oVar.getClass();
        return org.threeten.bp.chrono.o.r(j12);
    }

    public final int J() {
        short s5 = this.f421942c;
        return s5 != 2 ? (s5 == 4 || s5 == 6 || s5 == 9 || s5 == 11) ? 30 : 31 : H() ? 29 : 28;
    }

    public final e K(long j12) {
        return j12 == Long.MIN_VALUE ? S(Long.MAX_VALUE).S(1L) : S(-j12);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final e n(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (e) kVar.a(this, j12);
        }
        switch (((ChronoUnit) kVar).ordinal()) {
            case 7:
                return S(j12);
            case 8:
                return U(j12);
            case 9:
                return T(j12);
            case 10:
                return V(j12);
            case 11:
                return V(w81.d.i(10, j12));
            case 12:
                return V(w81.d.i(100, j12));
            case 13:
                return V(w81.d.i(1000, j12));
            case 14:
                ChronoField chronoField = ChronoField.f422124F;
                return c(w81.d.h(m(chronoField), j12), chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }

    public final e S(long j12) {
        return j12 == 0 ? this : P(w81.d.h(v(), j12));
    }

    public final e T(long j12) {
        if (j12 == 0) {
            return this;
        }
        long j13 = (this.f421941b * 12) + (this.f421942c - 1) + j12;
        ChronoField chronoField = ChronoField.f422123E;
        return W(chronoField.f422152d.a(w81.d.c(j13, 12L), chronoField), w81.d.e(12, j13) + 1, this.f421943d);
    }

    public final e U(long j12) {
        return S(w81.d.i(7, j12));
    }

    public final e V(long j12) {
        if (j12 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.f422123E;
        return W(chronoField.f422152d.a(this.f421941b + j12, chronoField), this.f421942c, this.f421943d);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final e c(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (e) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        chronoField.i(j12);
        int iOrdinal = chronoField.ordinal();
        short s5 = this.f421943d;
        short s12 = this.f421942c;
        int i12 = this.f421941b;
        switch (iOrdinal) {
            case 15:
                return S(j12 - E().d());
            case 16:
                return S(j12 - m(ChronoField.f422144u));
            case 17:
                return S(j12 - m(ChronoField.f422145v));
            case 18:
                int i13 = (int) j12;
                return s5 == i13 ? this : N(i12, s12, i13);
            case 19:
                int i14 = (int) j12;
                return F() == i14 ? this : Q(i12, i14);
            case 20:
                return P(j12);
            case 21:
                return U(j12 - m(ChronoField.f422149z));
            case 22:
                return U(j12 - m(ChronoField.f422119A));
            case 23:
                int i15 = (int) j12;
                if (s12 == i15) {
                    return this;
                }
                ChronoField.f422120B.i(i15);
                return W(i12, i15, s5);
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return T(j12 - m(ChronoField.f422121C));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (i12 < 1) {
                    j12 = 1 - j12;
                }
                return Z((int) j12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Z((int) j12);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(ChronoField.f422124F) == j12 ? this : Z(1 - i12);
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final e e(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof e ? (e) eVar : (e) eVar.a(this);
    }

    public final e Z(int i12) {
        if (this.f421941b == i12) {
            return this;
        }
        ChronoField.f422123E.i(i12);
        return W(i12, this.f421942c, this.f421943d);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.d(this);
        }
        ChronoField chronoField = (ChronoField) hVar;
        if (!chronoField.e()) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        int iOrdinal = chronoField.ordinal();
        if (iOrdinal == 18) {
            return org.threeten.bp.temporal.l.d(1L, J());
        }
        if (iOrdinal == 19) {
            return org.threeten.bp.temporal.l.d(1L, H() ? 366 : 365);
        }
        if (iOrdinal == 21) {
            return org.threeten.bp.temporal.l.d(1L, (Month.q(this.f421942c) != Month.f421842b || H()) ? 5L : 4L);
        }
        if (iOrdinal != 25) {
            return ((ChronoField) hVar).f422152d;
        }
        return org.threeten.bp.temporal.l.d(1L, this.f421941b <= 0 ? 1000000000L : 999999999L);
    }

    @Override // org.threeten.bp.chrono.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && z((e) obj) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.chrono.c, w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        return jVar == org.threeten.bp.temporal.i.f422203f ? this : (R) super.f(jVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final int hashCode() {
        int i12 = this.f421941b;
        return (((i12 << 11) + (this.f421942c << 6)) + this.f421943d) ^ (i12 & (-2048));
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        ChronoUnit chronoUnit = (ChronoUnit) kVar;
        return j12 == Long.MIN_VALUE ? n(Long.MAX_VALUE, chronoUnit).n(1L, chronoUnit) : n(-j12, chronoUnit);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? C(hVar) : super.k(hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422148y ? v() : hVar == ChronoField.f422121C ? (this.f421941b * 12) + (this.f421942c - 1) : C(hVar) : hVar.h(this);
    }

    @Override // org.threeten.bp.chrono.c
    public final org.threeten.bp.chrono.d o(g gVar) {
        return f.G(this, gVar);
    }

    @Override // org.threeten.bp.chrono.c, java.lang.Comparable
    /* renamed from: p */
    public final int compareTo(org.threeten.bp.chrono.c cVar) {
        return cVar instanceof e ? z((e) cVar) : super.compareTo(cVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final org.threeten.bp.chrono.j q() {
        return org.threeten.bp.chrono.o.f421908d;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: s */
    public final org.threeten.bp.chrono.c i(long j12, org.threeten.bp.temporal.k kVar) {
        ChronoUnit chronoUnit = (ChronoUnit) kVar;
        return j12 == Long.MIN_VALUE ? n(Long.MAX_VALUE, chronoUnit).n(1L, chronoUnit) : n(-j12, chronoUnit);
    }

    @Override // org.threeten.bp.chrono.c
    public final String toString() {
        int i12 = this.f421941b;
        int iAbs = Math.abs(i12);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i12 > 9999) {
                sb2.append('+');
            }
            sb2.append(i12);
        } else if (i12 < 0) {
            sb2.append(i12 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i12 + 10000);
            sb2.deleteCharAt(0);
        }
        short s5 = this.f421942c;
        sb2.append(s5 < 10 ? "-0" : "-");
        sb2.append((int) s5);
        short s12 = this.f421943d;
        sb2.append(s12 < 10 ? "-0" : "-");
        sb2.append((int) s12);
        return sb2.toString();
    }

    @Override // org.threeten.bp.chrono.c
    public final org.threeten.bp.chrono.c u(org.threeten.bp.temporal.g gVar) {
        return (e) gVar.a(this);
    }

    @Override // org.threeten.bp.chrono.c
    public final long v() {
        long j12 = this.f421941b;
        long j13 = this.f421942c;
        long j14 = 365 * j12;
        long j15 = (((367 * j13) - 362) / 12) + (j12 >= 0 ? ((j12 + 399) / 400) + (((3 + j12) / 4) - ((99 + j12) / 100)) + j14 : j14 - ((j12 / (-400)) + ((j12 / (-4)) - (j12 / (-100))))) + (this.f421943d - 1);
        if (j13 > 2) {
            j15 = !H() ? j15 - 2 : j15 - 1;
        }
        return j15 - 719528;
    }

    public final int z(e eVar) {
        int i12 = this.f421941b - eVar.f421941b;
        if (i12 != 0) {
            return i12;
        }
        int i13 = this.f421942c - eVar.f421942c;
        return i13 == 0 ? this.f421943d - eVar.f421943d : i13;
    }
}
