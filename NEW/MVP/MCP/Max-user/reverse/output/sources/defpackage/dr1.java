package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class dr1 {
    public static final bk8 a;

    static {
        long millis = TimeUnit.SECONDS.toMillis(5L);
        a = new bk8(millis - 2000, millis + 4000);
    }
}
