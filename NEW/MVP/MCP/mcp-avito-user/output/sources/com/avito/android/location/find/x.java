package com.avito.android.location.find;

import android.app.Activity;
import android.location.Location;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GoogleServicesLocationProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/x;", "Lcom/avito/android/location/find/w;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f181778a;

    @Inject
    public x(@Y61.k r rVar) {
        this.f181778a = rVar;
    }

    @Override // com.avito.android.location.find.z
    public final boolean b() {
        return this.f181778a.e();
    }

    @Override // com.avito.android.location.find.z
    public final void d(@Y61.k Activity activity) {
        this.f181778a.d(activity);
    }

    @Override // com.avito.android.location.find.z
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> e(boolean z12) {
        return this.f181778a.a(z12).F();
    }
}
