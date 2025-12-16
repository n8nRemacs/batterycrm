package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzt extends zzv {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f350534r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f350535s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(i iVar, long j12, PendingIntent pendingIntent) {
        super(iVar);
        this.f350534r = j12;
        this.f350535s = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        zzf zzfVar = (zzf) bVar;
        PendingIntent pendingIntent = this.f350535s;
        C36729v.j(pendingIntent);
        long j12 = this.f350534r;
        C36729v.a("detectionIntervalMillis must be >= 0", j12 >= 0);
        ((zzo) zzfVar.getService()).zzr(j12, true, pendingIntent);
        setResult((zzt) Status.f348900f);
    }
}
