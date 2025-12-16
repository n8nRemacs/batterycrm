package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class I<TResult, TContinuationResult> implements InterfaceC37024g<TContinuationResult>, InterfaceC37023f, InterfaceC37021d, J {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f355651b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC37027j f355652c;

    /* renamed from: d, reason: collision with root package name */
    public final P f355653d;

    public I(@j.N Executor executor, @j.N InterfaceC37027j interfaceC37027j, @j.N P p12) {
        this.f355651b = executor;
        this.f355652c = interfaceC37027j;
        this.f355653d = p12;
    }

    @Override // com.google.android.gms.tasks.J
    public final void a(@j.N Task task) {
        this.f355651b.execute(new H(this, task));
    }

    @Override // com.google.android.gms.tasks.InterfaceC37021d
    public final void onCanceled() {
        this.f355653d.w();
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public final void onFailure(@j.N Exception exc) {
        this.f355653d.u(exc);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f355653d.v(tcontinuationresult);
    }
}
