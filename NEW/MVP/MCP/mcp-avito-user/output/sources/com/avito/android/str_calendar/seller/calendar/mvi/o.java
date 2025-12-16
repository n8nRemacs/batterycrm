package com.avito.android.str_calendar.seller.calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerCalendarViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/o;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calendar.data.c f287774a;

    /* compiled from: StrSellerCalendarViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StrSellerCalendarState.LoadingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSellerCalendarState.LoadingType loadingType = StrSellerCalendarState.LoadingType.f287726b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSellerCalendarState.LoadingType loadingType2 = StrSellerCalendarState.LoadingType.f287726b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public o(@Y61.k com.avito.android.str_calendar.seller.calendar.data.c cVar) {
        this.f287774a = cVar;
    }

    public static PrintableText a(StrSellerCalendarState strSellerCalendarState) {
        DateRange dateRange = strSellerCalendarState.f287718e;
        if (dateRange != null) {
            return com.avito.android.printable_text.b.f(wy0.b.f(dateRange));
        }
        Date date = strSellerCalendarState.f287717d;
        return date != null ? com.avito.android.printable_text.b.f(wy0.b.b(date)) : com.avito.android.printable_text.b.c(R.string.seller_calendar_toolbar_title, new Serializable[0]);
    }

    @Y61.k
    public final StrSellerCalendarState b(@Y61.k StrSellerCalendarState strSellerCalendarState) {
        DateRange dateRange;
        Date date;
        PrintableText printableTextC;
        String str;
        int iOrdinal = strSellerCalendarState.f287716c.ordinal();
        if (iOrdinal == 0) {
            return StrSellerCalendarState.a(strSellerCalendarState, null, null, null, null, null, null, null, false, null, false, new a.d(a(strSellerCalendarState)), 1023);
        }
        boolean z12 = true;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return StrSellerCalendarState.a(strSellerCalendarState, null, null, null, null, null, null, null, false, null, false, new a.c(a(strSellerCalendarState)), 1023);
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayListA = this.f287774a.a(strSellerCalendarState);
        Iterator it = arrayListA.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            dateRange = strSellerCalendarState.f287718e;
            date = strSellerCalendarState.f287717d;
            if (!zHasNext) {
                i12 = -1;
                break;
            }
            TV0.a aVar = (TV0.a) it.next();
            if (aVar instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a) {
                com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a aVar2 = (com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a) aVar;
                if (L.f(aVar2.f287627n, date)) {
                    break;
                }
                if (L.f(aVar2.f287627n, dateRange != null ? dateRange.f286636b : null)) {
                    break;
                }
            }
            i12++;
        }
        Integer numValueOf = i12 >= 0 ? Integer.valueOf(i12) : null;
        PrintableText printableTextA = a(strSellerCalendarState);
        if (date == null && dateRange == null) {
            Iy0.c cVar = strSellerCalendarState.f287715b;
            printableTextC = (cVar == null || (str = cVar.f8659f) == null) ? com.avito.android.printable_text.b.c(R.string.seller_calendar_edit_main_params, new Serializable[0]) : com.avito.android.printable_text.b.f(str);
        } else {
            printableTextC = com.avito.android.printable_text.b.c(R.string.seller_calendar_edit_params, new Serializable[0]);
        }
        if (date == null && dateRange == null) {
            z12 = false;
        }
        return StrSellerCalendarState.a(strSellerCalendarState, null, null, null, null, null, null, null, false, numValueOf, false, new a.b(printableTextA, printableTextC, arrayListA, z12), 767);
    }
}
