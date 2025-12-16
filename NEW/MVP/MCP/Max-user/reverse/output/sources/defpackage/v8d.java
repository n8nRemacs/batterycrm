package defpackage;

import java.util.Arrays;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class v8d {
    public static final nme a = new nme("SAMPLED_TRACE", 1);

    public static final void a(k2g k2gVar, y2g y2gVar, String str) {
        b3g.i.fine(y2gVar.f + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + k2gVar.c);
    }

    public static final String b(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= ((long) (-999500000)) ? ho7.k(new StringBuilder(), (j - 500000000) / 1000000000, " s ") : j <= ((long) (-999500)) ? ho7.k(new StringBuilder(), (j - 500000) / 1000000, " ms") : j <= 0 ? ho7.k(new StringBuilder(), (j - 500) / 1000, " µs") : j < ((long) 999500) ? ho7.k(new StringBuilder(), (j + 500) / 1000, " µs") : j < ((long) 999500000) ? ho7.k(new StringBuilder(), (j + 500000) / 1000000, " ms") : ho7.k(new StringBuilder(), (j + 500000000) / 1000000000, " s ")}, 1));
    }

    public static final void c(esg esgVar) {
        esgVar.d(80, new a13(28));
        esgVar.d(HttpStatus.SC_SWITCHING_PROTOCOLS, new a13(29));
        esgVar.d(HttpStatus.SC_PROCESSING, new zv6(0));
        esgVar.d(103, new qu4(24));
        esgVar.d(104, new em(28));
        esgVar.d(105, new em(29));
        esgVar.d(106, new yv6(0));
    }
}
