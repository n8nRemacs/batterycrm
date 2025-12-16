package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.location.C36789j;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcq extends zzr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350478a;

    public zzcq(C37028k c37028k) {
        this.f350478a = c37028k;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        Status status = locationSettingsResult.f354255b;
        C36789j c36789j = new C36789j();
        c36789j.f349259b = locationSettingsResult;
        B.a(status, c36789j, this.f350478a);
    }
}
