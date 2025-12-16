package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.remote.model.Navigation;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C36646i;
import com.google.android.gms.common.api.internal.C36681z;
import com.google.android.gms.common.internal.C36729v;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final UX0.a f348791a = new UX0.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f348791a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Navigation.CONFIG, signInConfiguration);
        intent.putExtra(Navigation.CONFIG, bundle);
        return intent;
    }

    public static BasePendingResult b(com.google.android.gms.common.api.i iVar, Context context, boolean z12) {
        f348791a.a("Signing out", new Object[0]);
        c(context);
        if (!z12) {
            return iVar.g(new l(iVar));
        }
        Status status = Status.f348900f;
        C36729v.k(status, "Result must not be null");
        C36681z c36681z = new C36681z(iVar);
        c36681z.setResult(status);
        return c36681z;
    }

    public static void c(Context context) {
        q.a(context).b();
        Set set = com.google.android.gms.common.api.i.f348935a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.i) it.next()).k();
        }
        C36646i.a();
    }
}
