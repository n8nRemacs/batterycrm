package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class sli extends mci {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sli(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.mci
    public final void a(es3 es3Var) {
        w7c w7cVar = this.h.y0;
        if (w7cVar != null) {
            ((wv6) w7cVar.a).i(es3Var);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.mci
    public final boolean b() throws RemoteException {
        IBinder iBinder = this.g;
        try {
            s5j.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (!aVar.p().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.p() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceL = aVar.l(iBinder);
            if (iInterfaceL == null || !(a.u(aVar, 2, 4, iInterfaceL) || a.u(aVar, 3, 4, iInterfaceL))) {
                return false;
            }
            aVar.C0 = null;
            s6b s6bVar = aVar.x0;
            if (s6bVar == null) {
                return true;
            }
            ((vv6) s6bVar.a).onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
