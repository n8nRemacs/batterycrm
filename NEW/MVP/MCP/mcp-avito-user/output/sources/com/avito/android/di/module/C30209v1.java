package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import com.avito.android.social.InterfaceC35013e;

/* compiled from: AvitoAppFakeSocialModule_ProvideAvitoFakeSocialManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.v1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30209v1 implements dagger.internal.h<InterfaceC35013e> {

    /* renamed from: a, reason: collision with root package name */
    public final C30198u1 f144645a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144646b;

    public C30209v1(C30198u1 c30198u1, dagger.internal.l lVar) {
        this.f144645a = c30198u1;
        this.f144646b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144646b.f393949a;
        this.f144645a.getClass();
        return interfaceC29905l.n();
    }
}
