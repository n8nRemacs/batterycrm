package com.avito.android.user_advert.advert;

import Tv0.InterfaceC15415a;
import android.content.res.Resources;
import ur.InterfaceC49101b;

/* compiled from: MyAdvertDetailsResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.advert.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35390f1 implements dagger.internal.h<C35387e1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f308899a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f308900b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f308901c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f308902d;

    public C35390f1(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f308899a = lVar;
        this.f308900b = uVar;
        this.f308901c = uVar2;
        this.f308902d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35387e1((Resources) this.f308899a.f393949a, (nt.f) this.f308900b.get(), (InterfaceC49101b) this.f308901c.get(), (InterfaceC15415a) this.f308902d.get());
    }
}
