package com.avito.android.work_profile.profile.about_me;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.android.work_profile.profile.about_me.mvi.g;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AboutMeViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.work_profile.profile.about_me.mvi.h f330756a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f330757b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B> f330758c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f330759d;

    /* renamed from: e, reason: collision with root package name */
    public final C31144q0 f330760e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f330761f;

    /* renamed from: g, reason: collision with root package name */
    public final C31151u0 f330762g;

    public b(com.avito.android.work_profile.profile.about_me.mvi.h hVar, Provider provider, Provider provider2, Provider provider3, C31144q0 c31144q0, Provider provider4, C31151u0 c31151u0) {
        this.f330756a = hVar;
        this.f330757b = provider;
        this.f330758c = provider2;
        this.f330759d = provider3;
        this.f330760e = c31144q0;
        this.f330761f = provider4;
        this.f330762g = c31151u0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((g) this.f330756a.get(), this.f330757b.get(), this.f330758c.get(), this.f330759d.get(), (aU0.b) this.f330760e.get(), this.f330761f.get(), (ZS.b) this.f330762g.get());
    }
}
