package com.avito.android.widget_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WidgetFiltersItemsModule_ProvideAdapterPresenter$_avito_widget_filters_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f329830a;

    public e(u uVar) {
        this.f329830a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f329830a.get();
        d.f329829a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
