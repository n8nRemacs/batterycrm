package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
class n extends zzan {

    /* renamed from: a, reason: collision with root package name */
    public final p f348559a;

    public n(p pVar) {
        this.f348559a = pVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(Status status) {
        C37028k c37028k = this.f348559a.f348560d;
        int i12 = b.f348556k;
        c37028k.a(new AccountTransferException(status));
    }
}
