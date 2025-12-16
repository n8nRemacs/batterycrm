package com.avito.android.iac_problems.impl_module.miui_permission;

import PL.i;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hM.C40851c;
import hM.InterfaceC40849a;
import javax.inject.Provider;
import kM.AbstractC42601e;
import vN.C49237a;
import vN.C49239c;

/* compiled from: IacMiuiPermissionInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AbstractC42601e> f168802a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<NL.e> f168803b;

    /* renamed from: c, reason: collision with root package name */
    public final C49239c f168804c;

    /* renamed from: d, reason: collision with root package name */
    public final C40851c f168805d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f168806e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<F> f168807f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f168808g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<i> f168809h;

    public e(Provider provider, Provider provider2, C49239c c49239c, C40851c c40851c, Provider provider3, Provider provider4, dagger.internal.f fVar, Provider provider5) {
        this.f168802a = provider;
        this.f168803b = provider2;
        this.f168804c = c49239c;
        this.f168805d = c40851c;
        this.f168806e = provider3;
        this.f168807f = provider4;
        this.f168808g = fVar;
        this.f168809h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f168802a.get(), this.f168803b.get(), (C49237a) this.f168804c.get(), (InterfaceC40849a) this.f168805d.get(), this.f168806e.get(), this.f168807f.get(), (InterfaceC28373a) this.f168808g.get(), this.f168809h.get());
    }
}
