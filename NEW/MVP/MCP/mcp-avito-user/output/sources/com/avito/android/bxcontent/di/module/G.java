package com.avito.android.bxcontent.di.module;

import Ab.C13005a;
import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideItemVisibilityTracker$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class G implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Ab.c> f110887a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C13005a> f110888b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.analytics.r> f110889c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.analytics.q> f110890d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f110891e;

    public G(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f110887a = provider;
        this.f110888b = provider2;
        this.f110889c = provider3;
        this.f110890d = provider4;
        this.f110891e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Ab.c cVar = this.f110887a.get();
        C13005a c13005a = this.f110888b.get();
        com.avito.android.bxcontent.analytics.r rVar = this.f110889c.get();
        com.avito.android.bxcontent.analytics.q qVar = this.f110890d.get();
        Bundle bundle = (Bundle) this.f110891e.f393949a;
        C29070s.f111022a.getClass();
        d.a aVar = new d.a(bundle, true);
        aVar.a(cVar);
        aVar.a(rVar);
        aVar.a(qVar);
        aVar.a(c13005a);
        return aVar.b();
    }
}
