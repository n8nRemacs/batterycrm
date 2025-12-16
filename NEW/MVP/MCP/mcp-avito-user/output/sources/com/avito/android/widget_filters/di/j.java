package com.avito.android.widget_filters.di;

import android.content.Context;
import com.avito.android.widget_filters.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetFiltersModule_ProvideWidgetFiltersPreferencesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<AK0.l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AK0.i> f329837a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f329838b;

    public j(Provider<AK0.i> provider, Provider<Context> provider2) {
        this.f329837a = provider;
        this.f329838b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.i iVar = (AK0.i) ((a.c.h) this.f329837a).get();
        Context context = (Context) ((a.c.C10248c) this.f329838b).get();
        h.f329835a.getClass();
        return iVar.a(context, "str_search_widget_filters");
    }
}
