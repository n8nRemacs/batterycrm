package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o81;
import java.util.Arrays;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes8.dex */
public final class l81 {
    public static final void a(k81 k81Var, n81 n81Var, String str) {
        o81 o81Var = o81.f388458h;
        Logger loggerA = o81.b.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n81Var.f());
        sb2.append(' ');
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        sb2.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sb2.append(": ");
        sb2.append(k81Var.b());
        loggerA.fine(sb2.toString());
    }

    @Y61.k
    public static final String a(long j12) {
        String strJ;
        if (j12 <= -999500000) {
            strJ = AK.c.j((j12 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder());
        } else if (j12 <= -999500) {
            strJ = AK.c.j((j12 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j12 <= 0) {
            strJ = AK.c.j((j12 - 500) / 1000, " µs", new StringBuilder());
        } else if (j12 < 999500) {
            strJ = AK.c.j((j12 + 500) / 1000, " µs", new StringBuilder());
        } else if (j12 < 999500000) {
            strJ = AK.c.j((j12 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strJ = AK.c.j((j12 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder());
        }
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        return String.format("%6s", Arrays.copyOf(new Object[]{strJ}, 1));
    }
}
