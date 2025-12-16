package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class w implements J {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f355688b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC37020c f355689c;

    /* renamed from: d, reason: collision with root package name */
    public final P f355690d;

    public w(@j.N Executor executor, @j.N InterfaceC37020c interfaceC37020c, @j.N P p12) {
        this.f355688b = executor;
        this.f355689c = interfaceC37020c;
        this.f355690d = p12;
    }

    @Override // com.google.android.gms.tasks.J
    public final void a(@j.N Task task) {
        this.f355688b.execute(new v(this, task));
    }
}
