package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC36699e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class T1 extends AbstractC36699e<L1> {
    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof L1 ? (L1) iInterfaceQueryLocalInterface : new N1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @j.N
    public final String h() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @j.N
    public final String i() {
        return "com.google.android.gms.measurement.START";
    }
}
