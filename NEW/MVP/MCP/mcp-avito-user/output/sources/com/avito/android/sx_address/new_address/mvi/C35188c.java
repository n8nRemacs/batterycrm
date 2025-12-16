package com.avito.android.sx_address.new_address.mvi;

import com.avito.android.sx_address.SxAddressControl;
import javax.inject.Provider;

/* compiled from: SxNewAddressBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.new_address.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35188c implements dagger.internal.h<C35187b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.new_address.domain.a> f293766a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f293767b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.new_address.analytics.c> f293768c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.features.a> f293769d;

    public C35188c(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f293766a = provider;
        this.f293767b = lVar;
        this.f293768c = provider2;
        this.f293769d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35187b(this.f293766a.get(), (SxAddressControl) this.f293767b.f393949a, this.f293768c.get(), this.f293769d.get());
    }
}
