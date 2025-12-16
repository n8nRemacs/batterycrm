package com.avito.android.brandspace.beduin_v2;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: BrandspaceBeduinV2ViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.brandspace.beduin_v2.mvi.e f107560a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f107561b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B> f107562c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f107563d;

    /* renamed from: e, reason: collision with root package name */
    public final C31144q0 f107564e;

    /* renamed from: f, reason: collision with root package name */
    public final C31151u0 f107565f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f107566g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f107567h;

    public d(com.avito.android.brandspace.beduin_v2.mvi.e eVar, Provider provider, Provider provider2, Provider provider3, C31144q0 c31144q0, C31151u0 c31151u0, Provider provider4, Provider provider5) {
        this.f107560a = eVar;
        this.f107561b = provider;
        this.f107562c = provider2;
        this.f107563d = provider3;
        this.f107564e = c31144q0;
        this.f107565f = c31151u0;
        this.f107566g = provider4;
        this.f107567h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.brandspace.beduin_v2.mvi.d) this.f107560a.get(), this.f107561b.get(), this.f107562c.get(), this.f107563d.get(), (aU0.b) this.f107564e.get(), (ZS.b) this.f107565f.get(), this.f107566g.get(), this.f107567h.get());
    }
}
