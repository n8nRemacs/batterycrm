package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.internal.p000authapi.zbat;
import j.P;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class h extends AbstractC36709j {

    /* renamed from: I, reason: collision with root package name */
    public final GoogleSignInOptions f348787I;

    public h(Context context, Looper looper, C36703g c36703g, @P GoogleSignInOptions googleSignInOptions, i.b bVar, i.c cVar) {
        super(context, looper, 91, c36703g, bVar, cVar);
        GoogleSignInOptions.a aVar = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar.f348758i = zbat.zba();
        Set<Scope> set = c36703g.f349426c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f348750a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f348787I = aVar.a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof v ? (v) iInterfaceQueryLocalInterface : new v(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final Intent getSignInIntent() {
        return p.a(getContext(), this.f348787I);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String h() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String i() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final boolean providesSignIn() {
        return true;
    }
}
