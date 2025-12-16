package com.avito.android.image.enhancement;

import com.avito.android.remote.R0;

/* compiled from: ImageEnhanceApi_Module_ProvideImageEnhanceApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.image.enhancement.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30972c implements dagger.internal.h<InterfaceC30970a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f169351a;

    public C30972c(dagger.internal.f fVar) {
        this.f169351a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f169351a.get();
        C30971b.f169350a.getClass();
        InterfaceC30970a interfaceC30970a = (InterfaceC30970a) r02.create(InterfaceC30970a.class);
        dagger.internal.t.d(interfaceC30970a);
        return interfaceC30970a;
    }
}
