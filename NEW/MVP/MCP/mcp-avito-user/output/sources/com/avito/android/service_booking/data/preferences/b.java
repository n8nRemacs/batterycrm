package com.avito.android.service_booking.data.preferences;

import Cs0.d;
import Y61.k;
import android.content.SharedPreferences;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DayScheduleSavePreferencesStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/data/preferences/b;", "Lcom/avito/android/service_booking/data/preferences/a;", "a", "_avito_service-booking-utils_data"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking.data.preferences.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f274175a;

    /* compiled from: DayScheduleSavePreferencesStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking/data/preferences/b$a;", "", "<init>", "()V", "", "SAVE_DIALOG_SHOWN_KEY", "Ljava/lang/String;", "_avito_service-booking-utils_data"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@d @k SharedPreferences sharedPreferences) {
        this.f274175a = sharedPreferences;
    }

    @Override // com.avito.android.service_booking.data.preferences.a
    public final void a() {
        this.f274175a.edit().putBoolean("DAY_SCHEDULE_SAVE_DIALOG_SHOWN_KEY", true).apply();
    }

    @Override // com.avito.android.service_booking.data.preferences.a
    public final boolean b() {
        return this.f274175a.getBoolean("DAY_SCHEDULE_SAVE_DIALOG_SHOWN_KEY", false);
    }
}
