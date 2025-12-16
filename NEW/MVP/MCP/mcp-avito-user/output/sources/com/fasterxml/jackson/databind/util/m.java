package com.fasterxml.jackson.databind.util;

import androidx.compose.ui.platform.C22491k0;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
@Deprecated
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f342620a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i12, char c12) {
        return i12 < str.length() && str.charAt(i12) == c12;
    }

    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        int i12;
        int i13;
        int iC2;
        int iC3;
        int length;
        char cCharAt;
        int length2;
        Objects.requireNonNull(str);
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int iC4 = c(index, i14, str);
            if (a(str, i14, '-')) {
                i14 = index + 5;
            }
            int i15 = i14 + 2;
            int iC5 = c(i14, i15, str);
            if (a(str, i15, '-')) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int iC6 = c(i15, i16, str);
            boolean zA2 = a(str, i16, 'T');
            if (!zA2 && str.length() <= i16) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC4, iC5 - 1, iC6);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (zA2) {
                int i17 = i15 + 5;
                int iC7 = c(i15 + 3, i17, str);
                if (a(str, i17, ':')) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int iC8 = c(i17, i18, str);
                if (a(str, i18, ':')) {
                    i18 = i17 + 3;
                }
                if (str.length() <= i18 || (cCharAt = str.charAt(i18)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i13 = iC8;
                    iC2 = 0;
                    iC3 = 0;
                    i16 = i18;
                    i12 = iC7;
                } else {
                    int i19 = i18 + 2;
                    iC3 = c(i18, i19, str);
                    if (iC3 > 59 && iC3 < 63) {
                        iC3 = 59;
                    }
                    if (a(str, i19, '.')) {
                        int i22 = i18 + 3;
                        for (int i23 = i18 + 4; i23 < str.length(); i23++) {
                            char cCharAt2 = str.charAt(i23);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            }
                            length2 = i23;
                        }
                        length2 = str.length();
                        int iMin = Math.min(length2, i18 + 6);
                        iC2 = c(i22, iMin, str);
                        int i24 = iMin - i22;
                        if (i24 == 1) {
                            iC2 *= 100;
                        } else if (i24 == 2) {
                            iC2 *= 10;
                        }
                        i12 = iC7;
                        i16 = length2;
                        i13 = iC8;
                    } else {
                        i12 = iC7;
                        i16 = i19;
                        i13 = iC8;
                        iC2 = 0;
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
                iC2 = 0;
                iC3 = 0;
            }
            if (str.length() <= i16) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i16);
            TimeZone timeZone = f342620a;
            if (cCharAt3 == 'Z') {
                length = i16 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i16);
                length = i16 + strSubstring.length();
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    String id2 = timeZone.getID();
                    if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iC4);
            gregorianCalendar2.set(2, iC5 - 1);
            gregorianCalendar2.set(5, iC6);
            gregorianCalendar2.set(11, i12);
            gregorianCalendar2.set(12, i13);
            gregorianCalendar2.set(13, iC3);
            gregorianCalendar2.set(14, iC2);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (Exception e12) {
            String strA = C22491k0.a('\"', "\"", str);
            String message = e12.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e12.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(androidx.compose.ui.graphics.colorspace.e.n("Failed to parse date ", strA, ": ", message), parsePosition.getIndex());
            parseException.initCause(e12);
            throw parseException;
        }
    }

    public static int c(int i12, int i13, String str) {
        int i14;
        int i15;
        if (i12 < 0 || i13 > str.length() || i12 > i13) {
            throw new NumberFormatException(str);
        }
        if (i12 < i13) {
            i15 = i12 + 1;
            int iDigit = Character.digit(str.charAt(i12), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i12, i13));
            }
            i14 = -iDigit;
        } else {
            i14 = 0;
            i15 = i12;
        }
        while (i15 < i13) {
            int i16 = i15 + 1;
            int iDigit2 = Character.digit(str.charAt(i15), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i12, i13));
            }
            i14 = (i14 * 10) - iDigit2;
            i15 = i16;
        }
        return -i14;
    }
}
