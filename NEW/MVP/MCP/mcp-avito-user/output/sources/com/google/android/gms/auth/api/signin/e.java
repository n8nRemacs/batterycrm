package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes6.dex */
public class e implements r {

    /* renamed from: b, reason: collision with root package name */
    public final Status f348763b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final GoogleSignInAccount f348764c;

    public e(@P GoogleSignInAccount googleSignInAccount, @N Status status) {
        this.f348764c = googleSignInAccount;
        this.f348763b = status;
    }

    @Override // com.google.android.gms.common.api.r
    @N
    public final Status getStatus() {
        return this.f348763b;
    }
}
