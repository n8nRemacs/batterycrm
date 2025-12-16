package com.avito.android.service_booking_persistence;

import AK0.l;
import Y61.k;
import androidx.compose.ui.platform.C22491k0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingOnboardingStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_persistence/g;", "Lcom/avito/android/service_booking_persistence/f;", "_avito_service-booking-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f277485a;

    @Inject
    public g(@k l lVar) {
        this.f277485a = lVar;
    }

    @Override // com.avito.android.service_booking_persistence.f
    public final int a(@k String str) {
        return this.f277485a.getInt(str, 0);
    }

    @Override // com.avito.android.service_booking_persistence.f
    public final boolean b(@k String str) {
        return this.f277485a.getBoolean(C22491k0.a('}', "sb_is_finished_onboarding_{", str), false);
    }

    @Override // com.avito.android.service_booking_persistence.f
    public final void c(int i12, int i13, @k String str) {
        int iA2 = a(str);
        l lVar = this.f277485a;
        if (i12 > iA2) {
            lVar.a(i12, str);
        }
        if (i12 == i13) {
            lVar.putBoolean("sb_is_finished_onboarding_{" + str + '}', true);
        }
    }
}
