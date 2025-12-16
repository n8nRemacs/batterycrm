package com.avito.android.esia_sdk.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaSdkOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.esia_sdk.utils.b f148153a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f148154b;

    public j(com.avito.android.esia_sdk.utils.b bVar, Provider provider) {
        this.f148153a = bVar;
        this.f148154b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.esia_sdk.utils.a) this.f148153a.get(), this.f148154b.get());
    }
}
