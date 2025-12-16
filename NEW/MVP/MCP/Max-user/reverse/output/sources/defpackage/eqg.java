package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eqg implements Executor {
    public static final eqg a;
    public static final Handler b;
    public static final /* synthetic */ eqg[] c;

    static {
        eqg eqgVar = new eqg("INSTANCE", 0);
        a = eqgVar;
        c = new eqg[]{eqgVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static eqg valueOf(String str) {
        return (eqg) Enum.valueOf(eqg.class, str);
    }

    public static eqg[] values() {
        return (eqg[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
