package com.avito.android.widget_filters.mvi;

import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/z;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lcom/avito/android/widget_filters/mvi/entity/c;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z implements com.avito.android.arch.mvi.u<WidgetFiltersInternalAction, com.avito.android.widget_filters.mvi.entity.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f330239b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MP0.e f330240c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.n f330241d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.e f330242e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.h f330243f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.k f330244g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.v f330245h;

    @Inject
    public z(@Y61.k B b12, @Y61.k MP0.e eVar, @Y61.k com.avito.android.widget_filters.domain.use_case.n nVar, @Y61.k com.avito.android.widget_filters.domain.use_case.e eVar2, @Y61.k com.avito.android.widget_filters.domain.use_case.h hVar, @Y61.k com.avito.android.widget_filters.domain.use_case.k kVar, @Y61.k com.avito.android.widget_filters.domain.v vVar) {
        this.f330239b = b12;
        this.f330240c = eVar;
        this.f330241d = nVar;
        this.f330242e = eVar2;
        this.f330243f = hVar;
        this.f330244g = kVar;
        this.f330245h = vVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.widget_filters.mvi.entity.c a(WidgetFiltersInternalAction widgetFiltersInternalAction, com.avito.android.widget_filters.mvi.entity.c cVar) {
        com.avito.android.widget_filters.mvi.entity.c cVar2 = cVar;
        return this.f330239b.a((com.avito.android.widget_filters.mvi.entity.c) new y(widgetFiltersInternalAction, this, cVar2).invoke(cVar2));
    }
}
