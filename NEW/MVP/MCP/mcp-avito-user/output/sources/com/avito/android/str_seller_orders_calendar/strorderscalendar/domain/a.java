package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain;

import Sz0.C15273b;
import Uz0.C15589a;
import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/a;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @k
    LinkedHashMap a(@k ArrayList arrayList);

    @l
    Object b(@k Map<String, ? extends List<C15273b>> map, @k Date date, @k Continuation<? super Map<String, ? extends List<C15273b>>> continuation);

    @l
    Object c(@k ArrayList arrayList, @k Continuation continuation);

    @l
    Object d(@k Map map, @k ArrayList arrayList, @l C15589a c15589a, @k Continuation continuation);

    @l
    Object e(@k Map<String, ? extends List<C15273b>> map, @k Date date, @k Continuation<? super Map<String, ? extends List<C15273b>>> continuation);

    @l
    Object f(@k Map map, @k ArrayList arrayList, @k Continuation continuation);
}
