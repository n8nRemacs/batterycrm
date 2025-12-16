package com.avito.android.vas_planning_calendar.view.konveyor.items.empty;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.vas_planning_calendar.view.data.items.CalendarItemState;
import com.avito.android.vas_planning_calendar.view.konveyor.items.day.Position;
import kotlin.Metadata;

/* compiled from: EmptyItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/empty/g;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/empty/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f322723b;

    /* renamed from: c, reason: collision with root package name */
    public final View f322724c;

    /* compiled from: EmptyItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalendarItemState.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalendarItemState calendarItemState = CalendarItemState.f322685b;
                iArr[9] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CalendarItemState calendarItemState2 = CalendarItemState.f322685b;
                iArr[10] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(@k View view) {
        super(view);
        this.f322723b = view;
        this.f322724c = view.findViewById(R.id.background_view);
    }

    @Override // com.avito.android.vas_planning_calendar.view.konveyor.items.empty.f
    public final void jQ(@k CalendarItemState calendarItemState) {
        int iOrdinal = calendarItemState.ordinal();
        View view = this.f322724c;
        View view2 = this.f322723b;
        if (iOrdinal == 5) {
            view2.setTag(Position.f322698e);
            D6.D(view, R.drawable.plan_calendar_booking_selected_day_background);
        } else if (iOrdinal == 9) {
            view2.setTag(Position.f322698e);
            D6.D(view, R.drawable.plan_calendar_seller_unavailable_day_background);
        } else if (iOrdinal != 10) {
            view2.setTag(Position.f322699f);
            view.setBackground(null);
        } else {
            view2.setTag(Position.f322698e);
            D6.D(view, R.drawable.plan_calendar_seller_booked_day_background);
        }
    }
}
