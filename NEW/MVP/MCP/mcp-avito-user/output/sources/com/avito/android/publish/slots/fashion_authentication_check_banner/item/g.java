package com.avito.android.publish.slots.fashion_authentication_check_banner.item;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FashionAuthenticationBannerItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.c f243880a;

    /* renamed from: b, reason: collision with root package name */
    public final u f243881b;

    public g(com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.c cVar, u uVar) {
        this.f243880a = cVar;
        this.f243881b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.a) this.f243880a.get(), (InterfaceC35745a5) this.f243881b.get());
    }
}
