package com.squareup.picasso;

import com.squareup.picasso.K;
import com.squareup.picasso.Picasso;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PicassoExecutorService.java */
/* loaded from: classes7.dex */
class x extends ThreadPoolExecutor {

    /* compiled from: PicassoExecutorService.java */
    public static final class a extends FutureTask<RunnableC37866c> implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        public final RunnableC37866c f366476b;

        public a(RunnableC37866c runnableC37866c) {
            super(runnableC37866c, null);
            this.f366476b = runnableC37866c;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            RunnableC37866c runnableC37866c = this.f366476b;
            Picasso.Priority priority = runnableC37866c.f366425s;
            RunnableC37866c runnableC37866c2 = aVar.f366476b;
            Picasso.Priority priority2 = runnableC37866c2.f366425s;
            return priority == priority2 ? runnableC37866c.f366408b - runnableC37866c2.f366408b : priority2.ordinal() - priority.ordinal();
        }
    }

    public x() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new K.b());
    }

    public final void a(int i12) {
        setCorePoolSize(i12);
        setMaximumPoolSize(i12);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((RunnableC37866c) runnable);
        execute(aVar);
        return aVar;
    }
}
