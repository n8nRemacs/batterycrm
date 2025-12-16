package com.facebook.imagepipeline.core;

import android.os.Process;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PriorityThreadFactory.java */
@Nullsafe
/* loaded from: classes12.dex */
public class y implements ThreadFactory {

    /* renamed from: c, reason: collision with root package name */
    public final String f340365c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f340367e = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final int f340364b = 10;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f340366d = true;

    /* compiled from: PriorityThreadFactory.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f340368b;

        public a(Runnable runnable) {
            this.f340368b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Process.setThreadPriority(y.this.f340364b);
            } catch (Throwable unused) {
            }
            this.f340368b.run();
        }
    }

    public y(String str) {
        this.f340365c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        a aVar = new a(runnable);
        boolean z12 = this.f340366d;
        String string = this.f340365c;
        if (z12) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(string, "-");
            sbZ.append(this.f340367e.getAndIncrement());
            string = sbZ.toString();
        }
        return new Thread(aVar, string);
    }
}
