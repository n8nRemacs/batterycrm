package com.avito.android.profile.user_profile.cards.sessions;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileSessionsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f225511a;

    public b(u uVar) {
        this.f225511a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f225511a.get());
    }
}
