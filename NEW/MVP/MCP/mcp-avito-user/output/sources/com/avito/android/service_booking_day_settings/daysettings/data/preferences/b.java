package com.avito.android.service_booking_day_settings.daysettings.data.preferences;

import Y61.k;
import android.content.SharedPreferences;
import com.avito.android.service_booking_day_settings.di.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DaySchedulePreferencesStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/preferences/b;", "Lcom/avito/android/service_booking_day_settings/daysettings/data/preferences/a;", "a", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_day_settings.daysettings.data.preferences.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f276754a;

    /* compiled from: DaySchedulePreferencesStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/preferences/b$a;", "", "<init>", "()V", "", "AGREEMENT_SHOWN_KEY", "Ljava/lang/String;", "TOOLTIP_CLICKED_KEY", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@l @k SharedPreferences sharedPreferences) {
        this.f276754a = sharedPreferences;
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.data.preferences.a
    public final boolean a() {
        return this.f276754a.getBoolean("AGREEMENT_SHOWN_KEY", false);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.data.preferences.a
    public final boolean b() {
        return this.f276754a.getBoolean("TOOLTIP_CLICKED_KEY", false);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.data.preferences.a
    public final void c() {
        this.f276754a.edit().putBoolean("TOOLTIP_CLICKED_KEY", true).apply();
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.data.preferences.a
    public final void d() {
        this.f276754a.edit().putBoolean("AGREEMENT_SHOWN_KEY", true).apply();
    }
}
