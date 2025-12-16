package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public class hp8 {
    public final ldi a;

    public hp8(ldi ldiVar) {
        this.a = ldiVar;
    }

    public final void a() {
        try {
            ddi ddiVar = (ddi) this.a;
            ddiVar.V(ddiVar.T(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b(xo0 xo0Var) {
        ldi ldiVar = this.a;
        try {
            if (xo0Var == null) {
                ddi ddiVar = (ddi) ldiVar;
                Parcel parcelT = ddiVar.T();
                mgi.d(parcelT, null);
                ddiVar.V(parcelT, 18);
                return;
            }
            kb7 kb7Var = xo0Var.a;
            ddi ddiVar2 = (ddi) ldiVar;
            Parcel parcelT2 = ddiVar2.T();
            mgi.d(parcelT2, kb7Var);
            ddiVar2.V(parcelT2, 18);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void c(Long l) {
        try {
            ldi ldiVar = this.a;
            tqa tqaVar = new tqa(l);
            ddi ddiVar = (ddi) ldiVar;
            Parcel parcelT = ddiVar.T();
            mgi.d(parcelT, tqaVar);
            ddiVar.V(parcelT, 29);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void d() {
        try {
            ddi ddiVar = (ddi) this.a;
            Parcel parcelT = ddiVar.T();
            int i = mgi.a;
            parcelT.writeInt(1);
            ddiVar.V(parcelT, 14);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hp8)) {
            return false;
        }
        try {
            ldi ldiVar = this.a;
            ldi ldiVar2 = ((hp8) obj).a;
            ddi ddiVar = (ddi) ldiVar;
            Parcel parcelT = ddiVar.T();
            mgi.d(parcelT, ldiVar2);
            Parcel parcelS = ddiVar.S(parcelT, 16);
            boolean z = parcelS.readInt() != 0;
            parcelS.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            ddi ddiVar = (ddi) this.a;
            Parcel parcelS = ddiVar.S(ddiVar.T(), 17);
            int i = parcelS.readInt();
            parcelS.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
