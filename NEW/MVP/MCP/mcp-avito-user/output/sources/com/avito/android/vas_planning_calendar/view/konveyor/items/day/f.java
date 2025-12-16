package com.avito.android.vas_planning_calendar.view.konveyor.items.day;

import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.vas_planning_calendar.view.data.items.CalendarItemState;
import java.util.Date;
import kotlin.Metadata;
import l41.g;
import m.C43852a;

/* compiled from: DayItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/f;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f322711f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f322712b;

    /* renamed from: c, reason: collision with root package name */
    public final View f322713c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f322714d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f322715e;

    /* compiled from: DayItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalendarItemState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalendarItemState calendarItemState = CalendarItemState.f322685b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CalendarItemState calendarItemState2 = CalendarItemState.f322685b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CalendarItemState calendarItemState3 = CalendarItemState.f322685b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CalendarItemState calendarItemState4 = CalendarItemState.f322685b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                CalendarItemState calendarItemState5 = CalendarItemState.f322685b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                CalendarItemState calendarItemState6 = CalendarItemState.f322685b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CalendarItemState calendarItemState7 = CalendarItemState.f322685b;
                iArr[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                CalendarItemState calendarItemState8 = CalendarItemState.f322685b;
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                CalendarItemState calendarItemState9 = CalendarItemState.f322685b;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                CalendarItemState calendarItemState10 = CalendarItemState.f322685b;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public f(@k View view) {
        super(view);
        this.f322712b = view;
        this.f322713c = view.findViewById(R.id.background_view);
        this.f322714d = (FrameLayout) view.findViewById(R.id.text_view_container);
        this.f322715e = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.vas_planning_calendar.view.konveyor.items.day.e
    public final void Pr(@k String str, @k CalendarItemState calendarItemState, @k g<Date> gVar, @k Date date) {
        TextView textView = this.f322715e;
        textView.setText(str);
        int iOrdinal = calendarItemState.ordinal();
        FrameLayout frameLayout = this.f322714d;
        View view = this.f322712b;
        View view2 = this.f322713c;
        switch (iOrdinal) {
            case 0:
                view2.setTag(Position.f322699f);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.bg_selectable_blue_oval);
                textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
                break;
            case 1:
                view2.setTag(Position.f322699f);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.plan_calendar_booking_current_day_background);
                textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
                break;
            case 2:
                view2.setTag(Position.f322697d);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.plan_calendar_booking_selected_single_day_background);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 3:
                view2.setTag(Position.f322695b);
                D6.D(view2, R.drawable.plan_calendar_booking_selected_day_left_background);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 4:
                view2.setTag(Position.f322696c);
                D6.D(view2, R.drawable.plan_calendar_booking_selected_day_right_background);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 5:
                view2.setTag(Position.f322698e);
                D6.D(view2, R.drawable.plan_calendar_booking_selected_day_background);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 6:
                view2.setTag(Position.f322699f);
                view2.setBackground(null);
                frameLayout.setForeground(C43852a.a(view.getContext(), R.drawable.plan_calendar_booking_cross_date_line));
                textView.setBackground(null);
                textView.setTextColor(androidx.core.content.d.getColor(view.getContext(), R.color.plan_calendar_past_text_color));
                break;
            case 7:
                view2.setTag(Position.f322699f);
                view2.setBackground(null);
                frameLayout.setForeground(C43852a.a(view.getContext(), R.drawable.plan_calendar_booking_cross_date_line));
                D6.D(textView, R.drawable.plan_calendar_booking_current_day_background);
                textView.setTextColor(androidx.core.content.d.getColor(view.getContext(), R.color.plan_calendar_past_text_color));
                break;
            case 8:
                view2.setTag(Position.f322699f);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(androidx.core.content.d.getColor(view.getContext(), R.color.plan_calendar_past_text_color));
                break;
        }
        if (calendarItemState == CalendarItemState.f322692i || calendarItemState == CalendarItemState.f322691h) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.f(gVar, date, 1));
        }
    }
}
