package com.avito.android.comfortable_deal.select_agent;

import com.avito.android.comfortable_deal.select_agent.mvi.i;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectAgentViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final i f122710a;

    public h(i iVar) {
        this.f122710a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.comfortable_deal.select_agent.mvi.h) this.f122710a.get(), null, 2, null);
    }
}
