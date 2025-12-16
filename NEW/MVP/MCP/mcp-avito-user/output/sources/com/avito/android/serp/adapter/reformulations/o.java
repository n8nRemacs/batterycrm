package com.avito.android.serp.adapter.reformulations;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.p1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReformulationsItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f270644a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f270645b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p1> f270646c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<u> f270647d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f270648e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f270649f;

    public o(Provider provider, dagger.internal.l lVar, Provider provider2, Provider provider3, dagger.internal.f fVar, dagger.internal.l lVar2) {
        this.f270644a = provider;
        this.f270645b = lVar;
        this.f270646c = provider2;
        this.f270647d = provider3;
        this.f270648e = fVar;
        this.f270649f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f270644a.get(), (SearchParams) this.f270645b.f393949a, this.f270646c.get(), this.f270647d.get(), dagger.internal.g.b(this.f270648e), (Bundle) this.f270649f.f393949a);
    }
}
