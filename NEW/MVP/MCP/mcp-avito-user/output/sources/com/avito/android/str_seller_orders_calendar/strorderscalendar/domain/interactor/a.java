package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor;

import Sz0.C15273b;
import Uz0.C15589a;
import Y61.k;
import Y61.l;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrOrdersCalendarRedesignInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/interactor/a;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @k
    InterfaceC43160i<StrOrdersCalendarInternalAction> a(@k String str, @k Date date, @k Date date2, @k Map<String, ? extends List<C15273b>> map);

    @k
    InterfaceC43160i<StrOrdersCalendarInternalAction> b(@k Date date, @k Date date2, @k Date date3, @k Date date4);

    @k
    InterfaceC43160i<StrOrdersCalendarInternalAction> c(@k Date date, @k Date date2, @k Date date3, @k Date date4, @k Map<String, ? extends List<C15273b>> map, @l C15589a c15589a);
}
