package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xxf implements apf {
    public static final boolean a(int i) {
        int i2 = owg.c;
        char c = (char) i;
        if ('a' <= c && c < '{') {
            return true;
        }
        if ('A' > c || c >= '[') {
            return ('0' <= c && c < ':') || c == '-' || c == '_' || c == '.' || c == '~';
        }
        return true;
    }

    public static long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    @Override // defpackage.apf
    public ybj c(Object obj) {
        return n5e.f((List) obj);
    }
}
