package com.avito.android.service_booking_day_settings;

import Y61.k;
import Y61.l;
import android.R;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DaySettingsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_day_settings/DaySettingsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DaySettingsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f276682n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_day_settings.a f276683m = new com.avito.android.service_booking_day_settings.a();

    /* compiled from: DaySettingsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_day_settings/DaySettingsActivity$a;", "", "<init>", "()V", "", "KEY_DAY_ID", "Ljava/lang/String;", "RESULT_KEY_SETTINGS_STATUS", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("key_day_id");
            if (stringExtra == null) {
                throw new IllegalArgumentException("key_day_id must be specified");
            }
            DaySettingsFragmentArgs daySettingsFragmentArgs = new DaySettingsFragmentArgs(stringExtra);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            this.f276683m.getClass();
            DaySettingsFragment.f276691v0.getClass();
            DaySettingsFragment daySettingsFragment = new DaySettingsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("day_key_arg", daySettingsFragmentArgs);
            daySettingsFragment.setArguments(bundle2);
            H hE2 = supportFragmentManager.e();
            hE2.j(R.id.content, daySettingsFragment, null, 1);
            hE2.c(DaySettingsFragment.class.getCanonicalName());
            hE2.e();
        }
    }
}
