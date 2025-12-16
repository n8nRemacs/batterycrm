package com.avito.android.widget_filters.di;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import com.avito.android.widget_filters.ui.WidgetFiltersFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import oW.InterfaceC44697a;

/* compiled from: WidgetFiltersComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/di/b;", "", "a", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: WidgetFiltersComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/di/b$a;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k WidgetFiltersOpenParams widgetFiltersOpenParams, @h31.b @Y61.k FragmentManager fragmentManager, @h31.b @Y61.k ActivityC22955m activityC22955m, @h31.b @Y61.k Y41.l lVar, @Y61.k c cVar, @Y61.k InterfaceC44697a interfaceC44697a, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k WidgetFiltersFragment widgetFiltersFragment);
}
