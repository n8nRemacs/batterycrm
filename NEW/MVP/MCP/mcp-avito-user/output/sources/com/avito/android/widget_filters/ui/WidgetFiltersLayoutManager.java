package com.avito.android.widget_filters.ui;

import Y61.l;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

/* compiled from: WidgetFiltersLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/WidgetFiltersLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WidgetFiltersLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public boolean f330300G = true;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final a f330301H;

    /* compiled from: WidgetFiltersLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/widget_filters/ui/WidgetFiltersLayoutManager$a", "Landroidx/recyclerview/widget/z;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final float j(@Y61.k DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final int n() {
            return -1;
        }
    }

    public WidgetFiltersLayoutManager(@l Context context) {
        this.f330301H = new a(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean J() {
        return (this.f330300G || z0()) && super.J();
    }
}
