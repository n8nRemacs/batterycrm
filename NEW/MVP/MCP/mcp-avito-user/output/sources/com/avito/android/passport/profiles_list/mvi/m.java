package com.avito.android.passport.profiles_list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportProfilesListReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213851a;

    public m(dagger.internal.l lVar) {
        this.f213851a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(((Boolean) this.f213851a.f393949a).booleanValue());
    }
}
