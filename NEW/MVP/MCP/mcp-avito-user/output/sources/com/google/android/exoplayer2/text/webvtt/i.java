package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import java.util.regex.Pattern;

/* compiled from: WebvttParserUtil.java */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f347129a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(F f12) {
        String strE = f12.e();
        return strE != null && strE.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i12 = U.f348106a;
        String[] strArrSplit = str.split("\\.", 2);
        long j12 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j12 = (j12 * 60) + Long.parseLong(str2);
        }
        long j13 = j12 * 1000;
        if (strArrSplit.length == 2) {
            j13 += Long.parseLong(strArrSplit[1]);
        }
        return j13 * 1000;
    }

    public static void d(F f12) throws ParserException {
        int i12 = f12.f348071b;
        if (a(f12)) {
            return;
        }
        f12.B(i12);
        throw ParserException.a("Expected WEBVTT. Got " + f12.e(), null);
    }
}
