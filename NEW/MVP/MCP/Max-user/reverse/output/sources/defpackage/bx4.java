package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bx4 implements Executor {
    public static final bx4 a;
    public static final /* synthetic */ bx4[] b;

    static {
        bx4 bx4Var = new bx4("INSTANCE", 0);
        a = bx4Var;
        b = new bx4[]{bx4Var};
    }

    public static bx4 valueOf(String str) {
        return (bx4) Enum.valueOf(bx4.class, str);
    }

    public static bx4[] values() {
        return (bx4[]) b.clone();
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
