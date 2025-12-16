package com.avito.android.calendar_select.domain;

import Y61.k;
import com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction;
import com.avito.android.calendar_select.remote.model.CalendarLoadDataResponse;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;

/* compiled from: CalendarLoadResultMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/domain/b;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {
    @k
    CalendarSelectInternalAction a(@k TypedResult<CalendarLoadDataResponse> typedResult);
}
