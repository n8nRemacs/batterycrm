package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes4.dex */
class M implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f360924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f360925c;

    /* compiled from: ExecutorUtils.java */
    public class a extends AbstractRunnableC37581c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f360926b;

        public a(Runnable runnable) {
            this.f360926b = runnable;
        }

        @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC37581c
        public final void a() {
            this.f360926b.run();
        }
    }

    public M(String str, AtomicLong atomicLong) {
        this.f360924b = str;
        this.f360925c = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName(this.f360924b + this.f360925c.getAndIncrement());
        return threadNewThread;
    }
}
