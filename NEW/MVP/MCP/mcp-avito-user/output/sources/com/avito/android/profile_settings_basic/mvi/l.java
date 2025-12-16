package com.avito.android.profile_settings_basic.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_settings_basic.InterfaceC33460e;
import javax.inject.Provider;

/* compiled from: BasicProfileSettingsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_basic.s> f228893a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f228894b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f228895c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f228896d;

    public l(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f228893a = provider;
        this.f228894b = uVar;
        this.f228895c = provider2;
        this.f228896d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f228893a.get(), (InterfaceC33460e) this.f228894b.get(), this.f228895c.get(), this.f228896d.get());
    }
}
