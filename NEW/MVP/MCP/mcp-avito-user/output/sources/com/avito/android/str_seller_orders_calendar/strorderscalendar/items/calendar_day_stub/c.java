package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_stub;

import android.view.View;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_stub.CalendarDayStubItem;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalendarDayStubItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_stub/c;", "LTV0/d;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_stub/e;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_stub/CalendarDayStubItem;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.d<e, CalendarDayStubItem> {

    /* compiled from: CalendarDayStubItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalendarDayStubItem.StubTagType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalendarDayStubItem.StubTagType stubTagType = CalendarDayStubItem.StubTagType.f290883b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CalendarDayStubItem.StubTagType stubTagType2 = CalendarDayStubItem.StubTagType.f290883b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CalendarDayStubItem.StubTagType stubTagType3 = CalendarDayStubItem.StubTagType.f290883b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        int iOrdinal = ((CalendarDayStubItem) aVar).f290882c.ordinal();
        View view = eVar2.f290894b;
        View view2 = eVar2.f290895c;
        View view3 = eVar2.f290896d;
        if (iOrdinal == 0) {
            D6.w(view3);
            D6.w(view2);
            D6.w(view);
            return;
        }
        if (iOrdinal == 1) {
            D6.H(view3);
            D6.w(view2);
            D6.w(view);
        } else if (iOrdinal == 2) {
            D6.w(view3);
            D6.w(view2);
            D6.H(view);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            D6.w(view3);
            D6.H(view2);
            D6.w(view);
        }
    }
}
