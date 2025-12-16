package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes10.dex */
public class J<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f59110e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f59111a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f59112b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f59113c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public volatile I<T> f59114d;

    /* compiled from: LottieTask.java */
    public static class a<T> extends FutureTask<I<T>> {

        /* renamed from: b, reason: collision with root package name */
        public J<T> f59115b;

        public a() {
            throw null;
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    J<T> j12 = this.f59115b;
                    I<T> i12 = get();
                    Executor executor = J.f59110e;
                    j12.d(i12);
                } catch (InterruptedException | ExecutionException e12) {
                    J<T> j13 = this.f59115b;
                    I<T> i13 = new I<>(e12);
                    Executor executor2 = J.f59110e;
                    j13.d(i13);
                }
            } finally {
                this.f59115b = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f59110e = new androidx.arch.core.executor.a(1);
        } else {
            f59110e = Executors.newCachedThreadPool(new com.airbnb.lottie.utils.f());
        }
    }

    @RestrictTo
    public J() {
        throw null;
    }

    public J(C27291k c27291k) {
        this.f59111a = new LinkedHashSet(1);
        this.f59112b = new LinkedHashSet(1);
        this.f59113c = new Handler(Looper.getMainLooper());
        this.f59114d = null;
        d(new I<>(c27291k));
    }

    public final synchronized void a(E e12) {
        Throwable th2;
        try {
            I<T> i12 = this.f59114d;
            if (i12 != null && (th2 = i12.f59109b) != null) {
                e12.onResult(th2);
            }
            this.f59112b.add(e12);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(E e12) {
        C27291k c27291k;
        try {
            I<T> i12 = this.f59114d;
            if (i12 != null && (c27291k = i12.f59108a) != null) {
                e12.onResult(c27291k);
            }
            this.f59111a.add(e12);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        I<T> i12 = this.f59114d;
        if (i12 == null) {
            return;
        }
        C27291k c27291k = i12.f59108a;
        if (c27291k != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f59111a).iterator();
                while (it.hasNext()) {
                    ((E) it.next()).onResult(c27291k);
                }
            }
            return;
        }
        Throwable th2 = i12.f59109b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f59112b);
            if (arrayList.isEmpty()) {
                com.airbnb.lottie.utils.e.c("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((E) it2.next()).onResult(th2);
            }
        }
    }

    public final void d(@j.P I<T> i12) {
        if (this.f59114d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f59114d = i12;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f59113c.post(new RunnableC27294n(this, 3));
        }
    }

    @RestrictTo
    public J(Callable<I<T>> callable, boolean z12) {
        this.f59111a = new LinkedHashSet(1);
        this.f59112b = new LinkedHashSet(1);
        this.f59113c = new Handler(Looper.getMainLooper());
        this.f59114d = null;
        if (z12) {
            try {
                d(callable.call());
                return;
            } catch (Throwable th2) {
                d(new I<>(th2));
                return;
            }
        }
        Executor executor = f59110e;
        a aVar = new a(callable);
        aVar.f59115b = this;
        executor.execute(aVar);
    }
}
