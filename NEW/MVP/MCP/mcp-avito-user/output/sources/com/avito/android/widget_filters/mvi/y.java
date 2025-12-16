package com.avito.android.widget_filters.mvi;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersToolbarViewState;
import com.avito.android.widget_filters.mvi.entity.b;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.WidgetFiltersResponse;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersCategoryWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersDatesWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersGuestsWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersLocationWidget;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: WidgetFiltersReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/c;", VoiceInfo.STATE, "invoke", "(Lcom/avito/android/widget_filters/mvi/entity/c;)Lcom/avito/android/widget_filters/mvi/entity/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class y extends N implements Y41.l<com.avito.android.widget_filters.mvi.entity.c, com.avito.android.widget_filters.mvi.entity.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WidgetFiltersInternalAction f330236l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f330237m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f330238n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(WidgetFiltersInternalAction widgetFiltersInternalAction, z zVar, com.avito.android.widget_filters.mvi.entity.c cVar) {
        super(1);
        this.f330236l = widgetFiltersInternalAction;
        this.f330237m = zVar;
        this.f330238n = cVar;
    }

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [NP0.m, com.avito.android.widget_filters.ui.items.location.a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // Y41.l
    public final com.avito.android.widget_filters.mvi.entity.c invoke(com.avito.android.widget_filters.mvi.entity.c cVar) {
        com.avito.android.widget_filters.mvi.entity.c cVarA;
        ?? r52;
        d.a aVarB;
        com.avito.android.widget_filters.mvi.entity.c cVar2 = cVar;
        WidgetFiltersInternalAction widgetFiltersInternalAction = this.f330236l;
        if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateParameters) {
            return com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, ((WidgetFiltersInternalAction.UpdateParameters) widgetFiltersInternalAction).f330048b, null, null, null, null, 0, null, null, null, null, null, 65503);
        }
        if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateToolbarTitle) {
            return com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, null, null, null, null, 0, null, null, WidgetFiltersToolbarViewState.a(cVar2.f330108o, ((WidgetFiltersInternalAction.UpdateToolbarTitle) widgetFiltersInternalAction).f330049b, null, 2), null, null, 57343);
        }
        if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.StartContentLoading) {
            return com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, new b.c(((WidgetFiltersInternalAction.StartContentLoading) widgetFiltersInternalAction).f330026d), null, null, null, null, null, null, 0, null, null, null, null, null, 65527);
        }
        boolean z12 = widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.ShowContent;
        WidgetFiltersWidget.WidgetType widgetType = cVar2.f330106m;
        z zVar = this.f330237m;
        if (z12) {
            zVar.getClass();
            WidgetFiltersResponse widgetFiltersResponse = ((WidgetFiltersInternalAction.ShowContent) widgetFiltersInternalAction).f330020b;
            b.d dVar = new b.d(widgetFiltersResponse);
            List<WidgetFiltersWidget> listG = widgetFiltersResponse.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (L.f(((WidgetFiltersWidget) obj).getIsEnabled(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            d.C10254d c10254dC = null;
            d.b bVarD = null;
            d.a aVarB2 = null;
            d.c cVarA2 = null;
            WidgetFiltersWidget.WidgetType widgetType2 = null;
            int i12 = 0;
            int i13 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i14 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                WidgetFiltersWidget widgetFiltersWidget = (WidgetFiltersWidget) next;
                WidgetFiltersWidget.WidgetType type = widgetFiltersWidget.getType();
                linkedHashMap.put(Integer.valueOf(i12), type);
                boolean zF2 = widgetType == null ? L.f(widgetFiltersWidget.getIsExpanded(), Boolean.TRUE) : type == widgetType;
                if (zF2) {
                    widgetType2 = type;
                    i13 = i12;
                }
                boolean z13 = widgetFiltersWidget instanceof WidgetFiltersCategoryWidget;
                MP0.e eVar = zVar.f330240c;
                if (z13) {
                    aVarB2 = eVar.b((WidgetFiltersCategoryWidget) widgetFiltersWidget, i12, zF2);
                } else if (widgetFiltersWidget instanceof WidgetFiltersDatesWidget) {
                    bVarD = eVar.d((WidgetFiltersDatesWidget) widgetFiltersWidget, i12, zF2);
                } else if (widgetFiltersWidget instanceof WidgetFiltersGuestsWidget) {
                    cVarA2 = eVar.a((WidgetFiltersGuestsWidget) widgetFiltersWidget, i12, zF2);
                } else if (widgetFiltersWidget instanceof WidgetFiltersLocationWidget) {
                    c10254dC = eVar.c((WidgetFiltersLocationWidget) widgetFiltersWidget, i12, zF2);
                }
                i12 = i14;
            }
            com.avito.android.widget_filters.mvi.entity.c cVarA3 = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, dVar, arrayList, null, c10254dC, bVarD, aVarB2, cVarA2, i13, widgetType2, linkedHashMap, null, null, null, 57383);
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVarA3, false, false, false, null, null, zVar.f330245h.a(cVarA3), null, null, null, null, 0, null, null, null, null, null, 65503);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.ShowContentError) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, new b.C10253b(((WidgetFiltersInternalAction.ShowContentError) widgetFiltersInternalAction).f330021b), null, null, null, null, null, null, 0, null, null, null, null, null, 65527);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.StartApplyLoading) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, null, null, null, null, 0, null, null, null, WidgetFiltersFooterViewState.a(cVar2.f330109p, null, null, null, null, null, null, false, false, true, 255), null, 49151);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.ShowApplyError) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, null, null, null, null, 0, null, null, null, WidgetFiltersFooterViewState.a(cVar2.f330109p, null, null, null, null, null, null, false, false, false, 255), null, 49151);
            if (widgetType == WidgetFiltersWidget.WidgetType.f330263c) {
                cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVarA, false, false, false, null, null, null, zVar.f330241d.a(cVarA, widgetFiltersInternalAction), null, null, null, 0, null, null, null, null, null, 65471);
            }
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.HandleApplyRedirect) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, null, null, null, null, 0, null, null, null, WidgetFiltersFooterViewState.a(cVar2.f330109p, null, null, null, null, null, null, false, false, false, 255), null, 49151);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.ToggleKeyboard) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, ((WidgetFiltersInternalAction.ToggleKeyboard) widgetFiltersInternalAction).f330027b, false, false, null, null, null, null, null, null, null, 0, null, null, null, null, null, 65534);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateLocation) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, zVar.f330241d.a(cVar2, widgetFiltersInternalAction), null, null, null, 0, null, null, null, null, null, 65471);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateCategory) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, null, null, zVar.f330242e.a(cVar2, widgetFiltersInternalAction), null, 0, null, null, null, null, null, 65279);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateDates) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, null, zVar.f330243f.a(cVar2, widgetFiltersInternalAction), null, null, 0, null, null, null, null, null, 65407);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests) {
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, false, null, null, null, null, null, null, zVar.f330244g.a(cVar2, widgetFiltersInternalAction), 0, null, null, null, null, null, 65023);
        } else if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.ChangeExpandedWidgetPosition) {
            WidgetFiltersInternalAction.ChangeExpandedWidgetPosition changeExpandedWidgetPosition = (WidgetFiltersInternalAction.ChangeExpandedWidgetPosition) widgetFiltersInternalAction;
            int i15 = changeExpandedWidgetPosition.f330012b;
            WidgetFiltersWidget.WidgetType widgetType3 = cVar2.f330107n.get(Integer.valueOf(i15));
            d.b bVar = cVar2.f330102i;
            d.b bVarB = bVar != null ? d.b.b(bVar, null, i15 == bVar.f330123f, null, null, 495) : null;
            d.a aVar = cVar2.f330103j;
            if (aVar != null) {
                r52 = 0;
                aVarB = d.a.b(aVar, null, i15 == aVar.f330116f, null, 111);
            } else {
                r52 = 0;
                aVarB = null;
            }
            d.C10254d c10254d = cVar2.f330101h;
            d.C10254d c10254dB = c10254d != null ? d.C10254d.b(c10254d, r52, i15 == c10254d.f330140f, r52, ErrorCodes.IO_EXCEPTION) : r52;
            d.c cVar3 = cVar2.f330104k;
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, changeExpandedWidgetPosition.f330014d, false, null, null, null, c10254dB, bVarB, aVarB, cVar3 != null ? d.c.b(cVar3, null, i15 == cVar3.f330132f, null, null, 239) : r52, i15, widgetType3, null, null, null, null, 61501);
        } else {
            if (!(widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateOrientation)) {
                return this.f330238n;
            }
            cVarA = com.avito.android.widget_filters.mvi.entity.c.a(cVar2, false, false, ((WidgetFiltersInternalAction.UpdateOrientation) widgetFiltersInternalAction).f330047b, null, null, null, null, null, null, null, 0, null, null, null, null, null, 65531);
        }
        return cVarA;
    }
}
