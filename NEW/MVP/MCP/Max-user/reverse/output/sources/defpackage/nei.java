package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class nei implements y38 {
    public final a a;
    public final fwi b;

    public nei(SupportMapFragment supportMapFragment, fwi fwiVar) {
        this.b = fwiVar;
        s5j.g(supportMapFragment);
        this.a = supportMapFragment;
    }

    @Override // defpackage.y38
    public final void a() {
        try {
            fwi fwiVar = this.b;
            fwiVar.V(fwiVar.T(), 8);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b(pva pvaVar) {
        try {
            fwi fwiVar = this.b;
            bdi bdiVar = new bdi(pvaVar, 1);
            Parcel parcelT = fwiVar.T();
            mgi.d(parcelT, bdiVar);
            fwiVar.V(parcelT, 12);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void e() {
        try {
            fwi fwiVar = this.b;
            fwiVar.V(fwiVar.T(), 16);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void g() {
        try {
            fwi fwiVar = this.b;
            fwiVar.V(fwiVar.T(), 6);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void h(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            bhi.d(bundle2, bundle3);
            fwi fwiVar = this.b;
            tqa tqaVar = new tqa(activity);
            Parcel parcelT = fwiVar.T();
            mgi.d(parcelT, tqaVar);
            mgi.c(parcelT, googleMapOptions);
            mgi.c(parcelT, bundle3);
            fwiVar.V(parcelT, 2);
            bhi.d(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void i() {
        try {
            fwi fwiVar = this.b;
            fwiVar.V(fwiVar.T(), 5);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final View j(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bhi.d(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                fwi fwiVar = this.b;
                tqa tqaVar = new tqa(layoutInflater);
                tqa tqaVar2 = new tqa(viewGroup);
                Parcel parcelT = fwiVar.T();
                mgi.d(parcelT, tqaVar);
                mgi.d(parcelT, tqaVar2);
                mgi.c(parcelT, bundle2);
                Parcel parcelS = fwiVar.S(parcelT, 4);
                kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
                parcelS.recycle();
                StrictMode.setThreadPolicy(threadPolicy);
                bhi.d(bundle2, bundle);
                return (View) tqa.X(kb7VarW);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bhi.d(bundle, bundle2);
            fwi fwiVar = this.b;
            Parcel parcelT = fwiVar.T();
            mgi.c(parcelT, bundle2);
            Parcel parcelS = fwiVar.S(parcelT, 10);
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
        try {
            fwi fwiVar = this.b;
            fwiVar.V(fwiVar.T(), 7);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void m() {
        try {
            fwi fwiVar = this.b;
            fwiVar.V(fwiVar.T(), 15);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void n(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bhi.d(bundle, bundle2);
            Bundle bundle3 = this.a.X;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                bhi.e(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            fwi fwiVar = this.b;
            Parcel parcelT = fwiVar.T();
            mgi.c(parcelT, bundle2);
            fwiVar.V(parcelT, 3);
            bhi.d(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.y38
    public final void onLowMemory() {
        try {
            fwi fwiVar = this.b;
            fwiVar.V(fwiVar.T(), 9);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
