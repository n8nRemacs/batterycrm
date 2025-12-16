package com.avito.android.advert.item.early_access_fakedoor.konveyor;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessAdvertPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f75309a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.early_access_advert.a> f75310b;

    public f(l lVar, Provider provider) {
        this.f75309a = lVar;
        this.f75310b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f75309a.f393949a, this.f75310b.get());
    }
}
