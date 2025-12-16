package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C36729v;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class F2 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final Object f354673b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractQueue f354674c;

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public boolean f354675d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A2 f354676e;

    /* JADX WARN: Multi-variable type inference failed */
    public F2(A2 a22, String str, BlockingQueue<G2<?>> blockingQueue) {
        this.f354676e = a22;
        C36729v.j(blockingQueue);
        this.f354673b = new Object();
        this.f354674c = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        S1 s1Zzj = this.f354676e.zzj();
        s1Zzj.f354892i.c(androidx.appcompat.app.r.q(getName(), " was interrupted"), interruptedException);
    }

    public final void b() {
        synchronized (this.f354676e.f354517i) {
            try {
                if (!this.f354675d) {
                    this.f354676e.f354518j.release();
                    this.f354676e.f354517i.notifyAll();
                    A2 a22 = this.f354676e;
                    if (this == a22.f354511c) {
                        a22.f354511c = null;
                    } else if (this == a22.f354512d) {
                        a22.f354512d = null;
                    } else {
                        a22.zzj().f354889f.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f354675d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z12 = false;
        while (!z12) {
            try {
                this.f354676e.f354518j.acquire();
                z12 = true;
            } catch (InterruptedException e12) {
                a(e12);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                G2 g22 = (G2) this.f354674c.poll();
                if (g22 != null) {
                    Process.setThreadPriority(g22.f354685c ? threadPriority : 10);
                    g22.run();
                } else {
                    synchronized (this.f354673b) {
                        if (this.f354674c.peek() == null) {
                            A2 a22 = this.f354676e;
                            AtomicLong atomicLong = A2.f354510k;
                            a22.getClass();
                            try {
                                this.f354673b.wait(30000L);
                            } catch (InterruptedException e13) {
                                a(e13);
                            }
                        }
                    }
                    synchronized (this.f354676e.f354517i) {
                        if (this.f354674c.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }
}
