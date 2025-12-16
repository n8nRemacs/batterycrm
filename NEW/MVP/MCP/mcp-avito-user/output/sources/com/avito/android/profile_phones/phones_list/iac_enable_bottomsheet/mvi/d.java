package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.permissions.z;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacEnableBottomSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<NL.e> f227828a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f227829b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<OL.a> f227830c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<z> f227831d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<F> f227832e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f227833f;

    public d(Provider<NL.e> provider, Provider<R0> provider2, Provider<OL.a> provider3, Provider<z> provider4, Provider<F> provider5, Provider<InterfaceC28373a> provider6) {
        this.f227828a = provider;
        this.f227829b = provider2;
        this.f227830c = provider3;
        this.f227831d = provider4;
        this.f227832e = provider5;
        this.f227833f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f227828a.get(), this.f227829b.get(), this.f227830c.get(), this.f227831d.get(), this.f227832e.get(), this.f227833f.get());
    }
}
