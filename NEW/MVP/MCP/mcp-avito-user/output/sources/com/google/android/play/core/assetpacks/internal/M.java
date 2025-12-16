package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class M extends G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f358354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f358355d;

    public M(P p12, IBinder iBinder) {
        this.f358355d = p12;
        this.f358354c = iBinder;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() throws RemoteException {
        w uVar;
        P p12 = this.f358355d;
        int i12 = v.f358384a;
        IBinder iBinder = this.f358354c;
        if (iBinder == null) {
            uVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
            uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        }
        Q q12 = p12.f358357b;
        q12.f358371m = uVar;
        q12.f358360b.d("linkToDeath", new Object[0]);
        try {
            q12.f358371m.asBinder().linkToDeath(q12.f358368j, 0);
        } catch (RemoteException e12) {
            q12.f358360b.c(e12, "linkToDeath failed", new Object[0]);
        }
        q12.f358365g = false;
        Iterator it = q12.f358362d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        q12.f358362d.clear();
    }
}
