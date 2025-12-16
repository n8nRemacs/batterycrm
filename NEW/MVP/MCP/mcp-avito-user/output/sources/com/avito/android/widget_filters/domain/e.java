package com.avito.android.widget_filters.domain;

import com.avito.android.remote.model.SearchParamsConverter;

/* compiled from: WidgetFiltersInitialSearchParamsWrapperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<C36156d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.widget_filters.di.i f329852a;

    public e(com.avito.android.widget_filters.di.i iVar) {
        this.f329852a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C36156d((SearchParamsConverter) this.f329852a.get());
    }
}
