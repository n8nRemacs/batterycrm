package com.avito.android.publish.objects.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_list_view.C33219m;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.s;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ImageListUploadModule_ProvideImageListPresenter$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33926i implements dagger.internal.h<com.avito.android.photo_list_view.s> {

    /* renamed from: a, reason: collision with root package name */
    public final C33921d f238000a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238001b;

    /* renamed from: c, reason: collision with root package name */
    public final C33923f f238002c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33214h> f238003d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<s.b> f238004e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f238005f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f238006g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f238007h;

    public C33926i(C33921d c33921d, dagger.internal.u uVar, C33923f c33923f, Provider provider, Provider provider2, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f238000a = c33921d;
        this.f238001b = uVar;
        this.f238002c = c33923f;
        this.f238003d = provider;
        this.f238004e = provider2;
        this.f238005f = uVar2;
        this.f238006g = uVar3;
        this.f238007h = uVar4;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.avito.android.photo_list_view.x, com.avito.android.publish.view.ItemDetailsBaseFragment] */
    @Override // javax.inject.Provider
    public final Object get() {
        HM.a aVar = (HM.a) this.f238001b.get();
        InterfaceC30978i interfaceC30978i = (InterfaceC30978i) this.f238002c.get();
        InterfaceC33214h interfaceC33214h = this.f238003d.get();
        s.b bVar = this.f238004e.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f238005f.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f238006g.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f238007h.get();
        C33921d c33921d = this.f238000a;
        c33921d.getClass();
        return new com.avito.android.photo_list_view.t(interfaceC33214h, bVar, c33921d.f237988d, interfaceC35745a5, c33921d.f237987c, new C33219m(), new com.avito.android.photo_list_view.O(interfaceC28373a, aVar2), interfaceC30978i, aVar, interfaceC28373a);
    }
}
