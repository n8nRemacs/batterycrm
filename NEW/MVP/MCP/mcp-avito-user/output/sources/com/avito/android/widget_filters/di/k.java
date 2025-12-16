package com.avito.android.widget_filters.di;

import TP0.b;
import android.content.Context;
import androidx.view.T0;
import com.avito.android.di.C29972i;
import com.avito.android.widget_filters.di.a;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetFiltersModule_ProvideWidgetFiltersSharedViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<com.avito.android.widget_filters_shared.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f329839a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f329840b;

    public k(dagger.internal.l lVar, Provider provider) {
        this.f329839a = provider;
        this.f329840b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context contextG = ((a.c.C10248c) this.f329839a).f329817a.g();
        T0 t02 = (T0) this.f329840b.f393949a;
        h.f329835a.getClass();
        com.avito.android.widget_filters_shared.a aVarA = ((b.InterfaceC1073b) C29972i.a(C29972i.b(contextG), b.InterfaceC1073b.class)).Hc().f15663a.a(t02).a();
        t.d(aVarA);
        return aVarA;
    }
}
