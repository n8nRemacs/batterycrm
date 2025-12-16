package org.threeten.bp.chrono;

import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.D8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: HijrahDate.java */
/* loaded from: classes8.dex */
public final class n extends b<n> implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    public static final Integer[] f421877A;

    /* renamed from: B, reason: collision with root package name */
    public static final Integer[] f421878B;

    /* renamed from: C, reason: collision with root package name */
    public static final Integer[] f421879C;

    /* renamed from: D, reason: collision with root package name */
    public static final Integer[] f421880D;

    /* renamed from: E, reason: collision with root package name */
    public static final Integer[] f421881E;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f421882i = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f421883j = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f421884k = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f421885l = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f421886m = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f421887n = {1, 9999, 11, 51, 5, 29, 354};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f421888o = {1, 9999, 11, 52, 6, 30, 355};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f421889p = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* renamed from: q, reason: collision with root package name */
    public static final char f421890q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f421891r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f421892s;
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: t, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f421893t;

    /* renamed from: u, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f421894u;

    /* renamed from: v, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f421895v;

    /* renamed from: w, reason: collision with root package name */
    public static final Long[] f421896w;

    /* renamed from: x, reason: collision with root package name */
    public static final Integer[] f421897x;

    /* renamed from: y, reason: collision with root package name */
    public static final Integer[] f421898y;

    /* renamed from: z, reason: collision with root package name */
    public static final Integer[] f421899z;

    /* renamed from: b, reason: collision with root package name */
    public final transient HijrahEra f421900b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f421901c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f421902d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f421903e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f421904f;

    /* renamed from: g, reason: collision with root package name */
    public final transient DayOfWeek f421905g;

    /* renamed from: h, reason: collision with root package name */
    public final long f421906h;

    /* compiled from: HijrahDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421907a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421907a = iArr;
            try {
                iArr[ChronoField.f422146w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421907a[ChronoField.f422147x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421907a[ChronoField.f422149z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421907a[ChronoField.f422122D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421907a[ChronoField.f422143t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421907a[ChronoField.f422144u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421907a[ChronoField.f422145v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f421907a[ChronoField.f422148y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f421907a[ChronoField.f422119A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f421907a[ChronoField.f422120B.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f421907a[ChronoField.f422123E.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f421907a[ChronoField.f422124F.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int i12 = 0;
        char c12 = File.separatorChar;
        f421890q = c12;
        f421891r = File.pathSeparator;
        f421892s = "org" + c12 + "threeten" + c12 + "bp" + c12 + "chrono";
        f421893t = new HashMap<>();
        f421894u = new HashMap<>();
        f421895v = new HashMap<>();
        f421877A = new Integer[12];
        int i13 = 0;
        while (true) {
            int[] iArr = f421882i;
            if (i13 >= 12) {
                break;
            }
            f421877A[i13] = Integer.valueOf(iArr[i13]);
            i13++;
        }
        f421878B = new Integer[12];
        int i14 = 0;
        while (true) {
            int[] iArr2 = f421883j;
            if (i14 >= 12) {
                break;
            }
            f421878B[i14] = Integer.valueOf(iArr2[i14]);
            i14++;
        }
        f421879C = new Integer[12];
        int i15 = 0;
        while (true) {
            int[] iArr3 = f421884k;
            if (i15 >= 12) {
                break;
            }
            f421879C[i15] = Integer.valueOf(iArr3[i15]);
            i15++;
        }
        f421880D = new Integer[12];
        int i16 = 0;
        while (true) {
            int[] iArr4 = f421885l;
            if (i16 >= 12) {
                break;
            }
            f421880D[i16] = Integer.valueOf(iArr4[i16]);
            i16++;
        }
        f421881E = new Integer[30];
        int i17 = 0;
        while (true) {
            int[] iArr5 = f421889p;
            if (i17 >= 30) {
                break;
            }
            f421881E[i17] = Integer.valueOf(iArr5[i17]);
            i17++;
        }
        f421896w = new Long[334];
        int i18 = 0;
        while (true) {
            Long[] lArr = f421896w;
            if (i18 >= lArr.length) {
                break;
            }
            lArr[i18] = Long.valueOf(i18 * 10631);
            i18++;
        }
        f421897x = new Integer[7];
        int i19 = 0;
        while (true) {
            int[] iArr6 = f421886m;
            if (i19 >= 7) {
                break;
            }
            f421897x[i19] = Integer.valueOf(iArr6[i19]);
            i19++;
        }
        f421898y = new Integer[7];
        int i22 = 0;
        while (true) {
            int[] iArr7 = f421887n;
            if (i22 >= 7) {
                break;
            }
            f421898y[i22] = Integer.valueOf(iArr7[i22]);
            i22++;
        }
        f421899z = new Integer[7];
        while (true) {
            int[] iArr8 = f421888o;
            if (i12 >= 7) {
                try {
                    S();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                f421899z[i12] = Integer.valueOf(iArr8[i12]);
                i12++;
            }
        }
    }

    public n(long j12) {
        int iIntValue;
        int iK2;
        int i12;
        int iH2;
        int i13;
        HijrahEra hijrahEra;
        int i14;
        Long l12;
        Long[] lArr = f421896w;
        long j13 = j12 - (-492148);
        if (j13 >= 0) {
            int i15 = 0;
            while (true) {
                try {
                    if (i15 >= lArr.length) {
                        i14 = ((int) j13) / 10631;
                        break;
                    } else {
                        if (j13 < lArr[i15].longValue()) {
                            i14 = i15 - 1;
                            break;
                        }
                        i15++;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    i14 = ((int) j13) / 10631;
                }
            }
            try {
                l12 = lArr[i14];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                l12 = null;
            }
            int iLongValue = (int) (j13 - (l12 == null ? Long.valueOf(i14 * 10631) : l12).longValue());
            int iL2 = L(i14, iLongValue);
            Integer[] numArrF = F(i14);
            iIntValue = iLongValue > 0 ? iLongValue - numArrF[iL2].intValue() : iLongValue + numArrF[iL2].intValue();
            int iA2 = C22026a.a(i14, 30, iL2, 1);
            iK2 = K(iIntValue, iA2);
            i12 = iA2;
            iH2 = H(iIntValue, iK2, iA2) + 1;
            i13 = 1;
        } else {
            int i16 = (int) j13;
            int i17 = i16 / 10631;
            int i18 = i16 % 10631;
            if (i18 == 0) {
                i17++;
                i18 = -10631;
            }
            int iL3 = L(i17, i18);
            Integer[] numArrF2 = F(i17);
            int iIntValue2 = i18 > 0 ? i18 - numArrF2[iL3].intValue() : i18 + numArrF2[iL3].intValue();
            int i19 = 1 - ((i17 * 30) - iL3);
            iIntValue = N((long) i19) ? iIntValue2 + 355 : iIntValue2 + 354;
            iK2 = K(iIntValue, i19);
            i12 = i19;
            iH2 = H(iIntValue, iK2, i19) + 1;
            i13 = 0;
        }
        int i22 = (int) ((j12 - (-492153)) % 7);
        int[] iArr = {i13, i12, iK2 + 1, iH2, iIntValue + 1, i22 + (i22 <= 0 ? 7 : 0)};
        int i23 = iArr[1];
        if (i23 < 1 || i23 > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
        int i24 = iArr[2];
        if (i24 < 1 || i24 > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
        E(iArr[3]);
        int i25 = iArr[4];
        if (i25 < 1 || i25 > f421899z[6].intValue()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
        int i26 = iArr[0];
        if (i26 == 0) {
            hijrahEra = HijrahEra.f421851b;
        } else {
            if (i26 != 1) {
                throw new DateTimeException("HijrahEra not valid");
            }
            hijrahEra = HijrahEra.f421852c;
        }
        this.f421900b = hijrahEra;
        this.f421901c = iArr[1];
        this.f421902d = iArr[2];
        this.f421903e = iArr[3];
        this.f421904f = iArr[4];
        this.f421905g = DayOfWeek.h(iArr[5]);
        this.f421906h = j12;
    }

    public static void E(int i12) {
        Integer[] numArr = f421899z;
        if (i12 < 1 || i12 > numArr[5].intValue()) {
            StringBuilder sbJ = G.j(i12, "Invalid day of month of Hijrah date, day ", " greater than ");
            sbJ.append(numArr[5].intValue());
            sbJ.append(" or less than 1");
            throw new DateTimeException(sbJ.toString());
        }
    }

    public static Integer[] F(int i12) {
        Integer[] numArr;
        try {
            numArr = f421895v.get(Integer.valueOf(i12));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? f421881E : numArr;
    }

    public static Integer[] G(int i12) {
        Integer[] numArr;
        try {
            numArr = f421893t.get(Integer.valueOf(i12));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? N((long) i12) ? f421878B : f421877A : numArr;
    }

    public static int H(int i12, int i13, int i14) {
        int iIntValue;
        Integer[] numArrG = G(i14);
        if (i12 < 0) {
            i12 = N((long) i14) ? i12 + 355 : i12 + 354;
            if (i13 <= 0) {
                return i12;
            }
            iIntValue = numArrG[i13].intValue();
        } else {
            if (i13 <= 0) {
                return i12;
            }
            iIntValue = numArrG[i13].intValue();
        }
        return i12 - iIntValue;
    }

    public static long J(int i12, int i13, int i14) {
        Long lValueOf;
        int i15 = i12 - 1;
        int i16 = i15 / 30;
        int i17 = i15 % 30;
        int iIntValue = F(i16)[Math.abs(i17)].intValue();
        if (i17 < 0) {
            iIntValue = -iIntValue;
        }
        try {
            lValueOf = f421896w[i16];
        } catch (ArrayIndexOutOfBoundsException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(i16 * 10631);
        }
        return ((lValueOf.longValue() + iIntValue) - 492149) + G(i12)[i13 - 1].intValue() + i14;
    }

    public static int K(int i12, int i13) {
        Integer[] numArrG = G(i13);
        int i14 = 0;
        if (i12 >= 0) {
            while (i14 < numArrG.length) {
                if (i12 < numArrG[i14].intValue()) {
                    return i14 - 1;
                }
                i14++;
            }
            return 11;
        }
        int i15 = N((long) i13) ? i12 + 355 : i12 + 354;
        while (i14 < numArrG.length) {
            if (i15 < numArrG[i14].intValue()) {
                return i14 - 1;
            }
            i14++;
        }
        return 11;
    }

    public static int L(int i12, long j12) {
        Integer[] numArrF = F(i12);
        int i13 = 0;
        if (j12 == 0) {
            return 0;
        }
        if (j12 > 0) {
            while (i13 < numArrF.length) {
                if (j12 < numArrF[i13].intValue()) {
                    return i13 - 1;
                }
                i13++;
            }
            return 29;
        }
        long j13 = -j12;
        while (i13 < numArrF.length) {
            if (j13 <= numArrF[i13].intValue()) {
                return i13 - 1;
            }
            i13++;
        }
        return 29;
    }

    public static boolean N(long j12) {
        if (j12 <= 0) {
            j12 = -j12;
        }
        return ((j12 * 11) + 14) % 30 < 11;
    }

    public static n O(int i12, int i13, int i14) {
        return i12 >= 1 ? P(HijrahEra.f421852c, i12, i13, i14) : P(HijrahEra.f421851b, 1 - i12, i13, i14);
    }

    public static n P(HijrahEra hijrahEra, int i12, int i13, int i14) {
        w81.d.f(hijrahEra, "era");
        if (i12 < 1 || i12 > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
        if (i13 < 1 || i13 > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
        E(i14);
        if (hijrahEra != HijrahEra.f421852c) {
            i12 = 1 - i12;
        }
        return new n(J(i12, i13, i14));
    }

    public static void Q(int i12, String str) throws NumberFormatException, ParseException {
        int i13;
        int i14;
        HashMap<Integer, Integer[]> map;
        HashMap<Integer, Integer[]> map2;
        int[] iArr;
        int[] iArr2;
        Long[] lArr;
        int i15 = i12;
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(58);
            if (iIndexOf == -1) {
                int i16 = i15;
                throw new ParseException(G.e(i16, "Offset has incorrect format at line ", "."), i16);
            }
            try {
                int i17 = Integer.parseInt(strNextToken.substring(iIndexOf + 1, strNextToken.length()));
                int iIndexOf2 = strNextToken.indexOf(45);
                if (iIndexOf2 == -1) {
                    int i18 = i15;
                    throw new ParseException(G.e(i18, "Start and end year/month has incorrect format at line ", "."), i18);
                }
                String strSubstring = strNextToken.substring(0, iIndexOf2);
                String strSubstring2 = strNextToken.substring(iIndexOf2 + 1, iIndexOf);
                int iIndexOf3 = strSubstring.indexOf(47);
                int iIndexOf4 = strSubstring2.indexOf(47);
                if (iIndexOf3 == -1) {
                    int i19 = i15;
                    throw new ParseException(G.e(i19, "Start year/month has incorrect format at line ", "."), i19);
                }
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                String strSubstring4 = strSubstring.substring(iIndexOf3 + 1, strSubstring.length());
                try {
                    int i22 = Integer.parseInt(strSubstring3);
                    try {
                        int i23 = Integer.parseInt(strSubstring4);
                        if (iIndexOf4 == -1) {
                            int i24 = i15;
                            throw new ParseException(G.e(i24, "End year/month has incorrect format at line ", "."), i24);
                        }
                        String strSubstring5 = strSubstring2.substring(0, iIndexOf4);
                        String strSubstring6 = strSubstring2.substring(iIndexOf4 + 1, strSubstring2.length());
                        try {
                            int i25 = Integer.parseInt(strSubstring5);
                            try {
                                int i26 = Integer.parseInt(strSubstring6);
                                if (i22 == -1 || i23 == -1 || i25 == -1 || i26 == -1) {
                                    throw new ParseException(G.e(i12, "Unknown error at line ", "."), i12);
                                }
                                if (i22 < 1) {
                                    throw new IllegalArgumentException("startYear < 1");
                                }
                                if (i25 < 1) {
                                    throw new IllegalArgumentException("endYear < 1");
                                }
                                if (i23 < 0 || i23 > 11) {
                                    throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
                                }
                                if (i26 < 0 || i26 > 11) {
                                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                                }
                                if (i25 > 9999) {
                                    throw new IllegalArgumentException("endYear > 9999");
                                }
                                if (i25 < i22) {
                                    throw new IllegalArgumentException("startYear > endYear");
                                }
                                if (i25 == i22 && i26 < i23) {
                                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                }
                                boolean zN2 = N(i22);
                                Integer numValueOf = Integer.valueOf(i22);
                                HashMap<Integer, Integer[]> map3 = f421893t;
                                Integer[] numArr = map3.get(numValueOf);
                                int[] iArr3 = f421882i;
                                int[] iArr4 = f421883j;
                                if (numArr == null) {
                                    if (zN2) {
                                        numArr = new Integer[iArr4.length];
                                        for (int i27 = 0; i27 < iArr4.length; i27++) {
                                            numArr[i27] = Integer.valueOf(iArr4[i27]);
                                        }
                                    } else {
                                        numArr = new Integer[iArr3.length];
                                        for (int i28 = 0; i28 < iArr3.length; i28++) {
                                            numArr[i28] = Integer.valueOf(iArr3[i28]);
                                        }
                                    }
                                }
                                Integer[] numArr2 = new Integer[numArr.length];
                                for (int i29 = 0; i29 < 12; i29++) {
                                    if (i29 > i23) {
                                        numArr2[i29] = Integer.valueOf(numArr[i29].intValue() - i17);
                                    } else {
                                        Integer num = numArr[i29];
                                        num.intValue();
                                        numArr2[i29] = num;
                                    }
                                }
                                map3.put(Integer.valueOf(i22), numArr2);
                                Integer numValueOf2 = Integer.valueOf(i22);
                                HashMap<Integer, Integer[]> map4 = f421894u;
                                Integer[] numArr3 = map4.get(numValueOf2);
                                int[] iArr5 = f421884k;
                                int[] iArr6 = f421885l;
                                if (numArr3 == null) {
                                    if (zN2) {
                                        numArr3 = new Integer[iArr6.length];
                                        for (int i32 = 0; i32 < iArr6.length; i32++) {
                                            numArr3[i32] = Integer.valueOf(iArr6[i32]);
                                        }
                                    } else {
                                        numArr3 = new Integer[iArr5.length];
                                        for (int i33 = 0; i33 < iArr5.length; i33++) {
                                            numArr3[i33] = Integer.valueOf(iArr5[i33]);
                                        }
                                    }
                                }
                                Integer[] numArr4 = new Integer[numArr3.length];
                                StringTokenizer stringTokenizer2 = stringTokenizer;
                                for (int i34 = 0; i34 < 12; i34++) {
                                    if (i34 == i23) {
                                        numArr4[i34] = Integer.valueOf(numArr3[i34].intValue() - i17);
                                    } else {
                                        Integer num2 = numArr3[i34];
                                        num2.intValue();
                                        numArr4[i34] = num2;
                                    }
                                }
                                map4.put(Integer.valueOf(i22), numArr4);
                                if (i22 != i25) {
                                    int i35 = i22 - 1;
                                    int i36 = i35 / 30;
                                    int i37 = i35 % 30;
                                    Integer numValueOf3 = Integer.valueOf(i36);
                                    HashMap<Integer, Integer[]> map5 = f421895v;
                                    Integer[] numArr5 = map5.get(numValueOf3);
                                    int[] iArr7 = f421889p;
                                    if (numArr5 == null) {
                                        int length = iArr7.length;
                                        i13 = i23;
                                        Integer[] numArr6 = new Integer[length];
                                        i14 = i22;
                                        for (int i38 = 0; i38 < length; i38++) {
                                            numArr6[i38] = Integer.valueOf(iArr7[i38]);
                                        }
                                        numArr5 = numArr6;
                                    } else {
                                        i13 = i23;
                                        i14 = i22;
                                    }
                                    for (int i39 = i37 + 1; i39 < iArr7.length; i39++) {
                                        numArr5[i39] = Integer.valueOf(numArr5[i39].intValue() - i17);
                                    }
                                    map5.put(Integer.valueOf(i36), numArr5);
                                    int i42 = i25 - 1;
                                    int i43 = i42 / 30;
                                    if (i36 != i43) {
                                        int i44 = i36 + 1;
                                        while (true) {
                                            lArr = f421896w;
                                            if (i44 >= lArr.length) {
                                                break;
                                            }
                                            lArr[i44] = Long.valueOf(lArr[i44].longValue() - i17);
                                            i44++;
                                            iArr3 = iArr3;
                                            iArr4 = iArr4;
                                        }
                                        iArr = iArr3;
                                        iArr2 = iArr4;
                                        int i45 = i43 + 1;
                                        while (i45 < lArr.length) {
                                            lArr[i45] = Long.valueOf(lArr[i45].longValue() + i17);
                                            i45++;
                                            map3 = map3;
                                            map4 = map4;
                                        }
                                        map = map4;
                                        map2 = map3;
                                    } else {
                                        map = map4;
                                        map2 = map3;
                                        iArr = iArr3;
                                        iArr2 = iArr4;
                                    }
                                    int i46 = i42 % 30;
                                    Integer[] numArr7 = map5.get(Integer.valueOf(i43));
                                    if (numArr7 == null) {
                                        int length2 = iArr7.length;
                                        Integer[] numArr8 = new Integer[length2];
                                        for (int i47 = 0; i47 < length2; i47++) {
                                            numArr8[i47] = Integer.valueOf(iArr7[i47]);
                                        }
                                        numArr7 = numArr8;
                                    }
                                    for (int i48 = i46 + 1; i48 < iArr7.length; i48++) {
                                        numArr7[i48] = Integer.valueOf(numArr7[i48].intValue() + i17);
                                    }
                                    map5.put(Integer.valueOf(i43), numArr7);
                                } else {
                                    i13 = i23;
                                    i14 = i22;
                                    map = map4;
                                    map2 = map3;
                                    iArr = iArr3;
                                    iArr2 = iArr4;
                                }
                                boolean zN3 = N(i25);
                                HashMap<Integer, Integer[]> map6 = map2;
                                Integer[] numArr9 = map6.get(Integer.valueOf(i25));
                                if (numArr9 == null) {
                                    if (zN3) {
                                        int[] iArr8 = iArr2;
                                        Integer[] numArr10 = new Integer[iArr8.length];
                                        for (int i49 = 0; i49 < iArr8.length; i49++) {
                                            numArr10[i49] = Integer.valueOf(iArr8[i49]);
                                        }
                                        numArr9 = numArr10;
                                    } else {
                                        numArr9 = new Integer[iArr.length];
                                        for (int i52 = 0; i52 < iArr.length; i52++) {
                                            numArr9[i52] = Integer.valueOf(iArr[i52]);
                                        }
                                    }
                                }
                                Integer[] numArr11 = new Integer[numArr9.length];
                                int i53 = 0;
                                for (int i54 = 12; i53 < i54; i54 = 12) {
                                    if (i53 > i26) {
                                        numArr11[i53] = Integer.valueOf(numArr9[i53].intValue() + i17);
                                    } else {
                                        Integer num3 = numArr9[i53];
                                        num3.intValue();
                                        numArr11[i53] = num3;
                                    }
                                    i53++;
                                }
                                map6.put(Integer.valueOf(i25), numArr11);
                                HashMap<Integer, Integer[]> map7 = map;
                                Integer[] numArr12 = map7.get(Integer.valueOf(i25));
                                if (numArr12 == null) {
                                    if (zN3) {
                                        numArr12 = new Integer[iArr6.length];
                                        for (int i55 = 0; i55 < iArr6.length; i55++) {
                                            numArr12[i55] = Integer.valueOf(iArr6[i55]);
                                        }
                                    } else {
                                        numArr12 = new Integer[iArr5.length];
                                        for (int i56 = 0; i56 < iArr5.length; i56++) {
                                            numArr12[i56] = Integer.valueOf(iArr5[i56]);
                                        }
                                    }
                                }
                                Integer[] numArr13 = new Integer[numArr12.length];
                                for (int i57 = 0; i57 < 12; i57++) {
                                    if (i57 == i26) {
                                        numArr13[i57] = Integer.valueOf(numArr12[i57].intValue() + i17);
                                    } else {
                                        Integer num4 = numArr12[i57];
                                        num4.intValue();
                                        numArr13[i57] = num4;
                                    }
                                }
                                map7.put(Integer.valueOf(i25), numArr13);
                                Integer[] numArr14 = map7.get(Integer.valueOf(i14));
                                Integer[] numArr15 = map7.get(Integer.valueOf(i25));
                                Integer[] numArr16 = map6.get(Integer.valueOf(i14));
                                Integer[] numArr17 = map6.get(Integer.valueOf(i25));
                                int iIntValue = numArr14[i13].intValue();
                                int iIntValue2 = numArr15[i26].intValue();
                                int iIntValue3 = numArr14[11].intValue() + numArr16[11].intValue();
                                int iIntValue4 = numArr15[11].intValue() + numArr17[11].intValue();
                                Integer[] numArr18 = f421899z;
                                int iIntValue5 = numArr18[5].intValue();
                                Integer[] numArr19 = f421898y;
                                int iIntValue6 = numArr19[5].intValue();
                                if (iIntValue5 < iIntValue) {
                                    iIntValue5 = iIntValue;
                                }
                                if (iIntValue5 < iIntValue2) {
                                    iIntValue5 = iIntValue2;
                                }
                                numArr18[5] = Integer.valueOf(iIntValue5);
                                if (iIntValue6 <= iIntValue) {
                                    iIntValue = iIntValue6;
                                }
                                if (iIntValue <= iIntValue2) {
                                    iIntValue2 = iIntValue;
                                }
                                numArr19[5] = Integer.valueOf(iIntValue2);
                                int iIntValue7 = numArr18[6].intValue();
                                int iIntValue8 = numArr19[6].intValue();
                                if (iIntValue7 < iIntValue3) {
                                    iIntValue7 = iIntValue3;
                                }
                                if (iIntValue7 < iIntValue4) {
                                    iIntValue7 = iIntValue4;
                                }
                                numArr18[6] = Integer.valueOf(iIntValue7);
                                if (iIntValue8 <= iIntValue3) {
                                    iIntValue3 = iIntValue8;
                                }
                                if (iIntValue3 <= iIntValue4) {
                                    iIntValue4 = iIntValue3;
                                }
                                numArr19[6] = Integer.valueOf(iIntValue4);
                                i15 = i12;
                                stringTokenizer = stringTokenizer2;
                            } catch (NumberFormatException unused) {
                                int i58 = i15;
                                throw new ParseException(G.e(i58, "End month is not properly set at line ", "."), i58);
                            }
                        } catch (NumberFormatException unused2) {
                            int i59 = i15;
                            throw new ParseException(G.e(i59, "End year is not properly set at line ", "."), i59);
                        }
                    } catch (NumberFormatException unused3) {
                        int i62 = i15;
                        throw new ParseException(G.e(i62, "Start month is not properly set at line ", "."), i62);
                    }
                } catch (NumberFormatException unused4) {
                    int i63 = i15;
                    throw new ParseException(G.e(i63, "Start year is not properly set at line ", "."), i63);
                }
            } catch (NumberFormatException unused5) {
                int i64 = i15;
                throw new ParseException(G.e(i64, "Offset is not properly set at line ", "."), i64);
            }
        }
    }

    public static void S() throws Throwable {
        InputStream fileInputStream;
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        BufferedReader bufferedReader = null;
        char c12 = f421890q;
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                StringBuilder sbR = H.r(property2);
                sbR.append(System.getProperty("file.separator"));
                property2 = sbR.toString();
            }
            File file = new File(H.i(c12, property2, property));
            fileInputStream = file.exists() ? new FileInputStream(file) : null;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f421891r);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                File file2 = new File(strNextToken);
                if (file2.exists()) {
                    boolean zIsDirectory = file2.isDirectory();
                    String str = f421892s;
                    if (!zIsDirectory) {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile == null) {
                            continue;
                        } else {
                            String strI = H.i(c12, str, property);
                            ZipEntry entry = zipFile.getEntry(strI);
                            if (entry == null) {
                                if (c12 == '/') {
                                    strI = strI.replace('/', '\\');
                                } else if (c12 == '\\') {
                                    strI = strI.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(strI);
                            }
                            if (entry != null) {
                                fileInputStream = zipFile.getInputStream(entry);
                                break;
                            }
                        }
                    } else if (new File(H.i(c12, strNextToken, str), property).exists()) {
                        fileInputStream = new FileInputStream(strNextToken + c12 + str + c12 + property);
                        break;
                    }
                }
            }
        }
        if (fileInputStream == null) {
            return;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
            int i12 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return;
                    } else {
                        i12++;
                        Q(i12, line.trim());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static n T(int i12, int i13, int i14) {
        int iIntValue = G(i12)[i13 - 1].intValue();
        if (i14 > iIntValue) {
            i14 = iIntValue;
        }
        return O(i12, i13, i14);
    }

    private Object readResolve() {
        return new n(this.f421906h);
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    @Override // org.threeten.bp.chrono.b
    public final b B(long j12) {
        if (j12 == 0) {
            return this;
        }
        int i12 = (this.f421902d - 1) + ((int) j12);
        int iK2 = i12 / 12;
        int i13 = i12 % 12;
        while (i13 < 0) {
            i13 += 12;
            iK2 = w81.d.k(iK2);
        }
        return P(this.f421900b, w81.d.g(this.f421901c, iK2), i13 + 1, this.f421903e);
    }

    @Override // org.threeten.bp.chrono.b
    public final b C(long j12) {
        if (j12 == 0) {
            return this;
        }
        return P(this.f421900b, w81.d.g(this.f421901c, (int) j12), this.f421902d, this.f421903e);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final n A(long j12) {
        return new n(this.f421906h + j12);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final n w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (n) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        chronoField.i(j12);
        int i12 = (int) j12;
        int iOrdinal = chronoField.ordinal();
        int i13 = this.f421903e;
        int i14 = this.f421902d;
        int i15 = this.f421901c;
        switch (iOrdinal) {
            case 15:
                return A(j12 - this.f421905g.d());
            case 16:
                return A(j12 - m(ChronoField.f422144u));
            case 17:
                return A(j12 - m(ChronoField.f422145v));
            case 18:
                return T(i15, i14, i12);
            case 19:
                int i16 = i12 - 1;
                return T(i15, (i16 / 30) + 1, (i16 % 30) + 1);
            case 20:
                return new n(i12);
            case 21:
                return A((j12 - m(ChronoField.f422149z)) * 7);
            case 22:
                return A((j12 - m(ChronoField.f422119A)) * 7);
            case 23:
                return T(i15, i12, i13);
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (i15 < 1) {
                    i12 = 1 - i12;
                }
                return T(i12, i14, i13);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return T(i12, i14, i13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return T(1 - i15, i14, i13);
        }
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        int iIntValue;
        if (!(hVar instanceof ChronoField)) {
            return hVar.d(this);
        }
        if (!l(hVar)) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        ChronoField chronoField = (ChronoField) hVar;
        int iOrdinal = chronoField.ordinal();
        Integer[] numArr = null;
        int i12 = this.f421901c;
        if (iOrdinal == 18) {
            int i13 = this.f421902d - 1;
            try {
                numArr = f421894u.get(Integer.valueOf(i12));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (numArr == null) {
                numArr = N((long) i12) ? f421880D : f421879C;
            }
            return org.threeten.bp.temporal.l.d(1L, numArr[i13].intValue());
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 21) {
                return org.threeten.bp.temporal.l.d(1L, 5L);
            }
            if (iOrdinal == 25) {
                return org.threeten.bp.temporal.l.d(1L, 1000L);
            }
            m.f421876d.getClass();
            return chronoField.f422152d;
        }
        int i14 = i12 - 1;
        int i15 = i14 / 30;
        try {
            numArr = f421895v.get(Integer.valueOf(i15));
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
        if (numArr != null) {
            int i16 = i14 % 30;
            if (i16 == 29) {
                Long[] lArr = f421896w;
                iIntValue = (lArr[i15 + 1].intValue() - lArr[i15].intValue()) - numArr[i16].intValue();
            } else {
                iIntValue = numArr[i16 + 1].intValue() - numArr[i16].intValue();
            }
        } else {
            iIntValue = N((long) i12) ? 355 : 354;
        }
        return org.threeten.bp.temporal.l.d(1L, iIntValue);
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(org.threeten.bp.e eVar) {
        return (n) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (n) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        int i12 = this.f421901c;
        int i13 = this.f421903e;
        int i14 = this.f421904f;
        switch (iOrdinal) {
            case 15:
                return this.f421905g.d();
            case 16:
                return ((i13 - 1) % 7) + 1;
            case 17:
                return ((i14 - 1) % 7) + 1;
            case 18:
                return i13;
            case 19:
                return i14;
            case 20:
                return v();
            case 21:
                return androidx.appcompat.app.r.f(i13, 1, 7, 1);
            case 22:
                return androidx.appcompat.app.r.f(i14, 1, 7, 1);
            case 23:
                return this.f421902d;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return i12;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return i12;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return this.f421900b.ordinal();
        }
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.c
    /* renamed from: n */
    public final org.threeten.bp.temporal.c r(long j12, org.threeten.bp.temporal.k kVar) {
        return (n) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<n> o(org.threeten.bp.g gVar) {
        return new e(this, gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final j q() {
        return m.f421876d;
    }

    @Override // org.threeten.bp.chrono.c
    public final l r() {
        return this.f421900b;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: s */
    public final c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (n) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    /* renamed from: t */
    public final c r(long j12, org.threeten.bp.temporal.k kVar) {
        return (n) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final c u(org.threeten.bp.temporal.g gVar) {
        return (n) super.u(gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final long v() {
        return J(this.f421901c, this.f421902d, this.f421903e);
    }

    @Override // org.threeten.bp.chrono.c
    public final c x(org.threeten.bp.temporal.e eVar) {
        return (n) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: z */
    public final b r(long j12, org.threeten.bp.temporal.k kVar) {
        return (n) super.r(j12, kVar);
    }
}
