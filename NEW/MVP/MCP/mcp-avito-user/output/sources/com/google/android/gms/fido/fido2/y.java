package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzf;
import com.google.android.gms.tasks.C37028k;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class y extends zzf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349893a;

    public y(C37028k c37028k) {
        this.f349893a = c37028k;
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzb(List list) {
        this.f349893a.b(list);
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzc(Status status) {
        this.f349893a.c(new ApiException(status));
    }
}
