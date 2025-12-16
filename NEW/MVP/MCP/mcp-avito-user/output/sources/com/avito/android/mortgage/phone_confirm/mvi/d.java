package com.avito.android.mortgage.phone_confirm.mvi;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneConfirmActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.domain.check_access.b> f201612a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.phone_confirm.mvi.domain.a> f201613b;

    /* renamed from: c, reason: collision with root package name */
    public final u f201614c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f201615d;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f201612a = provider;
        this.f201613b = provider2;
        this.f201614c = uVar;
        this.f201615d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f201612a.get(), this.f201613b.get(), (com.avito.android.mortgage.phone_confirm.mvi.domain.d) this.f201614c.get(), this.f201615d.get());
    }
}
