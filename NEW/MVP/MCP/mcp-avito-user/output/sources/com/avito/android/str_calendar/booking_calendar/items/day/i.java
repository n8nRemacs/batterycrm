package com.avito.android.str_calendar.booking_calendar.items.day;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.str_calendar.common.models.Position;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingCalendarDayItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/items/day/i;", "Lcom/avito/android/str_calendar/booking_calendar/items/day/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f286329e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f286330b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f286331c;

    /* renamed from: d, reason: collision with root package name */
    public final View f286332d;

    /* compiled from: StrBookingCalendarDayItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StrBookingCalendarUiDayState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState = StrBookingCalendarUiDayState.f286301b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState2 = StrBookingCalendarUiDayState.f286301b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState3 = StrBookingCalendarUiDayState.f286301b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState4 = StrBookingCalendarUiDayState.f286301b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState5 = StrBookingCalendarUiDayState.f286301b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState6 = StrBookingCalendarUiDayState.f286301b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState7 = StrBookingCalendarUiDayState.f286301b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState8 = StrBookingCalendarUiDayState.f286301b;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                StrBookingCalendarUiDayState strBookingCalendarUiDayState9 = StrBookingCalendarUiDayState.f286301b;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public i(@k View view) {
        super(view);
        this.f286330b = view.findViewById(R.id.background_view);
        this.f286331c = (TextView) view.findViewById(R.id.text_view);
        this.f286332d = view.findViewById(R.id.restriction_dot);
    }

    @Override // com.avito.android.str_calendar.booking_calendar.items.day.g
    public final void V2() {
        this.f286331c.setOnClickListener(null);
    }

    @Override // com.avito.android.str_calendar.booking_calendar.items.day.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f286331c.setOnClickListener(new h(0, aVar));
    }

    @Override // com.avito.android.str_calendar.booking_calendar.items.day.g
    public final void c8(boolean z12) {
        TextView textView = this.f286331c;
        if (z12) {
            textView.setForeground(androidx.core.content.d.getDrawable(textView.getContext(), R.drawable.str_calendar_current_day));
        } else {
            textView.setForeground(null);
        }
    }

    @Override // com.avito.android.str_calendar.booking_calendar.items.day.g
    public final void e70(@k StrBookingCalendarUiDayState strBookingCalendarUiDayState) {
        int iOrdinal = strBookingCalendarUiDayState.ordinal();
        View view = this.f286332d;
        TextView textView = this.f286331c;
        View view2 = this.f286330b;
        switch (iOrdinal) {
            case 0:
                view2.setTag(Position.f286642f);
                view2.setBackground(null);
                D6.D(textView, R.drawable.str_calendar_ripple);
                textView.setTextColor(C35835l0.d(R.attr.black, textView.getContext()));
                view.setVisibility(8);
                break;
            case 1:
                view2.setTag(Position.f286640d);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_single);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, textView.getContext()));
                view.setVisibility(8);
                break;
            case 2:
                view2.setTag(Position.f286638b);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_start);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, textView.getContext()));
                view.setVisibility(8);
                break;
            case 3:
                view2.setTag(Position.f286641e);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_middle);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, textView.getContext()));
                view.setVisibility(8);
                break;
            case 4:
                view2.setTag(Position.f286639c);
                D6.D(view2, R.drawable.str_calendar_day_unavailable_end);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.gray36, textView.getContext()));
                view.setVisibility(8);
                break;
            case 5:
                view2.setTag(Position.f286642f);
                view2.setBackground(null);
                D6.D(textView, R.drawable.str_calendar_ripple);
                textView.setTextColor(C35835l0.d(R.attr.black, textView.getContext()));
                view.setVisibility(0);
                break;
            case 6:
                view2.setTag(Position.f286640d);
                D6.D(view2, R.drawable.str_calendar_day_selected_single);
                textView.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.white, textView.getContext()));
                view.setVisibility(8);
                break;
            case 7:
                view2.setTag(Position.f286638b);
                D6.D(view2, R.drawable.str_calendar_day_selected_start);
                textView.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.white, textView.getContext()));
                view.setVisibility(8);
                break;
            case 8:
                view2.setTag(Position.f286641e);
                D6.D(view2, R.drawable.str_calendar_day_selected_middle);
                textView.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.white, textView.getContext()));
                view.setVisibility(8);
                break;
            case 9:
                view2.setTag(Position.f286639c);
                D6.D(view2, R.drawable.str_calendar_day_selected_end);
                textView.setForeground(null);
                textView.setBackground(null);
                textView.setTextColor(C35835l0.d(R.attr.white, textView.getContext()));
                view.setVisibility(8);
                break;
        }
    }

    @Override // com.avito.android.str_calendar.booking_calendar.items.day.g
    public final void setText(@k String str) {
        this.f286331c.setText(str);
    }
}
