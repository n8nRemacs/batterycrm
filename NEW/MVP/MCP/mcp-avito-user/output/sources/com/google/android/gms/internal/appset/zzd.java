package com.google.android.gms.internal.appset;

import NX0.f;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC36709j;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
public final class zzd extends AbstractC36709j<zzg> {
    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @P
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof zzg ? (zzg) iInterfaceQueryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Feature[] getApiFeatures() {
        return f.f11540b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String h() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String i() {
        return "com.google.android.gms.appset.service.START";
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
