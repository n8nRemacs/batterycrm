package io.reactivex.rxjava3.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BackpressureOverflowStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BackpressureOverflowStrategy[] f401952b = {new BackpressureOverflowStrategy("ERROR", 0), new BackpressureOverflowStrategy("DROP_OLDEST", 1), new BackpressureOverflowStrategy("DROP_LATEST", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureOverflowStrategy EF5;

    public BackpressureOverflowStrategy() {
        throw null;
    }

    public static BackpressureOverflowStrategy valueOf(String str) {
        return (BackpressureOverflowStrategy) Enum.valueOf(BackpressureOverflowStrategy.class, str);
    }

    public static BackpressureOverflowStrategy[] values() {
        return (BackpressureOverflowStrategy[]) f401952b.clone();
    }
}
