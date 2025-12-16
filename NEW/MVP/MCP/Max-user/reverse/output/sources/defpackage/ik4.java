package defpackage;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ik4 implements brf {
    public static final long b = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager a;

    public ik4(ActivityManager activityManager) {
        this.a = activityManager;
    }

    @Override // defpackage.brf
    public final Object get() {
        int iMin = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new kf9(iMin < 33554432 ? 4194304 : iMin < 67108864 ? 6291456 : iMin / 4, 256, Integer.MAX_VALUE, b, Integer.MAX_VALUE);
    }
}
