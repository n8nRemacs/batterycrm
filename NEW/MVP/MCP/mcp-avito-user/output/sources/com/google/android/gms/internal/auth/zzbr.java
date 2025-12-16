package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzbr extends zzbd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbs f350018a;

    public zzbr(zzbs zzbsVar) {
        this.f350018a = zzbsVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        zzbs zzbsVar = this.f350018a;
        if (str != null) {
            zzbsVar.setResult((zzbs) new zzbv(str));
        } else {
            zzbsVar.setResult((zzbs) new zzbv(new Status(3006, null, null, null)));
        }
    }
}
