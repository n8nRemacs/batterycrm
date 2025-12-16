package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cx4 implements Executor {
    public static final cx4 a;
    public static final /* synthetic */ cx4[] b;

    static {
        cx4 cx4Var = new cx4("INSTANCE", 0);
        a = cx4Var;
        b = new cx4[]{cx4Var};
    }

    public static cx4 valueOf(String str) {
        return (cx4) Enum.valueOf(cx4.class, str);
    }

    public static cx4[] values() {
        return (cx4[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
