package com.avito.android.user_adverts.tab_actions.info.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionResultReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f314688a;

    public i(Provider<InterfaceC35863o4> provider) {
        this.f314688a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f314688a.get());
    }
}
