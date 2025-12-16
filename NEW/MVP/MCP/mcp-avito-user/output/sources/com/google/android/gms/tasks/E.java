package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class E implements J {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f355641b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f355642c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public final InterfaceC37023f f355643d;

    public E(@j.N Executor executor, @j.N InterfaceC37023f interfaceC37023f) {
        this.f355641b = executor;
        this.f355643d = interfaceC37023f;
    }

    @Override // com.google.android.gms.tasks.J
    public final void a(@j.N Task task) {
        if (task.r() || task.p()) {
            return;
        }
        synchronized (this.f355642c) {
            try {
                if (this.f355643d == null) {
                    return;
                }
                this.f355641b.execute(new D(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
