package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dx4 implements Executor {
    public static final dx4 a;
    public static final /* synthetic */ dx4[] b;

    static {
        dx4 dx4Var = new dx4("INSTANCE", 0);
        a = dx4Var;
        b = new dx4[]{dx4Var};
    }

    public static dx4 valueOf(String str) {
        return (dx4) Enum.valueOf(dx4.class, str);
    }

    public static dx4[] values() {
        return (dx4[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
