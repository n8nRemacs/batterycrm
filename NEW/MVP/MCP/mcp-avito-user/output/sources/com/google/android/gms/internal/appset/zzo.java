package com.google.android.gms.internal.appset;

import NX0.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
final class zzo extends zze {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349957a;

    public zzo(C37028k c37028k) {
        this.f349957a = c37028k;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, @P com.google.android.gms.appset.zzc zzcVar) {
        B.a(status, zzcVar != null ? new b(zzcVar.f348528b, zzcVar.f348529c) : null, this.f349957a);
    }
}
