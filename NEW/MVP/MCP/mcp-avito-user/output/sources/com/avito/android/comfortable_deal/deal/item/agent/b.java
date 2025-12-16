package com.avito.android.comfortable_deal.deal.item.agent;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AgentBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f121158a;

    public b(f fVar) {
        this.f121158a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f121158a.get());
    }
}
