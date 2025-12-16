package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36703g;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class f extends C36616a.AbstractC10618a {
    @Override // com.google.android.gms.common.api.C36616a.AbstractC10618a
    public final /* synthetic */ C36616a.f buildClient(Context context, Looper looper, C36703g c36703g, @P Object obj, i.b bVar, i.c cVar) {
        return new com.google.android.gms.auth.api.signin.internal.h(context, looper, c36703g, (GoogleSignInOptions) obj, bVar, cVar);
    }

    @Override // com.google.android.gms.common.api.C36616a.e
    public final List getImpliedScopes(@P Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : new ArrayList(googleSignInOptions.f348740c);
    }
}
