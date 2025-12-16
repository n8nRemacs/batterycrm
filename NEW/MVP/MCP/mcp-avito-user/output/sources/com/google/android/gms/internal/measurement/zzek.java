package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzek extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f350700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzdf zzdfVar, Bundle bundle) {
        super(true);
        this.f350700f = bundle;
        this.f350701g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350701g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.setDefaultEventParameters(this.f350700f);
    }
}
