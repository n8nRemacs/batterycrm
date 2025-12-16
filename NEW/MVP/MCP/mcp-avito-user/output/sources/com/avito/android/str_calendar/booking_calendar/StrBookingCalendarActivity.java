package com.avito.android.str_calendar.booking_calendar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarInitParameters;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig;
import com.avito.android.str_calendar.common.models.CalendarConstraintsPicker;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Date;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingCalendarActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/StrBookingCalendarActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrBookingCalendarActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onBackPressed() {
        setResult(-1);
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_calendar);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("advert_id");
            Intent intent = getIntent();
            int i12 = Build.VERSION.SDK_INT;
            Parcelable parcelableExtra = i12 >= 33 ? (Parcelable) intent.getParcelableExtra("date_range", SelectedDateRange.class) : intent.getParcelableExtra("date_range");
            C42822w c42822w = null;
            SelectedDateRange selectedDateRange = parcelableExtra instanceof SelectedDateRange ? (SelectedDateRange) parcelableExtra : null;
            Intent intent2 = getIntent();
            Parcelable parcelableExtra2 = i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("calendar_constrains", CalendarConstraintsPicker.class) : intent2.getParcelableExtra("calendar_constrains");
            CalendarConstraintsPicker calendarConstraintsPicker = parcelableExtra2 instanceof CalendarConstraintsPicker ? (CalendarConstraintsPicker) parcelableExtra2 : null;
            String stringExtra2 = getIntent().getStringExtra("calendar_title");
            String stringExtra3 = getIntent().getStringExtra("calendar_request_id");
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calendar_locat_restrictions");
            String stringExtra4 = getIntent().getStringExtra("calendar_button_title");
            H hE2 = getSupportFragmentManager().e();
            new StrBookingCalendarFragment.b();
            Date date = calendarConstraintsPicker != null ? calendarConstraintsPicker.f286633b : null;
            Date date2 = calendarConstraintsPicker != null ? calendarConstraintsPicker.f286634c : null;
            boolean z12 = false;
            boolean z13 = calendarConstraintsPicker != null ? calendarConstraintsPicker.f286635d : false;
            StrBookingCalendarScreenConfig.Default r112 = new StrBookingCalendarScreenConfig.Default(z12, z12, 3, c42822w);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("extra_init_parameters", new StrBookingCalendarInitParameters(stringExtra, selectedDateRange, date, date2, z13, parcelableArrayListExtra, stringExtra2, stringExtra3, stringExtra4, r112));
            StrBookingCalendarFragment strBookingCalendarFragment = new StrBookingCalendarFragment();
            strBookingCalendarFragment.setArguments(bundle2);
            hE2.j(R.id.fragment_container, strBookingCalendarFragment, null, 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        View viewFindViewById = findViewById(R.id.bottom_sheet);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.width = getResources().getBoolean(R.bool.is_tablet) ? y6.b(512) : -1;
        viewFindViewById.setLayoutParams(layoutParams);
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(viewFindViewById);
        bottomSheetBehaviorB.M(true);
        bottomSheetBehaviorB.N(C35835l0.i(this).heightPixels, false);
        bottomSheetBehaviorB.v(new a(this));
    }
}
