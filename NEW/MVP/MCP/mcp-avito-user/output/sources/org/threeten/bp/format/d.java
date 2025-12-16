package org.threeten.bp.format;

import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.huawei.hms.framework.common.ExceptionCode;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.format.f;
import org.threeten.bp.format.f.b;
import org.threeten.bp.format.i;
import org.threeten.bp.format.l;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.zone.ZoneRulesException;
import w81.AbstractC49471c;

/* compiled from: DateTimeFormatterBuilder.java */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final org.threeten.bp.temporal.j<org.threeten.bp.o> f421984h = new a();

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f421985i;

    /* renamed from: j, reason: collision with root package name */
    public static final Comparator<String> f421986j;

    /* renamed from: a, reason: collision with root package name */
    public d f421987a;

    /* renamed from: b, reason: collision with root package name */
    public final d f421988b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f421989c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f421990d;

    /* renamed from: e, reason: collision with root package name */
    public int f421991e;

    /* renamed from: f, reason: collision with root package name */
    public char f421992f;

    /* renamed from: g, reason: collision with root package name */
    public int f421993g;

    /* compiled from: DateTimeFormatterBuilder.java */
    public class a implements org.threeten.bp.temporal.j<org.threeten.bp.o> {
        @Override // org.threeten.bp.temporal.j
        public final org.threeten.bp.o a(org.threeten.bp.temporal.d dVar) {
            org.threeten.bp.o oVar = (org.threeten.bp.o) dVar.f(org.threeten.bp.temporal.i.f422198a);
            if (oVar == null || (oVar instanceof org.threeten.bp.q)) {
                return null;
            }
            return oVar;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public class b implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            return str3.length() == str4.length() ? str3.compareTo(str4) : str3.length() - str4.length();
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421994a;

        static {
            int[] iArr = new int[SignStyle.values().length];
            f421994a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421994a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421994a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421994a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.d$d, reason: collision with other inner class name */
    public static final class C12240d implements g {

        /* renamed from: b, reason: collision with root package name */
        public final char f421995b;

        public C12240d(char c12) {
            this.f421995b = c12;
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            if (i12 == charSequence.length()) {
                return ~i12;
            }
            return !fVar.a(this.f421995b, charSequence.charAt(i12)) ? ~i12 : i12 + 1;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            sb2.append(this.f421995b);
            return true;
        }

        public final String toString() {
            char c12 = this.f421995b;
            if (c12 == '\'') {
                return "''";
            }
            return "'" + c12 + "'";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class e implements g {
        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            if (i12 < 0 || i12 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            org.threeten.bp.chrono.j.m();
            Iterator it = new HashSet(org.threeten.bp.chrono.j.f421874b.values()).iterator();
            org.threeten.bp.chrono.j jVar = null;
            int i13 = -1;
            while (it.hasNext()) {
                org.threeten.bp.chrono.j jVar2 = (org.threeten.bp.chrono.j) it.next();
                String strL = jVar2.l();
                int length = strL.length();
                if (length > i13 && fVar.f(charSequence, i12, strL, 0, length)) {
                    jVar = jVar2;
                    i13 = length;
                }
            }
            if (jVar == null) {
                return ~i12;
            }
            f.b bVarB = fVar.b();
            bVarB.f422045b = jVar;
            if (bVarB.f422050g != null) {
                ArrayList arrayList = new ArrayList(bVarB.f422050g);
                bVarB.f422050g.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object[] objArr = (Object[]) it2.next();
                    ((p) objArr[0]).e(fVar, ((Long) objArr[1]).longValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
                }
            }
            return i12 + i13;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            org.threeten.bp.chrono.j jVar = (org.threeten.bp.chrono.j) hVar.b(org.threeten.bp.temporal.i.f422199b);
            if (jVar == null) {
                return false;
            }
            sb2.append(jVar.l());
            return true;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class f implements g {

        /* renamed from: b, reason: collision with root package name */
        public final g[] f421996b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f421997c;

        public f(ArrayList arrayList, boolean z12) {
            this((g[]) arrayList.toArray(new g[arrayList.size()]), z12);
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            boolean z12 = this.f421997c;
            g[] gVarArr = this.f421996b;
            int i13 = 0;
            if (!z12) {
                int length = gVarArr.length;
                while (i13 < length) {
                    i12 = gVarArr[i13].a(fVar, charSequence, i12);
                    if (i12 < 0) {
                        break;
                    }
                    i13++;
                }
                return i12;
            }
            ArrayList<f.b> arrayList = fVar.f422044f;
            f.b bVarB = fVar.b();
            f.b bVar = org.threeten.bp.format.f.this.new b();
            bVar.f422045b = bVarB.f422045b;
            bVar.f422046c = bVarB.f422046c;
            bVar.f422047d.putAll(bVarB.f422047d);
            bVar.f422048e = bVarB.f422048e;
            arrayList.add(bVar);
            int length2 = gVarArr.length;
            int iA2 = i12;
            while (i13 < length2) {
                iA2 = gVarArr[i13].a(fVar, charSequence, iA2);
                if (iA2 < 0) {
                    C22026a.e(1, arrayList);
                    return i12;
                }
                i13++;
            }
            C22026a.e(2, arrayList);
            return iA2;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            int length = sb2.length();
            boolean z12 = this.f421997c;
            if (z12) {
                hVar.f422059d++;
            }
            try {
                for (g gVar : this.f421996b) {
                    if (!gVar.b(hVar, sb2)) {
                        sb2.setLength(length);
                        return true;
                    }
                }
                if (z12) {
                    hVar.f422059d--;
                }
                return true;
            } finally {
                if (z12) {
                    hVar.f422059d--;
                }
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            g[] gVarArr = this.f421996b;
            if (gVarArr != null) {
                boolean z12 = this.f421997c;
                sb2.append(z12 ? "[" : "(");
                for (g gVar : gVarArr) {
                    sb2.append(gVar);
                }
                sb2.append(z12 ? "]" : ")");
            }
            return sb2.toString();
        }

        public f(g[] gVarArr, boolean z12) {
            this.f421996b = gVarArr;
            this.f421997c = z12;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public interface g {
        int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12);

        boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2);
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class h implements g {
        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            if (fVar.c(null) == null) {
                fVar.e(null, 0L, i12, i12);
            }
            return i12;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            return true;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class i implements g {

        /* renamed from: b, reason: collision with root package name */
        public final ChronoField f421998b;

        /* renamed from: c, reason: collision with root package name */
        public final int f421999c;

        /* renamed from: d, reason: collision with root package name */
        public final int f422000d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f422001e;

        public i(ChronoField chronoField, int i12, int i13, boolean z12) {
            w81.d.f(chronoField, "field");
            org.threeten.bp.temporal.l lVar = chronoField.f422152d;
            if (lVar.f422205b != lVar.f422206c || lVar.f422207d != lVar.f422208e) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + chronoField);
            }
            if (i12 < 0 || i12 > 9) {
                throw new IllegalArgumentException(AK.c.g(i12, "Minimum width must be from 0 to 9 inclusive but was "));
            }
            if (i13 < 1 || i13 > 9) {
                throw new IllegalArgumentException(AK.c.g(i13, "Maximum width must be from 1 to 9 inclusive but was "));
            }
            if (i13 < i12) {
                throw new IllegalArgumentException(H.j(i13, i12, "Maximum width must exceed or equal the minimum width but ", " < "));
            }
            this.f421998b = chronoField;
            this.f421999c = i12;
            this.f422000d = i13;
            this.f422001e = z12;
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            boolean z12 = fVar.f422043e;
            int i13 = z12 ? this.f421999c : 0;
            int i14 = z12 ? this.f422000d : 9;
            int length = charSequence.length();
            if (i12 == length) {
                return i13 > 0 ? ~i12 : i12;
            }
            org.threeten.bp.format.j jVar = fVar.f422040b;
            if (this.f422001e) {
                char cCharAt = charSequence.charAt(i12);
                jVar.getClass();
                if (cCharAt != '.') {
                    return i13 > 0 ? ~i12 : i12;
                }
                i12++;
            }
            int i15 = i12;
            int i16 = i13 + i15;
            if (i16 > length) {
                return ~i15;
            }
            int iMin = Math.min(i14 + i15, length);
            int i17 = 0;
            int i18 = i15;
            while (true) {
                if (i18 >= iMin) {
                    break;
                }
                int i19 = i18 + 1;
                char cCharAt2 = charSequence.charAt(i18);
                jVar.getClass();
                int i22 = cCharAt2 - '0';
                if (i22 < 0 || i22 > 9) {
                    i22 = -1;
                }
                if (i22 >= 0) {
                    i17 = (i17 * 10) + i22;
                    i18 = i19;
                } else if (i19 < i16) {
                    return ~i15;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i17).movePointLeft(i18 - i15);
            org.threeten.bp.temporal.l lVar = this.f421998b.f422152d;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(lVar.f422205b);
            return fVar.e(this.f421998b, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(lVar.f422208e).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i15, i18);
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            ChronoField chronoField = this.f421998b;
            Long lA2 = hVar.a(chronoField);
            if (lA2 == null) {
                return false;
            }
            long jLongValue = lA2.longValue();
            org.threeten.bp.temporal.l lVar = chronoField.f422152d;
            lVar.b(jLongValue, chronoField);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(lVar.f422205b);
            BigDecimal bigDecimalAdd = BigDecimal.valueOf(lVar.f422208e).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
            BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
            RoundingMode roundingMode = RoundingMode.FLOOR;
            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
                bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
            }
            int iScale = bigDecimal.scale();
            org.threeten.bp.format.j jVar = hVar.f422058c;
            boolean z12 = this.f422001e;
            int i12 = this.f421999c;
            if (iScale != 0) {
                String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i12), this.f422000d), roundingMode).toPlainString().substring(2);
                jVar.getClass();
                if (z12) {
                    sb2.append('.');
                }
                sb2.append(strSubstring);
                return true;
            }
            if (i12 <= 0) {
                return true;
            }
            if (z12) {
                jVar.getClass();
                sb2.append('.');
            }
            for (int i13 = 0; i13 < i12; i13++) {
                jVar.getClass();
                sb2.append('0');
            }
            return true;
        }

        public final String toString() {
            return "Fraction(" + this.f421998b + "," + this.f421999c + "," + this.f422000d + (this.f422001e ? ",DecimalPoint" : "") + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class j implements g {
        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            org.threeten.bp.format.f fVar2 = new org.threeten.bp.format.f(fVar);
            d dVar = new d();
            dVar.a(org.threeten.bp.format.c.f421976f);
            dVar.c('T');
            ChronoField chronoField = ChronoField.f422140q;
            dVar.l(chronoField, 2);
            dVar.c(':');
            ChronoField chronoField2 = ChronoField.f422136m;
            dVar.l(chronoField2, 2);
            dVar.c(':');
            ChronoField chronoField3 = ChronoField.f422134k;
            dVar.l(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.f422128e;
            int i13 = 1;
            dVar.b(new i(chronoField4, 0, 9, true));
            dVar.c('Z');
            f fVar3 = dVar.p().f421979a;
            if (fVar3.f421997c) {
                fVar3 = new f(fVar3.f421996b, false);
            }
            int iA2 = fVar3.a(fVar2, charSequence, i12);
            if (iA2 < 0) {
                return iA2;
            }
            long jLongValue = fVar2.c(ChronoField.f422123E).longValue();
            int iIntValue = fVar2.c(ChronoField.f422120B).intValue();
            int iIntValue2 = fVar2.c(ChronoField.f422146w).intValue();
            int iIntValue3 = fVar2.c(chronoField).intValue();
            int iIntValue4 = fVar2.c(chronoField2).intValue();
            Long lC2 = fVar2.c(chronoField3);
            Long lC3 = fVar2.c(chronoField4);
            int iIntValue5 = lC2 != null ? lC2.intValue() : 0;
            int iIntValue6 = lC3 != null ? lC3.intValue() : 0;
            int i14 = ((int) jLongValue) % 10000;
            if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                iIntValue3 = 0;
            } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                fVar.b().f422048e = true;
                i13 = 0;
                iIntValue5 = 59;
            } else {
                i13 = 0;
            }
            try {
                org.threeten.bp.f fVar4 = org.threeten.bp.f.f421946d;
                return fVar.e(chronoField4, iIntValue6, i12, fVar.e(ChronoField.f422125G, w81.d.j(jLongValue / 10000, 315569520000L) + new org.threeten.bp.f(org.threeten.bp.e.N(i14, iIntValue, iIntValue2), org.threeten.bp.g.v(iIntValue3, iIntValue4, iIntValue5, 0)).K(i13).s(org.threeten.bp.q.f422106g), i12, iA2));
            } catch (RuntimeException unused) {
                return ~i12;
            }
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            Long lA2 = hVar.a(ChronoField.f422125G);
            ChronoField chronoField = ChronoField.f422128e;
            AbstractC49471c abstractC49471c = hVar.f422056a;
            Long lValueOf = abstractC49471c.l(chronoField) ? Long.valueOf(abstractC49471c.m(chronoField)) : 0L;
            if (lA2 == null) {
                return false;
            }
            long jLongValue = lA2.longValue();
            int iA2 = chronoField.f422152d.a(lValueOf.longValue(), chronoField);
            if (jLongValue >= -62167219200L) {
                long j12 = jLongValue - 253402300800L;
                long jC2 = w81.d.c(j12, 315569520000L) + 1;
                org.threeten.bp.f fVarH = org.threeten.bp.f.H((((j12 % 315569520000L) + 315569520000L) % 315569520000L) - 62167219200L, 0, org.threeten.bp.q.f422106g);
                if (jC2 > 0) {
                    sb2.append('+');
                    sb2.append(jC2);
                }
                sb2.append(fVarH);
                if (fVarH.f421949c.f422074d == 0) {
                    sb2.append(":00");
                }
            } else {
                long j13 = jLongValue + 62167219200L;
                long j14 = j13 / 315569520000L;
                long j15 = j13 % 315569520000L;
                org.threeten.bp.f fVarH2 = org.threeten.bp.f.H(j15 - 62167219200L, 0, org.threeten.bp.q.f422106g);
                int length = sb2.length();
                sb2.append(fVarH2);
                if (fVarH2.f421949c.f422074d == 0) {
                    sb2.append(":00");
                }
                if (j14 < 0) {
                    if (fVarH2.f421948b.f421941b == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j14 - 1));
                    } else if (j15 == 0) {
                        sb2.insert(length, j14);
                    } else {
                        sb2.insert(length + 1, Math.abs(j14));
                    }
                }
            }
            if (iA2 != 0) {
                sb2.append('.');
                if (iA2 % 1000000 == 0) {
                    sb2.append(Integer.toString((iA2 / 1000000) + 1000).substring(1));
                } else if (iA2 % 1000 == 0) {
                    sb2.append(Integer.toString((iA2 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(iA2 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
            sb2.append('Z');
            return true;
        }

        public final String toString() {
            return "Instant()";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class k implements g {

        /* renamed from: b, reason: collision with root package name */
        public final TextStyle f422002b;

        public k(TextStyle textStyle) {
            this.f422002b = textStyle;
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            char cCharAt;
            if (!fVar.f(charSequence, i12, "GMT", 0, 3)) {
                return ~i12;
            }
            int i13 = i12 + 3;
            if (this.f422002b == TextStyle.f421962b) {
                return new n("", "+HH:MM:ss").a(fVar, charSequence, i13);
            }
            int length = charSequence.length();
            if (i13 == length) {
                return fVar.e(ChronoField.f422126H, 0L, i13, i13);
            }
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 != '+' && cCharAt2 != '-') {
                return fVar.e(ChronoField.f422126H, 0L, i13, i13);
            }
            int i14 = cCharAt2 == '-' ? -1 : 1;
            if (i13 == length) {
                return ~i13;
            }
            int i15 = i12 + 4;
            char cCharAt3 = charSequence.charAt(i15);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i15;
            }
            int i16 = i12 + 5;
            int i17 = cCharAt3 - '0';
            if (i16 != length && (cCharAt = charSequence.charAt(i16)) >= '0' && cCharAt <= '9') {
                i17 = (i17 * 10) + (cCharAt - '0');
                if (i17 > 23) {
                    return ~i16;
                }
                i16 = i12 + 6;
            }
            int i18 = i16;
            if (i18 == length || charSequence.charAt(i18) != ':') {
                return fVar.e(ChronoField.f422126H, i14 * 3600 * i17, i18, i18);
            }
            int i19 = i18 + 1;
            int i22 = length - 2;
            if (i19 > i22) {
                return ~i19;
            }
            char cCharAt4 = charSequence.charAt(i19);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                return ~i19;
            }
            int i23 = i18 + 2;
            int i24 = cCharAt4 - '0';
            char cCharAt5 = charSequence.charAt(i23);
            if (cCharAt5 < '0' || cCharAt5 > '9') {
                return ~i23;
            }
            int i25 = i18 + 3;
            if ((cCharAt5 - '0') + (i24 * 10) > 59) {
                return ~i25;
            }
            if (i25 == length || charSequence.charAt(i25) != ':') {
                return fVar.e(ChronoField.f422126H, ((r12 * 60) + (i17 * 3600)) * i14, i25, i25);
            }
            int i26 = i18 + 4;
            if (i26 > i22) {
                return ~i26;
            }
            char cCharAt6 = charSequence.charAt(i26);
            if (cCharAt6 < '0' || cCharAt6 > '9') {
                return ~i26;
            }
            int i27 = i18 + 5;
            int i28 = cCharAt6 - '0';
            char cCharAt7 = charSequence.charAt(i27);
            if (cCharAt7 < '0' || cCharAt7 > '9') {
                return ~i27;
            }
            int i29 = i18 + 6;
            return (cCharAt7 - '0') + (i28 * 10) > 59 ? ~i29 : fVar.e(ChronoField.f422126H, ((r12 * 60) + (i17 * 3600) + r6) * i14, i29, i29);
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            Long lA2 = hVar.a(ChronoField.f422126H);
            if (lA2 == null) {
                return false;
            }
            sb2.append("GMT");
            if (this.f422002b == TextStyle.f421962b) {
                return new n("", "+HH:MM:ss").b(hVar, sb2);
            }
            int iM2 = w81.d.m(lA2.longValue());
            if (iM2 == 0) {
                return true;
            }
            int iAbs = Math.abs((iM2 / 3600) % 100);
            int iAbs2 = Math.abs((iM2 / 60) % 60);
            int iAbs3 = Math.abs(iM2 % 60);
            sb2.append(iM2 < 0 ? "-" : "+");
            sb2.append(iAbs);
            if (iAbs2 <= 0 && iAbs3 <= 0) {
                return true;
            }
            sb2.append(":");
            sb2.append((char) ((iAbs2 / 10) + 48));
            sb2.append((char) ((iAbs2 % 10) + 48));
            if (iAbs3 <= 0) {
                return true;
            }
            sb2.append(":");
            sb2.append((char) ((iAbs3 / 10) + 48));
            sb2.append((char) ((iAbs3 % 10) + 48));
            return true;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class l implements g {
        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            if (fVar.b().f422045b == null && fVar.f422041c == null) {
                org.threeten.bp.chrono.o oVar = org.threeten.bp.chrono.o.f421908d;
            }
            new org.threeten.bp.format.k();
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            org.threeten.bp.chrono.j.i(hVar.f422056a);
            new org.threeten.bp.format.k();
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }

        public final String toString() {
            return "Localized(" + ((Object) "") + "," + ((Object) "") + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class m implements g {

        /* renamed from: g, reason: collision with root package name */
        public static final int[] f422003g = {0, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

        /* renamed from: b, reason: collision with root package name */
        public final org.threeten.bp.temporal.h f422004b;

        /* renamed from: c, reason: collision with root package name */
        public final int f422005c;

        /* renamed from: d, reason: collision with root package name */
        public final int f422006d;

        /* renamed from: e, reason: collision with root package name */
        public final SignStyle f422007e;

        /* renamed from: f, reason: collision with root package name */
        public final int f422008f;

        public /* synthetic */ m(org.threeten.bp.temporal.h hVar, int i12, int i13, SignStyle signStyle, int i14, a aVar) {
            this(hVar, i12, i13, signStyle, i14);
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0133, code lost:
        
            if (r3 == false) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0135, code lost:
        
            if (r0 > r9) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x013a, code lost:
        
            return ~(r5 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x013b, code lost:
        
            if (r0 <= r9) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x013e, code lost:
        
            return ~r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x013f, code lost:
        
            if (r2 == null) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0147, code lost:
        
            if (r2.bitLength() <= 63) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0149, code lost:
        
            r2 = r2.divide(java.math.BigInteger.TEN);
            r15 = r15 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x015f, code lost:
        
            return e(r26, r2.longValue(), r5, r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x016b, code lost:
        
            return e(r26, r10, r5, r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00f7, code lost:
        
            r2 = r18;
            r10 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0101, code lost:
        
            if (r0 == false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0103, code lost:
        
            if (r2 == null) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x010b, code lost:
        
            if (r2.equals(java.math.BigInteger.ZERO) == false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x010f, code lost:
        
            if (r26.f422043e == false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0114, code lost:
        
            return ~(r5 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0115, code lost:
        
            r2 = r2.negate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x011c, code lost:
        
            if (r10 != 0) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0120, code lost:
        
            if (r26.f422043e == false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0125, code lost:
        
            return ~(r5 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0126, code lost:
        
            r10 = -r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x012b, code lost:
        
            if (r8 != org.threeten.bp.format.SignStyle.f421960e) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x012f, code lost:
        
            if (r26.f422043e == false) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0131, code lost:
        
            r0 = r15 - r5;
         */
        @Override // org.threeten.bp.format.d.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int a(org.threeten.bp.format.f r26, java.lang.CharSequence r27, int r28) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.m.a(org.threeten.bp.format.f, java.lang.CharSequence, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
        @Override // org.threeten.bp.format.d.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(org.threeten.bp.format.h r12, java.lang.StringBuilder r13) {
            /*
                r11 = this;
                org.threeten.bp.temporal.h r0 = r11.f422004b
                java.lang.Long r1 = r12.a(r0)
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                long r3 = r1.longValue()
                long r3 = r11.c(r12, r3)
                r5 = -9223372036854775808
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L1b
                java.lang.String r1 = "9223372036854775808"
                goto L23
            L1b:
                long r5 = java.lang.Math.abs(r3)
                java.lang.String r1 = java.lang.Long.toString(r5)
            L23:
                int r5 = r1.length()
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                int r8 = r11.f422006d
                if (r5 > r8) goto La4
                org.threeten.bp.format.j r12 = r12.f422058c
                r12.getClass()
                r8 = 0
                int r12 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                r5 = 1
                int r8 = r11.f422005c
                r9 = 4
                org.threeten.bp.format.SignStyle r10 = r11.f422007e
                if (r12 < 0) goto L60
                int r12 = r10.ordinal()
                r0 = 43
                if (r12 == r5) goto L5c
                if (r12 == r9) goto L4b
                goto L90
            L4b:
                r12 = 19
                if (r8 >= r12) goto L90
                int[] r12 = org.threeten.bp.format.d.m.f422003g
                r12 = r12[r8]
                long r6 = (long) r12
                int r12 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r12 < 0) goto L90
                r13.append(r0)
                goto L90
            L5c:
                r13.append(r0)
                goto L90
            L60:
                int r12 = r10.ordinal()
                if (r12 == 0) goto L8b
                if (r12 == r5) goto L8b
                r10 = 3
                if (r12 == r10) goto L6e
                if (r12 == r9) goto L8b
                goto L90
            L6e:
                org.threeten.bp.DateTimeException r12 = new org.threeten.bp.DateTimeException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>(r7)
                r13.append(r0)
                r13.append(r6)
                r13.append(r3)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L8b:
                r12 = 45
                r13.append(r12)
            L90:
                int r12 = r1.length()
                int r12 = r8 - r12
                if (r2 >= r12) goto La0
                r12 = 48
                r13.append(r12)
                int r2 = r2 + 1
                goto L90
            La0:
                r13.append(r1)
                return r5
            La4:
                org.threeten.bp.DateTimeException r12 = new org.threeten.bp.DateTimeException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>(r7)
                r13.append(r0)
                r13.append(r6)
                r13.append(r3)
                java.lang.String r0 = " exceeds the maximum print width of "
                r13.append(r0)
                r13.append(r8)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.m.b(org.threeten.bp.format.h, java.lang.StringBuilder):boolean");
        }

        public boolean d(org.threeten.bp.format.f fVar) {
            int i12 = this.f422008f;
            if (i12 != -1) {
                if (i12 > 0 && this.f422005c == this.f422006d) {
                    if (this.f422007e == SignStyle.f421959d) {
                    }
                }
                return false;
            }
            return true;
        }

        public int e(org.threeten.bp.format.f fVar, long j12, int i12, int i13) {
            return fVar.e(this.f422004b, j12, i12, i13);
        }

        public m f() {
            if (this.f422008f == -1) {
                return this;
            }
            return new m(this.f422004b, this.f422005c, this.f422006d, this.f422007e, -1);
        }

        public m g(int i12) {
            int i13 = this.f422008f + i12;
            return new m(this.f422004b, this.f422005c, this.f422006d, this.f422007e, i13);
        }

        public String toString() {
            org.threeten.bp.temporal.h hVar = this.f422004b;
            SignStyle signStyle = this.f422007e;
            int i12 = this.f422006d;
            int i13 = this.f422005c;
            if (i13 == 1 && i12 == 19 && signStyle == SignStyle.f421957b) {
                return "Value(" + hVar + ")";
            }
            if (i13 == i12 && signStyle == SignStyle.f421959d) {
                return "Value(" + hVar + "," + i13 + ")";
            }
            return "Value(" + hVar + "," + i13 + "," + i12 + "," + signStyle + ")";
        }

        public m(org.threeten.bp.temporal.h hVar, int i12, int i13, SignStyle signStyle) {
            this.f422004b = hVar;
            this.f422005c = i12;
            this.f422006d = i13;
            this.f422007e = signStyle;
            this.f422008f = 0;
        }

        public m(org.threeten.bp.temporal.h hVar, int i12, int i13, SignStyle signStyle, int i14) {
            this.f422004b = hVar;
            this.f422005c = i12;
            this.f422006d = i13;
            this.f422007e = signStyle;
            this.f422008f = i14;
        }

        public long c(org.threeten.bp.format.h hVar, long j12) {
            return j12;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class n implements g {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f422009d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: e, reason: collision with root package name */
        public static final n f422010e = new n("Z", "+HH:MM:ss");

        /* renamed from: f, reason: collision with root package name */
        public static final n f422011f = new n("0", "+HH:MM:ss");

        /* renamed from: b, reason: collision with root package name */
        public final String f422012b;

        /* renamed from: c, reason: collision with root package name */
        public final int f422013c;

        public n(String str, String str2) {
            w81.d.f(str2, "pattern");
            this.f422012b = str;
            int i12 = 0;
            while (true) {
                String[] strArr = f422009d;
                if (i12 >= 9) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str2));
                }
                if (strArr[i12].equals(str2)) {
                    this.f422013c = i12;
                    return;
                }
                i12++;
            }
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            int length = charSequence.length();
            int length2 = this.f422012b.length();
            if (length2 == 0) {
                if (i12 == length) {
                    return fVar.e(ChronoField.f422126H, 0L, i12, i12);
                }
            } else {
                if (i12 == length) {
                    return ~i12;
                }
                if (fVar.f(charSequence, i12, this.f422012b, 0, length2)) {
                    return fVar.e(ChronoField.f422126H, 0L, i12, i12 + length2);
                }
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '+' || cCharAt == '-') {
                int i13 = cCharAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i12 + 1;
                if (!c(iArr, 1, charSequence, true)) {
                    if (!c(iArr, 2, charSequence, this.f422013c >= 3) && !c(iArr, 3, charSequence, false)) {
                        return fVar.e(ChronoField.f422126H, ((iArr[2] * 60) + (iArr[1] * 3600) + iArr[3]) * i13, i12, iArr[0]);
                    }
                }
            }
            return length2 == 0 ? fVar.e(ChronoField.f422126H, 0L, i12, i12 + length2) : ~i12;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            Long lA2 = hVar.a(ChronoField.f422126H);
            if (lA2 == null) {
                return false;
            }
            int iM2 = w81.d.m(lA2.longValue());
            String str = this.f422012b;
            if (iM2 == 0) {
                sb2.append(str);
            } else {
                int iAbs = Math.abs((iM2 / 3600) % 100);
                int iAbs2 = Math.abs((iM2 / 60) % 60);
                int iAbs3 = Math.abs(iM2 % 60);
                int length = sb2.length();
                sb2.append(iM2 < 0 ? "-" : "+");
                sb2.append((char) ((iAbs / 10) + 48));
                sb2.append((char) ((iAbs % 10) + 48));
                int i12 = this.f422013c;
                if (i12 >= 3 || (i12 >= 1 && iAbs2 > 0)) {
                    int i13 = i12 % 2;
                    sb2.append(i13 == 0 ? ":" : "");
                    sb2.append((char) ((iAbs2 / 10) + 48));
                    sb2.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    if (i12 >= 7 || (i12 >= 5 && iAbs3 > 0)) {
                        sb2.append(i13 == 0 ? ":" : "");
                        sb2.append((char) ((iAbs3 / 10) + 48));
                        sb2.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb2.setLength(length);
                    sb2.append(str);
                }
            }
            return true;
        }

        public final boolean c(int[] iArr, int i12, CharSequence charSequence, boolean z12) {
            int i13 = this.f422013c;
            if ((i13 + 3) / 2 < i12) {
                return false;
            }
            int i14 = iArr[0];
            if (i13 % 2 == 0 && i12 > 1) {
                int i15 = i14 + 1;
                if (i15 > charSequence.length() || charSequence.charAt(i14) != ':') {
                    return z12;
                }
                i14 = i15;
            }
            int i16 = i14 + 2;
            if (i16 > charSequence.length()) {
                return z12;
            }
            int i17 = i14 + 1;
            char cCharAt = charSequence.charAt(i14);
            char cCharAt2 = charSequence.charAt(i17);
            if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i18 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                if (i18 >= 0 && i18 <= 59) {
                    iArr[i12] = i18;
                    iArr[0] = i16;
                    return false;
                }
            }
            return z12;
        }

        public final String toString() {
            return G.h(new StringBuilder("Offset("), f422009d[this.f422013c], ",'", this.f422012b.replace("'", "''"), "')");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class o implements g {

        /* renamed from: b, reason: collision with root package name */
        public final g f422014b;

        /* renamed from: c, reason: collision with root package name */
        public final int f422015c;

        /* renamed from: d, reason: collision with root package name */
        public final char f422016d;

        public o(g gVar, int i12, char c12) {
            this.f422014b = gVar;
            this.f422015c = i12;
            this.f422016d = c12;
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            boolean z12 = fVar.f422043e;
            boolean z13 = fVar.f422042d;
            if (i12 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            if (i12 == charSequence.length()) {
                return ~i12;
            }
            int length = this.f422015c + i12;
            if (length > charSequence.length()) {
                if (z12) {
                    return ~i12;
                }
                length = charSequence.length();
            }
            int i13 = i12;
            while (i13 < length) {
                char c12 = this.f422016d;
                if (!z13) {
                    if (!fVar.a(charSequence.charAt(i13), c12)) {
                        break;
                    }
                    i13++;
                } else {
                    if (charSequence.charAt(i13) != c12) {
                        break;
                    }
                    i13++;
                }
            }
            int iA2 = this.f422014b.a(fVar, charSequence.subSequence(0, length), i13);
            return (iA2 == length || !z12) ? iA2 : ~(i12 + i13);
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            int length = sb2.length();
            if (!this.f422014b.b(hVar, sb2)) {
                return false;
            }
            int length2 = sb2.length() - length;
            int i12 = this.f422015c;
            if (length2 > i12) {
                throw new DateTimeException(H.j(length2, i12, "Cannot print as output of ", " characters exceeds pad width of "));
            }
            for (int i13 = 0; i13 < i12 - length2; i13++) {
                sb2.insert(length, this.f422016d);
            }
            return true;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("Pad(");
            sb2.append(this.f422014b);
            sb2.append(",");
            sb2.append(this.f422015c);
            char c12 = this.f422016d;
            if (c12 == ' ') {
                str = ")";
            } else {
                str = ",'" + c12 + "')";
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class q implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final q f422019b;

        /* renamed from: c, reason: collision with root package name */
        public static final q f422020c;

        /* renamed from: d, reason: collision with root package name */
        public static final q f422021d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ q[] f422022e;

        static {
            q qVar = new q("SENSITIVE", 0);
            f422019b = qVar;
            q qVar2 = new q("INSENSITIVE", 1);
            f422020c = qVar2;
            q qVar3 = new q("STRICT", 2);
            q qVar4 = new q("LENIENT", 3);
            f422021d = qVar4;
            f422022e = new q[]{qVar, qVar2, qVar3, qVar4};
        }

        public q() {
            throw null;
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) f422022e.clone();
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                fVar.f422042d = true;
            } else if (iOrdinal == 1) {
                fVar.f422042d = false;
            } else if (iOrdinal == 2) {
                fVar.f422043e = true;
            } else if (iOrdinal == 3) {
                fVar.f422043e = false;
            }
            return i12;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            return true;
        }

        @Override // java.lang.Enum
        public final String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class r implements g {

        /* renamed from: b, reason: collision with root package name */
        public final String f422023b;

        public r(String str) {
            this.f422023b = str;
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            if (i12 > charSequence.length() || i12 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f422023b;
            return !fVar.f(charSequence, i12, str, 0, str.length()) ? ~i12 : str.length() + i12;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            sb2.append(this.f422023b);
            return true;
        }

        public final String toString() {
            return AK.c.k("'", this.f422023b.replace("'", "''"), "'");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class s implements g {

        /* renamed from: b, reason: collision with root package name */
        public final org.threeten.bp.temporal.h f422024b;

        /* renamed from: c, reason: collision with root package name */
        public final TextStyle f422025c;

        /* renamed from: d, reason: collision with root package name */
        public final org.threeten.bp.format.i f422026d;

        /* renamed from: e, reason: collision with root package name */
        public volatile m f422027e;

        public s(org.threeten.bp.temporal.h hVar, TextStyle textStyle, org.threeten.bp.format.i iVar) {
            this.f422024b = hVar;
            this.f422025c = textStyle;
            this.f422026d = iVar;
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            int length = charSequence.length();
            if (i12 < 0 || i12 > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> itB = this.f422026d.b(this.f422024b, fVar.f422043e ? this.f422025c : null, fVar.f422039a);
            if (itB != null) {
                while (itB.hasNext()) {
                    Map.Entry<String, Long> next = itB.next();
                    String key = next.getKey();
                    if (fVar.f(key, 0, charSequence, i12, key.length())) {
                        return fVar.e(this.f422024b, next.getValue().longValue(), i12, key.length() + i12);
                    }
                }
                if (fVar.f422043e) {
                    return ~i12;
                }
            }
            if (this.f422027e == null) {
                this.f422027e = new m(this.f422024b, 1, 19, SignStyle.f421957b);
            }
            return this.f422027e.a(fVar, charSequence, i12);
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            Long lA2 = hVar.a(this.f422024b);
            if (lA2 == null) {
                return false;
            }
            String strA = this.f422026d.a(this.f422024b, lA2.longValue(), this.f422025c, hVar.f422057b);
            if (strA != null) {
                sb2.append(strA);
                return true;
            }
            if (this.f422027e == null) {
                this.f422027e = new m(this.f422024b, 1, 19, SignStyle.f421957b);
            }
            return this.f422027e.b(hVar, sb2);
        }

        public final String toString() {
            TextStyle textStyle = TextStyle.f421962b;
            org.threeten.bp.temporal.h hVar = this.f422024b;
            TextStyle textStyle2 = this.f422025c;
            if (textStyle2 == textStyle) {
                return "Text(" + hVar + ")";
            }
            return "Text(" + hVar + "," + textStyle2 + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class t implements g {

        /* renamed from: b, reason: collision with root package name */
        public final char f422028b;

        /* renamed from: c, reason: collision with root package name */
        public final int f422029c;

        public t(char c12, int i12) {
            this.f422028b = c12;
            this.f422029c = i12;
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            return c(org.threeten.bp.temporal.m.a(fVar.f422039a)).a(fVar, charSequence, i12);
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            return c(org.threeten.bp.temporal.m.a(hVar.f422057b)).b(hVar, sb2);
        }

        public final m c(org.threeten.bp.temporal.m mVar) {
            m mVar2;
            m mVar3;
            SignStyle signStyle = SignStyle.f421959d;
            char c12 = this.f422028b;
            if (c12 == 'W') {
                mVar2 = new m(mVar.f422213e, 1, 2, signStyle);
            } else {
                if (c12 == 'Y') {
                    int i12 = this.f422029c;
                    if (i12 == 2) {
                        mVar3 = new p(mVar.f422215g, p.f422017i);
                    } else {
                        mVar3 = new m(mVar.f422215g, i12, 19, i12 < 4 ? SignStyle.f421957b : SignStyle.f421960e, -1, null);
                    }
                    return mVar3;
                }
                int i13 = this.f422029c;
                if (c12 == 'c' || c12 == 'e') {
                    mVar2 = new m(mVar.f422212d, i13, 2, signStyle);
                } else {
                    if (c12 != 'w') {
                        return null;
                    }
                    mVar2 = new m(mVar.f422214f, i13, 2, signStyle);
                }
            }
            return mVar2;
        }

        public final String toString() {
            StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(30, "Localized(");
            int i12 = this.f422029c;
            char c12 = this.f422028b;
            if (c12 != 'Y') {
                if (c12 == 'c' || c12 == 'e') {
                    sbQ.append("DayOfWeek");
                } else if (c12 == 'w') {
                    sbQ.append("WeekOfWeekBasedYear");
                } else if (c12 == 'W') {
                    sbQ.append("WeekOfMonth");
                }
                sbQ.append(",");
                sbQ.append(i12);
            } else if (i12 == 1) {
                sbQ.append("WeekBasedYear");
            } else if (i12 == 2) {
                sbQ.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sbQ.append("WeekBasedYear,");
                sbQ.append(i12);
                sbQ.append(",19,");
                sbQ.append(i12 < 4 ? SignStyle.f421957b : SignStyle.f421960e);
            }
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class u implements g {

        /* renamed from: d, reason: collision with root package name */
        public static volatile AbstractMap.SimpleImmutableEntry f422030d;

        /* renamed from: b, reason: collision with root package name */
        public final org.threeten.bp.temporal.j<org.threeten.bp.o> f422031b;

        /* renamed from: c, reason: collision with root package name */
        public final String f422032c;

        /* compiled from: DateTimeFormatterBuilder.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final int f422033a;

            /* renamed from: b, reason: collision with root package name */
            public final HashMap f422034b;

            /* renamed from: c, reason: collision with root package name */
            public final HashMap f422035c;

            public /* synthetic */ a(int i12, a aVar) {
                this(i12);
            }

            public final void a(String str) {
                int length = str.length();
                HashMap map = this.f422035c;
                HashMap map2 = this.f422034b;
                int i12 = this.f422033a;
                if (length == i12) {
                    map2.put(str, null);
                    map.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i12) {
                    String strSubstring = str.substring(0, i12);
                    a aVar = (a) map2.get(strSubstring);
                    if (aVar == null) {
                        aVar = new a(length);
                        map2.put(strSubstring, aVar);
                        map.put(strSubstring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.a(str);
                }
            }

            public a(int i12) {
                this.f422034b = new HashMap();
                this.f422035c = new HashMap();
                this.f422033a = i12;
            }
        }

        public u(String str, org.threeten.bp.temporal.j jVar) {
            this.f422031b = jVar;
            this.f422032c = str;
        }

        public static org.threeten.bp.o c(Set set, String str, boolean z12) {
            if (str == null) {
                return null;
            }
            if (z12) {
                if (set.contains(str)) {
                    return org.threeten.bp.o.p(str);
                }
                return null;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.equalsIgnoreCase(str)) {
                    return org.threeten.bp.o.p(str2);
                }
            }
            return null;
        }

        public static int d(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12, int i13) {
            String upperCase = charSequence.subSequence(i12, i13).toString().toUpperCase();
            org.threeten.bp.format.f fVar2 = new org.threeten.bp.format.f(fVar);
            if (i13 < charSequence.length() && fVar.a(charSequence.charAt(i13), 'Z')) {
                fVar.d(org.threeten.bp.o.q(upperCase, org.threeten.bp.q.f422106g));
                return i13;
            }
            int iA2 = n.f422010e.a(fVar2, charSequence, i13);
            if (iA2 < 0) {
                fVar.d(org.threeten.bp.o.q(upperCase, org.threeten.bp.q.f422106g));
                return i13;
            }
            fVar.d(org.threeten.bp.o.q(upperCase, org.threeten.bp.q.w((int) fVar2.c(ChronoField.f422126H).longValue())));
            return iA2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            int i13;
            int length = charSequence.length();
            if (i12 > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i12 == length) {
                return ~i12;
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '+' || cCharAt == '-') {
                org.threeten.bp.format.f fVar2 = new org.threeten.bp.format.f(fVar);
                int iA2 = n.f422010e.a(fVar2, charSequence, i12);
                if (iA2 < 0) {
                    return iA2;
                }
                fVar.d(org.threeten.bp.q.w((int) fVar2.c(ChronoField.f422126H).longValue()));
                return iA2;
            }
            int i14 = i12 + 2;
            if (length >= i14) {
                char cCharAt2 = charSequence.charAt(i12 + 1);
                if (fVar.a(cCharAt, 'U') && fVar.a(cCharAt2, 'T')) {
                    int i15 = i12 + 3;
                    return (length < i15 || !fVar.a(charSequence.charAt(i14), 'C')) ? d(fVar, charSequence, i12, i14) : d(fVar, charSequence, i12, i15);
                }
                if (fVar.a(cCharAt, 'G') && length >= (i13 = i12 + 3) && fVar.a(cCharAt2, 'M') && fVar.a(charSequence.charAt(i14), 'T')) {
                    return d(fVar, charSequence, i12, i13);
                }
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(org.threeten.bp.zone.i.f422259b.keySet());
            int size = setUnmodifiableSet.size();
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = f422030d;
            String str = null;
            Object[] objArr = 0;
            if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                synchronized (this) {
                    try {
                        simpleImmutableEntry = f422030d;
                        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                            Integer numValueOf = Integer.valueOf(size);
                            ArrayList arrayList = new ArrayList(setUnmodifiableSet);
                            Collections.sort(arrayList, d.f421986j);
                            a aVar = new a(((String) arrayList.get(0)).length(), objArr == true ? 1 : 0);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                aVar.a((String) it.next());
                            }
                            simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, aVar);
                            f422030d = simpleImmutableEntry;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            a aVar2 = (a) simpleImmutableEntry.getValue();
            String str2 = null;
            while (aVar2 != null) {
                int i16 = aVar2.f422033a + i12;
                if (i16 > length) {
                    break;
                }
                String string = charSequence.subSequence(i12, i16).toString();
                aVar2 = (a) (fVar.f422042d ? aVar2.f422034b.get(string) : aVar2.f422035c.get(string.toString().toLowerCase(Locale.ENGLISH)));
                String str3 = str;
                str = string;
                str2 = str3;
            }
            org.threeten.bp.o oVarC = c(setUnmodifiableSet, str, fVar.f422042d);
            if (oVarC == null) {
                oVarC = c(setUnmodifiableSet, str2, fVar.f422042d);
                if (oVarC == null) {
                    if (!fVar.a(cCharAt, 'Z')) {
                        return ~i12;
                    }
                    fVar.d(org.threeten.bp.q.f422106g);
                    return i12 + 1;
                }
                str = str2;
            }
            fVar.d(oVarC);
            return str.length() + i12;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            org.threeten.bp.o oVar = (org.threeten.bp.o) hVar.b(this.f422031b);
            if (oVar == null) {
                return false;
            }
            sb2.append(oVar.h());
            return true;
        }

        public final String toString() {
            return this.f422032c;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class v implements g {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator<String> f422036c = new a();

        /* renamed from: b, reason: collision with root package name */
        public final TextStyle f422037b;

        /* compiled from: DateTimeFormatterBuilder.java */
        public class a implements Comparator<String> {
            @Override // java.util.Comparator
            public final int compare(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                int length = str4.length() - str3.length();
                return length == 0 ? str3.compareTo(str4) : length;
            }
        }

        public v(TextStyle textStyle) {
            this.f422037b = textStyle;
        }

        public static int c(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12, String str) {
            int length = str.length();
            int i13 = i12 + length;
            if (i13 >= charSequence.length()) {
                fVar.d(org.threeten.bp.o.p(str));
                return i13;
            }
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != '+' && cCharAt != '-') {
                fVar.d(org.threeten.bp.o.p(str));
                return i13;
            }
            org.threeten.bp.format.f fVar2 = new org.threeten.bp.format.f(fVar);
            try {
                int iA2 = n.f422011f.a(fVar2, charSequence, i13);
                if (iA2 < 0) {
                    fVar.d(org.threeten.bp.o.p(str));
                    return i13;
                }
                org.threeten.bp.q qVarW = org.threeten.bp.q.w((int) fVar2.c(ChronoField.f422126H).longValue());
                fVar.d(length == 0 ? qVarW : org.threeten.bp.o.q(str, qVarW));
                return iA2;
            } catch (DateTimeException unused) {
                return ~i12;
            }
        }

        @Override // org.threeten.bp.format.d.g
        public final int a(org.threeten.bp.format.f fVar, CharSequence charSequence, int i12) {
            int length = charSequence.length();
            if (i12 > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i12 == length) {
                return ~i12;
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '+' || cCharAt == '-') {
                return i12 + 6 > length ? ~i12 : c(fVar, charSequence, i12, "");
            }
            if (fVar.f(charSequence, i12, "GMT", 0, 3)) {
                return c(fVar, charSequence, i12, "GMT");
            }
            if (fVar.f(charSequence, i12, "UTC", 0, 3)) {
                return c(fVar, charSequence, i12, "UTC");
            }
            if (fVar.f(charSequence, i12, "UT", 0, 2)) {
                return c(fVar, charSequence, i12, "UT");
            }
            TreeMap treeMap = new TreeMap(f422036c);
            Map<String, String> map = org.threeten.bp.o.f422103b;
            Iterator it = new HashSet(Collections.unmodifiableSet(org.threeten.bp.zone.i.f422259b.keySet())).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                treeMap.put(str, str);
                TimeZone timeZone = TimeZone.getTimeZone(str);
                TextStyle textStyle = this.f422037b;
                textStyle.getClass();
                int i13 = TextStyle.values()[textStyle.ordinal() & (-2)] == TextStyle.f421962b ? 1 : 0;
                Locale locale = fVar.f422039a;
                String displayName = timeZone.getDisplayName(false, i13, locale);
                if (str.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, str);
                }
                String displayName2 = timeZone.getDisplayName(true, i13, locale);
                if (str.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, str);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str2 = (String) entry.getKey();
                if (fVar.f(charSequence, i12, str2, 0, str2.length())) {
                    fVar.d(org.threeten.bp.o.p((String) entry.getValue()));
                    return str2.length() + i12;
                }
            }
            if (cCharAt != 'Z') {
                return ~i12;
            }
            fVar.d(org.threeten.bp.q.f422106g);
            return i12 + 1;
        }

        @Override // org.threeten.bp.format.d.g
        public final boolean b(org.threeten.bp.format.h hVar, StringBuilder sb2) {
            org.threeten.bp.zone.f fVarO;
            org.threeten.bp.o oVar = (org.threeten.bp.o) hVar.b(org.threeten.bp.temporal.i.f422198a);
            if (oVar == null) {
                return false;
            }
            try {
                fVarO = oVar.o();
            } catch (ZoneRulesException unused) {
            }
            org.threeten.bp.o oVarA = fVarO.e() ? fVarO.a(org.threeten.bp.d.f421934d) : oVar;
            if (oVarA instanceof org.threeten.bp.q) {
                sb2.append(oVar.h());
                return true;
            }
            ChronoField chronoField = ChronoField.f422125G;
            AbstractC49471c abstractC49471c = hVar.f422056a;
            boolean zD2 = abstractC49471c.l(chronoField) ? oVar.o().d(org.threeten.bp.d.o(0, abstractC49471c.m(chronoField))) : false;
            TimeZone timeZone = TimeZone.getTimeZone(oVar.h());
            TextStyle textStyle = this.f422037b;
            textStyle.getClass();
            sb2.append(timeZone.getDisplayName(zD2, TextStyle.values()[textStyle.ordinal() & (-2)] == TextStyle.f421962b ? 1 : 0, hVar.f422057b));
            return true;
        }

        public final String toString() {
            return "ZoneText(" + this.f422037b + ")";
        }
    }

    static {
        HashMap map = new HashMap();
        f421985i = map;
        map.put('G', ChronoField.f422124F);
        map.put('y', ChronoField.f422122D);
        map.put('u', ChronoField.f422123E);
        org.threeten.bp.temporal.h hVar = org.threeten.bp.temporal.a.f422172a;
        map.put('Q', hVar);
        map.put('q', hVar);
        ChronoField chronoField = ChronoField.f422120B;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.f422147x);
        map.put('d', ChronoField.f422146w);
        map.put('F', ChronoField.f422144u);
        ChronoField chronoField2 = ChronoField.f422143t;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.f422142s);
        map.put('H', ChronoField.f422140q);
        map.put('k', ChronoField.f422141r);
        map.put('K', ChronoField.f422138o);
        map.put('h', ChronoField.f422139p);
        map.put('m', ChronoField.f422136m);
        map.put('s', ChronoField.f422134k);
        ChronoField chronoField3 = ChronoField.f422128e;
        map.put('S', chronoField3);
        map.put('A', ChronoField.f422133j);
        map.put('n', chronoField3);
        map.put('N', ChronoField.f422129f);
        f421986j = new b();
    }

    public d() {
        this.f421987a = this;
        this.f421989c = new ArrayList();
        this.f421993g = -1;
        this.f421988b = null;
        this.f421990d = false;
    }

    public final void a(org.threeten.bp.format.c cVar) {
        w81.d.f(cVar, "formatter");
        f fVar = cVar.f421979a;
        if (fVar.f421997c) {
            fVar = new f(fVar.f421996b, false);
        }
        b(fVar);
    }

    public final int b(g gVar) {
        w81.d.f(gVar, "pp");
        d dVar = this.f421987a;
        int i12 = dVar.f421991e;
        if (i12 > 0) {
            o oVar = new o(gVar, i12, dVar.f421992f);
            dVar.f421991e = 0;
            dVar.f421992f = (char) 0;
            gVar = oVar;
        }
        dVar.f421989c.add(gVar);
        this.f421987a.f421993g = -1;
        return r5.f421989c.size() - 1;
    }

    public final void c(char c12) {
        b(new C12240d(c12));
    }

    public final void d(String str) {
        w81.d.f(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                b(new C12240d(str.charAt(0)));
            } else {
                b(new r(str));
            }
        }
    }

    public final void e(TextStyle textStyle) {
        if (textStyle != TextStyle.f421962b && textStyle != TextStyle.f421964d) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        b(new k(textStyle));
    }

    public final void f(String str, String str2) {
        b(new n(str2, str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.g(java.lang.String):void");
    }

    public final void h(ChronoField chronoField, Map map) {
        w81.d.f(chronoField, "field");
        w81.d.f(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.f421962b;
        b(new s(chronoField, textStyle, new org.threeten.bp.format.e(new l.b(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void i(org.threeten.bp.temporal.h hVar, TextStyle textStyle) {
        AtomicReference<org.threeten.bp.format.i> atomicReference = org.threeten.bp.format.i.f422060a;
        b(new s(hVar, textStyle, i.a.f422061a));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(org.threeten.bp.format.d.m r6) {
        /*
            r5 = this;
            org.threeten.bp.format.d r0 = r5.f421987a
            int r1 = r0.f421993g
            if (r1 < 0) goto L4c
            java.util.ArrayList r0 = r0.f421989c
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof org.threeten.bp.format.d.m
            if (r0 == 0) goto L4c
            org.threeten.bp.format.d r0 = r5.f421987a
            int r1 = r0.f421993g
            java.util.ArrayList r0 = r0.f421989c
            java.lang.Object r0 = r0.get(r1)
            org.threeten.bp.format.d$m r0 = (org.threeten.bp.format.d.m) r0
            int r2 = r6.f422005c
            int r3 = r6.f422006d
            if (r2 != r3) goto L38
            org.threeten.bp.format.SignStyle r2 = org.threeten.bp.format.SignStyle.f421959d
            org.threeten.bp.format.SignStyle r4 = r6.f422007e
            if (r4 != r2) goto L38
            org.threeten.bp.format.d$m r0 = r0.g(r3)
            org.threeten.bp.format.d$m r6 = r6.f()
            r5.b(r6)
            org.threeten.bp.format.d r6 = r5.f421987a
            r6.f421993g = r1
            goto L44
        L38:
            org.threeten.bp.format.d$m r0 = r0.f()
            org.threeten.bp.format.d r2 = r5.f421987a
            int r6 = r5.b(r6)
            r2.f421993g = r6
        L44:
            org.threeten.bp.format.d r6 = r5.f421987a
            java.util.ArrayList r6 = r6.f421989c
            r6.set(r1, r0)
            goto L54
        L4c:
            org.threeten.bp.format.d r0 = r5.f421987a
            int r6 = r5.b(r6)
            r0.f421993g = r6
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.j(org.threeten.bp.format.d$m):void");
    }

    public final void k(org.threeten.bp.temporal.h hVar) {
        w81.d.f(hVar, "field");
        j(new m(hVar, 1, 19, SignStyle.f421957b));
    }

    public final void l(org.threeten.bp.temporal.h hVar, int i12) {
        w81.d.f(hVar, "field");
        if (i12 < 1 || i12 > 19) {
            throw new IllegalArgumentException(AK.c.g(i12, "The width must be from 1 to 19 inclusive but was "));
        }
        j(new m(hVar, i12, i12, SignStyle.f421959d));
    }

    public final void m(org.threeten.bp.temporal.h hVar, int i12, int i13, SignStyle signStyle) {
        if (i12 == i13 && signStyle == SignStyle.f421959d) {
            l(hVar, i13);
            return;
        }
        w81.d.f(hVar, "field");
        if (i12 < 1 || i12 > 19) {
            throw new IllegalArgumentException(AK.c.g(i12, "The minimum width must be from 1 to 19 inclusive but was "));
        }
        if (i13 < 1 || i13 > 19) {
            throw new IllegalArgumentException(AK.c.g(i13, "The maximum width must be from 1 to 19 inclusive but was "));
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(H.j(i13, i12, "The maximum width must exceed or equal the minimum width but ", " < "));
        }
        j(new m(hVar, i12, i13, signStyle));
    }

    public final void n() {
        d dVar = this.f421987a;
        if (dVar.f421988b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dVar.f421989c.size() <= 0) {
            this.f421987a = this.f421987a.f421988b;
            return;
        }
        d dVar2 = this.f421987a;
        f fVar = new f(dVar2.f421989c, dVar2.f421990d);
        this.f421987a = this.f421987a.f421988b;
        b(fVar);
    }

    public final void o() {
        d dVar = this.f421987a;
        dVar.f421993g = -1;
        this.f421987a = new d(dVar);
    }

    public final org.threeten.bp.format.c p() {
        Locale locale = Locale.getDefault();
        w81.d.f(locale, "locale");
        while (this.f421987a.f421988b != null) {
            n();
        }
        return new org.threeten.bp.format.c(new f(this.f421989c, false), locale, org.threeten.bp.format.j.f422062a, ResolverStyle.f421954c, null);
    }

    public final org.threeten.bp.format.c q(ResolverStyle resolverStyle) {
        org.threeten.bp.format.c cVarP = p();
        if (w81.d.b(resolverStyle, cVarP.f421982d)) {
            return cVarP;
        }
        return new org.threeten.bp.format.c(cVarP.f421979a, cVarP.f421980b, cVarP.f421981c, resolverStyle, cVarP.f421983e);
    }

    public d(d dVar) {
        this.f421987a = this;
        this.f421989c = new ArrayList();
        this.f421993g = -1;
        this.f421988b = dVar;
        this.f421990d = true;
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class p extends m {

        /* renamed from: i, reason: collision with root package name */
        public static final org.threeten.bp.e f422017i = org.threeten.bp.e.N(2000, 1, 1);

        /* renamed from: h, reason: collision with root package name */
        public final org.threeten.bp.e f422018h;

        public p(org.threeten.bp.temporal.h hVar, org.threeten.bp.e eVar) {
            super(hVar, 2, 2, SignStyle.f421959d);
            if (eVar == null) {
                long j12 = 0;
                if (!hVar.f().c(j12)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j12 + m.f422003g[2] > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.f422018h = eVar;
        }

        @Override // org.threeten.bp.format.d.m
        public final long c(org.threeten.bp.format.h hVar, long j12) {
            long jAbs = Math.abs(j12);
            org.threeten.bp.e eVar = this.f422018h;
            long jK2 = eVar != null ? org.threeten.bp.chrono.j.i(hVar.f422056a).b(eVar).k(this.f422004b) : 0;
            int[] iArr = m.f422003g;
            if (j12 >= jK2) {
                int i12 = iArr[this.f422005c];
                if (j12 < r7 + i12) {
                    return jAbs % i12;
                }
            }
            return jAbs % iArr[this.f422006d];
        }

        @Override // org.threeten.bp.format.d.m
        public final boolean d(org.threeten.bp.format.f fVar) {
            if (fVar.f422043e) {
                return super.d(fVar);
            }
            return false;
        }

        @Override // org.threeten.bp.format.d.m
        public final int e(org.threeten.bp.format.f fVar, long j12, int i12, int i13) {
            int iK2;
            org.threeten.bp.e eVar = this.f422018h;
            if (eVar != null) {
                org.threeten.bp.chrono.j jVar = fVar.b().f422045b;
                if (jVar == null && (jVar = fVar.f422041c) == null) {
                    jVar = org.threeten.bp.chrono.o.f421908d;
                }
                iK2 = jVar.b(eVar).k(this.f422004b);
                f.b bVarB = fVar.b();
                if (bVarB.f422050g == null) {
                    bVarB.f422050g = new ArrayList(2);
                }
                bVarB.f422050g.add(new Object[]{this, Long.valueOf(j12), Integer.valueOf(i12), Integer.valueOf(i13)});
            } else {
                iK2 = 0;
            }
            int i14 = i13 - i12;
            int i15 = this.f422005c;
            if (i14 == i15 && j12 >= 0) {
                long j13 = m.f422003g[i15];
                long j14 = iK2;
                long j15 = j14 - (j14 % j13);
                j12 = iK2 > 0 ? j15 + j12 : j15 - j12;
                if (j12 < j14) {
                    j12 += j13;
                }
            }
            return fVar.e(this.f422004b, j12, i12, i13);
        }

        @Override // org.threeten.bp.format.d.m
        public final m f() {
            if (this.f422008f == -1) {
                return this;
            }
            return new p(this.f422004b, this.f422005c, this.f422006d, this.f422018h, -1);
        }

        @Override // org.threeten.bp.format.d.m
        public final m g(int i12) {
            int i13 = this.f422008f + i12;
            return new p(this.f422004b, this.f422005c, this.f422006d, this.f422018h, i13);
        }

        @Override // org.threeten.bp.format.d.m
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReducedValue(");
            sb2.append(this.f422004b);
            sb2.append(",");
            sb2.append(this.f422005c);
            sb2.append(",");
            sb2.append(this.f422006d);
            sb2.append(",");
            Object obj = this.f422018h;
            if (obj == null) {
                obj = 0;
            }
            return androidx.appcompat.app.r.o(obj, ")", sb2);
        }

        public p(org.threeten.bp.temporal.h hVar, int i12, int i13, org.threeten.bp.e eVar, int i14) {
            super(hVar, i12, i13, SignStyle.f421959d, i14, null);
            this.f422018h = eVar;
        }
    }
}
