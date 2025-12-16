package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.b;
import com.google.android.gms.common.api.Status;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzai implements b.a {

    /* renamed from: d, reason: collision with root package name */
    public static final Account f350001d = new Account("DUMMY_NAME", "com.google");

    /* renamed from: b, reason: collision with root package name */
    public final Status f350002b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f350003c;

    public zzai(Status status, @P Account account) {
        this.f350002b = status;
        this.f350003c = account == null ? f350001d : account;
    }

    public final Account getAccount() {
        return this.f350003c;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f350002b;
    }
}
