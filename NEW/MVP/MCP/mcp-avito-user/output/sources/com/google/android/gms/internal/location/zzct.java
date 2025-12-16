package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzct implements C36658n.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationResult f350480a;

    public zzct(LocationResult locationResult) {
        this.f350480a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.C36658n.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.f350480a);
    }

    @Override // com.google.android.gms.common.api.internal.C36658n.b
    public final void onNotifyListenerFailed() {
    }
}
