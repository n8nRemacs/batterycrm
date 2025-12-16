package com.avito.android.passport.profiles_list.mvi;

import com.avito.android.passport.profiles_list.o;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: PassportProfilesListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213818a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<o> f213819b;

    /* renamed from: c, reason: collision with root package name */
    public final u f213820c;

    public b(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f213818a = lVar;
        this.f213819b = provider;
        this.f213820c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(((Boolean) this.f213818a.f393949a).booleanValue(), this.f213819b.get(), (Z1) this.f213820c.get());
    }
}
