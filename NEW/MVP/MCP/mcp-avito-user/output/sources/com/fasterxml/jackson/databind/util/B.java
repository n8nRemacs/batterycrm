package com.fasterxml.jackson.databind.util;

import androidx.camera.core.Q;
import androidx.media3.common.C23088b;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: StdDateFormat.java */
/* loaded from: classes4.dex */
public class B extends DateFormat {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f342528h = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f342529i;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f342530j;

    /* renamed from: k, reason: collision with root package name */
    public static final TimeZone f342531k;

    /* renamed from: l, reason: collision with root package name */
    public static final Locale f342532l;

    /* renamed from: m, reason: collision with root package name */
    public static final SimpleDateFormat f342533m;

    /* renamed from: n, reason: collision with root package name */
    public static final B f342534n;

    /* renamed from: o, reason: collision with root package name */
    public static final GregorianCalendar f342535o;

    /* renamed from: b, reason: collision with root package name */
    public transient TimeZone f342536b;

    /* renamed from: c, reason: collision with root package name */
    public final Locale f342537c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f342538d;

    /* renamed from: e, reason: collision with root package name */
    public transient Calendar f342539e;

    /* renamed from: f, reason: collision with root package name */
    public transient DateFormat f342540f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f342541g;

    static {
        try {
            f342529i = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            f342530j = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            f342531k = timeZone;
            Locale locale = Locale.US;
            f342532l = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            f342533m = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f342534n = new B();
            f342535o = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public B() {
        this.f342541g = true;
        this.f342537c = f342532l;
    }

    public static int b(int i12, String str) {
        return (str.charAt(i12 + 1) - '0') + ((str.charAt(i12) - '0') * 10);
    }

    public static int c(String str) {
        return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
    }

    public static void g(StringBuffer stringBuffer, int i12) {
        int i13 = i12 / 10;
        if (i13 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i13 + 48));
            i12 -= i13 * 10;
        }
        stringBuffer.append((char) (i12 + 48));
    }

