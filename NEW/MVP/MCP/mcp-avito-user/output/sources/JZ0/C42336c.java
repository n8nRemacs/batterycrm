package jZ0;

import android.os.Bundle;
import j.N;
import j.P;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* renamed from: jZ0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C42336c implements InterfaceC42335b, InterfaceC42334a {

    /* renamed from: b, reason: collision with root package name */
    public final C42338e f405642b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f405643c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f405644d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f405645e;

    public C42336c(@N C42338e c42338e, TimeUnit timeUnit) {
        this.f405642b = c42338e;
        this.f405643c = timeUnit;
    }

    @Override // jZ0.InterfaceC42334a
    public final void c(@P Bundle bundle) {
        synchronized (this.f405644d) {
            com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
            Objects.toString(bundle);
            dVar.a(2);
            this.f405645e = new CountDownLatch(1);
            this.f405642b.c(bundle);
            dVar.a(2);
            try {
                if (this.f405645e.await(500, this.f405643c)) {
                    dVar.a(2);
                } else {
                    dVar.a(5);
                }
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.internal.d.f361031a.b();
            }
            this.f405645e = null;
        }
    }

    @Override // jZ0.InterfaceC42335b
    public final void onEvent(@N String str, @N Bundle bundle) {
        CountDownLatch countDownLatch = this.f405645e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
