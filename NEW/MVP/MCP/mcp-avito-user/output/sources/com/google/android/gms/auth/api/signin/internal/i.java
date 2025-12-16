package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class i extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f348788a;

    public i(j jVar) {
        this.f348788a = jVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.d, com.google.android.gms.auth.api.signin.internal.u
    public final void d3(GoogleSignInAccount googleSignInAccount, Status status) {
        j jVar = this.f348788a;
        if (googleSignInAccount != null) {
            jVar.getClass();
            q qVarA = q.a(null);
            synchronized (qVarA) {
                qVarA.f348793a.d(googleSignInAccount, null);
            }
        }
        jVar.setResult((j) new com.google.android.gms.auth.api.signin.e(googleSignInAccount, status));
    }
}
