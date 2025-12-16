package com.avito.android.profile.pro.impl.di;

import androidx.view.T0;
import com.avito.android.profile.pro.impl.di.a;
import com.avito.android.profile_tab.summary.e;
import com.avito.android.profile_tab.summary.factory.i;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileTabSummaryModule_ProvideProfileSummaryComponentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<com.avito.android.profile_tab.summary.factory.i> {

    /* renamed from: a, reason: collision with root package name */
    public final m f222651a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f222652b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<i.b> f222653c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f222654d;

    public p(m mVar, dagger.internal.l lVar, Provider provider, dagger.internal.l lVar2) {
        this.f222651a = mVar;
        this.f222652b = lVar;
        this.f222653c = provider;
        this.f222654d = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f222652b.f393949a;
        com.avito.android.profile_tab.summary.factory.a aVarDc = ((a.c.q) this.f222653c).f222599a.Dc();
        T0 t02 = (T0) this.f222654d.f393949a;
        this.f222651a.getClass();
        com.avito.android.profile_tab.summary.factory.i iVarA = aVarDc.a(new com.avito.android.profile_tab.summary.a(e.b.f230870a), t02, dVar);
        t.d(iVarA);
        return iVarA;
    }
}
