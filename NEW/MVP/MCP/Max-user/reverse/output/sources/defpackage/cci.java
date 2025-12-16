package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class cci extends a {
    public final l3g I0;

    public cci(Context context, Looper looper, goh gohVar, l3g l3gVar, wai waiVar, wai waiVar2) {
        super(context, looper, 270, gohVar, waiVar, waiVar2, 0);
        this.I0 = l3gVar;
    }

    @Override // defpackage.fl
    public final int g() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof xbi ? (xbi) iInterfaceQueryLocalInterface : new xbi(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final qt5[] m() {
        return ioi.b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle n() {
        l3g l3gVar = this.I0;
        l3gVar.getClass();
        Bundle bundle = new Bundle();
        String str = l3gVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean r() {
        return true;
    }
}
