package com.avito.android.widget_filters.domain;

import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WidgetFiltersParametersUpdater.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/z;", "Lcom/avito/android/widget_filters/domain/y;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.n f329925a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.e f329926b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.k f329927c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.h f329928d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final v f329929e;

    @Inject
    public z(@Y61.k com.avito.android.widget_filters.domain.use_case.n nVar, @Y61.k com.avito.android.widget_filters.domain.use_case.e eVar, @Y61.k com.avito.android.widget_filters.domain.use_case.k kVar, @Y61.k com.avito.android.widget_filters.domain.use_case.h hVar, @Y61.k v vVar) {
        this.f329925a = nVar;
        this.f329926b = eVar;
        this.f329927c = kVar;
        this.f329928d = hVar;
        this.f329929e = vVar;
    }

    @Override // com.avito.android.widget_filters.domain.y
    @Y61.k
    public final Map a(@Y61.k com.avito.android.widget_filters.mvi.entity.c cVar, @Y61.k WidgetFiltersInternalAction widgetFiltersInternalAction) {
        boolean z12 = widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateLocation.SelectLocation ? true : widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateLocation.ClearSelectedLocation;
        v vVar = this.f329929e;
        if (z12) {
            return vVar.a(com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, this.f329925a.a(cVar, widgetFiltersInternalAction), null, null, null, 0, null, null, null, null, null, 65471));
        }
        if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateCategory.ChangeCategorySelection) {
            return vVar.a(com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, null, null, this.f329926b.a(cVar, widgetFiltersInternalAction), null, 0, null, null, null, null, null, 65279));
        }
        if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.AddChild ? true : widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.RemoveChild ? true : widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.ChangeAdultsValue ? true : widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.ChangeAnimalsSelected) {
            return vVar.a(com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, null, null, null, this.f329927c.a(cVar, widgetFiltersInternalAction), 0, null, null, null, null, null, 65023));
        }
        return widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateDates.ResetDates ? true : widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateDates.SelectDate ? true : widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateDates.SelectFlexSearchOption ? vVar.a(com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, null, this.f329928d.a(cVar, widgetFiltersInternalAction), null, null, 0, null, null, null, null, null, 65407)) : cVar.f330100g;
    }
}
