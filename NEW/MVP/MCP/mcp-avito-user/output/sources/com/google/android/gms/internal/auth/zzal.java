package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.a;
import com.google.android.gms.auth.account.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.r;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzal implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final Status f350006a = new Status(13, null, null, null);

    public final m<b.a> addWorkAccount(i iVar, String str) {
        return iVar.g(new zzae(a.f348549a, iVar, str));
    }

    public final m<r> removeWorkAccount(i iVar, Account account) {
        return iVar.g(new zzag(a.f348549a, iVar, account));
    }

    public final void setWorkAuthenticatorEnabled(i iVar, boolean z12) {
        setWorkAuthenticatorEnabledWithResult(iVar, z12);
    }

    public final m<r> setWorkAuthenticatorEnabledWithResult(i iVar, boolean z12) {
        return iVar.g(new zzac(a.f348549a, iVar, z12));
    }
}
