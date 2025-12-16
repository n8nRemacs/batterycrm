package com.avito.android.calendar_select.domain;

import Y61.k;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction;
import com.avito.android.calendar_select.presentation.view.data.m;
import com.avito.android.calendar_select.remote.model.CalendarLoadDataResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarLoadResultMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/domain/c;", "Lcom/avito/android/calendar_select/domain/b;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.calendar_select.presentation.view.data.g f113359a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CalendarSettings f113360b;

    @Inject
    public c(@k com.avito.android.calendar_select.presentation.view.data.g gVar, @k CalendarSettings calendarSettings) {
        this.f113359a = gVar;
        this.f113360b = calendarSettings;
    }

    @Override // com.avito.android.calendar_select.domain.b
    @k
    public final CalendarSelectInternalAction a(@k TypedResult<CalendarLoadDataResponse> typedResult) {
        LocalDate localDateNow;
        LocalDate localDatePlusMonths;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            return new CalendarSelectInternalAction.CalendarLoadFailed(C35936s.a(error.getError(), error.getCause()));
        }
        CalendarLoadDataResponse calendarLoadDataResponse = (CalendarLoadDataResponse) ((TypedResult.Success) typedResult).getResult();
        String fromDate = calendarLoadDataResponse.getFromDate();
        if (fromDate == null || (localDateNow = Xl.b.a(fromDate)) == null) {
            localDateNow = LocalDate.now();
        }
        LocalDate localDate = localDateNow;
        String toDate = calendarLoadDataResponse.getToDate();
        if (toDate == null || (localDatePlusMonths = Xl.b.a(toDate)) == null) {
            Object obj = Xl.b.f19053a;
            localDatePlusMonths = LocalDate.now().plusMonths(3L);
        }
        LocalDate localDate2 = localDatePlusMonths;
        List<String> listC = calendarLoadDataResponse.c();
        if (listC != null) {
            arrayList = new ArrayList();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                LocalDate localDateA = Xl.b.a((String) it.next());
                if (localDateA != null) {
                    arrayList.add(localDateA);
                }
            }
        } else {
            arrayList = null;
        }
        List list = arrayList == null ? C42784z0.f406748b : arrayList;
        List<String> listF = calendarLoadDataResponse.f();
        if (listF != null) {
            arrayList2 = new ArrayList();
            Iterator<T> it2 = listF.iterator();
            while (it2.hasNext()) {
                LocalDate localDateA2 = Xl.b.a((String) it2.next());
                if (localDateA2 != null) {
                    arrayList2.add(localDateA2);
                }
            }
        } else {
            arrayList2 = null;
        }
        List list2 = arrayList2 == null ? C42784z0.f406748b : arrayList2;
        CalendarSettings calendarSettings = this.f113360b;
        m mVarB = this.f113359a.b(localDate, localDate2, list, list2, calendarSettings.f113320i, calendarSettings.f113321j);
        String title = calendarLoadDataResponse.getTitle();
        CalendarLoadDataResponse.CalendarButton button = calendarLoadDataResponse.getButton();
        String title2 = button != null ? button.getTitle() : null;
        String str = calendarSettings.f113322k;
        return new CalendarSelectInternalAction.CalendarLoadSuccess(mVarB, title, title2, str != null ? Xl.b.a(str) : null);
    }
}
