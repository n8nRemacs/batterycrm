package com.avito.android.safety.password_change.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.safety.password_change.PasswordChangeParams;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordChangeActor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257307a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f257308b;

    /* renamed from: c, reason: collision with root package name */
    public final s f257309c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.credman.o> f257310d;

    public e(dagger.internal.l lVar, Provider provider, s sVar, Provider provider2) {
        this.f257307a = lVar;
        this.f257308b = provider;
        this.f257309c = sVar;
        this.f257310d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((PasswordChangeParams) this.f257307a.f393949a, this.f257308b.get(), (p) this.f257309c.get(), this.f257310d.get());
    }
}
