package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Sz0.C15273b;
import Uz0.C15589a;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StrOrdersCalendarReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/B;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarState;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class B implements com.avito.android.arch.mvi.u<StrOrdersCalendarInternalAction, StrOrdersCalendarState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D f290976b;

    @Inject
    public B(@Y61.k D d12) {
        this.f290976b = d12;
    }

    public static void b(LinkedHashMap linkedHashMap, C15589a c15589a, boolean z12) {
        String str = c15589a.f16811a;
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        int i12 = c15589a.f16813c;
        Integer num = c15589a.f16815e;
        int iIntValue = num != null ? num.intValue() : i12;
        if (i12 <= iIntValue) {
            while (true) {
                arrayList.set(i12, C15273b.a((C15273b) arrayList.get(i12), null, null, null, null, false, false, false, z12, 3071));
                if (i12 == iIntValue) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        linkedHashMap.put(str, arrayList);
    }

    @Override // com.avito.android.arch.mvi.u
    public final StrOrdersCalendarState a(StrOrdersCalendarInternalAction strOrdersCalendarInternalAction, StrOrdersCalendarState strOrdersCalendarState) {
        C15589a c15589a;
        StrOrdersCalendarInternalAction strOrdersCalendarInternalAction2 = strOrdersCalendarInternalAction;
        StrOrdersCalendarState strOrdersCalendarState2 = strOrdersCalendarState;
        boolean z12 = strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.Init;
        D d12 = this.f290976b;
        if (z12) {
            StrOrdersCalendarInternalAction.Init init = (StrOrdersCalendarInternalAction.Init) strOrdersCalendarInternalAction2;
            return d12.c(StrOrdersCalendarState.a(strOrdersCalendarState2, init.f291012b, init.f291015e, init.f291013c, init.f291014d, false, null, null, null, null, null, null, false, null, null, null, null, 65520));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.InitScreenOrientation) {
            return StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, null, null, null, false, Integer.valueOf(((StrOrdersCalendarInternalAction.InitScreenOrientation) strOrdersCalendarInternalAction2).f291016b), null, null, null, 61439);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.StartLoading) {
            return d12.c(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, StrOrdersCalendarState.LoadingType.f291061d, null, null, null, null, null, false, null, null, null, null, 65439));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.RedesignLoadingComplete) {
            StrOrdersCalendarInternalAction.RedesignLoadingComplete redesignLoadingComplete = (StrOrdersCalendarInternalAction.RedesignLoadingComplete) strOrdersCalendarInternalAction2;
            return d12.c(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, StrOrdersCalendarState.LoadingType.f291059b, null, redesignLoadingComplete.f291025b, null, redesignLoadingComplete.f291026c, null, false, null, null, null, null, 64863));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.LoadingError) {
            return d12.a(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, StrOrdersCalendarState.LoadingType.f291062e, ((StrOrdersCalendarInternalAction.LoadingError) strOrdersCalendarInternalAction2).f291017b, null, null, null, null, false, null, null, null, null, 65439));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.StartPagination) {
            return StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, StrOrdersCalendarState.LoadingType.f291060c, null, null, null, null, null, false, null, null, null, null, 65503);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.RedesignPaginationCompleted) {
            StrOrdersCalendarInternalAction.RedesignPaginationCompleted redesignPaginationCompleted = (StrOrdersCalendarInternalAction.RedesignPaginationCompleted) strOrdersCalendarInternalAction2;
            return d12.c(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, redesignPaginationCompleted.f291027b, redesignPaginationCompleted.f291028c, false, StrOrdersCalendarState.LoadingType.f291059b, null, null, null, redesignPaginationCompleted.f291029d, null, false, null, null, null, null, 64979));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.FrameMonthChanged) {
            return d12.a(StrOrdersCalendarState.a(strOrdersCalendarState2, null, ((StrOrdersCalendarInternalAction.FrameMonthChanged) strOrdersCalendarInternalAction2).f291011b, null, null, false, null, null, null, null, null, null, false, null, null, null, null, 65533));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.ToggleShowDates) {
            return d12.c(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, !strOrdersCalendarState2.f291047f, null, null, null, null, null, null, false, null, null, null, null, 65519));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.RebuildItems) {
            return d12.c(strOrdersCalendarState2);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.ToggleFlatRecyclerCollapse) {
            return d12.a(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, null, null, null, ((StrOrdersCalendarInternalAction.ToggleFlatRecyclerCollapse) strOrdersCalendarInternalAction2).f291035b, null, null, null, null, 63487));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.UpdateItemDatesLoadingComplete) {
            return d12.c(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, null, ((StrOrdersCalendarInternalAction.UpdateItemDatesLoadingComplete) strOrdersCalendarInternalAction2).f291037b, null, false, null, null, null, null, 65023));
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.ChangeOrientation) {
            return StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, null, null, null, false, Integer.valueOf(((StrOrdersCalendarInternalAction.ChangeOrientation) strOrdersCalendarInternalAction2).f291008b), null, null, null, 61439);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.AddTooltipShowedItemId) {
            return StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, C42745f0.i0(((StrOrdersCalendarInternalAction.AddTooltipShowedItemId) strOrdersCalendarInternalAction2).f291006b, strOrdersCalendarState2.f291051j), null, null, false, null, null, null, null, 65279);
        }
        if (!(strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.UpdateSelectedDateRange)) {
            return strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.BannerLoaded ? d12.a(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, null, null, null, false, null, ((StrOrdersCalendarInternalAction.BannerLoaded) strOrdersCalendarInternalAction2).f291007b, null, null, 57343)) : strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.CloseBanner ? d12.a(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, null, null, null, false, null, null, null, null, 57343)) : strOrdersCalendarState2;
        }
        StrOrdersCalendarInternalAction.UpdateSelectedDateRange updateSelectedDateRange = (StrOrdersCalendarInternalAction.UpdateSelectedDateRange) strOrdersCalendarInternalAction2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(strOrdersCalendarState2.f291052k);
        if (updateSelectedDateRange.f291039c && (c15589a = strOrdersCalendarState2.f291053l) != null) {
            b(linkedHashMap, c15589a, false);
        }
        C15589a c15589a2 = updateSelectedDateRange.f291038b;
        if (c15589a2 != null) {
            b(linkedHashMap, c15589a2, true);
        }
        return d12.b(StrOrdersCalendarState.a(strOrdersCalendarState2, null, null, null, null, false, null, null, null, null, linkedHashMap, c15589a2, false, null, null, null, null, 63999));
    }
}
