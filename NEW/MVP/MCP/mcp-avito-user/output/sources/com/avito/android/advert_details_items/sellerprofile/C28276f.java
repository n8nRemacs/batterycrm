package com.avito.android.advert_details_items.sellerprofile;

import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: AdvertDetailsSellerProfilePresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_details_items.sellerprofile.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28276f implements dagger.internal.h<C28275e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28280j> f85616a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f85617b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f85618c;

    public C28276f(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f85616a = provider;
        this.f85617b = uVar;
        this.f85618c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28275e(this.f85616a.get(), (u3.l) this.f85617b.get(), (InterfaceC49101b) this.f85618c.get());
    }
}
