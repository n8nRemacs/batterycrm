package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C37591m {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f360982a;

    /* renamed from: b, reason: collision with root package name */
    public Task<Void> f360983b = C37030m.f(null);

    /* renamed from: c, reason: collision with root package name */
    public final Object f360984c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Boolean> f360985d = new ThreadLocal<>();

    public C37591m(ExecutorService executorService) {
        this.f360982a = executorService;
        executorService.execute(new RunnableC37587i(this));
    }

    public final <T> Task<T> a(Callable<T> callable) {
        Task<T> task;
        synchronized (this.f360984c) {
            task = (Task<T>) this.f360983b.i(this.f360982a, new C37589k(callable));
            this.f360983b = task.i(this.f360982a, new C37590l());
        }
        return task;
    }

    public final <T> Task<T> b(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.f360984c) {
            task = (Task<T>) this.f360983b.l(this.f360982a, new C37589k(callable));
            this.f360983b = task.i(this.f360982a, new C37590l());
        }
        return task;
    }
}
