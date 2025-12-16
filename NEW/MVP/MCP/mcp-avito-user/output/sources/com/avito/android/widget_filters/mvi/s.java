package com.avito.android.widget_filters.mvi;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;

/* compiled from: WidgetFiltersBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f330222a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f330223b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.widget_filters.di.i f330224c;

    public s(dagger.internal.l lVar, dagger.internal.u uVar, com.avito.android.widget_filters.di.i iVar) {
        this.f330222a = lVar;
        this.f330223b = uVar;
        this.f330224c = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r((WidgetFiltersOpenParams) this.f330222a.f393949a, (com.avito.android.widget_filters.domain.g) this.f330223b.get(), (SearchParamsConverter) this.f330224c.get());
    }
}
