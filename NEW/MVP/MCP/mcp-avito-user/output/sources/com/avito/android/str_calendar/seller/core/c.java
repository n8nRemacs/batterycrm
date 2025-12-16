package com.avito.android.str_calendar.seller.core;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e2;

/* compiled from: StrSellerCalendarCoreRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/c;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {
    @l
    Object a(@k SuspendLambda suspendLambda);

    @l
    Object b(@k Continuation continuation);

    @l
    Object c(@k String str, @k Continuation<? super G0> continuation);

    @l
    Object d(boolean z12, @l UpdatedParametersInfo updatedParametersInfo, @k SuspendLambda suspendLambda);

    @l
    Object e(@k String str, @l Date date, @l Date date2, boolean z12, @k Continuation<? super G0> continuation);

    @l
    Object f(@k String str, @l SelectedDateRange selectedDateRange, @k Continuation<? super G0> continuation);

    @k
    e2 g();

    @l
    Object h(@k SK0.f fVar, @k Continuation<? super G0> continuation);

    @k
    e2 i();

    @l
    Object j(@k String str, @l String str2, @l String str3, boolean z12, @k Continuation<? super G0> continuation);

    @l
    Object k(@k Continuation continuation);

    @l
    Object l(@k Continuation<? super G0> continuation);

    @l
    Object m(boolean z12, @l UpdatedParametersInfo updatedParametersInfo, @k Continuation<? super G0> continuation);

    @k
    e2 n();

    @l
    Object o(@k StrSellerCalendarRejectInfo strSellerCalendarRejectInfo, @k Continuation<? super G0> continuation);
}
