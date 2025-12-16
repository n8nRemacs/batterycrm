package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcm extends zzp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350471a;

    public zzcm(C37028k c37028k) {
        this.f350471a = c37028k;
    }

    @Override // com.google.android.gms.internal.location.zzq
    public final void zzb(Status status, Location location) {
        B.a(status, location, this.f350471a);
    }
}
