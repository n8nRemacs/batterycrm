package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzci extends zzl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350464a;

    public zzci(C37028k c37028k) {
        this.f350464a = c37028k;
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzb(int i12, String[] strArr) {
        if (i12 != 0 && (i12 < 1000 || i12 >= 1006)) {
            i12 = 13;
        }
        B.a(new Status(i12, null, null, null), null, this.f350464a);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzc(int i12, PendingIntent pendingIntent) {
        if (i12 != 0 && (i12 < 1000 || i12 >= 1006)) {
            i12 = 13;
        }
        B.a(new Status(i12, null, null, null), null, this.f350464a);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzd(int i12, String[] strArr) {
        if (i12 != 0 && (i12 < 1000 || i12 >= 1006)) {
            i12 = 13;
        }
        B.a(new Status(i12, null, null, null), null, this.f350464a);
    }
}
