package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.g;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pK.InterfaceC46970a;

/* compiled from: IacDialerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<IacDialerImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f164963a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.a> f164964b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.e> f164965c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.c> f164966d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<g> f164967e;

    /* renamed from: f, reason: collision with root package name */
    public final u f164968f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC46970a> f164969g;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f164963a = provider;
        this.f164964b = provider2;
        this.f164965c = provider3;
        this.f164966d = provider4;
        this.f164967e = provider5;
        this.f164968f = uVar;
        this.f164969g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new IacDialerImpl(this.f164963a.get(), this.f164964b.get(), this.f164965c.get(), this.f164966d.get(), this.f164967e.get(), (k) this.f164968f.get(), this.f164969g.get());
    }
}
