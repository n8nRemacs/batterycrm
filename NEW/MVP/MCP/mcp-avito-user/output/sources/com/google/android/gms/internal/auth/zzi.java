package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.h;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC36709j;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzi extends AbstractC36709j {
    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final void disconnect(String str) {
        "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str));
        super.disconnect(str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @P
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Feature[] getApiFeatures() {
        return new Feature[]{h.f348798c, h.f348797b, h.f348796a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String h() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String i() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final boolean usesClientTelemetry() {
        return true;
    }
}
