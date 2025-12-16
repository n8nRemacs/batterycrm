package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzd;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class x extends zzd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349892a;

    public x(C37028k c37028k) {
        this.f349892a = c37028k;
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzb(boolean z12) {
        this.f349892a.b(Boolean.valueOf(z12));
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzc(Status status) {
        this.f349892a.c(new ApiException(status));
    }
}
