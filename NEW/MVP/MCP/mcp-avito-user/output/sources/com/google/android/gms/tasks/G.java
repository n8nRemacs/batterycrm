package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class G implements J {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f355646b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f355647c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public final InterfaceC37024g f355648d;

    public G(@j.N Executor executor, @j.N InterfaceC37024g interfaceC37024g) {
        this.f355646b = executor;
        this.f355648d = interfaceC37024g;
    }

    @Override // com.google.android.gms.tasks.J
    public final void a(@j.N Task task) {
        if (task.r()) {
            synchronized (this.f355647c) {
                try {
                    if (this.f355648d == null) {
                        return;
                    }
                    this.f355646b.execute(new F(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
