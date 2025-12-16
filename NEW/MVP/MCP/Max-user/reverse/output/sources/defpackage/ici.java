package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Set;
import one.me.location.map.pick.PickLocationScreen;

/* loaded from: classes.dex */
public final class ici extends uai {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(nl nlVar) {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback", 6);
        this.e = nlVar;
    }

    @Override // defpackage.uai
    public final boolean T(int i, Parcel parcel, Parcel parcel2) throws SecurityException {
        Object ddiVar;
        cgi cgiVar;
        int i2 = this.d;
        Object obj = this.e;
        int i3 = 0;
        int i4 = 1;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ddiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    ddiVar = iInterfaceQueryLocalInterface instanceof ldi ? (ldi) iInterfaceQueryLocalInterface : new ddi(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 3);
                }
                mgi.b(parcel);
                s5j.g(ddiVar);
                dq4 dq4Var = (dq4) obj;
                yn8 yn8Var = (yn8) dq4Var.b;
                fba fbaVar = (fba) dq4Var.c;
                try {
                    ddi ddiVar2 = (ddi) ddiVar;
                    Parcel parcelS = ddiVar2.S(ddiVar2.T(), 30);
                    kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
                    parcelS.recycle();
                    Object objX = tqa.X(kb7VarW);
                    Long l = objX instanceof Long ? (Long) objX : null;
                    if (l != null) {
                        xn8 xn8Var = (xn8) yn8Var.d.get(l);
                        if (xn8Var != null) {
                            fbaVar.j(new ek0(xn8Var.a, i4));
                        } else {
                            xn8 xn8Var2 = (xn8) yn8Var.e.get(l);
                            if (xn8Var2 != null) {
                                fbaVar.j(new ek0(xn8Var2.a, i3));
                            }
                        }
                        i3 = 1;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            case 1:
                if (i != 1) {
                    return false;
                }
                q6b q6bVar = (q6b) ((hw6) obj);
                iw6 iw6Var = q6bVar.t0;
                if (iw6Var != null) {
                    pni pniVar = iw6Var.a;
                    try {
                        Parcel parcelS2 = pniVar.S(pniVar.T(), 26);
                        IBinder strongBinder2 = parcelS2.readStrongBinder();
                        if (strongBinder2 == null) {
                            cgiVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                            cgiVar = iInterfaceQueryLocalInterface2 instanceof cgi ? (cgi) iInterfaceQueryLocalInterface2 : new cgi(strongBinder2, "com.google.android.gms.maps.internal.IProjectionDelegate", 3);
                        }
                        parcelS2.recycle();
                        try {
                            Parcel parcelS3 = cgiVar.S(cgiVar.T(), 3);
                            xih xihVar = (xih) mgi.a(parcelS3, xih.CREATOR);
                            parcelS3.recycle();
                            LatLngBounds latLngBounds = xihVar.o;
                            sy6 sy6Var = q6bVar.o;
                            if (sy6Var != null) {
                                try {
                                    vaj vajVar = (vaj) sy6Var.a;
                                    vajVar.V(vajVar.T(), 1);
                                } catch (RemoteException e2) {
                                    throw new RuntimeRemoteException(e2);
                                }
                            }
                            try {
                                ici iciVar = new ici(new nl(q6bVar, iw6Var, latLngBounds, 18));
                                Parcel parcelT = pniVar.T();
                                mgi.d(parcelT, iciVar);
                                parcelT.writeStrongBinder(null);
                                pniVar.V(parcelT, 38);
                            } catch (RemoteException e3) {
                                throw new RuntimeRemoteException(e3);
                            }
                        } catch (RemoteException e4) {
                            throw new RuntimeRemoteException(e4);
                        }
                    } catch (RemoteException e5) {
                        throw new RuntimeRemoteException(e5);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 2:
                nl nlVar = (nl) obj;
                if (i == 1) {
                    Bitmap bitmap = (Bitmap) mgi.a(parcel, Bitmap.CREATOR);
                    mgi.b(parcel);
                    nlVar.j(bitmap);
                } else {
                    if (i != 2) {
                        return false;
                    }
                    kb7 kb7VarW2 = tqa.W(parcel.readStrongBinder());
                    mgi.b(parcel);
                    nlVar.j((Bitmap) tqa.X(kb7VarW2));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                parcel.readInt();
                mgi.b(parcel);
                gwb gwbVarA0 = ((PickLocationScreen) ((gw6) obj)).A0();
                svi.e(gwbVarA0.a, null, null, new dwb(gwbVarA0, null), 3);
                parcel2.writeNoException();
                return true;
            case 4:
                if (i != 1) {
                    return false;
                }
                ((fw6) obj).h0();
                parcel2.writeNoException();
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                mgi.b(parcel);
                for (laa laaVar : (Set) ((fba) obj).a) {
                }
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(dq4 dq4Var) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 6);
        this.e = dq4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(fw6 fw6Var) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 6);
        this.e = fw6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(gw6 gw6Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 6);
        this.e = gw6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(hw6 hw6Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 6);
        this.e = hw6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(fba fbaVar) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 6);
        this.e = fbaVar;
    }
}
