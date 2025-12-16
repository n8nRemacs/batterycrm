package com.avito.android.wallet.pin.impl.settings.mvi.component;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mP0.InterfaceC43998a;

/* compiled from: WalletSecuritySettingsGetContentInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43998a> f328848a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f328849b;

    public o(dagger.internal.l lVar, Provider provider) {
        this.f328848a = provider;
        this.f328849b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(dagger.internal.g.a(w.a(this.f328848a)), (String) this.f328849b.f393949a);
    }
}
