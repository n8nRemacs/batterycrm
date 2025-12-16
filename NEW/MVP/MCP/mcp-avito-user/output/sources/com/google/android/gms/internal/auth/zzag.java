package com.google.android.gms.internal.auth;

import RX0.a;
import android.accounts.Account;
import com.google.android.gms.auth.account.h;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.api.r;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzag extends C36634e.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Account f350000r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(C36616a c36616a, i iVar, Account account) {
        super(c36616a, iVar);
        this.f350000r = account;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        ((h) ((zzam) bVar).getService()).a4(new zzaf(this), this.f350000r);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final r createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a, com.google.android.gms.common.api.internal.C36634e.b
    @a
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzag) obj);
    }
}
