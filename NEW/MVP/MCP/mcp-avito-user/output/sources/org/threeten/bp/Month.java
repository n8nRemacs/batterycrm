package org.threeten.bp;

import com.yandex.div2.D8;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Month implements org.threeten.bp.temporal.d, org.threeten.bp.temporal.e {

    /* renamed from: b, reason: collision with root package name */
    public static final Month f421842b;

    /* renamed from: c, reason: collision with root package name */
    public static final Month[] f421843c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Month[] f421844d;

    /* JADX INFO: Fake field, exist only in values array */
    Month EF0;

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421845a;

        static {
            int[] iArr = new int[Month.values().length];
            f421845a = iArr;
            try {
                Month month = Month.f421842b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f421845a;
                Month month2 = Month.f421842b;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f421845a;
                Month month3 = Month.f421842b;
                iArr3[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f421845a;
                Month month4 = Month.f421842b;
                iArr4[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f421845a;
                Month month5 = Month.f421842b;
                iArr5[10] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f421845a;
                Month month6 = Month.f421842b;
                iArr6[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f421845a;
                Month month7 = Month.f421842b;
                iArr7[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f421845a;
                Month month8 = Month.f421842b;
                iArr8[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f421845a;
                Month month9 = Month.f421842b;
                iArr9[6] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f421845a;
                Month month10 = Month.f421842b;
                iArr10[7] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = f421845a;
                Month month11 = Month.f421842b;
                iArr11[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = f421845a;
                Month month12 = Month.f421842b;
                iArr12[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        Month month = new Month("JANUARY", 0);
        Month month2 = new Month("FEBRUARY", 1);
        f421842b = month2;
        f421844d = new Month[]{month, month2, new Month("MARCH", 2), new Month("APRIL", 3), new Month("MAY", 4), new Month("JUNE", 5), new Month("JULY", 6), new Month("AUGUST", 7), new Month("SEPTEMBER", 8), new Month("OCTOBER", 9), new Month("NOVEMBER", 10), new Month("DECEMBER", 11)};
        new org.threeten.bp.temporal.j<Month>() { // from class: org.threeten.bp.Month.a
            @Override // org.threeten.bp.temporal.j
            public final Month a(org.threeten.bp.temporal.d dVar) {
                Month month3 = Month.f421842b;
                if (dVar instanceof Month) {
                    return (Month) dVar;
                }
                try {
                    if (!org.threeten.bp.chrono.o.f421908d.equals(org.threeten.bp.chrono.j.i(dVar))) {
                        dVar = e.B(dVar);
                    }
                    return Month.q(dVar.k(ChronoField.f422120B));
                } catch (DateTimeException e12) {
                    throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName(), e12);
                }
            }
        };
        f421843c = values();
    }

    public Month() {
        throw null;
    }

    public static Month q(int i12) {
        if (i12 < 1 || i12 > 12) {
            throw new DateTimeException(AK.c.g(i12, "Invalid value for MonthOfYear: "));
        }
        return f421843c[i12 - 1];
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f421844d.clone();
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        if (!org.threeten.bp.chrono.j.i(cVar).equals(org.threeten.bp.chrono.o.f421908d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return cVar.w(h(), ChronoField.f422120B);
    }

    @Override // org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422120B) {
            return hVar.f();
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.d(this);
    }

    public final int d(boolean z12) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z12 ? 1 : 0) + 60;
            case 3:
                return (z12 ? 1 : 0) + 91;
            case 4:
                return (z12 ? 1 : 0) + 121;
            case 5:
                return (z12 ? 1 : 0) + 152;
            case 6:
                return (z12 ? 1 : 0) + 182;
            case 7:
                return (z12 ? 1 : 0) + 213;
            case 8:
                return (z12 ? 1 : 0) + 244;
            case 9:
                return (z12 ? 1 : 0) + 274;
            case 10:
                return (z12 ? 1 : 0) + 305;
            default:
                return (z12 ? 1 : 0) + 335;
        }
    }

    @Override // org.threeten.bp.temporal.d
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
        return jVar.a(this);
    }

    public final int h() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return hVar == ChronoField.f422120B ? h() : b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422120B : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422120B) {
            return h();
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.h(this);
    }

    public final int o(boolean z12) {
        int iOrdinal = ordinal();
        return iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : z12 ? 29 : 28;
    }

    public final int p() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        }
        return 29;
    }
}
