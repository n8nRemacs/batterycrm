package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class T implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f355669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callable f355670c;

    public T(P p12, Callable callable) {
        this.f355669b = p12;
        this.f355670c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P p12 = this.f355669b;
        try {
            p12.v(this.f355670c.call());
        } catch (Exception e12) {
            p12.u(e12);
        } catch (Throwable th2) {
            p12.u(new RuntimeException(th2));
        }
    }
}
