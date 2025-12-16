package com.avito.android.profile.user_profile.cards.address;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmptyAddressCardBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224739a;

    public j(u uVar) {
        this.f224739a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((k) this.f224739a.get());
    }
}
