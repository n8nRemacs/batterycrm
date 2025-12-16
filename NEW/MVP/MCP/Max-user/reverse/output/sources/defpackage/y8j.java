package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y8j extends z1j {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ r6j c;

    public y8j(r6j r6jVar, IBinder iBinder) {
        this.c = r6jVar;
        this.b = iBinder;
    }

    @Override // defpackage.z1j
    public final void a() throws RemoteException {
        oli iiiVar;
        jcj jcjVar = (jcj) this.c.b;
        int i = fki.d;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            iiiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            iiiVar = iInterfaceQueryLocalInterface instanceof oli ? (oli) iInterfaceQueryLocalInterface : new iii(iBinder);
        }
        jcjVar.m = iiiVar;
        jcjVar.b.v("linkToDeath", new Object[0]);
        try {
            jcjVar.m.asBinder().linkToDeath(jcjVar.j, 0);
        } catch (RemoteException e) {
            ulc ulcVar = jcjVar.b;
            Object[] objArr = new Object[0];
            ulcVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ulc.w((String) ulcVar.b, "linkToDeath failed", objArr), e);
            }
        }
        jcjVar.g = false;
        Iterator it = jcjVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        jcjVar.d.clear();
    }
}
