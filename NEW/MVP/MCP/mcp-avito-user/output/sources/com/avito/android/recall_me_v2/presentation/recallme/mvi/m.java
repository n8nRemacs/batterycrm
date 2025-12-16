package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.recall_me.presentation.RecallMeParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecallMeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f252196a;

    /* renamed from: b, reason: collision with root package name */
    public final o f252197b;

    /* renamed from: c, reason: collision with root package name */
    public final q f252198c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f252199d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f252200e;

    public m(j jVar, o oVar, q qVar, Provider provider, dagger.internal.l lVar) {
        this.f252196a = jVar;
        this.f252197b = oVar;
        this.f252198c = qVar;
        this.f252199d = provider;
        this.f252200e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f252196a.get();
        this.f252197b.getClass();
        n nVar = new n();
        this.f252198c.getClass();
        p pVar = new p();
        return new l("RecallMe", new AbstractC13405c.b((RecallMeParams) this.f252200e.f393949a), new k(aVar, this.f252199d.get(), pVar, nVar));
    }
}
