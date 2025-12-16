package com.avito.android.calendar_select.presentation.view.konveyor.items.day;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.body_condition.h;
import com.avito.android.calendar_select.presentation.view.data.items.CalendarItemState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DayItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/day/f;", "Lcom/avito/android/calendar_select/presentation/view/konveyor/items/day/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f113521f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f113522b;

    /* renamed from: c, reason: collision with root package name */
    public final View f113523c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f113524d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f113525e;

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
                CalendarItemState calendarItemState = CalendarItemState.f113461b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CalendarItemState calendarItemState2 = CalendarItemState.f113461b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CalendarItemState calendarItemState3 = CalendarItemState.f113461b;
                iArr[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CalendarItemState calendarItemState4 = CalendarItemState.f113461b;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                CalendarItemState calendarItemState5 = CalendarItemState.f113461b;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                CalendarItemState calendarItemState6 = CalendarItemState.f113461b;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CalendarItemState calendarItemState7 = CalendarItemState.f113461b;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public f(@k View view) {
        super(view);
        this.f113522b = view;
        this.f113523c = view.findViewById(R.id.background_view);
        this.f113524d = (FrameLayout) view.findViewById(R.id.text_view_container);
        this.f113525e = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.calendar_select.presentation.view.konveyor.items.day.e
    public final void rt(@k String str, @k CalendarItemState calendarItemState, @k l<? super LocalDate, G0> lVar, @k LocalDate localDate) {
        String str2 = localDate.format(DateTimeFormatter.ofPattern(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT));
        TextView textView = this.f113525e;
        textView.setTag(str2);
        I5.a(textView, str, false);
        int iOrdinal = calendarItemState.ordinal();
        View view = this.f113522b;
        FrameLayout frameLayout = this.f113524d;
        View view2 = this.f113523c;
        switch (iOrdinal) {
            case 0:
                view2.setTag(Position.f113506c);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.bg_selectable_black_oval);
                textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
                break;
            case 1:
                view2.setTag(Position.f113506c);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.calendar_select_current_day_background);
                textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
                break;
            case 2:
                view2.setTag(Position.f113506c);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.calendar_select_current_day_background);
                textView.setTextColor(C35835l0.d(R.attr.gray28, view.getContext()));
                break;
            case 3:
                view2.setTag(Position.f113505b);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.calendar_select_selected_single_day_background);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 4:
                view2.setTag(Position.f113507d);
                D6.D(view2, R.drawable.calendar_select_selected_day_left_background);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 5:
                view2.setTag(Position.f113508e);
                D6.D(view2, R.drawable.calendar_select_selected_day_right_background);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 6:
                view2.setTag(Position.f113509f);
                D6.D(view2, R.drawable.calendar_select_selected_day_background);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.constantWhite, view.getContext()));
                break;
            case 7:
                view2.setTag(Position.f113506c);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray28, view.getContext()));
                break;
        }
        if (calendarItemState == CalendarItemState.f113468i || calendarItemState == CalendarItemState.f113463d) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new h(5, lVar, localDate));
        }
    }
}
