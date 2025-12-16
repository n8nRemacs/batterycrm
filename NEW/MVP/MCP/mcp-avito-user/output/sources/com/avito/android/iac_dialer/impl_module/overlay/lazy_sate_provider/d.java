package com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sK.InterfaceC48062a;

/* compiled from: IacOverlayLazyStateProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f166147a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f166148b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f166149c;

    public d(u uVar, Provider provider, com.avito.android.iac_dialer.impl_module.splitter.features.c cVar) {
        this.f166147a = uVar;
        this.f166148b = provider;
        this.f166149c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48062a interfaceC48062a = (InterfaceC48062a) this.f166147a.get();
        R0 r02 = this.f166148b.get();
        this.f166149c.get();
        return new b(interfaceC48062a, r02);
    }
}
