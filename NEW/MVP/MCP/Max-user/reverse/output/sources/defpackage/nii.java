package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class nii extends uai {
    public a d;
    public final int e;

    public nii(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.d = aVar;
        this.e = i;
    }

    @Override // defpackage.uai
    public final boolean T(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) wgi.a(parcel, Bundle.CREATOR);
            wgi.b(parcel);
            s5j.h(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.d;
            int i3 = this.e;
            aVar.getClass();
            sli sliVar = new sli(aVar, i2, strongBinder, bundle);
            bfi bfiVar = aVar.o;
            bfiVar.sendMessage(bfiVar.obtainMessage(1, i3, -1, sliVar));
            this.d = null;
        } else if (i == 2) {
            parcel.readInt();
            wgi.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            cwi cwiVar = (cwi) wgi.a(parcel, cwi.CREATOR);
            wgi.b(parcel);
            a aVar2 = this.d;
            s5j.h(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            s5j.g(cwiVar);
            aVar2.E0 = cwiVar;
            if (aVar2.t()) {
                ls3 ls3Var = cwiVar.d;
                usd usdVarH = usd.h();
                vsd vsdVar = ls3Var == null ? null : ls3Var.a;
                synchronized (usdVarH) {
                    if (vsdVar == null) {
                        vsdVar = usd.d;
                    } else {
                        vsd vsdVar2 = (vsd) usdVarH.b;
                        if (vsdVar2 == null || vsdVar2.a < vsdVar.a) {
                        }
                    }
                    usdVarH.b = vsdVar;
                }
            }
            Bundle bundle2 = cwiVar.a;
            s5j.h(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.d;
            int i5 = this.e;
            aVar3.getClass();
            sli sliVar2 = new sli(aVar3, i4, strongBinder2, bundle2);
            bfi bfiVar2 = aVar3.o;
            bfiVar2.sendMessage(bfiVar2.obtainMessage(1, i5, -1, sliVar2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
