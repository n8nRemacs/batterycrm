package com.bumptech.glide.load.engine;

import j.N;
import j.P;
import j.k0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: ActiveResources.java */
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f338952a;

    /* renamed from: b, reason: collision with root package name */
    @k0
    public final HashMap f338953b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue<r<?>> f338954c;

    /* renamed from: d, reason: collision with root package name */
    public m f338955d;

    /* compiled from: ActiveResources.java */
    @k0
    public interface a {
    }

    /* compiled from: ActiveResources.java */
    @k0
    public static final class b extends WeakReference<r<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.h f338956a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f338957b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public w<?> f338958c;

        public b(@N com.bumptech.glide.load.h hVar, @N r rVar, @N ReferenceQueue referenceQueue) {
            super(rVar, referenceQueue);
            com.bumptech.glide.util.k.c(hVar, "Argument must not be null");
            this.f338956a = hVar;
            boolean z12 = rVar.f339154b;
            this.f338958c = null;
            this.f338957b = z12;
        }
    }

    public c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC36355a());
        this.f338953b = new HashMap();
        this.f338954c = new ReferenceQueue<>();
        this.f338952a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new RunnableC36356b(this));
    }

    public final synchronized void a(com.bumptech.glide.load.h hVar, r<?> rVar) {
        b bVar = (b) this.f338953b.put(hVar, new b(hVar, rVar, this.f338954c));
        if (bVar != null) {
            bVar.f338958c = null;
            bVar.clear();
        }
    }

    public final void b(@N b bVar) {
        w<?> wVar;
        synchronized (this) {
            this.f338953b.remove(bVar.f338956a);
            if (bVar.f338957b && (wVar = bVar.f338958c) != null) {
                this.f338955d.d(bVar.f338956a, new r<>(wVar, true, false, bVar.f338956a, this.f338955d));
            }
        }
    }
}
