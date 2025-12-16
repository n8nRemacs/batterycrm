package com.avito.android.code_confirmation.code_confirmation;

import android.app.Activity;
import android.content.IntentFilter;
import javax.inject.Provider;

/* compiled from: CodeReceiverImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class k0 implements dagger.internal.h<j0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f119567a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IntentFilter> f119568b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f119569c;

    public k0(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f119567a = lVar;
        this.f119568b = provider;
        this.f119569c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j0((Activity) this.f119567a.f393949a, this.f119568b.get(), (com.google.android.gms.auth.api.phone.f) this.f119569c.get());
    }
}
