package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class y<TResult, TContinuationResult> implements InterfaceC37024g<TContinuationResult>, InterfaceC37023f, InterfaceC37021d, J {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f355693b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC37020c f355694c;

    /* renamed from: d, reason: collision with root package name */
    public final P f355695d;

    public y(@j.N Executor executor, @j.N InterfaceC37020c interfaceC37020c, @j.N P p12) {
        this.f355693b = executor;
        this.f355694c = interfaceC37020c;
        this.f355695d = p12;
    }

    @Override // com.google.android.gms.tasks.J
    public final void a(@j.N Task task) {
        this.f355693b.execute(new x(this, task));
    }

    @Override // com.google.android.gms.tasks.InterfaceC37021d
    public final void onCanceled() {
        this.f355695d.w();
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public final void onFailure(@j.N Exception exc) {
        this.f355695d.u(exc);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f355695d.v(tcontinuationresult);
    }
}
