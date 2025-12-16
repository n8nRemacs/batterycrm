package com.avito.android.publish.objects.di;

import com.avito.android.image.enhancement.C30979j;
import com.avito.android.image.enhancement.InterfaceC30973d;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_list_view.s;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ImageListUploadModule_ProvideImageEnhanceViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33923f implements dagger.internal.h<InterfaceC30978i> {

    /* renamed from: a, reason: collision with root package name */
    public final C33921d f237989a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f237990b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f237991c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f237992d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f237993e;

    public C33923f(C33921d c33921d, dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, dagger.internal.u uVar3) {
        this.f237989a = c33921d;
        this.f237990b = uVar;
        this.f237991c = uVar2;
        this.f237992d = provider;
        this.f237993e = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f237990b.get();
        InterfaceC30973d interfaceC30973d = (InterfaceC30973d) this.f237991c.get();
        com.avito.android.photo_cache.b bVar = this.f237992d.get();
        s.b bVar2 = (s.b) this.f237993e.get();
        C33921d c33921d = this.f237989a;
        c33921d.getClass();
        return new C30979j(interfaceC35745a5, c33921d.f237986b, interfaceC30973d, bVar, new C33919b(bVar2));
    }
}
