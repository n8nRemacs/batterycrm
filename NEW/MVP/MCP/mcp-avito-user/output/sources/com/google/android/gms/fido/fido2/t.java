package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.internal.fido.zzl;
import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class t extends zzl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349888a;

    public t(C37028k c37028k) {
        this.f349888a = c37028k;
    }

    @Override // com.google.android.gms.internal.fido.zzm
    public final void zzb(Status status, @P PendingIntent pendingIntent) {
        B.a(status, pendingIntent, this.f349888a);
    }
}
