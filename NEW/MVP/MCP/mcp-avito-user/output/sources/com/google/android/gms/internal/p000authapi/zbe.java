package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.g;
import com.google.android.gms.auth.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbe extends AbstractC36709j {

    /* renamed from: I, reason: collision with root package name */
    public final h f349987I;

    public zbe(Context context, Looper looper, C36703g c36703g, h hVar, i.b bVar, i.c cVar) {
        super(context, looper, 68, c36703g, bVar, cVar);
        hVar = hVar == null ? h.f348596d : hVar;
        g gVar = new g();
        gVar.f348594a = Boolean.FALSE;
        h hVar2 = h.f348596d;
        hVar.getClass();
        gVar.f348594a = Boolean.valueOf(hVar.f348597b);
        gVar.f348595b = hVar.f348598c;
        gVar.f348595b = zbat.zba();
        this.f349987I = new h(gVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbf ? (zbf) iInterfaceQueryLocalInterface : new zbf(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Bundle f() {
        h hVar = this.f349987I;
        hVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", hVar.f348597b);
        bundle.putString("log_session_id", hVar.f348598c);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String h() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String i() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
