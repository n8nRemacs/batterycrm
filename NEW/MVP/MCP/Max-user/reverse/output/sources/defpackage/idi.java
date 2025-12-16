package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class idi extends ds4 {
    public kme f;
    public final Object h;
    public Context i;
    public final /* synthetic */ int e = 1;
    public final ArrayList g = new ArrayList();

    public idi(q6b q6bVar, Context context) {
        this.h = q6bVar;
        this.i = context;
    }

    @Override // defpackage.ds4
    public final void l(kme kmeVar) {
        switch (this.e) {
            case 0:
                this.f = kmeVar;
                if (((y38) this.a) == null) {
                    try {
                        Context context = this.i;
                        synchronized (so8.class) {
                            so8.b(context);
                        }
                        kyi kyiVarY = vui.j(context).Y(new tqa(context));
                        if (kyiVarY == null) {
                            return;
                        }
                        this.f.c(new gdi((q6b) this.h, kyiVarY));
                        ArrayList arrayList = this.g;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((gdi) ((y38) this.a)).b((pva) it.next());
                        }
                        arrayList.clear();
                        return;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    } catch (GooglePlayServicesNotAvailableException unused) {
                        return;
                    }
                }
                return;
            default:
                this.f = kmeVar;
                x();
                return;
        }
    }

    public void x() {
        Activity activity = (Activity) this.i;
        if (activity == null || this.f == null || ((y38) this.a) != null) {
            return;
        }
        try {
            synchronized (so8.class) {
                so8.b(activity);
            }
            fwi fwiVarX = vui.j((Activity) this.i).X(new tqa((Activity) this.i));
            if (fwiVarX == null) {
                return;
            }
            this.f.c(new nei((SupportMapFragment) this.h, fwiVarX));
            ArrayList arrayList = this.g;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((nei) ((y38) this.a)).b((pva) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    public idi(SupportMapFragment supportMapFragment) {
        this.h = supportMapFragment;
    }
}
