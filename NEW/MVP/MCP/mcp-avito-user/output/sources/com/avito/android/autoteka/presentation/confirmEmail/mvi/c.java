package com.avito.android.autoteka.presentation.confirmEmail.mvi;

import com.avito.android.autoteka.domain.model.confirmEmail.ConfirmEmailDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaConfirmEmailActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.order.a> f97257a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97258b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f97257a = provider;
        this.f97258b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f97257a.get(), (ConfirmEmailDetails) this.f97258b.f393949a);
    }
}
