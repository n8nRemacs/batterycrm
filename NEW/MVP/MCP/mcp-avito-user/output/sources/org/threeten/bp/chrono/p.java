package org.threeten.bp.chrono;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: JapaneseChronology.java */
/* loaded from: classes8.dex */
public final class p extends j implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Locale f421909d = new Locale("ja", "JP", "JP");

    /* renamed from: e, reason: collision with root package name */
    public static final p f421910e = new p();
    private static final long serialVersionUID = 459996390165777884L;

    /* compiled from: JapaneseChronology.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421911a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421911a = iArr;
            try {
                iArr[ChronoField.f422146w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421911a[ChronoField.f422143t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421911a[ChronoField.f422131h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421911a[ChronoField.f422130g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421911a[ChronoField.f422140q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421911a[ChronoField.f422138o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421911a[ChronoField.f422137n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f421911a[ChronoField.f422136m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f421911a[ChronoField.f422135l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f421911a[ChronoField.f422134k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f421911a[ChronoField.f422133j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f421911a[ChronoField.f422132i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f421911a[ChronoField.f422129f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f421911a[ChronoField.f422128e.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f421911a[ChronoField.f422141r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f421911a[ChronoField.f422139p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f421911a[ChronoField.f422148y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f421911a[ChronoField.f422121C.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f421911a[ChronoField.f422124F.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f421911a[ChronoField.f422123E.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f421911a[ChronoField.f422122D.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f421911a[ChronoField.f422120B.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f421911a[ChronoField.f422147x.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        map.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        map2.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        map2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        map3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        map3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private Object readResolve() {
        return f421910e;
    }

    @Override // org.threeten.bp.chrono.j
    public final c a(int i12, int i13, int i14) {
        return new q(org.threeten.bp.e.N(i12, i13, i14));
    }

    @Override // org.threeten.bp.chrono.j
    public final c b(org.threeten.bp.temporal.d dVar) {
        return dVar instanceof q ? (q) dVar : new q(org.threeten.bp.e.B(dVar));
    }

    @Override // org.threeten.bp.chrono.j
    public final c c(long j12) {
        return new q(org.threeten.bp.e.P(j12));
    }

    @Override // org.threeten.bp.chrono.j
    public final l h(int i12) {
        return r.q(i12);
    }

    @Override // org.threeten.bp.chrono.j
    public final String k() {
        return "japanese";
    }

    @Override // org.threeten.bp.chrono.j
    public final String l() {
        return "Japanese";
    }

    @Override // org.threeten.bp.chrono.j
    public final h<q> q(org.threeten.bp.d dVar, org.threeten.bp.o oVar) {
        return i.C(this, dVar, oVar);
    }

    public final org.threeten.bp.temporal.l r(ChronoField chronoField) {
        int iOrdinal = chronoField.ordinal();
        if (iOrdinal != 15 && iOrdinal != 18 && iOrdinal != 20 && iOrdinal != 24) {
            switch (iOrdinal) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    Calendar calendar = Calendar.getInstance(f421909d);
                    int iOrdinal2 = chronoField.ordinal();
                    int i12 = 0;
                    if (iOrdinal2 == 19) {
                        r[] rVarArrR = r.r();
                        int iMin = 366;
                        while (i12 < rVarArrR.length) {
                            iMin = Math.min(iMin, ((rVarArrR[i12].f421920c.H() ? 366 : 365) - rVarArrR[i12].f421920c.F()) + 1);
                            i12++;
                        }
                        return org.threeten.bp.temporal.l.e(1L, 1L, iMin, 366L);
                    }
                    if (iOrdinal2 == 23) {
                        return org.threeten.bp.temporal.l.e(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    }
                    switch (iOrdinal2) {
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            r[] rVarArrR2 = r.r();
                            int i13 = (rVarArrR2[rVarArrR2.length - 1].o().f421941b - rVarArrR2[rVarArrR2.length - 1].f421920c.f421941b) + 1;
                            int iMin2 = Integer.MAX_VALUE;
                            while (i12 < rVarArrR2.length) {
                                iMin2 = Math.min(iMin2, (rVarArrR2[i12].o().f421941b - rVarArrR2[i12].f421920c.f421941b) + 1);
                                i12++;
                            }
                            return org.threeten.bp.temporal.l.e(1L, 6L, iMin2, i13);
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            r[] rVarArrR3 = r.r();
                            return org.threeten.bp.temporal.l.d(q.f421912e.f421941b, rVarArrR3[rVarArrR3.length - 1].o().f421941b);
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            r[] rVarArrR4 = r.r();
                            return org.threeten.bp.temporal.l.d(rVarArrR4[0].f421919b, rVarArrR4[rVarArrR4.length - 1].f421919b);
                        default:
                            throw new UnsupportedOperationException("Unimplementable field: " + chronoField);
                    }
            }
        }
        return chronoField.f422152d;
    }
}