    public static void i(StringBuffer stringBuffer, int i12) {
        int i13 = i12 / 100;
        if (i13 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i13 > 99) {
                stringBuffer.append(i13);
            } else {
                g(stringBuffer, i13);
            }
            i12 -= i13 * 100;
        }
        g(stringBuffer, i12);
    }

    public final Calendar a(TimeZone timeZone) {
        Calendar calendar = this.f342539e;
        if (calendar == null) {
            calendar = (Calendar) f342535o.clone();
            this.f342539e = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    @Override // java.text.DateFormat, java.text.Format
    public final Object clone() {
        return new B(this.f342536b, this.f342537c, this.f342538d, this.f342541g);
    }

    public final Date e(String str) throws ParseException {
        String str2;
        int length = str.length();
        Calendar calendarA = a((this.f342536b == null || 'Z' == str.charAt(length + (-1))) ? f342531k : this.f342536b);
        calendarA.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = f342529i.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i12 = iEnd - iStart;
                if (i12 > 1) {
                    int iB2 = b(iStart + 1, str) * 3600;
                    if (i12 >= 5) {
                        iB2 += b(iEnd - 2, str) * 60;
                    }
                    calendarA.set(15, str.charAt(iStart) == '-' ? iB2 * (-1000) : iB2 * 1000);
                    calendarA.set(16, 0);
                }
                calendarA.set(c(str), b(5, str) - 1, b(8, str), b(11, str), b(14, str), (length <= 16 || str.charAt(16) != ':') ? 0 : b(17, str));
                int iStart2 = matcher.start(1);
                int i13 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i13 >= iEnd2) {
                    calendarA.set(14, 0);
                } else {
                    int i14 = iEnd2 - i13;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3 && i14 > 9) {
                                    throw new ParseException(Q.a("Cannot parse date \"", str, "\": invalid fractional seconds '", matcher.group(1).substring(1), "'; can use at most 9 digits"), i13);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i13) - '0') * 100;
                    }
                    calendarA.set(14, iCharAt);
                }
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (f342528h.matcher(str).matches()) {
                calendarA.set(c(str), b(5, str) - 1, b(8, str), 0, 0, 0);
                calendarA.set(14, 0);
                return calendarA.getTime();
            }
            str2 = BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT;
        }
        Boolean bool = this.f342538d;
        StringBuilder sbB = C23088b.b("Cannot parse date \"", str, "\": while it seems to fit format '", str2, "', parsing fails (leniency? ");
        sbB.append(bool);
        sbB.append(")");
        throw new ParseException(sbB.toString(), 0);
    }

    @Override // java.text.DateFormat
    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r2 < 0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date f(java.lang.String r6, java.text.ParsePosition r7) throws java.text.ParseException {
        /*
            r5 = this;
            int r0 = r6.length()
            r1 = 7
            r2 = 45
            r3 = 0
            if (r0 < r1) goto L4d
            char r0 = r6.charAt(r3)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L4d
            r0 = 3
            char r0 = r6.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L4d
            r0 = 4
            char r0 = r6.charAt(r0)
            if (r0 != r2) goto L4d
            r0 = 5
            char r0 = r6.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L4d
            java.util.Date r6 = r5.e(r6)     // Catch: java.lang.IllegalArgumentException -> L36
            return r6
        L36:
            r0 = move-exception
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "Cannot parse date \""
            java.lang.String r3 = "\", problem: "
            java.lang.String r6 = androidx.compose.ui.graphics.colorspace.e.n(r2, r6, r3, r0)
            int r7 = r7.getErrorIndex()
            r1.<init>(r6, r7)
            throw r1
        L4d:
            int r0 = r6.length()
        L51:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L65
            char r1 = r6.charAt(r0)
            r4 = 48
            if (r1 < r4) goto L61
            r4 = 57
            if (r1 <= r4) goto L51
        L61:
            if (r0 > 0) goto L65
            if (r1 == r2) goto L51
        L65:
            if (r0 >= 0) goto Lac
            char r0 = r6.charAt(r3)
            if (r0 == r2) goto L90
            java.lang.String r0 = com.fasterxml.jackson.core.io.j.f341180b
            int r1 = r0.length()
            int r2 = r6.length()
            if (r2 >= r1) goto L7a
            goto L90
        L7a:
            if (r2 <= r1) goto L7d
            goto Lac
        L7d:
            if (r3 >= r1) goto L90
            char r2 = r6.charAt(r3)
            char r4 = r0.charAt(r3)
            int r2 = r2 - r4
            if (r2 == 0) goto L8d
            if (r2 >= 0) goto Lac
            goto L90
        L8d:
            int r3 = r3 + 1
            goto L7d
        L90:
            long r6 = com.fasterxml.jackson.core.io.j.d(r6)     // Catch: java.lang.NumberFormatException -> L9a
            java.util.Date r0 = new java.util.Date
            r0.<init>(r6)
            return r0
        L9a:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "Timestamp value "
            java.lang.String r2 = " out of 64-bit value range"
            java.lang.String r6 = AK.c.k(r1, r6, r2)
            int r7 = r7.getErrorIndex()
            r0.<init>(r6, r7)
            throw r0
        Lac:
            java.text.DateFormat r0 = r5.f342540f
            if (r0 != 0) goto Le5
            java.text.SimpleDateFormat r0 = com.fasterxml.jackson.databind.util.B.f342533m
            java.util.TimeZone r1 = r5.f342536b
            java.lang.Boolean r2 = r5.f342538d
            java.util.Locale r3 = com.fasterxml.jackson.databind.util.B.f342532l
            java.util.Locale r4 = r5.f342537c
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto Lcf
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r3 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            r0.<init>(r3, r4)
            if (r1 != 0) goto Lcb
            java.util.TimeZone r1 = com.fasterxml.jackson.databind.util.B.f342531k
        Lcb:
            r0.setTimeZone(r1)
            goto Lda
        Lcf:
            java.lang.Object r0 = r0.clone()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            if (r1 == 0) goto Lda
            r0.setTimeZone(r1)
        Lda:
            if (r2 == 0) goto Le3
            boolean r1 = r2.booleanValue()
            r0.setLenient(r1)
        Le3:
            r5.f342540f = r0
        Le5:
            java.text.DateFormat r0 = r5.f342540f
            java.util.Date r6 = r0.parse(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.B.f(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f342536b;
        if (timeZone == null) {
            timeZone = f342531k;
        }
        Calendar calendarA = a(timeZone);
        calendarA.setTime(date);
        int i12 = calendarA.get(1);
        if (calendarA.get(0) != 0) {
            if (i12 > 9999) {
                stringBuffer.append('+');
            }
            i(stringBuffer, i12);
        } else if (i12 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            i(stringBuffer, i12 - 1);
        }
        stringBuffer.append('-');
        g(stringBuffer, calendarA.get(2) + 1);
        stringBuffer.append('-');
        g(stringBuffer, calendarA.get(5));
        stringBuffer.append('T');
        g(stringBuffer, calendarA.get(11));
        stringBuffer.append(':');
        g(stringBuffer, calendarA.get(12));
        stringBuffer.append(':');
        g(stringBuffer, calendarA.get(13));
        stringBuffer.append('.');
        int i13 = calendarA.get(14);
        int i14 = i13 / 100;
        if (i14 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i14 + 48));
            i13 -= i14 * 100;
        }
        g(stringBuffer, i13);
        int offset = timeZone.getOffset(calendarA.getTimeInMillis());
        boolean z12 = this.f342541g;
        if (offset != 0) {
            int i15 = offset / 60000;
            int iAbs = Math.abs(i15 / 60);
            int iAbs2 = Math.abs(i15 % 60);
            stringBuffer.append(offset < 0 ? '-' : '+');
            g(stringBuffer, iAbs);
            if (z12) {
                stringBuffer.append(':');
            }
            g(stringBuffer, iAbs2);
        } else if (z12) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.f342536b;
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        Boolean bool = this.f342538d;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateF = f(strTrim, parsePosition);
        if (dateF != null) {
            return dateF;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f342530j) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append('\"');
            }
            sb2.append(str2);
        }
        sb2.append('\"');
        throw new ParseException(Q.a("Cannot parse date \"", strTrim, "\": not compatible with any of standard forms (", sb2.toString(), ")"), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z12) {
        Boolean boolValueOf = Boolean.valueOf(z12);
        Boolean bool = this.f342538d;
        if (boolValueOf == bool || boolValueOf.equals(bool)) {
            return;
        }
        this.f342538d = boolValueOf;
        this.f342540f = null;
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f342536b)) {
            return;
        }
        this.f342540f = null;
        this.f342536b = timeZone;
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.f342536b, this.f342537c, this.f342538d);
    }

    public B(TimeZone timeZone, Locale locale, Boolean bool, boolean z12) {
        this.f342536b = timeZone;
        this.f342537c = locale;
        this.f342538d = bool;
        this.f342541g = z12;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return f(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
