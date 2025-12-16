package com.avito.android.evidence_request.details.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.evidence_request.details.di.C30376a;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.O;
import com.avito.android.photo_list_view.s;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EvidenceFilesUploadModule_ProvideImageListPresenter$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<com.avito.android.photo_list_view.s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33214h> f148258a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<s.b> f148259b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<s.a> f148260c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148261d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f148262e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f148263f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f148264g;

    public A(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f148258a = provider;
        this.f148259b = provider2;
        this.f148260c = provider3;
        this.f148261d = provider4;
        this.f148262e = uVar;
        this.f148263f = provider5;
        this.f148264g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33214h interfaceC33214h = this.f148258a.get();
        s.b bVar = this.f148259b.get();
        s.a aVar = this.f148260c.get();
        InterfaceC35745a5 interfaceC35745a5D = ((C30376a.b.u) this.f148261d).f148376a.d();
        com.avito.android.photo_list_view.x xVar = (com.avito.android.photo_list_view.x) this.f148262e.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) ((C30376a.b.g) this.f148263f).get();
        InterfaceC28373a interfaceC28373aA = ((C30376a.b.C4346b) this.f148264g).f148357a.a();
        w.f148426a.getClass();
        return new com.avito.android.photo_list_view.t(interfaceC33214h, bVar, aVar, interfaceC35745a5D, xVar, new com.avito.android.evidence_request.details.files.e(), new O(interfaceC28373aA, aVar2));
    }
}
