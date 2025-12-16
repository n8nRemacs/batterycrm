package com.avito.android.iac_dialer.impl_module.telecom.stub;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacTelecomManagerStub_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f166496a;

    /* renamed from: b, reason: collision with root package name */
    public final u f166497b;

    public d(u uVar, Provider provider) {
        this.f166496a = provider;
        this.f166497b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f166496a.get(), g.a(w.a(this.f166497b)));
    }
}
