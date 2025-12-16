package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.impl.ob.Gm;
import com.yandex.metrica.networktasks.impl.e;
import com.yandex.metrica.networktasks.impl.f;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes7.dex */
public class NetworkCore extends com.yandex.metrica.networktasks.impl.c {

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f382410c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f382411d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f382412e;

    /* renamed from: f, reason: collision with root package name */
    public volatile c f382413f;

    /* renamed from: g, reason: collision with root package name */
    public final e f382414g;

    public NetworkCore() {
        e eVar = new e();
        this.f382410c = new LinkedBlockingQueue();
        this.f382411d = new Object();
        this.f382412e = new Object();
        this.f382414g = eVar;
    }

    public final void a(NetworkTask networkTask) {
        boolean z12;
        synchronized (this.f382411d) {
            try {
                c cVar = new c(networkTask, null);
                synchronized (this) {
                    z12 = this.f382460b;
                }
                if (z12 && !this.f382410c.contains(cVar) && !cVar.equals(this.f382413f)) {
                    NetworkTask networkTask2 = cVar.f382447a;
                    boolean zA2 = networkTask2.a(d.f382450c);
                    if (zA2) {
                        networkTask2.f382421e.onTaskAdded();
                    }
                    if (zA2) {
                        this.f382410c.offer(cVar);
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z12;
        NetworkTask networkTask = null;
        while (true) {
            synchronized (this) {
                z12 = this.f382460b;
            }
            if (!z12) {
                return;
            }
            try {
                synchronized (this.f382412e) {
                }
                this.f382413f = (c) this.f382410c.take();
                networkTask = this.f382413f.f382447a;
                Gm gm2 = networkTask.f382418b;
                this.f382414g.getClass();
                gm2.execute(new f(networkTask, this, new com.yandex.metrica.networktasks.impl.d()));
                synchronized (this.f382412e) {
                    this.f382413f = null;
                    networkTask.h();
                    networkTask.i();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f382412e) {
                    try {
                        this.f382413f = null;
                        if (networkTask != null) {
                            networkTask.h();
                            networkTask.i();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.f382412e) {
                    try {
                        this.f382413f = null;
                        if (networkTask != null) {
                            networkTask.h();
                            networkTask.i();
                        }
                        throw th2;
                    } finally {
                    }
                }
            }
        }
    }
}
