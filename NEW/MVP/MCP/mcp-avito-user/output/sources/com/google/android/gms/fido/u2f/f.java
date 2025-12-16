package com.google.android.gms.fido.u2f;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.internal.fido.zzt;
import com.google.android.gms.internal.fido.zzu;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class f extends zzu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349948a;

    public f(C37028k c37028k) {
        this.f349948a = c37028k;
    }

    @Override // com.google.android.gms.internal.fido.zzv
    public final void zzb(Status status, PendingIntent pendingIntent) {
        B.a(status, new zzt(pendingIntent), this.f349948a);
    }
}
