package com.avito.android.service_booking_calendar;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingCalendarActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/ServiceBookingCalendarActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingCalendarActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f275240m = new a(null);

    /* compiled from: ServiceBookingCalendarActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_calendar/ServiceBookingCalendarActivity$a;", "", "<init>", "()V", "", "SERVICE_BOOKING_CALENDAR_ARGUMENT_EXTRA", "Ljava/lang/String;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() > 1) {
            super.onBackPressed();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            ServiceBookingCalendarActivityArg serviceBookingCalendarActivityArg = (ServiceBookingCalendarActivityArg) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("SERVICE_BOOKING_CALENDAR_ARGUMENT_EXTRA", ServiceBookingCalendarActivityArg.class) : intent.getParcelableExtra("SERVICE_BOOKING_CALENDAR_ARGUMENT_EXTRA"));
            if (serviceBookingCalendarActivityArg == null) {
                throw new IllegalStateException("argument must not be null!");
            }
            ServiceBookingFlexibleCalendarFragment.f275609x0.getClass();
            ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment = new ServiceBookingFlexibleCalendarFragment();
            serviceBookingFlexibleCalendarFragment.setArguments(C22777e.b(new Q("key.day_focus", serviceBookingCalendarActivityArg.f275241b)));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.content, serviceBookingFlexibleCalendarFragment, null, 1);
            hE2.c(ServiceBookingFlexibleCalendarFragment.class.getCanonicalName());
            hE2.e();
        }
    }
}
