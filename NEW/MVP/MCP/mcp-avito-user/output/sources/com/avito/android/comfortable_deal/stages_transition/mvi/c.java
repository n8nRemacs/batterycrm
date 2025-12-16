package com.avito.android.comfortable_deal.stages_transition.mvi;

import com.avito.android.comfortable_deal.repository.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StagesTransitionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f122980a;

    public c(l lVar) {
        this.f122980a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.comfortable_deal.repository.a) this.f122980a.get());
    }
}
