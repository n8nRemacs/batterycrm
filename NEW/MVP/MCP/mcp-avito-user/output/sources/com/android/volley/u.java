package com.android.volley;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestQueue.java */
/* loaded from: classes10.dex */
public class u {

    /* renamed from: e, reason: collision with root package name */
    public final j f67154e;

    /* renamed from: f, reason: collision with root package name */
    public final p f67155f;

    /* renamed from: g, reason: collision with root package name */
    public final x f67156g;

    /* renamed from: h, reason: collision with root package name */
    public final q[] f67157h;

    /* renamed from: i, reason: collision with root package name */
    public l f67158i;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f67150a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f67151b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue<Request<?>> f67152c = new PriorityBlockingQueue<>();

    /* renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue<Request<?>> f67153d = new PriorityBlockingQueue<>();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f67159j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f67160k = new ArrayList();

    /* compiled from: RequestQueue.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: RequestQueue.java */
    public interface b {
        void a();
    }

    /* compiled from: RequestQueue.java */
    public interface c {
    }

    /* compiled from: RequestQueue.java */
    @Deprecated
    public interface d<T> {
        void a();
    }

    public u(j jVar, p pVar, int i12, x xVar) {
        this.f67154e = jVar;
        this.f67155f = pVar;
        this.f67157h = new q[i12];
        this.f67156g = xVar;
    }

    public final void a(Request request) {
        request.f67032i = this;
        synchronized (this.f67151b) {
            this.f67151b.add(request);
        }
        request.f67031h = Integer.valueOf(this.f67150a.incrementAndGet());
        request.a("add-to-queue");
        c(request, 0);
        b(request);
    }

    public <T> void b(Request<T> request) {
        if (request.f67033j) {
            this.f67152c.add(request);
        } else {
            d(request);
        }
    }

    public final void c(Request<?> request, int i12) {
        synchronized (this.f67160k) {
            try {
                Iterator it = this.f67160k.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public <T> void d(Request<T> request) {
        this.f67153d.add(request);
    }

    public void e() {
        l lVar = this.f67158i;
        if (lVar != null) {
            lVar.f67081f = true;
            lVar.interrupt();
        }
        for (q qVar : this.f67157h) {
            if (qVar != null) {
                qVar.f67098f = true;
                qVar.interrupt();
            }
        }
    }
}
