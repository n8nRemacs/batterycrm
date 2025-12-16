package com.avito.android.passport.auth_suggest;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.passport.auth_suggest.mvi.g;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: PassportAuthSuggestViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.auth_suggest.mvi.h f210992a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f210993b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B> f210994c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f210995d;

    /* renamed from: e, reason: collision with root package name */
    public final C31144q0 f210996e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f210997f;

    /* renamed from: g, reason: collision with root package name */
    public final C31151u0 f210998g;

    public d(com.avito.android.passport.auth_suggest.mvi.h hVar, Provider provider, Provider provider2, Provider provider3, C31144q0 c31144q0, Provider provider4, C31151u0 c31151u0) {
        this.f210992a = hVar;
        this.f210993b = provider;
        this.f210994c = provider2;
        this.f210995d = provider3;
        this.f210996e = c31144q0;
        this.f210997f = provider4;
        this.f210998g = c31151u0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f210992a.get(), this.f210993b.get(), this.f210994c.get(), this.f210995d.get(), (aU0.b) this.f210996e.get(), this.f210997f.get(), (ZS.b) this.f210998g.get());
    }
}
