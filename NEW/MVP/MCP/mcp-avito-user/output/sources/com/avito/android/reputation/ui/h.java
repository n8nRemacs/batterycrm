package com.avito.android.reputation.ui;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: ReputationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.reputation.ui.mvi.h f254861a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f254862b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B> f254863c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f254864d;

    /* renamed from: e, reason: collision with root package name */
    public final C31144q0 f254865e;

    /* renamed from: f, reason: collision with root package name */
    public final C31151u0 f254866f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f254867g;

    public h(com.avito.android.reputation.ui.mvi.h hVar, Provider provider, Provider provider2, Provider provider3, C31144q0 c31144q0, C31151u0 c31151u0, Provider provider4) {
        this.f254861a = hVar;
        this.f254862b = provider;
        this.f254863c = provider2;
        this.f254864d = provider3;
        this.f254865e = c31144q0;
        this.f254866f = c31151u0;
        this.f254867g = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.reputation.ui.mvi.g) this.f254861a.get(), this.f254862b.get(), this.f254863c.get(), this.f254864d.get(), (aU0.b) this.f254865e.get(), (ZS.b) this.f254866f.get(), this.f254867g.get());
    }
}
