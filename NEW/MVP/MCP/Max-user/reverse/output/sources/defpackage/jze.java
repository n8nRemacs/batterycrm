package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class jze extends a implements fl {
    public final boolean I0;
    public final goh J0;
    public final Bundle K0;
    public final Integer L0;

    public jze(Context context, Looper looper, goh gohVar, Bundle bundle, vv6 vv6Var, wv6 wv6Var) {
        super(context, looper, 44, gohVar, vv6Var, wv6Var, 0);
        this.I0 = true;
        this.J0 = gohVar;
        this.K0 = bundle;
        this.L0 = (Integer) gohVar.f;
    }

    @Override // defpackage.fl
    public final int g() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fl
    public final boolean j() {
        return this.I0;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof rbi ? (rbi) iInterfaceQueryLocalInterface : new rbi(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle n() {
        goh gohVar = this.J0;
        boolean zEquals = this.c.getPackageName().equals((String) gohVar.a);
        Bundle bundle = this.K0;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) gohVar.a);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.signin.service.START";
    }
}
