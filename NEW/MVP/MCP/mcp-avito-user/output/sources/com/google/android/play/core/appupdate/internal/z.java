package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class z extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f358054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f358055d;

    public z(C c12, IBinder iBinder) {
        this.f358055d = c12;
        this.f358054c = iBinder;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() throws RemoteException {
        l jVar;
        C c12 = this.f358055d;
        int i12 = k.f358037a;
        IBinder iBinder = this.f358054c;
        if (iBinder == null) {
            jVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            jVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new j(iBinder);
        }
        D d12 = c12.f358016b;
        d12.f358030m = jVar;
        d12.f358019b.c("linkToDeath", new Object[0]);
        try {
            d12.f358030m.asBinder().linkToDeath(d12.f358027j, 0);
        } catch (RemoteException e12) {
            d12.f358019b.b(e12, "linkToDeath failed", new Object[0]);
        }
        d12.f358024g = false;
        Iterator it = d12.f358021d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        d12.f358021d.clear();
    }
}
