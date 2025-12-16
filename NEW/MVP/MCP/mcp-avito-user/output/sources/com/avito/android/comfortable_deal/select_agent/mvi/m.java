package com.avito.android.comfortable_deal.select_agent.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectAgentReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.select_agent.mvi.builder.f f122780a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.select_agent.mvi.builder.c f122781b;

    public m(com.avito.android.comfortable_deal.select_agent.mvi.builder.f fVar, com.avito.android.comfortable_deal.select_agent.mvi.builder.c cVar) {
        this.f122780a = fVar;
        this.f122781b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.comfortable_deal.select_agent.mvi.builder.d) this.f122780a.get(), (com.avito.android.comfortable_deal.select_agent.mvi.builder.a) this.f122781b.get());
    }
}
