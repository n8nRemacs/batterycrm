package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzbn extends zzbd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350015a;

    public zzbn(C37028k c37028k) {
        this.f350015a = c37028k;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        B.a(str != null ? Status.f348900f : new Status(3006, null, null, null), str, this.f350015a);
    }
}
