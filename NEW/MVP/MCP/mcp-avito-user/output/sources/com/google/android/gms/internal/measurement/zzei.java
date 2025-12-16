package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzei extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcs f350695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f350696g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzdf f350697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzdf zzdfVar, zzcs zzcsVar, int i12) {
        super(true);
        this.f350695f = zzcsVar;
        this.f350696g = i12;
        this.f350697h = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() {
        this.f350695f.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350697h.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.getTestFlag(this.f350695f, this.f350696g);
    }
}
