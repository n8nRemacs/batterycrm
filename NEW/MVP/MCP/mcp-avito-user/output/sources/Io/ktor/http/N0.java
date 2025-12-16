package io.ktor.http;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: URLParser.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final List<String> f399880a = Collections.singletonList("");

    public static final int a(int i12, int i13, String str) {
        boolean z12 = false;
        while (i12 < i13) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '[') {
                z12 = true;
            } else if (cCharAt == ']') {
                z12 = false;
            } else if (cCharAt == ':' && !z12) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Y61.k
    public static final void b(@Y61.k I0 i02, @Y61.k String str) {
        if (C43066x.K(str)) {
            return;
        }
        try {
            c(i02, str);
        } catch (Throwable th2) {
            throw new URLParserException("Fail to parse url: ".concat(str), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0128  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k io.ktor.http.I0 r16, @Y61.k java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.N0.c(io.ktor.http.I0, java.lang.String):void");
    }
}
