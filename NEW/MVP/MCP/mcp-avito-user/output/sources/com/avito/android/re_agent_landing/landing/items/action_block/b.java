package com.avito.android.re_agent_landing.landing.items.action_block;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActionBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f250734a;

    public b(g gVar) {
        this.f250734a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f250734a.get());
    }
}
