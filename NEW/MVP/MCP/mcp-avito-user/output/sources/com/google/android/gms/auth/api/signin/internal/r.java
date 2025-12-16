package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C36625b;
import com.google.android.gms.common.internal.C36728u;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.p000authapi.zbb;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public abstract class r extends zbb implements s {
    public r() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResultG;
        com.google.android.gms.common.api.m mVarA;
        if (i12 == 1) {
            w wVar = (w) this;
            wVar.f4();
            RevocationBoundService revocationBoundService = wVar.f348794a;
            b bVarA = b.a(revocationBoundService);
            GoogleSignInAccount googleSignInAccountB = bVarA.b();
            GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.f348733m;
            if (googleSignInAccountB != null) {
                googleSignInOptionsC = bVarA.c();
            }
            C36729v.j(googleSignInOptionsC);
            C36616a<GoogleSignInOptions> c36616a = com.google.android.gms.auth.api.a.f348551a;
            h.a.C10621a c10621a = new h.a.C10621a();
            c10621a.f348933a = new C36625b();
            com.google.android.gms.auth.api.signin.c cVar = new com.google.android.gms.auth.api.signin.c(revocationBoundService, c36616a, googleSignInOptionsC, c10621a.a());
            if (googleSignInAccountB != null) {
                com.google.android.gms.common.api.i iVarAsGoogleApiClient = cVar.asGoogleApiClient();
                Context applicationContext = cVar.getApplicationContext();
                boolean z12 = cVar.d() == 3;
                p.f348791a.a("Revoking access", new Object[0]);
                String strE = b.a(applicationContext).e("refreshToken");
                p.c(applicationContext);
                if (z12) {
                    if (strE == null) {
                        UX0.a aVar = e.f348782d;
                        mVarA = com.google.android.gms.common.api.n.a(new Status(4, null, null, null));
                    } else {
                        e eVar = new e(strE);
                        new Thread(eVar).start();
                        mVarA = eVar.f348784c;
                    }
                    basePendingResultG = (BasePendingResult) mVarA;
                } else {
                    basePendingResultG = iVarAsGoogleApiClient.g(new n(iVarAsGoogleApiClient));
                }
                C36728u.a(basePendingResultG);
            } else {
                C36728u.a(p.b(cVar.asGoogleApiClient(), cVar.getApplicationContext(), cVar.d() == 3));
            }
        } else {
            if (i12 != 2) {
                return false;
            }
            w wVar2 = (w) this;
            wVar2.f4();
            q.a(wVar2.f348794a).b();
        }
        return true;
    }
}
