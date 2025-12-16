package com.avito.android.user_adverts.root_screen.adverts_host.safety_info;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SafetyInfoViewModelImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_adverts_common.safety.h f313824a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f313825b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f313826c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f313827d;

    public f(com.avito.android.user_adverts_common.safety.h hVar, Provider provider, Provider provider2, Provider provider3) {
        this.f313824a = hVar;
        this.f313825b = provider;
        this.f313826c = provider2;
        this.f313827d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.user_adverts_common.safety.b) this.f313824a.get(), this.f313825b.get(), this.f313826c.get(), this.f313827d.get());
    }
}
