package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class p extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f358629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f358630d;

    public p(s sVar, IBinder iBinder) {
        this.f358630d = sVar;
        this.f358629c = iBinder;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() throws RemoteException {
        f dVar;
        s sVar = this.f358630d;
        int i12 = e.f358620a;
        IBinder iBinder = this.f358629c;
        if (iBinder == null) {
            dVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            dVar = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinder);
        }
        t tVar = sVar.f358632b;
        tVar.f358646m = dVar;
        tVar.f358635b.a("linkToDeath", new Object[0]);
        try {
            tVar.f358646m.asBinder().linkToDeath(tVar.f358643j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            i iVar = tVar.f358635b;
            iVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                i.b(iVar.f358621a, "linkToDeath failed", objArr);
            }
        }
        tVar.f358640g = false;
        Iterator it = tVar.f358637d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        tVar.f358637d.clear();
    }
}
