package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdo extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Boolean f350651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzdf zzdfVar, Boolean bool) {
        super(true);
        this.f350651f = bool;
        this.f350652g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        if (this.f350651f != null) {
            zzcu zzcuVar = this.f350652g.f350620i;
            C36729v.j(zzcuVar);
            zzcuVar.setMeasurementEnabled(this.f350651f.booleanValue(), this.f350621b);
        } else {
            zzcu zzcuVar2 = this.f350652g.f350620i;
            C36729v.j(zzcuVar2);
            zzcuVar2.clearMeasurementEnabled(this.f350621b);
        }
    }
}
