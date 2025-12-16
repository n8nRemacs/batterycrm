package com.avito.android.service_booking.storage.preferences;

import Y61.k;
import android.content.SharedPreferences;
import com.avito.android.service_booking.mvi.step.di.p;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingPreferencesStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/storage/preferences/b;", "Lcom/avito/android/service_booking/storage/preferences/a;", "a", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking.storage.preferences.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f274813a;

    /* compiled from: ServiceBookingPreferencesStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking/storage/preferences/b$a;", "", "<init>", "()V", "", "SRV_EDIT_ONBOARDING_SHOWN_KEY", "Ljava/lang/String;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@p @k SharedPreferences sharedPreferences) {
        this.f274813a = sharedPreferences;
    }

    @Override // com.avito.android.service_booking.storage.preferences.a
    public final void a() {
        this.f274813a.edit().putBoolean("EDIT_ONBOARDING_SHOWN_KEY", true).apply();
    }

    @Override // com.avito.android.service_booking.storage.preferences.a
    public final boolean b() {
        return this.f274813a.getBoolean("EDIT_ONBOARDING_SHOWN_KEY", false);
    }
}
