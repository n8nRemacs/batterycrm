package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface d2a {
    @fz4
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @fz4
    long nowNanos();
}
