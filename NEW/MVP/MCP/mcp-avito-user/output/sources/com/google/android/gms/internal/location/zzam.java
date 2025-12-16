package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.location.LocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzam extends zzat {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f350446r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LocationRequest f350447s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(iVar);
        this.f350446r = pendingIntent;
        this.f350447s = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        ((zzda) bVar).zzw(this.f350446r, this.f350447s, zzau.a(this));
    }
}
