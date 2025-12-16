package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.o;
import com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.p;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BasicIndicatorsTabModule_ProvideBasicIndicatorsStatsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f317358a;

    /* renamed from: b, reason: collision with root package name */
    public final p f317359b;

    public e(dagger.internal.l lVar, p pVar) {
        this.f317358a = lVar;
        this.f317359b = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f317358a.f393949a;
        o oVar = (o) this.f317359b.get();
        c.f317356a.getClass();
        return (com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.i) new P0(t02, oVar).a(com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.i.class);
    }
}
