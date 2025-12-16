package com.avito.android.favorite_comparison.di;

import com.avito.android.favorite_comparison.presentation.o;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteComparisonModule_Companion_ProvideActionConsumerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<io.reactivex.rxjava3.subjects.e<com.avito.android.favorite_comparison.presentation.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f155303a;

    public h(u uVar) {
        this.f155303a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        o oVar = (o) this.f155303a.get();
        g.f155301a.getClass();
        io.reactivex.rxjava3.subjects.e<com.avito.android.favorite_comparison.presentation.a> eVarM1 = oVar.m1();
        t.d(eVarM1);
        return eVarM1;
    }
}
