package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class mf4 implements Comparable, Serializable {
    public final Integer X;
    public final Integer Y;
    public int Z;
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer o;

    public mf4(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.o = num5;
        this.X = num6;
        this.Y = num7;
        e(1, 9999, num, "Year");
        e(1, 12, this.b, "Month");
        e(1, 31, this.c, "Day");
        e(0, 23, this.d, "Hour");
        e(0, 59, this.o, "Minute");
        e(0, 59, this.X, "Second");
        e(0, 999999999, this.Y, "Nanosecond");
        Integer num8 = this.a;
        Integer num9 = this.b;
        Integer num10 = this.c;
        Object[] objArr = {num8, num9, num10};
        for (int i = 0; i < 3; i++) {
            if (objArr[i] == null) {
                return;
            }
        }
        if (num10.intValue() <= k(num8, num9).intValue()) {
            return;
        }
        throw new q81("The day-of-the-month value '" + num10 + "' exceeds the number of days in the month: " + k(num8, num9), 2);
    }

    public static void a(String str, Object obj, StringBuilder sb) {
        StringBuilder sbO = ho7.o(str, ":");
        sbO.append(String.valueOf(obj));
        sbO.append(" ");
        sb.append(sbO.toString());
    }

    public static void e(int i, int i2, Integer num, String str) {
        if (num != null) {
            if (num.intValue() < i || num.intValue() > i2) {
                throw new q81(str + " is not in the range " + i + ".." + i2 + ". Value is:" + num, 2);
            }
        }
    }

    public static mf4 i(long j, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTimeInMillis(j);
        return new mf4(Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13)), Integer.valueOf(gregorianCalendar.get(14) * 1000000));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r5 = 29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer k(java.lang.Integer r5, java.lang.Integer r6) {
        /*
            r0 = 30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 31
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r5 == 0) goto Laa
            if (r6 == 0) goto Laa
            int r2 = r6.intValue()
            r3 = 1
            if (r2 != r3) goto L18
            return r1
        L18:
            int r2 = r6.intValue()
            r3 = 2
            r4 = 4
            if (r2 != r3) goto L42
            int r6 = r5.intValue()
            int r6 = r6 % 100
            if (r6 != 0) goto L31
            int r5 = r5.intValue()
            int r5 = r5 % 400
            if (r5 != 0) goto L3b
            goto L38
        L31:
            int r5 = r5.intValue()
            int r5 = r5 % r4
            if (r5 != 0) goto L3b
        L38:
            r5 = 29
            goto L3d
        L3b:
            r5 = 28
        L3d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L42:
            int r5 = r6.intValue()
            r2 = 3
            if (r5 != r2) goto L4a
            return r1
        L4a:
            int r5 = r6.intValue()
            if (r5 != r4) goto L51
            return r0
        L51:
            int r5 = r6.intValue()
            r2 = 5
            if (r5 != r2) goto L59
            return r1
        L59:
            int r5 = r6.intValue()
            r2 = 6
            if (r5 != r2) goto L61
            return r0
        L61:
            int r5 = r6.intValue()
            r2 = 7
            if (r5 != r2) goto L69
            return r1
        L69:
            int r5 = r6.intValue()
            r2 = 8
            if (r5 != r2) goto L72
            return r1
        L72:
            int r5 = r6.intValue()
            r2 = 9
            if (r5 != r2) goto L7b
            return r0
        L7b:
            int r5 = r6.intValue()
            r2 = 10
            if (r5 != r2) goto L84
            return r1
        L84:
            int r5 = r6.intValue()
            r2 = 11
            if (r5 != r2) goto L8d
            return r0
        L8d:
            int r5 = r6.intValue()
            r0 = 12
            if (r5 != r0) goto L96
            return r1
        L96:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Month is out of range 1..12:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        Laa:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf4.k(java.lang.Integer, java.lang.Integer):java.lang.Integer");
    }

    public static mf4 n(TimeZone timeZone) {
        return i(System.currentTimeMillis(), timeZone);
    }

    public final String c() {
        if (r(1) && q(2, 3, 4, 5, 6, 7)) {
            return "YYYY";
        }
        if (r(1, 2) && q(3, 4, 5, 6, 7)) {
            return "YYYY-MM";
        }
        if (r(1, 2, 3) && q(4, 5, 6, 7)) {
            return "YYYY-MM-DD";
        }
        if (r(1, 2, 3, 4) && q(5, 6, 7)) {
            return "YYYY-MM-DD hh";
        }
        if (r(1, 2, 3, 4, 5) && q(6, 7)) {
            return "YYYY-MM-DD hh:mm";
        }
        if (r(1, 2, 3, 4, 5, 6) && q(7)) {
            return "YYYY-MM-DD hh:mm:ss";
        }
        if (r(1, 2, 3, 4, 5, 6, 7)) {
            return "YYYY-MM-DD hh:mm:ss.fffffffff";
        }
        if (q(1, 2, 3) && r(4, 5, 6, 7)) {
            return "hh:mm:ss.fffffffff";
        }
        if (q(1, 2, 3, 7) && r(4, 5, 6)) {
            return "hh:mm:ss";
        }
        if (q(1, 2, 3, 6, 7) && r(4, 5)) {
            return "hh:mm";
        }
        return null;
    }

    public final int d() {
        int iIntValue = this.a.intValue();
        int iIntValue2 = (this.b.intValue() - 14) / 12;
        return (((((((r1 - 2) - (iIntValue2 * 12)) * 367) / 12) + ((((iIntValue + 4800) + iIntValue2) * 1461) / 4)) - (((((iIntValue + 4900) + iIntValue2) / 100) * 3) / 4)) + this.c.intValue()) - 32075;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        throw new java.lang.IllegalArgumentException("This method does not currently support arrays.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            if (r7 != r8) goto L5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L11
        L5:
            java.lang.Class<mf4> r0 = defpackage.mf4.class
            boolean r0 = r0.isInstance(r8)
            if (r0 != 0) goto L10
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L61
            mf4 r8 = (defpackage.mf4) r8
            r8.getClass()
            java.lang.Object[] r0 = r7.l()
            java.lang.Object[] r8 = r8.l()
            r1 = 0
            r2 = r1
        L22:
            r3 = 7
            r4 = 1
            if (r2 >= r3) goto L5c
            r3 = r0[r2]
            r5 = r8[r2]
            if (r3 == 0) goto L36
            java.lang.Class r6 = r3.getClass()
            boolean r6 = r6.isArray()
            if (r6 != 0) goto L43
        L36:
            if (r5 == 0) goto L4b
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r6.isArray()
            if (r6 != 0) goto L43
            goto L4b
        L43:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "This method does not currently support arrays."
            r8.<init>(r0)
            throw r8
        L4b:
            if (r3 != 0) goto L52
            if (r5 != 0) goto L50
            goto L56
        L50:
            r4 = r1
            goto L56
        L52:
            boolean r4 = r3.equals(r5)
        L56:
            if (r4 != 0) goto L59
            goto L5d
        L59:
            int r2 = r2 + 1
            goto L22
        L5c:
            r1 = r4
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L61:
            boolean r8 = r0.booleanValue()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf4.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mf4 mf4Var) {
        if (this == mf4Var) {
            return 0;
        }
        mf4Var.getClass();
        int iA = axi.a(this.a, mf4Var.a);
        if (iA != 0) {
            return iA;
        }
        int iA2 = axi.a(this.b, mf4Var.b);
        if (iA2 != 0) {
            return iA2;
        }
        int iA3 = axi.a(this.c, mf4Var.c);
        if (iA3 != 0) {
            return iA3;
        }
        int iA4 = axi.a(this.d, mf4Var.d);
        if (iA4 != 0) {
            return iA4;
        }
        int iA5 = axi.a(this.o, mf4Var.o);
        if (iA5 != 0) {
            return iA5;
        }
        int iA6 = axi.a(this.X, mf4Var.X);
        if (iA6 != 0) {
            return iA6;
        }
        int iA7 = axi.a(this.Y, mf4Var.Y);
        if (iA7 != 0) {
            return iA7;
        }
        return 0;
    }

    public final void h() {
        if (!r(1, 2, 3)) {
            throw new q81("DateTime does not include year/month/day.", 3);
        }
    }

    public final int hashCode() {
        if (this.Z == 0) {
            Object[] objArrL = l();
            int iB = 23;
            for (int i = 0; i < 7; i++) {
                iB = axi.b(iB, objArrL[i]);
            }
            this.Z = iB;
        }
        return this.Z;
    }

    public final long j(TimeZone timeZone) {
        Integer num = this.d;
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = this.o;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = this.X;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Integer num4 = this.Y;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(1, this.a.intValue());
        gregorianCalendar.set(2, this.b.intValue() - 1);
        gregorianCalendar.set(5, this.c.intValue());
        gregorianCalendar.set(11, iIntValue);
        gregorianCalendar.set(12, iIntValue2);
        gregorianCalendar.set(13, iIntValue3);
        gregorianCalendar.set(14, iIntValue4 / 1000000);
        return gregorianCalendar.getTimeInMillis();
    }

    public final Object[] l() {
        return new Object[]{this.a, this.b, this.c, this.d, this.o, this.X, this.Y};
    }

    public final mf4 m() {
        h();
        h();
        return new mf4(this.a, this.b, this.c, 0, 0, 0, 0);
    }

    public final int o() {
        Integer num = this.X;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.o;
        if (num2 != null) {
            iIntValue += num2.intValue() * 60;
        }
        Integer num3 = this.d;
        return num3 != null ? (num3.intValue() * 3600) + iIntValue : iIntValue;
    }

    public final mf4 p(Integer num) {
        h();
        h();
        int iIntValue = num.intValue() + d() + 68569;
        int i = (iIntValue * 4) / 146097;
        int i2 = iIntValue - (((146097 * i) + 3) / 4);
        int i3 = ((i2 + 1) * q0f.CLOSE_SOCKET_CODE_TIMEOUT) / 1461001;
        int i4 = (i2 - ((i3 * 1461) / 4)) + 31;
        int i5 = (i4 * 80) / 2447;
        int i6 = i5 / 11;
        mf4 mf4Var = new mf4(Integer.valueOf(((i - 49) * 100) + i3 + i6), Integer.valueOf((i5 + 2) - (i6 * 12)), Integer.valueOf(i4 - ((i5 * 2447) / 80)), null, null, null, null);
        return new mf4(mf4Var.a, mf4Var.b, mf4Var.c, this.d, this.o, this.X, this.Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L5:
            if (r3 >= r0) goto L54
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L16
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.Y
            if (r4 != 0) goto L14
        L12:
            r4 = r1
            goto L51
        L14:
            r4 = r2
            goto L51
        L16:
            r6 = 6
            if (r6 != r5) goto L20
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.X
            if (r4 != 0) goto L14
            goto L12
        L20:
            r6 = 5
            if (r6 != r5) goto L2a
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.o
            if (r4 != 0) goto L14
            goto L12
        L2a:
            r6 = 4
            if (r6 != r5) goto L34
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.d
            if (r4 != 0) goto L14
            goto L12
        L34:
            r6 = 3
            if (r6 != r5) goto L3e
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.c
            if (r4 != 0) goto L14
            goto L12
        L3e:
            r6 = 2
            if (r6 != r5) goto L48
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.b
            if (r4 != 0) goto L14
            goto L12
        L48:
            if (r1 != r5) goto L51
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.a
            if (r4 != 0) goto L14
            goto L12
        L51:
            int r3 = r3 + 1
            goto L5
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf4.q(int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L5:
            if (r3 >= r0) goto L54
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L16
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.Y
            if (r4 == 0) goto L14
        L12:
            r4 = r1
            goto L51
        L14:
            r4 = r2
            goto L51
        L16:
            r6 = 6
            if (r6 != r5) goto L20
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.X
            if (r4 == 0) goto L14
            goto L12
        L20:
            r6 = 5
            if (r6 != r5) goto L2a
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.o
            if (r4 == 0) goto L14
            goto L12
        L2a:
            r6 = 4
            if (r6 != r5) goto L34
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.d
            if (r4 == 0) goto L14
            goto L12
        L34:
            r6 = 3
            if (r6 != r5) goto L3e
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.c
            if (r4 == 0) goto L14
            goto L12
        L3e:
            r6 = 2
            if (r6 != r5) goto L48
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.b
            if (r4 == 0) goto L14
            goto L12
        L48:
            if (r1 != r5) goto L51
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.a
            if (r4 == 0) goto L14
            goto L12
        L51:
            int r3 = r3 + 1
            goto L5
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf4.r(int[]):boolean");
    }

    public final String toString() {
        int i;
        Integer num;
        Iterator it;
        char c;
        Matcher matcher;
        String strSubstring;
        char c2;
        char c3 = '\f';
        Integer num2 = 12;
        if (c() == null) {
            StringBuilder sb = new StringBuilder();
            a("Y", this.a, sb);
            a("M", this.b, sb);
            a("D", this.c, sb);
            a("h", this.d, sb);
            a("m", this.o, sb);
            a("s", this.X, sb);
            a("f", this.Y, sb);
            return sb.toString().trim();
        }
        pf4 pf4Var = new pf4(c());
        pf4Var.c = new ArrayList();
        pf4Var.b = new ArrayList();
        Pattern pattern = pf4.d;
        String str = pf4Var.a;
        Matcher matcher2 = pattern.matcher(str);
        while (true) {
            i = 1;
            if (!matcher2.find()) {
                break;
            }
            nf4 nf4Var = new nf4();
            nf4Var.a = matcher2.start();
            nf4Var.b = matcher2.end() - 1;
            pf4Var.c.add(nf4Var);
        }
        Iterator it2 = pf4.f.iterator();
        String strReplace = str;
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            int i2 = i;
            Matcher matcher3 = Pattern.compile(str2).matcher(strReplace);
            while (matcher3.find()) {
                of4 of4Var = new of4();
                of4Var.a = matcher3.start();
                of4Var.b = matcher3.end() - 1;
                Iterator it3 = pf4Var.c.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Iterator it4 = it3;
                        nf4 nf4Var2 = (nf4) it3.next();
                        num = num2;
                        int i3 = nf4Var2.a;
                        it = it2;
                        int i4 = of4Var.a;
                        if (i3 <= i4 && i4 <= nf4Var2.b) {
                            matcher = matcher3;
                            c = '\f';
                            break;
                        }
                        num2 = num;
                        it3 = it4;
                        it2 = it;
                    } else {
                        num = num2;
                        it = it2;
                        String strGroup = matcher3.group();
                        if ("YYYY".equals(strGroup)) {
                            strSubstring = pf4.b(this.a);
                        } else if ("YY".equals(strGroup)) {
                            String strB = pf4.b(this.a);
                            strSubstring = qoi.c(strB) ? strB.substring(2) : "";
                        } else {
                            if ("MMMM".equals(strGroup)) {
                                this.b.getClass();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + qoi.b(str));
                            }
                            if ("MMM".equals(strGroup)) {
                                this.b.getClass();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + qoi.b(str));
                            }
                            if ("MM".equals(strGroup)) {
                                strSubstring = pf4.a(pf4.b(this.b));
                            } else if ("M".equals(strGroup)) {
                                strSubstring = pf4.b(this.b);
                            } else if ("DD".equals(strGroup)) {
                                strSubstring = pf4.a(pf4.b(this.c));
                            } else if ("D".equals(strGroup)) {
                                strSubstring = pf4.b(this.c);
                            } else {
                                if ("WWWW".equals(strGroup)) {
                                    h();
                                    d();
                                    throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + qoi.b(str));
                                }
                                if ("WWW".equals(strGroup)) {
                                    h();
                                    d();
                                    throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + qoi.b(str));
                                }
                                if ("hh".equals(strGroup)) {
                                    strSubstring = pf4.a(pf4.b(this.d));
                                } else if ("h".equals(strGroup)) {
                                    strSubstring = pf4.b(this.d);
                                } else if ("h12".equals(strGroup)) {
                                    Integer numValueOf = this.d;
                                    if (numValueOf != null) {
                                        if (numValueOf.intValue() == 0) {
                                            numValueOf = num;
                                        } else if (numValueOf.intValue() > 12) {
                                            numValueOf = Integer.valueOf(numValueOf.intValue() - 12);
                                        }
                                    }
                                    strSubstring = pf4.b(numValueOf);
                                } else {
                                    if ("hh12".equals(strGroup)) {
                                        Integer numValueOf2 = this.d;
                                        if (numValueOf2 == null) {
                                            c2 = '\f';
                                            strSubstring = pf4.a(pf4.b(numValueOf2));
                                            c = c2;
                                        } else if (numValueOf2.intValue() == 0) {
                                            numValueOf2 = num;
                                            c2 = '\f';
                                            strSubstring = pf4.a(pf4.b(numValueOf2));
                                            c = c2;
                                        } else {
                                            c2 = '\f';
                                            if (numValueOf2.intValue() > 12) {
                                                numValueOf2 = Integer.valueOf(numValueOf2.intValue() - 12);
                                            }
                                            strSubstring = pf4.a(pf4.b(numValueOf2));
                                            c = c2;
                                        }
                                    } else {
                                        c = '\f';
                                        if ("a".equals(strGroup)) {
                                            this.d.getClass();
                                            throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + qoi.b(str));
                                        }
                                        if ("mm".equals(strGroup)) {
                                            strSubstring = pf4.a(pf4.b(this.o));
                                        } else if ("m".equals(strGroup)) {
                                            strSubstring = pf4.b(this.o);
                                        } else if ("ss".equals(strGroup)) {
                                            strSubstring = pf4.a(pf4.b(this.X));
                                        } else if ("s".equals(strGroup)) {
                                            strSubstring = pf4.b(this.X);
                                        } else {
                                            if (!strGroup.startsWith("f")) {
                                                throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(strGroup));
                                            }
                                            if (!pf4.e.matcher(strGroup).matches()) {
                                                throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(strGroup));
                                            }
                                            String strB2 = pf4.b(this.Y);
                                            while (true) {
                                                matcher = matcher3;
                                                if (strB2.length() >= 9) {
                                                    break;
                                                }
                                                strB2 = "0".concat(strB2);
                                                matcher3 = matcher;
                                            }
                                            int length = strGroup.length();
                                            strSubstring = (!qoi.c(strB2) || strB2.length() < length) ? strB2 : strB2.substring(0, length);
                                            of4Var.c = strSubstring;
                                            pf4Var.b.add(of4Var);
                                        }
                                    }
                                    matcher = matcher3;
                                    of4Var.c = strSubstring;
                                    pf4Var.b.add(of4Var);
                                }
                            }
                        }
                        matcher = matcher3;
                        c = '\f';
                        of4Var.c = strSubstring;
                        pf4Var.b.add(of4Var);
                    }
                }
                c3 = c;
                num2 = num;
                matcher3 = matcher;
                it2 = it;
            }
            char c4 = c3;
            Integer num3 = num2;
            Iterator it5 = it2;
            StringBuilder sb2 = new StringBuilder();
            for (int i5 = i2; i5 <= str2.length(); i5++) {
                sb2.append("@");
            }
            strReplace = strReplace.replace(str2, sb2.toString());
            i = i2;
            c3 = c4;
            num2 = num3;
            it2 = it5;
        }
        StringBuilder sb3 = new StringBuilder();
        int i6 = 0;
        while (i6 < str.length()) {
            String strSubstring2 = str.substring(i6, i6 + 1);
            Iterator it6 = pf4Var.b.iterator();
            of4 of4Var2 = null;
            while (it6.hasNext()) {
                of4 of4Var3 = (of4) it6.next();
                if (of4Var3.a == i6) {
                    of4Var2 = of4Var3;
                }
            }
            if (of4Var2 != null) {
                sb3.append(of4Var2.c);
                i6 = of4Var2.b;
            } else if (!"|".equals(strSubstring2)) {
                sb3.append(strSubstring2);
            }
            i6++;
        }
        return sb3.toString();
    }
}
