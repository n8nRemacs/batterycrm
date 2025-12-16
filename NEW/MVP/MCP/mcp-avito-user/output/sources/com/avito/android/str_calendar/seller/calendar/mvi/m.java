package com.avito.android.str_calendar.seller.calendar.mvi;

import Iy0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import java.util.ArrayList;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;

/* compiled from: StrSellerCalendarReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<StrSellerCalendarInternalAction, StrSellerCalendarState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calendar.data.f f287768b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calendar.data.i f287769c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f287770d;

    @Inject
    public m(@Y61.k com.avito.android.str_calendar.seller.calendar.data.f fVar, @Y61.k com.avito.android.str_calendar.seller.calendar.data.i iVar, @Y61.k o oVar) {
        this.f287768b = fVar;
        this.f287769c = iVar;
        this.f287770d = oVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final StrSellerCalendarState a(StrSellerCalendarInternalAction strSellerCalendarInternalAction, StrSellerCalendarState strSellerCalendarState) {
        StrSellerCalendarInternalAction strSellerCalendarInternalAction2 = strSellerCalendarInternalAction;
        StrSellerCalendarState strSellerCalendarState2 = strSellerCalendarState;
        if (strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.Init) {
            StrSellerCalendarInternalAction.Init init = (StrSellerCalendarInternalAction.Init) strSellerCalendarInternalAction2;
            String str = init.f287705c;
            DateRange dateRange = null;
            String str2 = init.f287706d;
            String str3 = (str == null || str2 != null) ? (str != null || str2 == null) ? null : str2 : str;
            Date dateC = str3 != null ? wy0.b.c(str3) : null;
            if (str != null && str2 != null) {
                dateRange = new DateRange(wy0.b.c(str), wy0.b.c(str2));
            }
            return StrSellerCalendarState.a(strSellerCalendarState2, null, null, dateC, dateRange, null, null, init.f287704b, init.f287707e, null, false, null, 1843);
        }
        boolean z12 = strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ContentError;
        o oVar = this.f287770d;
        if (z12) {
            return oVar.b(StrSellerCalendarState.a(strSellerCalendarState2, null, StrSellerCalendarState.LoadingType.f287728d, null, null, C42784z0.f406748b, P0.c(), null, false, null, false, null, 1984));
        }
        if (strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ContentLoading) {
            return oVar.b(StrSellerCalendarState.a(strSellerCalendarState2, null, StrSellerCalendarState.LoadingType.f287726b, null, null, C42784z0.f406748b, P0.c(), null, false, null, false, null, 1996));
        }
        if (strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ContentLoaded) {
            Iy0.c cVar = ((StrSellerCalendarInternalAction.ContentLoaded) strSellerCalendarInternalAction2).f287703b;
            ?? r12 = cVar.f8658e;
            ArrayList arrayListA = this.f287769c.a(new DateRange(((c.b) C42745f0.E(r12)).f8662a, ((c.b) C42745f0.Q(r12)).f8662a));
            return oVar.b(StrSellerCalendarState.a(strSellerCalendarState2, cVar, StrSellerCalendarState.LoadingType.f287727c, null, null, arrayListA, this.f287768b.a(cVar, arrayListA), null, false, null, (strSellerCalendarState2.f287718e == null && strSellerCalendarState2.f287717d == null) ? false : true, null, 1484));
        }
        if (strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ScrollToPosition) {
            return StrSellerCalendarState.a(strSellerCalendarState2, null, null, null, null, null, null, null, false, null, false, null, 1535);
        }
        if (!(strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ClickDay)) {
            return strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ClearSelectedDates ? oVar.b(StrSellerCalendarState.a(strSellerCalendarState2, null, null, null, null, null, null, null, false, null, false, null, 2035)) : strSellerCalendarState2;
        }
        StrSellerCalendarInternalAction.ClickDay clickDay = (StrSellerCalendarInternalAction.ClickDay) strSellerCalendarInternalAction2;
        return oVar.b(StrSellerCalendarState.a(strSellerCalendarState2, null, null, clickDay.f287698b, clickDay.f287699c, null, null, null, false, null, false, null, 2035));
    }
}
