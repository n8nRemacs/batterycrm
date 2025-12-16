package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class C implements J {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f355635b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f355636c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public final InterfaceC37022e f355637d;

    public C(@j.N Executor executor, @j.N InterfaceC37022e interfaceC37022e) {
        this.f355635b = executor;
        this.f355637d = interfaceC37022e;
    }

    @Override // com.google.android.gms.tasks.J
    public final void a(@j.N Task task) {
        synchronized (this.f355636c) {
            try {
                if (this.f355637d == null) {
                    return;
                }
                this.f355635b.execute(new B(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
