package com.avito.android.comfortable_deal.deal.item.agent;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AgentPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f121171a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.common.formatter.b f121172b;

    public f(l lVar, com.avito.android.comfortable_deal.common.formatter.b bVar) {
        this.f121171a = lVar;
        this.f121172b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f121171a.f393949a, (com.avito.android.comfortable_deal.common.formatter.a) this.f121172b.get());
    }
}
