package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class pli extends uti {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pli(sri sriVar, n2g n2gVar, n2g n2gVar2) {
        super(n2gVar);
        this.c = n2gVar2;
        this.d = sriVar;
    }

    @Override // defpackage.uti
    public final void a() throws RemoteException {
        HashMap map;
        qli jiiVar = null;
        switch (this.b) {
            case 0:
                try {
                    sri sriVar = (sri) this.d;
                    qli qliVar = sriVar.a.m;
                    String str = sriVar.b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = zti.a;
                    synchronized (zti.class) {
                        map = zti.a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    sri sriVar2 = (sri) this.d;
                    n2g n2gVar = (n2g) this.c;
                    String str2 = sriVar2.b;
                    rpi rpiVar = new rpi(sriVar2, n2gVar);
                    jii jiiVar2 = (jii) qliVar;
                    jiiVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = rgi.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(rpiVar);
                    try {
                        jiiVar2.c.transact(2, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    sri sriVar3 = (sri) this.d;
                    hx5 hx5Var = sri.c;
                    Object[] objArr = {sriVar3.b};
                    hx5Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", hx5.c(hx5Var.a, "error requesting in-app review for %s", objArr), e);
                    }
                    ((n2g) this.c).c(new RuntimeException(e));
                    return;
                }
            default:
                z8j z8jVar = (z8j) ((r6j) this.d).b;
                IBinder iBinder = (IBinder) this.c;
                int i2 = zji.d;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    jiiVar = iInterfaceQueryLocalInterface instanceof qli ? (qli) iInterfaceQueryLocalInterface : new jii(iBinder);
                }
                z8jVar.m = jiiVar;
                hx5 hx5Var2 = z8jVar.b;
                hx5Var2.a("linkToDeath", new Object[0]);
                try {
                    z8jVar.m.asBinder().linkToDeath(z8jVar.j, 0);
                } catch (RemoteException e2) {
                    Object[] objArr2 = new Object[0];
                    hx5Var2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", hx5.c(hx5Var2.a, "linkToDeath failed", objArr2), e2);
                    }
                }
                z8jVar.g = false;
                Iterator it = z8jVar.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                z8jVar.d.clear();
                return;
        }
    }

    public pli(r6j r6jVar, IBinder iBinder) {
        this.c = iBinder;
        this.d = r6jVar;
    }
}
