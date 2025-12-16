package org.threeten.bp;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.D8;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49471c;

/* compiled from: Year.java */
/* loaded from: classes8.dex */
public final class m extends AbstractC49471c implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<m>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f422094c = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: b, reason: collision with root package name */
    public final int f422095b;

    /* compiled from: Year.java */
    public class a implements org.threeten.bp.temporal.j<m> {
        @Override // org.threeten.bp.temporal.j
        public final m a(org.threeten.bp.temporal.d dVar) {
            return m.o(dVar);
        }
    }

    /* compiled from: Year.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422096a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f422097b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f422097b = iArr;
            try {
                iArr[ChronoUnit.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422097b[ChronoUnit.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f422097b[ChronoUnit.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f422097b[ChronoUnit.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f422097b[ChronoUnit.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f422096a = iArr2;
            try {
                iArr2[ChronoField.f422122D.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f422096a[ChronoField.f422123E.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f422096a[ChronoField.f422124F.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        new a();
        org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
        dVar.m(ChronoField.f422123E, 4, 10, SignStyle.f421960e);
        dVar.p();
    }

    public m(int i12) {
        this.f422095b = i12;
    }

    public static m o(org.threeten.bp.temporal.d dVar) {
        if (dVar instanceof m) {
            return (m) dVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f421908d.equals(org.threeten.bp.chrono.j.i(dVar))) {
                dVar = e.B(dVar);
            }
            return q(dVar.k(ChronoField.f422123E));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
        }
    }

    public static boolean p(long j12) {
        return (3 & j12) == 0 && (j12 % 100 != 0 || j12 % 400 == 0);
    }

    public static m q(int i12) {
        ChronoField.f422123E.i(i12);
        return new m(i12);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 67, this);
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        if (!org.threeten.bp.chrono.j.i(cVar).equals(org.threeten.bp.chrono.o.f421908d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return cVar.w(this.f422095b, ChronoField.f422123E);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422122D) {
            return org.threeten.bp.temporal.l.d(1L, this.f422095b <= 0 ? 1000000000L : 999999999L);
        }
        return super.b(hVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(m mVar) {
        return this.f422095b - mVar.f422095b;
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(e eVar) {
        return (m) eVar.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f422095b == ((m) obj).f422095b;
        }
        return false;
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422199b) {
            return (R) org.threeten.bp.chrono.o.f421908d;
        }
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.YEARS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f || jVar == org.threeten.bp.temporal.i.f422204g || jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422202e) {
            return null;
        }
        return (R) super.f(jVar);
    }

    public final int hashCode() {
        return this.f422095b;
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
        return hVar instanceof ChronoField ? hVar == ChronoField.f422123E || hVar == ChronoField.f422122D || hVar == ChronoField.f422124F : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        int i12 = this.f422095b;
        switch (iOrdinal) {
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

    @Override // org.threeten.bp.temporal.c
    public final m r(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (m) kVar.a(this, j12);
        }
        switch (((ChronoUnit) kVar).ordinal()) {
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

    public final m s(long j12) {
        if (j12 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.f422123E;
        return q(chronoField.f422152d.a(this.f422095b + j12, chronoField));
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final m w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (m) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        chronoField.i(j12);
        int iOrdinal = chronoField.ordinal();
        int i12 = this.f422095b;
        switch (iOrdinal) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (i12 < 1) {
                    j12 = 1 - j12;
                }
                return q((int) j12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return q((int) j12);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(ChronoField.f422124F) == j12 ? this : q(1 - i12);
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
    }

    public final String toString() {
        return Integer.toString(this.f422095b);
    }
}
