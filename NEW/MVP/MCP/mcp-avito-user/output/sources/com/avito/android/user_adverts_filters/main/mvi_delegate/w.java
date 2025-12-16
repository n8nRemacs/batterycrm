package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: FiltersDelegateActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class w implements dagger.internal.h<C35708a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f316190a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f316191b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f316192c;

    public w(Provider<InterfaceC40691b> provider, Provider<InterfaceC28373a> provider2, Provider<R0> provider3) {
        this.f316190a = provider;
        this.f316191b = provider2;
        this.f316192c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35708a(this.f316190a.get(), this.f316191b.get(), this.f316192c.get());
    }
}
