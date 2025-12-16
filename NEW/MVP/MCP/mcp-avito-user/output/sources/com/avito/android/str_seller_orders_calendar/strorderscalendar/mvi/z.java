package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Uz0.c;
import com.avito.android.R;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersCalendarOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/z;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "LUz0/c;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z implements com.avito.android.arch.mvi.t<StrOrdersCalendarInternalAction, Uz0.c> {
    @Inject
    public z() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Uz0.c b(StrOrdersCalendarInternalAction strOrdersCalendarInternalAction) {
        StrOrdersCalendarInternalAction strOrdersCalendarInternalAction2 = strOrdersCalendarInternalAction;
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.OpenDeeplink) {
            return new c.b(((StrOrdersCalendarInternalAction.OpenDeeplink) strOrdersCalendarInternalAction2).f291018b);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.CloseScreen) {
            return c.a.f16840a;
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.ShowBookingsLoadingError) {
            return c.g.f16848a;
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.OpenMonthSelector) {
            return new c.C1158c(((StrOrdersCalendarInternalAction.OpenMonthSelector) strOrdersCalendarInternalAction2).f291019b);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.OpenSellerCalendarWithSelectedDates) {
            StrOrdersCalendarInternalAction.OpenSellerCalendarWithSelectedDates openSellerCalendarWithSelectedDates = (StrOrdersCalendarInternalAction.OpenSellerCalendarWithSelectedDates) strOrdersCalendarInternalAction2;
            return new c.d(openSellerCalendarWithSelectedDates.f291023d, openSellerCalendarWithSelectedDates.f291021b, openSellerCalendarWithSelectedDates.f291022c);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.OpenSellerCalendar) {
            return new c.d(((StrOrdersCalendarInternalAction.OpenSellerCalendar) strOrdersCalendarInternalAction2).f291020b, null, null);
        }
        if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.UxInfoLoadingComplete) {
            SK0.f fVar = ((StrOrdersCalendarInternalAction.UxInfoLoadingComplete) strOrdersCalendarInternalAction2).f291040b;
            if (fVar != null) {
                return new c.h(fVar);
            }
        } else {
            if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.ScrollToHorizontalPosition) {
                return new c.f(((StrOrdersCalendarInternalAction.ScrollToHorizontalPosition) strOrdersCalendarInternalAction2).f291031b + 20);
            }
            if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.ToggleFlatRecyclerCollapse) {
                boolean z12 = ((StrOrdersCalendarInternalAction.ToggleFlatRecyclerCollapse) strOrdersCalendarInternalAction2).f291035b;
                return new c.i(z12 ? com.avito.android.printable_text.b.a() : com.avito.android.printable_text.b.c(R.string.str_orders_calendar_rotate_button, new Serializable[0]), z12);
            }
            if (strOrdersCalendarInternalAction2 instanceof StrOrdersCalendarInternalAction.RotateScreen) {
                return c.e.f16846a;
            }
        }
        return null;
    }
}
