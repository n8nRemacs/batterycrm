package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.location.T;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzco extends zzj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f350475b;

    public zzco(C37028k c37028k, T t12) {
        this.f350474a = c37028k;
        this.f350475b = t12;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        B.a(zzgVar.getStatus(), null, this.f350474a);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
        this.f350475b.zze();
    }
}
