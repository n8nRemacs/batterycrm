package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcn extends zzj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f350472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37028k f350473b;

    public zzcn(Boolean bool, C37028k c37028k) {
        this.f350472a = bool;
        this.f350473b = c37028k;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        B.a(zzgVar.getStatus(), this.f350472a, this.f350473b);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
    }
}
