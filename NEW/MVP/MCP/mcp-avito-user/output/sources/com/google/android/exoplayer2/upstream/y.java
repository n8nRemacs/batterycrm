package com.google.android.exoplayer2.upstream;

import j.P;
import java.util.regex.Pattern;

/* compiled from: HttpUtil.java */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f348018a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f348019b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @P
    public static String a(long j12, long j13) {
        if (j12 == 0 && j13 == -1) {
            return null;
        }
        StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "bytes=", "-");
        if (j13 != -1) {
            sbQ.append((j12 + j13) - 1);
        }
        return sbQ.toString();
    }
}
