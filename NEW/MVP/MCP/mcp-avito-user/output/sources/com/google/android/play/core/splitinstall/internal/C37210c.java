package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37210c extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f358747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC37213f f358748d;

    public C37210c(ServiceConnectionC37213f serviceConnectionC37213f, IBinder iBinder) {
        this.f358748d = serviceConnectionC37213f;
        this.f358747c = iBinder;
    }

    @Override // com.google.android.play.core.splitinstall.internal.t0
    public final void a() throws RemoteException {
        N l12;
        ServiceConnectionC37213f serviceConnectionC37213f = this.f358748d;
        int i12 = M.f358737a;
        IBinder iBinder = this.f358747c;
        if (iBinder == null) {
            l12 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            l12 = iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new L(iBinder);
        }
        C37214g c37214g = serviceConnectionC37213f.f358756b;
        c37214g.f358771m = l12;
        c37214g.f358760b.d("linkToDeath", new Object[0]);
        try {
            c37214g.f358771m.asBinder().linkToDeath(c37214g.f358768j, 0);
        } catch (RemoteException e12) {
            c37214g.f358760b.c(e12, "linkToDeath failed", new Object[0]);
        }
        c37214g.f358765g = false;
        Iterator it = c37214g.f358762d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c37214g.f358762d.clear();
    }
}
