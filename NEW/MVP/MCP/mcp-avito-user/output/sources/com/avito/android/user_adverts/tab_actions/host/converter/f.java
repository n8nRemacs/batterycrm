package com.avito.android.user_adverts.tab_actions.host.converter;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertSelectedActionsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f314229a;

    public f(Provider<InterfaceC35863o4> provider) {
        this.f314229a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f314229a.get());
    }
}
