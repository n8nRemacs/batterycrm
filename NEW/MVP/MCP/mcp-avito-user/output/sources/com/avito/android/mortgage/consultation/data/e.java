package com.avito.android.mortgage.consultation.data;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: MortgageConsultationRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f198544a;

    public e(Provider<InterfaceC41203a> provider) {
        this.f198544a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(g.a(w.a(this.f198544a)));
    }
}
