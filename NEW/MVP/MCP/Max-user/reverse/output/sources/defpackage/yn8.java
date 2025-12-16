package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* loaded from: classes2.dex */
public final class yn8 implements un8 {
    public static final String m = un8.class.getName();
    public final iw6 a;
    public final do8 b;
    public final j0e c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final HashMap f = new HashMap();
    public qu1 g;
    public p5c h;
    public qu1 i;
    public long j;
    public qu1 k;
    public r93 l;

    public yn8(iw6 iw6Var, do8 do8Var, j0e j0eVar) {
        this.a = iw6Var;
        this.b = do8Var;
        this.c = j0eVar;
    }

    public final void a() {
        r93 r93Var = this.l;
        if (r93Var == null || r93Var == null) {
            return;
        }
        try {
            hyi hyiVar = (hyi) r93Var.a;
            hyiVar.V(hyiVar.T(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b() {
        c();
        p5c p5cVar = this.h;
        if (p5cVar == null) {
            return;
        }
        if (p5cVar != null) {
            try {
                aei aeiVar = (aei) p5cVar.a;
                aeiVar.V(aeiVar.T(), 1);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.h = null;
        this.j = 0L;
    }

    public final void c() {
        bwd.b(this.i);
        bwd.b(this.k);
        LinkedHashMap linkedHashMap = this.e;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((xn8) it.next()).b.a();
        }
        linkedHashMap.clear();
    }

    public final void d(double d, double d2, Float f, Float f2, Float f3) {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(d, d2), f.floatValue(), f2.floatValue(), f3.floatValue());
        try {
            xei xeiVar = yxi.a;
            s5j.h(xeiVar, "CameraUpdateFactory is not initialized");
            Parcel parcelT = xeiVar.T();
            mgi.c(parcelT, cameraPosition);
            Parcel parcelS = xeiVar.S(parcelT, 7);
            kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
            parcelS.recycle();
            e(new usd(kb7VarW), false);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void e(usd usdVar, boolean z) {
        iw6 iw6Var = this.a;
        if (!z) {
            iw6Var.g(usdVar);
            return;
        }
        try {
            pni pniVar = iw6Var.a;
            kb7 kb7Var = (kb7) usdVar.b;
            Parcel parcelT = pniVar.T();
            mgi.d(parcelT, kb7Var);
            parcelT.writeInt(UploadConfig.DEFAULT_MAX_EVENT_COUNT);
            parcelT.writeStrongBinder(null);
            pniVar.V(parcelT, 7);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void f(Context context, int i) {
        if (i == 0) {
            return;
        }
        eo8 eo8Var = (eo8) this.f.get(Integer.valueOf(i));
        if (eo8Var != null) {
            this.a.j(eo8Var);
            return;
        }
        bwd.b(this.g);
        u2f u2fVarI = new wk3(2, new ad0(context, i, 5)).m(this.c).i(de.a());
        qu1 qu1Var = new qu1(new ad0(this, i, 6), 2, new zb8(16));
        u2fVarI.k(qu1Var);
        this.g = qu1Var;
    }

    public final void g(Context context, boolean z) {
        boolean z2 = false;
        iw6 iw6Var = this.a;
        if (!z) {
            iw6Var.l(false);
            return;
        }
        int iB = z7.b(context, "android.permission.ACCESS_FINE_LOCATION");
        int iB2 = z7.b(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (iB == 0 && iB2 == 0) {
            z2 = true;
        }
        iw6Var.l(z2);
    }
}
