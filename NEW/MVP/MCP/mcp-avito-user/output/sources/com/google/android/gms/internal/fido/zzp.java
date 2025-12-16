package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import cY0.C27129c;
import com.avito.android.actions_sheet.a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;
import j.N;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzp extends AbstractC36709j {
    public zzp(Context context, Looper looper, C36703g c36703g, i.b bVar, i.c cVar) {
        super(context, looper, 148, c36703g, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof zzs ? (zzs) iInterfaceQueryLocalInterface : new zzs(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Bundle f() {
        return a.m("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Feature[] getApiFeatures() {
        return new Feature[]{C27129c.f57926b, C27129c.f57925a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String h() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String i() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final boolean usesClientTelemetry() {
        return true;
    }
}
