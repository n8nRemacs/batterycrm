package com.google.android.gms.internal.p000authapi;

import OX0.k;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbh extends AbstractC36709j {

    /* renamed from: I, reason: collision with root package name */
    public final Bundle f349989I;

    public zbh(Context context, Looper looper, k kVar, C36703g c36703g, InterfaceC36637f interfaceC36637f, InterfaceC36664q interfaceC36664q) {
        super(context, looper, 223, c36703g, interfaceC36637f, interfaceC36664q);
        this.f349989I = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @P
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof zbn ? (zbn) iInterfaceQueryLocalInterface : new zbn(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Bundle f() {
        return this.f349989I;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Feature[] getApiFeatures() {
        return zbas.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String h() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String i() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
