package com.avito.android.evidence_request.mvi.evidence_details.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.evidence_request.mvi.evidence_details.di.a;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.O;
import com.avito.android.photo_list_view.s;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideImageListPresenter$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.android.photo_list_view.s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33214h> f148945a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<s.b> f148946b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<s.a> f148947c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148948d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f148949e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f148950f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f148951g;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f148945a = provider;
        this.f148946b = provider2;
        this.f148947c = provider3;
        this.f148948d = provider4;
        this.f148949e = uVar;
        this.f148950f = provider5;
        this.f148951g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33214h interfaceC33214h = this.f148945a.get();
        s.b bVar = this.f148946b.get();
        s.a aVar = this.f148947c.get();
        InterfaceC35745a5 interfaceC35745a5D = ((a.b.u) this.f148948d).f148926a.d();
        com.avito.android.photo_list_view.x xVar = (com.avito.android.photo_list_view.x) this.f148949e.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) ((a.b.g) this.f148950f).get();
        InterfaceC28373a interfaceC28373aA = ((a.b.C4365b) this.f148951g).f148907a.a();
        d.f148929a.getClass();
        return new com.avito.android.photo_list_view.t(interfaceC33214h, bVar, aVar, interfaceC35745a5D, xVar, new com.avito.android.evidence_request.mvi.domain.evidence_details.m(), new O(interfaceC28373aA, aVar2));
    }
}
