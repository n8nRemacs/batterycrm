package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SetProfileNameBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f212182a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f212183b;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f212182a = lVar;
        this.f212183b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(((Boolean) this.f212182a.f393949a).booleanValue(), (Z1) this.f212183b.f393949a);
    }
}
