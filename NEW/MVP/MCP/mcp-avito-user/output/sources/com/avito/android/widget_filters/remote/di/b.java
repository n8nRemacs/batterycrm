package com.avito.android.widget_filters.remote.di;

import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersCategoryWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersDatesWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersGuestsWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersLocationWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: WidgetFiltersJsonModule_ProvideWidgetFiltersWidgetTypeFactoryFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class b implements h<Set<r>> {

    /* compiled from: WidgetFiltersJsonModule_ProvideWidgetFiltersWidgetTypeFactoryFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f330247a = new b();
    }

    public static b a() {
        return a.f330247a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.widget_filters.remote.di.a.f330246a.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, WidgetFiltersWidget.class);
        WidgetFiltersWidget.WidgetType widgetType = WidgetFiltersWidget.WidgetType.f330263c;
        runtimeTypeAdapterFactoryD.b(WidgetFiltersLocationWidget.class, "locationWidget", null);
        runtimeTypeAdapterFactoryD.b(WidgetFiltersDatesWidget.class, "datesWidget", null);
        runtimeTypeAdapterFactoryD.b(WidgetFiltersGuestsWidget.class, "guestsWidget", null);
        runtimeTypeAdapterFactoryD.b(WidgetFiltersCategoryWidget.class, "categoryWidget", null);
        return Collections.singleton(runtimeTypeAdapterFactoryD);
    }
}
