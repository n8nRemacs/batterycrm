package com.avito.android.social;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.social.D;
import com.avito.android.social.I;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C36625b;
import com.google.android.gms.common.internal.C36695c;
import com.google.android.gms.common.internal.C36728u;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GoogleSocialManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/j;", "Lcom/avito/android/social/i;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35018j implements InterfaceC35017i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f284420a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.google.android.gms.auth.api.signin.c f284421b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f284422c;

    @Inject
    public C35018j(@Y61.k Context context) {
        this.f284420a = context;
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(GoogleSignInOptions.f348733m);
        aVar.f348750a.add(GoogleSignInOptions.f348734n);
        String string = context.getString(R.string.googleRequestIdToken);
        boolean z12 = true;
        aVar.f348753d = true;
        C36729v.f(string);
        String str = aVar.f348754e;
        if (str != null && !str.equals(string)) {
            z12 = false;
        }
        C36729v.a("two different server client ids provided", z12);
        aVar.f348754e = string;
        GoogleSignInOptions googleSignInOptionsA = aVar.a();
        C36616a<GoogleSignInOptions> c36616a = com.google.android.gms.auth.api.a.f348551a;
        h.a.C10621a c10621a = new h.a.C10621a();
        c10621a.f348933a = new C36625b();
        this.f284421b = new com.google.android.gms.auth.api.signin.c(context, c36616a, googleSignInOptionsA, c10621a.a());
    }

    @Override // com.avito.android.social.D
    public final void a() {
        this.f284422c = null;
        com.google.android.gms.auth.api.signin.c cVar = this.f284421b;
        C36728u.a(com.google.android.gms.auth.api.signin.internal.p.b(cVar.asGoogleApiClient(), cVar.getApplicationContext(), cVar.d() == 3));
    }

    @Override // com.avito.android.social.InterfaceC35017i
    public final boolean b() {
        return C36687f.f349287e.c(C36688g.f349288a, this.f284420a) == 0;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getF284422c() {
        return this.f284422c;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    public final String d() {
        return null;
    }

    @Override // com.avito.android.social.D
    public final void e(@Y61.k SocialActivity socialActivity, @Y61.l Y41.l lVar) throws Resources.NotFoundException {
        Intent intentA;
        C36687f c36687f = C36687f.f349287e;
        int iC2 = c36687f.c(C36688g.f349288a, socialActivity);
        if (iC2 != 0) {
            Intent intentB = c36687f.b(socialActivity, iC2, "n");
            c36687f.i(socialActivity, iC2, intentB != null ? PendingIntent.getActivity(socialActivity, 0, intentB, zzd.zza | 134217728) : null);
            ((J) lVar).invoke(D.b.C8495b.f284270a);
            return;
        }
        a();
        com.google.android.gms.auth.api.signin.c cVar = this.f284421b;
        Context applicationContext = cVar.getApplicationContext();
        int iD2 = cVar.d();
        int i12 = iD2 - 1;
        if (iD2 == 0) {
            throw null;
        }
        if (i12 == 2) {
            GoogleSignInOptions apiOptions = cVar.getApiOptions();
            com.google.android.gms.auth.api.signin.internal.p.f348791a.a("getFallbackSignInIntent()", new Object[0]);
            intentA = com.google.android.gms.auth.api.signin.internal.p.a(applicationContext, apiOptions);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        } else if (i12 != 3) {
            GoogleSignInOptions apiOptions2 = cVar.getApiOptions();
            com.google.android.gms.auth.api.signin.internal.p.f348791a.a("getNoImplementationSignInIntent()", new Object[0]);
            intentA = com.google.android.gms.auth.api.signin.internal.p.a(applicationContext, apiOptions2);
            intentA.setAction("com.google.android.gms.auth.NO_IMPL");
        } else {
            intentA = com.google.android.gms.auth.api.signin.internal.p.a(applicationContext, cVar.getApiOptions());
        }
        try {
            C35974x2.d(intentA);
            socialActivity.startActivityForResult(intentA, 1002);
        } catch (Exception e12) {
            V2.f318762a.f(e12);
        }
    }

    @Override // com.avito.android.social.D
    public final boolean g(int i12, int i13, @Y61.l Intent intent, @Y61.l Y41.l<? super D.b, G0> lVar) {
        com.google.android.gms.auth.api.signin.e eVar;
        D.b bVar;
        GoogleSignInAccount googleSignInAccount;
        if (i12 != 1002) {
            return false;
        }
        UX0.a aVar = com.google.android.gms.auth.api.signin.internal.p.f348791a;
        if (intent == null) {
            eVar = new com.google.android.gms.auth.api.signin.e(null, Status.f348902h);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status == null) {
                    status = Status.f348902h;
                }
                eVar = new com.google.android.gms.auth.api.signin.e(null, status);
            } else {
                eVar = new com.google.android.gms.auth.api.signin.e(googleSignInAccount2, Status.f348900f);
            }
        }
        Status status2 = eVar.f348763b;
        Task taskE = (!status2.h() || (googleSignInAccount = eVar.f348764c) == null) ? C37030m.e(C36695c.a(status2)) : C37030m.f(googleSignInAccount);
        if (taskE.r()) {
            Object objN = taskE.n();
            if (objN == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.f284422c = ((GoogleSignInAccount) objN).f348722d;
            bVar = D.b.c.f284271a;
        } else {
            bVar = taskE.p() ? D.b.a.f284269a : D.b.C8495b.f284270a;
        }
        ((I.a) lVar).invoke(bVar);
        return true;
    }

    @Override // com.avito.android.social.InterfaceC35021m
    @Y61.k
    public final SocialType getType() {
        return SocialType.f284279b;
    }
}
