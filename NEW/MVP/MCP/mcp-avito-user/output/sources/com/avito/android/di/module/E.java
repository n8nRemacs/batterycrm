package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import com.avito.android.serp.adapter.C34727d;
import com.avito.android.serp.adapter.InterfaceC34689c;
import com.avito.android.serp.adapter.InterfaceC34863v;
import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideAdvertGridItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E implements dagger.internal.h<InterfaceC34689c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34863v> f143892a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f143893b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f143894c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ImageViewportEvent.EventSource> f143895d;

    /* renamed from: e, reason: collision with root package name */
    public final N f143896e;

    public E(Provider provider, dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider2, N n12) {
        this.f143892a = provider;
        this.f143893b = uVar;
        this.f143894c = uVar2;
        this.f143895d = provider2;
        this.f143896e = n12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f143892a);
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f143893b.get();
        C36135w2 c36135w2 = (C36135w2) this.f143894c.get();
        ImageViewportEvent.EventSource eventSource = this.f143895d.get();
        com.avito.android.constructor_advert.ui.serp.constructor.h hVar = (com.avito.android.constructor_advert.ui.serp.constructor.h) this.f143896e.get();
        D d12 = D.f143878a;
        return new C34727d(eVarB, interfaceC28373a, c36135w2, eventSource, hVar);
    }
}
