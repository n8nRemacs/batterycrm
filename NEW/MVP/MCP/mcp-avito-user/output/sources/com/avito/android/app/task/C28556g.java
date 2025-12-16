package com.avito.android.app.task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStartTypeDetermineTaskImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.app.task.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28556g implements dagger.internal.h<AppStartTypeDetermineTaskImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f91596a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f91597b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.analytics.start.b f91598c;

    public C28556g(dagger.internal.f fVar, Provider provider, com.avito.android.analytics.start.b bVar) {
        this.f91596a = fVar;
        this.f91597b = provider;
        this.f91598c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AppStartTypeDetermineTaskImpl((InterfaceC28373a) this.f91596a.get(), this.f91597b.get(), (com.avito.android.analytics.start.a) this.f91598c.get());
    }
}
