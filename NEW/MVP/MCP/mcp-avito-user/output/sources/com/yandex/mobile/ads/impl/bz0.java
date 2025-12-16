package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class bz0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f384123a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f384124b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<qy0<?>> f384125c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<qy0<?>> f384126d;

    /* renamed from: e, reason: collision with root package name */
    private final zg f384127e;

    /* renamed from: f, reason: collision with root package name */
    private final uo0 f384128f;

    /* renamed from: g, reason: collision with root package name */
    private final sz0 f384129g;

    /* renamed from: h, reason: collision with root package name */
    private final vo0[] f384130h;

    /* renamed from: i, reason: collision with root package name */
    private eh f384131i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f384132j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f384133k;

    public interface a {
        void a();
    }

    public interface b {
        boolean a(qy0<?> qy0Var);
    }

    @Deprecated
    public interface c<T> {
        void a();
    }

    public bz0(zg zgVar, lf lfVar, int i12, gt gtVar) {
        this.f384123a = new AtomicInteger();
        this.f384124b = new HashSet();
        this.f384125c = new PriorityBlockingQueue<>();
        this.f384126d = new PriorityBlockingQueue<>();
        this.f384132j = new ArrayList();
        this.f384133k = new ArrayList();
        this.f384127e = zgVar;
        this.f384128f = lfVar;
        this.f384130h = new vo0[i12];
        this.f384129g = gtVar;
    }

    public final void a() {
        eh ehVar = this.f384131i;
        if (ehVar != null) {
            ehVar.b();
        }
        for (vo0 vo0Var : this.f384130h) {
            if (vo0Var != null) {
                vo0Var.b();
            }
        }
        eh ehVar2 = new eh(this.f384125c, this.f384126d, this.f384127e, this.f384129g);
        this.f384131i = ehVar2;
        ehVar2.start();
        for (int i12 = 0; i12 < this.f384130h.length; i12++) {
            vo0 vo0Var2 = new vo0(this.f384126d, this.f384128f, this.f384127e, this.f384129g);
            this.f384130h[i12] = vo0Var2;
            vo0Var2.start();
        }
    }

    public final <T> void b(qy0<T> qy0Var) {
        synchronized (this.f384124b) {
            this.f384124b.remove(qy0Var);
        }
        synchronized (this.f384132j) {
            try {
                Iterator it = this.f384132j.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(qy0Var, 5);
    }

    public final void a(b bVar) {
        synchronized (this.f384124b) {
            try {
                Iterator it = this.f384124b.iterator();
                while (it.hasNext()) {
                    qy0<?> qy0Var = (qy0) it.next();
                    if (bVar.a(qy0Var)) {
                        qy0Var.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public bz0(zg zgVar, lf lfVar, int i12) {
        this(zgVar, lfVar, i12, new gt(new Handler(Looper.getMainLooper())));
    }

    public final void a(qy0 qy0Var) {
        qy0Var.a(this);
        synchronized (this.f384124b) {
            this.f384124b.add(qy0Var);
        }
        qy0Var.b(this.f384123a.incrementAndGet());
        qy0Var.a("add-to-queue");
        a(qy0Var, 0);
        if (!qy0Var.s()) {
            this.f384126d.add(qy0Var);
        } else {
            this.f384125c.add(qy0Var);
        }
    }

    public final void a(qy0<?> qy0Var, int i12) {
        synchronized (this.f384133k) {
            try {
                Iterator it = this.f384133k.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
