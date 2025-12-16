package com.avito.android.progress_overlay;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadingProgressOverlayImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231585a;

    /* renamed from: b, reason: collision with root package name */
    public final u f231586b;

    public d(u uVar, u uVar2) {
        this.f231585a = uVar;
        this.f231586b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC28373a) this.f231585a.get(), (h) this.f231586b.get());
    }
}
