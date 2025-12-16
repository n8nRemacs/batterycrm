package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzbr extends zzbu {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ GeofencingRequest f350459r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f350460s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbr(i iVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(iVar);
        this.f350459r = geofencingRequest;
        this.f350460s = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final void c(C36616a.b bVar) {
        C37028k c37028k = new C37028k();
        c37028k.f355672a.c(new zzbq(this));
        ((zzda) bVar).zzq(this.f350459r, this.f350460s, c37028k);
    }
}
