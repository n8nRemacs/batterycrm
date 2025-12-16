package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzu extends zzv {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f350536r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(i iVar, PendingIntent pendingIntent) {
        super(iVar);
        this.f350536r = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        ((zzf) bVar).zzp(this.f350536r);
        setResult((zzu) Status.f348900f);
    }
}
