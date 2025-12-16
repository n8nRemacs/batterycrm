package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.I;

/* compiled from: JobScheduler.java */
/* loaded from: classes15.dex */
class G implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f340544b;

    public G(I i12) {
        this.f340544b = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        YW0.d dVar;
        int i12;
        I i13 = this.f340544b;
        i13.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (i13) {
            dVar = i13.f340550e;
            i12 = i13.f340551f;
            i13.f340550e = null;
            i13.f340551f = 0;
            i13.f340552g = I.d.f340559d;
            i13.f340554i = jUptimeMillis;
        }
        try {
            if (I.d(dVar, i12)) {
                i13.f340547b.a(dVar, i12);
            }
        } finally {
            YW0.d.b(dVar);
            i13.b();
        }
    }
}
