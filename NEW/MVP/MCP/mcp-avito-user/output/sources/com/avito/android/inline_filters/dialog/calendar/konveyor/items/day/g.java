package com.avito.android.inline_filters.dialog.calendar.konveyor.items.day;

import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.calendar.models.FiltersCalendarPickerItemState;
import com.avito.android.str_calendar.common.models.Position;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: FiltersCalendarDayItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/day/g;", "Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/day/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f171230f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f171231b;

    /* renamed from: c, reason: collision with root package name */
    public final View f171232c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f171233d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f171234e;

    /* compiled from: FiltersCalendarDayItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FiltersCalendarPickerItemState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState = FiltersCalendarPickerItemState.f171257b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState2 = FiltersCalendarPickerItemState.f171257b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState3 = FiltersCalendarPickerItemState.f171257b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState4 = FiltersCalendarPickerItemState.f171257b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState5 = FiltersCalendarPickerItemState.f171257b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState6 = FiltersCalendarPickerItemState.f171257b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState7 = FiltersCalendarPickerItemState.f171257b;
                iArr[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState8 = FiltersCalendarPickerItemState.f171257b;
                iArr[9] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState9 = FiltersCalendarPickerItemState.f171257b;
                iArr[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState10 = FiltersCalendarPickerItemState.f171257b;
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState11 = FiltersCalendarPickerItemState.f171257b;
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState12 = FiltersCalendarPickerItemState.f171257b;
                iArr[7] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public g(@k View view) {
        super(view);
        this.f171231b = view;
        this.f171232c = view.findViewById(R.id.background_view);
        this.f171233d = (FrameLayout) view.findViewById(R.id.text_view_container);
        this.f171234e = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.e
    public final void KK(@k String str, @k FiltersCalendarPickerItemState filtersCalendarPickerItemState, @k l41.g<Date> gVar, @k Date date, boolean z12) {
        TextView textView = this.f171234e;
        textView.setText(str);
        if (z12) {
            textView.setForeground(androidx.core.content.d.getDrawable(textView.getContext(), R.drawable.str_calendar_current_day));
        } else {
            textView.setForeground(null);
        }
        int iOrdinal = filtersCalendarPickerItemState.ordinal();
        FrameLayout frameLayout = this.f171233d;
        View view = this.f171231b;
        View view2 = this.f171232c;
        switch (iOrdinal) {
            case 0:
                view2.setTag(Position.f286642f);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.str_calendar_ripple);
                textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
                break;
            case 1:
                view2.setTag(Position.f286642f);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.str_calendar_current_day);
                textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
                break;
            case 2:
                view2.setTag(Position.f286640d);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                D6.D(textView, R.drawable.str_calendar_day_selected_single);
                textView.setTextColor(C35835l0.d(R.attr.white, view.getContext()));
                break;
            case 3:
                view2.setTag(Position.f286638b);
                D6.D(view2, R.drawable.str_calendar_day_selected_start);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.white, view.getContext()));
                break;
            case 4:
                view2.setTag(Position.f286639c);
                D6.D(view2, R.drawable.str_calendar_day_selected_end);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.white, view.getContext()));
                break;
            case 5:
                view2.setTag(Position.f286641e);
                D6.D(view2, R.drawable.str_calendar_day_selected_middle);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.white, view.getContext()));
                break;
            case 6:
                view2.setTag(Position.f286642f);
                view2.setBackground(null);
                frameLayout.setForeground(view.getContext().getDrawable(R.drawable.str_calendar_booking_cross_date_line));
                textView.setBackground(null);
                textView.setTextColor(androidx.core.content.d.getColor(view.getContext(), R.color.calendar_past_text_color));
                break;
            case 7:
                view2.setTag(Position.f286642f);
                view2.setBackground(null);
                frameLayout.setForeground(view.getContext().getDrawable(R.drawable.str_calendar_booking_cross_date_line));
                D6.D(textView, R.drawable.str_calendar_booking_current_day_background);
                textView.setTextColor(androidx.core.content.d.getColor(view.getContext(), R.color.calendar_past_text_color));
                break;
            case 8:
                view2.setTag(Position.f286640d);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_single);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, view.getContext()));
                break;
            case 9:
                view2.setTag(Position.f286638b);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_start);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, view.getContext()));
                break;
            case 10:
                view2.setTag(Position.f286639c);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_end);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, view.getContext()));
                break;
            case 11:
                view2.setTag(Position.f286641e);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_middle);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, view.getContext()));
                break;
            case 12:
                view2.setTag(Position.f286642f);
                view2.setBackground(null);
                frameLayout.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(androidx.core.content.d.getColor(view.getContext(), R.color.calendar_past_text_color));
                break;
        }
        if (filtersCalendarPickerItemState == FiltersCalendarPickerItemState.f171264i || filtersCalendarPickerItemState == FiltersCalendarPickerItemState.f171265j || filtersCalendarPickerItemState == FiltersCalendarPickerItemState.f171267l || filtersCalendarPickerItemState == FiltersCalendarPickerItemState.f171266k || filtersCalendarPickerItemState == FiltersCalendarPickerItemState.f171268m || filtersCalendarPickerItemState == FiltersCalendarPickerItemState.f171263h) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new f(gVar, date, 0));
        }
    }
}
