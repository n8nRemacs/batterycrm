package io.reactivex.rxjava3.parallel;

import l41.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ParallelFailureHandling implements c<Long, Throwable, ParallelFailureHandling> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ParallelFailureHandling[] f404887b = {new ParallelFailureHandling("STOP", 0), new ParallelFailureHandling("ERROR", 1), new ParallelFailureHandling("SKIP", 2), new ParallelFailureHandling("RETRY", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ParallelFailureHandling EF5;

    public ParallelFailureHandling() {
        throw null;
    }

    public static ParallelFailureHandling valueOf(String str) {
        return (ParallelFailureHandling) Enum.valueOf(ParallelFailureHandling.class, str);
    }

    public static ParallelFailureHandling[] values() {
        return (ParallelFailureHandling[]) f404887b.clone();
    }

    @Override // l41.c
    public final ParallelFailureHandling apply(Long l12, Throwable th2) {
        return this;
    }
}
