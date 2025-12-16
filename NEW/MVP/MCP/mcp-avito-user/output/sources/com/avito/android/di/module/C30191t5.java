package com.avito.android.di.module;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ImageUploadServiceModule_ProvideImageUploadServiceDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.t5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30191t5 implements dagger.internal.h<com.avito.android.photo_picker.legacy.service.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f144589a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.U> f144590b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.Q> f144591c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f144592d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144593e;

    public C30191t5(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f144589a = provider;
        this.f144590b = provider2;
        this.f144591c = provider3;
        this.f144592d = uVar;
        this.f144593e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_cache.b bVar = this.f144589a.get();
        com.avito.android.photo_picker.U u12 = this.f144590b.get();
        com.avito.android.photo_picker.Q q12 = this.f144591c.get();
        com.avito.android.photo_picker.X x12 = (com.avito.android.photo_picker.X) this.f144592d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144593e.get();
        C30169r5 c30169r5 = C30169r5.f144559a;
        return new com.avito.android.photo_picker.legacy.service.d(bVar, u12, q12, x12, interfaceC35745a5);
    }
}
