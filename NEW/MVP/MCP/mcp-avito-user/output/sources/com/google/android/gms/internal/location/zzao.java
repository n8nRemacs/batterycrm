package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzao extends zzat {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f350449r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(i iVar, PendingIntent pendingIntent) {
        super(iVar);
        this.f350449r = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        ((zzda) bVar).zzD(this.f350449r, zzau.a(this), null);
    }
}
