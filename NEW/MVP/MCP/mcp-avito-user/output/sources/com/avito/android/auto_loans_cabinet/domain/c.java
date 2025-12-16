package com.avito.android.auto_loans_cabinet.domain;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoLoanCabinetInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f95380a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.auto_loans_cabinet.data.d f95381b;

    public c(Provider provider, com.avito.android.auto_loans_cabinet.data.d dVar) {
        this.f95380a = provider;
        this.f95381b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f95380a.get(), (com.avito.android.auto_loans_cabinet.data.a) this.f95381b.get());
    }
}
