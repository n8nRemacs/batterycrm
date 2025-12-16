package com.avito.android.publish.details.di;

import com.avito.android.Q1;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.publish.objects.di.C33923f;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: PublishDetailsPhotoModule_ProvideMultiStatePhotoItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class z0 implements dagger.internal.h<com.avito.android.photo_list_view.blueprints.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view.s> f234608a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234609b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f234610c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f234611d;

    /* renamed from: e, reason: collision with root package name */
    public final C33923f f234612e;

    public z0(Provider provider, dagger.internal.u uVar, Provider provider2, dagger.internal.u uVar2, C33923f c33923f) {
        this.f234608a = provider;
        this.f234609b = uVar;
        this.f234610c = provider2;
        this.f234611d = uVar2;
        this.f234612e = c33923f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_list_view.s sVar = this.f234608a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f234609b.get();
        InterfaceC35807h4 interfaceC35807h4 = this.f234610c.get();
        Q1 q12 = (Q1) this.f234611d.get();
        InterfaceC30978i interfaceC30978i = (InterfaceC30978i) this.f234612e.get();
        y0.f234605a.getClass();
        return new com.avito.android.photo_list_view.blueprints.k(sVar, aVar, interfaceC35807h4, q12, interfaceC30978i);
    }
}
