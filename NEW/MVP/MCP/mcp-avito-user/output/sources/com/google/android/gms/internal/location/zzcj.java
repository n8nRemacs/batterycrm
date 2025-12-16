package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C36660o;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcj extends LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzda f350466b;

    public zzcj(zzda zzdaVar, C37028k c37028k) {
        this.f350466b = zzdaVar;
        this.f350465a = c37028k;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.f350465a.d(locationResult.h());
        try {
            this.f350466b.zzB(C36660o.c(this, "GetCurrentLocation"), false, new C37028k());
        } catch (RemoteException unused) {
        }
    }
}
