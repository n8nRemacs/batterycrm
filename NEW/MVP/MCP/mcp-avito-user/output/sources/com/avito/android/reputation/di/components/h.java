package com.avito.android.reputation.di.components;

import com.avito.android.reputation.ui.items.reputation_progress_bar.r;
import com.avito.android.reputation.ui.items.reputation_progress_bar.s;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationProgressBarComponentModule_ProvideReputationProgressBarComponentFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<n<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final s f254726a;

    public h(s sVar) {
        this.f254726a = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f254726a.getClass();
        r rVar = new r();
        g.f254725a.getClass();
        return rVar;
    }
}
