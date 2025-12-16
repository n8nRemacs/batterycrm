package com.google.android.gms.internal.auth;

import RX0.a;
import com.google.android.gms.auth.api.b;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.api.r;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
abstract class zzbi extends C36634e.a {
    public zzbi(i iVar) {
        super(b.f348590a, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zzbeVar.getContext();
        d((zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ r createFailedResult(Status status) {
        return new zzbu(status);
    }

    public abstract void d(zzbh zzbhVar);

    @Override // com.google.android.gms.common.api.internal.C36634e.a, com.google.android.gms.common.api.internal.C36634e.b
    @a
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzbi) obj);
    }
}
