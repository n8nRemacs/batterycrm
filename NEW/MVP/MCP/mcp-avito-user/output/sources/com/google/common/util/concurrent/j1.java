package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ThreadFactoryBuilder.java */
/* loaded from: classes6.dex */
class j1 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f360618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f360619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f360620d;

    public j1(ThreadFactory threadFactory, AtomicLong atomicLong, Boolean bool) {
        this.f360618b = threadFactory;
        this.f360619c = atomicLong;
        this.f360620d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f360618b.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        AtomicLong atomicLong = this.f360619c;
        Objects.requireNonNull(atomicLong);
        long andIncrement = atomicLong.getAndIncrement();
        Locale locale = Locale.ROOT;
        threadNewThread.setName("ListenableFutureAdapter-thread-" + andIncrement);
        Boolean bool = this.f360620d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}
