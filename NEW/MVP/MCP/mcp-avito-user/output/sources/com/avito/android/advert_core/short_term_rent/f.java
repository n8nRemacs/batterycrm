package com.avito.android.advert_core.short_term_rent;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import l90.n;

/* compiled from: AdvertStrBlockAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f84344a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84345b;

    /* renamed from: c, reason: collision with root package name */
    public final u f84346c;

    public f(dagger.internal.h hVar, u uVar, u uVar2) {
        this.f84344a = hVar;
        this.f84345b = uVar;
        this.f84346c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f84344a.get(), (n) this.f84345b.get(), (InterfaceC28373a) this.f84346c.get());
    }
}
