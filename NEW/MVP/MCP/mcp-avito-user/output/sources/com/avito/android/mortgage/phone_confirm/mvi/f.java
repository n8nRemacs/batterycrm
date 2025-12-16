package com.avito.android.mortgage.phone_confirm.mvi;

import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneConfirmBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f201647a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.phone_confirm.mvi.domain.d> f201648b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f201647a = lVar;
        this.f201648b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((PhoneConfirmArguments) this.f201647a.f393949a, this.f201648b.get());
    }
}
