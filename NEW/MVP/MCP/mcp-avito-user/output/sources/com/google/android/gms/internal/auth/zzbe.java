package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.b;
import com.google.android.gms.auth.api.c;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.K;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzbe extends AbstractC36709j {

    /* renamed from: I, reason: collision with root package name */
    public final Bundle f350013I;

    public zzbe(Context context, Looper looper, C36703g c36703g, c cVar, InterfaceC36637f interfaceC36637f, InterfaceC36664q interfaceC36664q) {
        super(context, looper, 16, c36703g, interfaceC36637f, interfaceC36664q);
        this.f350013I = cVar == null ? new Bundle() : new Bundle(cVar.f348593b);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Bundle f() {
        return this.f350013I;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String h() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String i() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final boolean requiresSignIn() {
        C36703g c36703g = this.f349441F;
        Account account = c36703g.f349424a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((K) c36703g.f349427d.get(b.f348590a)) == null) {
            return !c36703g.f349425b.isEmpty();
        }
        throw null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final boolean usesClientTelemetry() {
        return true;
    }
}
