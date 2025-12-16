package com.avito.android.location.find;

import android.location.Location;
import kotlin.Metadata;

/* compiled from: DetectLocationProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/j;", "Lcom/avito/android/location/find/i;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public DetectLocationInteractor f181756a;

    @Override // com.avito.android.location.find.i
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> e(boolean z12) {
        return this.f181756a.a(z12);
    }
}
