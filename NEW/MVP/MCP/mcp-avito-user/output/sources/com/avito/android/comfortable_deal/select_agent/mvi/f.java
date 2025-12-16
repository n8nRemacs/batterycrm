package com.avito.android.comfortable_deal.select_agent.mvi;

import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectAgentBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f122765a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f122766b;

    public f(com.avito.android.comfortable_deal.repository.l lVar, dagger.internal.l lVar2) {
        this.f122765a = lVar;
        this.f122766b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.comfortable_deal.repository.a) this.f122765a.get(), (SelectAgentArguments) this.f122766b.f393949a);
    }
}
