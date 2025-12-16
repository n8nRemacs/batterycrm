package com.avito.android.profile.user_profile.cards.info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InfoCardBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224991a;

    public b(u uVar) {
        this.f224991a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f224991a.get());
    }
}
