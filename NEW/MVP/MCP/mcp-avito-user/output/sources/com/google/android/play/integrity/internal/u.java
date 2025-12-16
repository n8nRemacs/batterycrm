package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class u extends o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f358925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f358926d;

    public u(y yVar, IBinder iBinder) {
        this.f358926d = yVar;
        this.f358925c = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() throws RemoteException {
        k iVar;
        y yVar = this.f358926d;
        int i12 = j.f358916a;
        IBinder iBinder = this.f358925c;
        if (iBinder == null) {
            iVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            iVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new i(iBinder);
        }
        z zVar = yVar.f358928b;
        zVar.f358942m = iVar;
        zVar.f358931b.a("linkToDeath", new Object[0]);
        try {
            zVar.f358942m.asBinder().linkToDeath(zVar.f358939j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            n nVar = zVar.f358931b;
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                n.b(nVar.f358917a, "linkToDeath failed", objArr);
            }
        }
        zVar.f358936g = false;
        Iterator it = zVar.f358933d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zVar.f358933d.clear();
    }
}
