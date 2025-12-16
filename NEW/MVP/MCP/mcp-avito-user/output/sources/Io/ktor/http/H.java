package io.ktor.http;

import kotlin.Metadata;

/* compiled from: CookieUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class H {
    public static final boolean a(char c12) {
        return c12 == '\t' || (' ' <= c12 && c12 < '0') || ((';' <= c12 && c12 < 'A') || (('[' <= c12 && c12 < 'a') || ('{' <= c12 && c12 < 127)));
    }

    public static final boolean b(char c12) {
        return '0' <= c12 && c12 < ':';
    }

    public static final boolean c(char c12) {
        return (c12 >= 0 && c12 < '\t') || ('\n' <= c12 && c12 < ' ') || (('0' <= c12 && c12 < ':') || c12 == ':' || (('a' <= c12 && c12 < '{') || (('A' <= c12 && c12 < '[') || (127 <= c12 && c12 < 256))));
    }

    public static final boolean d(char c12) {
        return (c12 >= 0 && c12 < '0') || ('J' <= c12 && c12 < 256);
    }
}
