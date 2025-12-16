package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.InterfaceC30498c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSelectionCreateActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152376a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30498c> f152377b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f152378c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f152379d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f152380e;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f152376a = lVar;
        this.f152377b = provider;
        this.f152378c = provider2;
        this.f152379d = provider3;
        this.f152380e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((ExtendedProfileSelectionCreateConfig) this.f152376a.f393949a, this.f152377b.get(), this.f152378c.get(), this.f152379d.get(), this.f152380e.get());
    }
}
