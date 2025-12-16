package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import com.avito.android.serp.adapter.InterfaceC34863v;
import javax.inject.Provider;
import sN0.InterfaceC48080b;

/* compiled from: AdvertItemPresenterModule_ProvideAdvertGridItemWithVideoPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class F implements dagger.internal.h<com.avito.android.serp.adapter.video_snippet.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34863v> f143915a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f143916b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C36135w2> f143917c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ImageViewportEvent.EventSource> f143918d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f143919e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC48080b> f143920f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.h> f143921g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.player_holder.a> f143922h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f143923i;

    public F(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f143915a = provider;
        this.f143916b = provider2;
        this.f143917c = provider3;
        this.f143918d = provider4;
        this.f143919e = provider5;
        this.f143920f = provider6;
        this.f143921g = provider7;
        this.f143922h = provider8;
        this.f143923i = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f143915a);
        InterfaceC28373a interfaceC28373a = this.f143916b.get();
        C36135w2 c36135w2 = this.f143917c.get();
        ImageViewportEvent.EventSource eventSource = this.f143918d.get();
        com.avito.android.video_snippets.g gVar = this.f143919e.get();
        InterfaceC48080b interfaceC48080b = this.f143920f.get();
        com.avito.android.constructor_advert.ui.serp.constructor.h hVar = this.f143921g.get();
        com.avito.android.player_holder.a aVar = this.f143922h.get();
        com.avito.android.serp.adapter.p1 p1Var = (com.avito.android.serp.adapter.p1) this.f143923i.get();
        D d12 = D.f143878a;
        return new com.avito.android.serp.adapter.video_snippet.b(eVarB, interfaceC28373a, c36135w2, eventSource, gVar, interfaceC48080b, hVar, aVar, p1Var);
    }
}
