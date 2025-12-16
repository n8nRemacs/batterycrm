package com.avito.android.favorite_comparison.di;

import androidx.view.P0;
import com.avito.android.favorite_comparison.presentation.o;
import com.avito.android.favorite_comparison.presentation.p;
import com.avito.android.favorite_comparison.presentation.q;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteComparisonModule_Companion_ProvideFavoriteComparisonViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final l f155304a;

    /* renamed from: b, reason: collision with root package name */
    public final q f155305b;

    public i(l lVar, q qVar) {
        this.f155304a = lVar;
        this.f155305b = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorite_comparison.presentation.c cVar = (com.avito.android.favorite_comparison.presentation.c) this.f155304a.f393949a;
        p pVar = (p) this.f155305b.get();
        g.f155301a.getClass();
        return (o) new P0(cVar.a(), pVar).a(com.avito.android.favorite_comparison.presentation.y.class);
    }
}
