package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class yji extends a {
    public final z0f I0;
    public final z0f J0;
    public final z0f K0;

    public yji(Context context, Looper looper, goh gohVar, wai waiVar, wai waiVar2) {
        super(context, looper, 23, gohVar, waiVar, waiVar2, 0);
        this.I0 = new z0f(0);
        this.J0 = new z0f(0);
        this.K0 = new z0f(0);
    }

    @Override // defpackage.fl
    public final int g() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof y9j ? (y9j) iInterfaceQueryLocalInterface : new y9j(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final qt5[] m() {
        return ooi.a;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void s() {
        System.currentTimeMillis();
        synchronized (this.I0) {
            this.I0.clear();
        }
        synchronized (this.J0) {
            this.J0.clear();
        }
        synchronized (this.K0) {
            this.K0.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
