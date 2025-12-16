package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class spi implements Executor {
    public static final spi a;
    public static final /* synthetic */ spi[] b;

    static {
        spi spiVar = new spi("INSTANCE", 0);
        a = spiVar;
        b = new spi[]{spiVar};
    }

    public static spi[] values() {
        return (spi[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((y1a) h08.J().b).post(runnable);
    }
}
