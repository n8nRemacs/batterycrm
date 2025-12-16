package com.avito.android.personal_selections.domain;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import n70.InterfaceC44207a;

/* compiled from: PersonalSelectionsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f215793a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44207a> f215794b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f215795c;

    /* renamed from: d, reason: collision with root package name */
    public final l f215796d;

    public e(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f215793a = provider;
        this.f215794b = provider2;
        this.f215795c = provider3;
        this.f215796d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f215793a.get(), g.a(w.a(this.f215794b)), this.f215795c.get(), (com.avito.android.personal_selections.mvi.a) this.f215796d.f393949a);
    }
}
