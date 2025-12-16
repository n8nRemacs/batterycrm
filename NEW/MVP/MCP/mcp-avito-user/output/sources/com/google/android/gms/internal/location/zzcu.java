package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcu implements C36658n.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationAvailability f350481a;

    public zzcu(LocationAvailability locationAvailability) {
        this.f350481a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C36658n.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationAvailability(this.f350481a);
    }

    @Override // com.google.android.gms.common.api.internal.C36658n.b
    public final void onNotifyListenerFailed() {
    }
}
