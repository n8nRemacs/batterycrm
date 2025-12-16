package com.avito.android.str_calendar.seller.calendar.konveyor;

import Jy0.C14262b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.str_calendar.common.models.Position;
import com.avito.android.str_calendar.seller.calendar.data.models.CalendarDayState;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.Status;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: StrSellerCalendarBackgroundsProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/c;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f287605a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Object f287606b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Object f287607c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Object f287608d;

    /* compiled from: StrSellerCalendarBackgroundsProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalendarDayState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalendarDayState[] calendarDayStateArr = CalendarDayState.f287543b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CalendarDayState[] calendarDayStateArr2 = CalendarDayState.f287543b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Status status = Status.f287687b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        Position position = Position.f286638b;
        Q q12 = new Q(position, Integer.valueOf(R.drawable.str_calendar_seller_booked_day_left_background));
        Position position2 = Position.f286639c;
        Q q13 = new Q(position2, Integer.valueOf(R.drawable.str_calendar_seller_booked_day_right_background));
        Position position3 = Position.f286641e;
        Q q14 = new Q(position3, Integer.valueOf(R.drawable.str_calendar_seller_booked_day_background));
        Position position4 = Position.f286640d;
        f287606b = P0.g(q12, q13, q14, new Q(position4, Integer.valueOf(R.drawable.str_calendar_seller_booked_day_single_background)));
        f287607c = P0.g(new Q(position, Integer.valueOf(R.drawable.str_calendar_seller_selected_day_left_background)), new Q(position2, Integer.valueOf(R.drawable.str_calendar_seller_selected_day_right_background)), new Q(position3, Integer.valueOf(R.drawable.str_calendar_seller_selected_day_background)), new Q(position4, Integer.valueOf(R.drawable.str_calendar_seller_selected_single_day_background)));
        f287608d = P0.g(new Q(position, Integer.valueOf(R.drawable.str_calendar_seller_unavailable_day_left_background)), new Q(position2, Integer.valueOf(R.drawable.str_calendar_seller_unavailable_day_right_background)), new Q(position3, Integer.valueOf(R.drawable.str_calendar_seller_unavailable_day_background)), new Q(position4, Integer.valueOf(R.drawable.str_calendar_seller_unavailable_day_single_background)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @InterfaceC42165v
    public static Integer a(C14262b c14262b) {
        int iOrdinal = c14262b.f9190c.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? Integer.valueOf(R.drawable.str_calendar_seller_day_selectable_background) : Integer.valueOf(R.drawable.str_calendar_seller_current_day_background) : (Integer) f287607c.get(c14262b.f9191d);
    }
}
