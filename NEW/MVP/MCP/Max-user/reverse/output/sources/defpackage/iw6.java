package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import one.me.location.map.pick.PickLocationScreen;

/* loaded from: classes.dex */
public final class iw6 {
    public final pni a;
    public ulc b;

    public iw6(pni pniVar) {
        new HashMap();
        new HashMap();
        s5j.g(pniVar);
        this.a = pniVar;
    }

    public final hp8 a(mp8 mp8Var) {
        ldi ddiVar;
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            mgi.c(parcelT, mp8Var);
            Parcel parcelS = pniVar.S(parcelT, 11);
            IBinder strongBinder = parcelS.readStrongBinder();
            int i = kdi.d;
            if (strongBinder == null) {
                ddiVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                ddiVar = iInterfaceQueryLocalInterface instanceof ldi ? (ldi) iInterfaceQueryLocalInterface : new ddi(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 3);
            }
            parcelS.recycle();
            if (ddiVar != null) {
                return mp8Var.A0 == 1 ? new gc(ddiVar) : new hp8(ddiVar);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final n8g b(o8g o8gVar) {
        qei keiVar;
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            mgi.c(parcelT, o8gVar);
            Parcel parcelS = pniVar.S(parcelT, 13);
            IBinder strongBinder = parcelS.readStrongBinder();
            int i = oei.d;
            if (strongBinder == null) {
                keiVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                keiVar = iInterfaceQueryLocalInterface instanceof qei ? (qei) iInterfaceQueryLocalInterface : new kei(strongBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate", 3);
            }
            parcelS.recycle();
            if (keiVar != null) {
                return new n8g(keiVar);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void c(usd usdVar) {
        try {
            pni pniVar = this.a;
            kb7 kb7Var = (kb7) usdVar.b;
            Parcel parcelT = pniVar.T();
            mgi.d(parcelT, kb7Var);
            pniVar.V(parcelT, 5);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition d() {
        try {
            pni pniVar = this.a;
            Parcel parcelS = pniVar.S(pniVar.T(), 1);
            CameraPosition cameraPosition = (CameraPosition) mgi.a(parcelS, CameraPosition.CREATOR);
            parcelS.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int e() {
        try {
            pni pniVar = this.a;
            Parcel parcelS = pniVar.S(pniVar.T(), 15);
            int i = parcelS.readInt();
            parcelS.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final ulc f() {
        zgi zgiVar;
        try {
            if (this.b == null) {
                pni pniVar = this.a;
                Parcel parcelS = pniVar.S(pniVar.T(), 25);
                IBinder strongBinder = parcelS.readStrongBinder();
                if (strongBinder == null) {
                    zgiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    zgiVar = iInterfaceQueryLocalInterface instanceof zgi ? (zgi) iInterfaceQueryLocalInterface : new zgi(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 3);
                }
                parcelS.recycle();
                this.b = new ulc(10, zgiVar);
            }
            return this.b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void g(usd usdVar) {
        try {
            pni pniVar = this.a;
            kb7 kb7Var = (kb7) usdVar.b;
            Parcel parcelT = pniVar.T();
            mgi.d(parcelT, kb7Var);
            pniVar.V(parcelT, 4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void h() {
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            int i = mgi.a;
            parcelT.writeInt(0);
            pniVar.V(parcelT, 41);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void i() {
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            int i = mgi.a;
            parcelT.writeInt(0);
            Parcel parcelS = pniVar.S(parcelT, 20);
            parcelS.readInt();
            parcelS.recycle();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void j(eo8 eo8Var) {
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            mgi.c(parcelT, eo8Var);
            Parcel parcelS = pniVar.S(parcelT, 91);
            parcelS.readInt();
            parcelS.recycle();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void k(int i) {
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            parcelT.writeInt(i);
            pniVar.V(parcelT, 16);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void l(boolean z) {
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            int i = mgi.a;
            parcelT.writeInt(z ? 1 : 0);
            pniVar.V(parcelT, 22);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void m(fw6 fw6Var) {
        pni pniVar = this.a;
        try {
            if (fw6Var == null) {
                Parcel parcelT = pniVar.T();
                mgi.d(parcelT, null);
                pniVar.V(parcelT, 99);
            } else {
                ici iciVar = new ici(fw6Var);
                Parcel parcelT2 = pniVar.T();
                mgi.d(parcelT2, iciVar);
                pniVar.V(parcelT2, 99);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void n(PickLocationScreen pickLocationScreen) {
        pni pniVar = this.a;
        try {
            if (pickLocationScreen == null) {
                Parcel parcelT = pniVar.T();
                mgi.d(parcelT, null);
                pniVar.V(parcelT, 96);
            } else {
                ici iciVar = new ici((gw6) pickLocationScreen);
                Parcel parcelT2 = pniVar.T();
                mgi.d(parcelT2, iciVar);
                pniVar.V(parcelT2, 96);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void o(hw6 hw6Var) {
        pni pniVar = this.a;
        try {
            ici iciVar = new ici(hw6Var);
            Parcel parcelT = pniVar.T();
            mgi.d(parcelT, iciVar);
            pniVar.V(parcelT, 42);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void p() {
        try {
            pni pniVar = this.a;
            Parcel parcelT = pniVar.T();
            int i = mgi.a;
            parcelT.writeInt(0);
            pniVar.V(parcelT, 18);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
