package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class r<T> implements InterfaceC37035s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f355676b = new CountDownLatch(1);

    public r() {
    }

    @Override // com.google.android.gms.tasks.InterfaceC37021d
    public final void onCanceled() {
        this.f355676b.countDown();
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public final void onFailure(@j.N Exception exc) {
        this.f355676b.countDown();
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public final void onSuccess(T t12) {
        this.f355676b.countDown();
    }

    public /* synthetic */ r(C37034q c37034q) {
    }
}
