package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzed extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzcs f350685g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzdf f350686h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzdf zzdfVar, String str, zzcs zzcsVar) {
        super(true);
        this.f350684f = str;
        this.f350685g = zzcsVar;
        this.f350686h = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() {
        this.f350685g.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350686h.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.getMaxUserProperties(this.f350684f, this.f350685g);
    }
}
