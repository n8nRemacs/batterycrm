package io.reactivex.rxjava3.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BackpressureStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final BackpressureStrategy f401953b;

    /* renamed from: c, reason: collision with root package name */
    public static final BackpressureStrategy f401954c;

    /* renamed from: d, reason: collision with root package name */
    public static final BackpressureStrategy f401955d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BackpressureStrategy[] f401956e;

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureStrategy EF0;

    static {
        BackpressureStrategy backpressureStrategy = new BackpressureStrategy("MISSING", 0);
        BackpressureStrategy backpressureStrategy2 = new BackpressureStrategy("ERROR", 1);
        BackpressureStrategy backpressureStrategy3 = new BackpressureStrategy("BUFFER", 2);
        f401953b = backpressureStrategy3;
        BackpressureStrategy backpressureStrategy4 = new BackpressureStrategy("DROP", 3);
        f401954c = backpressureStrategy4;
        BackpressureStrategy backpressureStrategy5 = new BackpressureStrategy("LATEST", 4);
        f401955d = backpressureStrategy5;
        f401956e = new BackpressureStrategy[]{backpressureStrategy, backpressureStrategy2, backpressureStrategy3, backpressureStrategy4, backpressureStrategy5};
    }

    public BackpressureStrategy() {
        throw null;
    }

    public static BackpressureStrategy valueOf(String str) {
        return (BackpressureStrategy) Enum.valueOf(BackpressureStrategy.class, str);
    }

    public static BackpressureStrategy[] values() {
        return (BackpressureStrategy[]) f401956e.clone();
    }
}
