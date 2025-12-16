package com.avito.android.widget_filters.mvi;

import com.avito.android.component.toast.f;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersOneTimeEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WidgetFiltersOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters/mvi/w;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements com.avito.android.arch.mvi.t<WidgetFiltersInternalAction, WidgetFiltersOneTimeEvent> {
    @Inject
    public w() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final WidgetFiltersOneTimeEvent b(WidgetFiltersInternalAction widgetFiltersInternalAction) {
        WidgetFiltersInternalAction widgetFiltersInternalAction2 = widgetFiltersInternalAction;
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.ToggleKeyboard) {
            return new WidgetFiltersOneTimeEvent.a(!((WidgetFiltersInternalAction.ToggleKeyboard) widgetFiltersInternalAction2).f330027b);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.UpdateLocation.SelectLocation ? true : widgetFiltersInternalAction2.equals(WidgetFiltersInternalAction.StartApplyLoading.f330025b)) {
            return new WidgetFiltersOneTimeEvent.e();
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.HandleApplyRedirect) {
            return new WidgetFiltersOneTimeEvent.c(((WidgetFiltersInternalAction.HandleApplyRedirect) widgetFiltersInternalAction2).f330016b);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.HandleClarifySearch) {
            WidgetFiltersInternalAction.HandleClarifySearch handleClarifySearch = (WidgetFiltersInternalAction.HandleClarifySearch) widgetFiltersInternalAction2;
            return new WidgetFiltersOneTimeEvent.d(handleClarifySearch.f330017b, handleClarifySearch.f330018c);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.ShowOnboarding) {
            return new WidgetFiltersOneTimeEvent.i(((WidgetFiltersInternalAction.ShowOnboarding) widgetFiltersInternalAction2).f330024b);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.UpdateDates.ResetDates) {
            return WidgetFiltersOneTimeEvent.g.f330063a;
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.UpdateLocation.RequestLocationInputFocus) {
            return WidgetFiltersOneTimeEvent.f.f330062a;
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.CloseScreen) {
            return WidgetFiltersOneTimeEvent.b.f330058a;
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.ShowApplyError) {
            f.c.f125255c.getClass();
            return new WidgetFiltersOneTimeEvent.ShowToast(((WidgetFiltersInternalAction.ShowApplyError) widgetFiltersInternalAction2).f330019b, f.c.a.b(), WidgetFiltersOneTimeEvent.ShowToast.ToastAnchorType.f330053b);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.UpdateLocation.ShowSuggestedLocationsError) {
            f.c.f125255c.getClass();
            return new WidgetFiltersOneTimeEvent.ShowToast(((WidgetFiltersInternalAction.UpdateLocation.ShowSuggestedLocationsError) widgetFiltersInternalAction2).f330045b, f.c.a.b(), WidgetFiltersOneTimeEvent.ShowToast.ToastAnchorType.f330053b);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.ShowDefaultToast) {
            return new WidgetFiltersOneTimeEvent.ShowToast(((WidgetFiltersInternalAction.ShowDefaultToast) widgetFiltersInternalAction2).f330023b, f.a.f125253a, WidgetFiltersOneTimeEvent.ShowToast.ToastAnchorType.f330054c);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.ChangeExpandedWidgetPosition) {
            return new WidgetFiltersOneTimeEvent.h(((WidgetFiltersInternalAction.ChangeExpandedWidgetPosition) widgetFiltersInternalAction2).f330013c);
        }
        if (widgetFiltersInternalAction2 instanceof WidgetFiltersInternalAction.UpdateLocation.ClearSelectedLocation) {
            return WidgetFiltersOneTimeEvent.f.f330062a;
        }
        return null;
    }
}
