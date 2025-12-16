package com.avito.android.comfortable_deal.select_agent.mvi.builder;

import com.avito.android.comfortable_deal.select_agent.di.i;
import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectAgentItemListBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f122746a;

    public c(i iVar) {
        this.f122746a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC35945t1) this.f122746a.get());
    }
}
