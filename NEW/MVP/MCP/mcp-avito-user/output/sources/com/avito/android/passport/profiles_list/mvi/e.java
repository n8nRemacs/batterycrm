package com.avito.android.passport.profiles_list.mvi;

import com.avito.android.passport.profiles_list.o;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportProfilesListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f213828a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213829b;

    public e(u uVar, Provider provider) {
        this.f213828a = uVar;
        this.f213829b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((o) this.f213828a.get(), this.f213829b.get());
    }
}
