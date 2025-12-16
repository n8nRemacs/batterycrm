package com.avito.android.travel_guest_profile.navigation;

import Y61.k;
import Y61.l;
import a61.InterfaceC19688a;
import android.app.Application;
import android.content.Intent;
import com.avito.android.travel_guest_profile.TravelGuestProfileActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TravelGuestProfileIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/navigation/a;", "La61/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements InterfaceC19688a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f302205a;

    @Inject
    public a(@k Application application) {
        this.f302205a = application;
    }

    @Override // a61.InterfaceC19688a
    @k
    public final Intent a(@k String str, @l String str2, @l String str3) {
        TravelGuestProfileActivity.f301838m.getClass();
        return new Intent(this.f302205a, (Class<?>) TravelGuestProfileActivity.class).putExtra("user_key", str).putExtra("context", str2).putExtra("booking_id", str3);
    }
}
