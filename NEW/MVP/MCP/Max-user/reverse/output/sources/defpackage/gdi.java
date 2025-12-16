package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class gdi implements y38 {
    public final ViewGroup a;
    public final kyi b;
    public View c;

    public gdi(q6b q6bVar, kyi kyiVar) {
        this.b = kyiVar;
        s5j.g(q6bVar);
        this.a = q6bVar;
    }

    @Override // defpackage.y38
    public final void a() {
        try {
            kyi kyiVar = this.b;
            kyiVar.V(kyiVar.T(), 5);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b(pva pvaVar) {
        try {
            kyi kyiVar = this.b;
            bdi bdiVar = new bdi(pvaVar, 0);
            Parcel parcelT = kyiVar.T();
            mgi.d(parcelT, bdiVar);
            kyiVar.V(parcelT, 9);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void e() {
        try {
            kyi kyiVar = this.b;
            kyiVar.V(kyiVar.T(), 13);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void g() {
        try {
            kyi kyiVar = this.b;
            kyiVar.V(kyiVar.T(), 4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void h(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // defpackage.y38
    public final void i() {
        try {
            kyi kyiVar = this.b;
            kyiVar.V(kyiVar.T(), 3);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final View j(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // defpackage.y38
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bhi.d(bundle, bundle2);
            kyi kyiVar = this.b;
            Parcel parcelT = kyiVar.T();
            mgi.c(parcelT, bundle2);
            Parcel parcelS = kyiVar.S(parcelT, 7);
            if (parcelS.readInt() != 0) {
                bundle2.readFromParcel(parcelS);
            }
            parcelS.recycle();
            bhi.d(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void l() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // defpackage.y38
    public final void m() {
        try {
            kyi kyiVar = this.b;
            kyiVar.V(kyiVar.T(), 12);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void n(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bhi.d(bundle, bundle2);
            kyi kyiVar = this.b;
            Parcel parcelT = kyiVar.T();
            mgi.c(parcelT, bundle2);
            kyiVar.V(parcelT, 2);
            bhi.d(bundle2, bundle);
            Parcel parcelS = kyiVar.S(kyiVar.T(), 8);
            kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
            parcelS.recycle();
            this.c = (View) tqa.X(kb7VarW);
            ViewGroup viewGroup = this.a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void onLowMemory() {
        try {
            kyi kyiVar = this.b;
            kyiVar.V(kyiVar.T(), 6);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
