package com.avito.android.safety.password_change.mvi;

import com.avito.android.safety.password_change.PasswordChangeParams;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordChangeOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257411a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f257412b;

    public v(dagger.internal.l lVar, Provider provider) {
        this.f257411a = lVar;
        this.f257412b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new u((PasswordChangeParams) this.f257411a.f393949a, this.f257412b.get());
    }
}
