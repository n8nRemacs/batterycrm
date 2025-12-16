package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import javax.inject.Provider;

/* compiled from: ProfileToConvertBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213162a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213163b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f213164c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<r60.d> f213165d;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f213162a = lVar;
        this.f213163b = provider;
        this.f213164c = provider2;
        this.f213165d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((List) this.f213162a.f393949a, this.f213163b.get(), this.f213164c.get(), this.f213165d.get());
    }
}
