package com.avito.android.comfortable_deal.select_agent.item.agent;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AgentBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f122714a;

    public b(f fVar) {
        this.f122714a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f122714a.get());
    }
}
