package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.location.P;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcp extends zzj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f350477b;

    public zzcp(C37028k c37028k, P p12) {
        this.f350476a = c37028k;
        this.f350477b = p12;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        B.a(zzgVar.getStatus(), null, this.f350476a);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
        this.f350477b.zzf();
    }
}
