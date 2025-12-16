package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class A implements J {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f355630b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f355631c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public final InterfaceC37021d f355632d;

    public A(@j.N Executor executor, @j.N InterfaceC37021d interfaceC37021d) {
        this.f355630b = executor;
        this.f355632d = interfaceC37021d;
    }

    @Override // com.google.android.gms.tasks.J
    public final void a(@j.N Task task) {
        if (task.p()) {
            synchronized (this.f355631c) {
                try {
                    if (this.f355632d == null) {
                        return;
                    }
                    this.f355630b.execute(new z(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
