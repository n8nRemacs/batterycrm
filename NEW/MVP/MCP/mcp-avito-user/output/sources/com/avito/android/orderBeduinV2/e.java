package com.avito.android.orderBeduinV2;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.orderBeduinV2.mvi.q;
import com.avito.android.orderBeduinV2.mvi.r;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: OrderViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final r f209826a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f209827b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B> f209828c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f209829d;

    /* renamed from: e, reason: collision with root package name */
    public final C31144q0 f209830e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f209831f;

    /* renamed from: g, reason: collision with root package name */
    public final C31151u0 f209832g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<dD.b> f209833h;

    public e(r rVar, Provider provider, Provider provider2, Provider provider3, C31144q0 c31144q0, Provider provider4, C31151u0 c31151u0, Provider provider5) {
        this.f209826a = rVar;
        this.f209827b = provider;
        this.f209828c = provider2;
        this.f209829d = provider3;
        this.f209830e = c31144q0;
        this.f209831f = provider4;
        this.f209832g = c31151u0;
        this.f209833h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((q) this.f209826a.get(), this.f209827b.get(), this.f209828c.get(), this.f209829d.get(), (aU0.b) this.f209830e.get(), this.f209831f.get(), (ZS.b) this.f209832g.get(), this.f209833h.get());
    }
}
