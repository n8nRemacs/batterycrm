package com.avito.android.crm_paid_cvs.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sP.InterfaceC48087a;

/* compiled from: PaidCvsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48087a> f130314a;

    public f(Provider<InterfaceC48087a> provider) {
        this.f130314a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f130314a.get());
    }
}
