package com.google.firebase.dynamiclinks.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.firebase.dynamiclinks.internal.h;
import j.N;
import j.P;

/* compiled from: DynamicLinksClient.java */
/* loaded from: classes5.dex */
public class d extends AbstractC36709j<h> {
    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @P
    public final IInterface e(IBinder iBinder) {
        int i12 = h.b.f361540a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof h)) {
            return (h) iInterfaceQueryLocalInterface;
        }
        h.b.a aVar = new h.b.a();
        aVar.f361541a = iBinder;
        return aVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String h() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String i() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final boolean usesClientTelemetry() {
        return true;
    }
}
