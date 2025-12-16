package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.account.f;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.auth.account.h;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzam extends AbstractC36709j {
    public zzam(Context context, Looper looper, C36703g c36703g, i.b bVar, i.c cVar) {
        super(context, looper, 120, c36703g, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final IInterface e(IBinder iBinder) {
        int i12 = g.f348550a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.auth.h.f348799d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String h() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String i() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final boolean usesClientTelemetry() {
        return true;
    }
}
