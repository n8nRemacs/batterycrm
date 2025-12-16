package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC36699e;
import j.InterfaceC42151g;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class x0 extends AbstractC36706h0 {

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final IBinder f349477g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC36699e f349478h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC42151g
    public x0(AbstractC36699e abstractC36699e, @j.P int i12, @j.P IBinder iBinder, Bundle bundle) {
        super(abstractC36699e, i12, bundle);
        this.f349478h = abstractC36699e;
        this.f349477g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36706h0
    public final void c(ConnectionResult connectionResult) {
        AbstractC36699e abstractC36699e = this.f349478h;
        AbstractC36699e.b bVar = abstractC36699e.f349419w;
        if (bVar != null) {
            bVar.onConnectionFailed(connectionResult);
        }
        abstractC36699e.f349401e = connectionResult.f348860c;
        abstractC36699e.f349402f = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.internal.AbstractC36706h0
    public final boolean d() throws RemoteException {
        IInterface iInterfaceE;
        IBinder iBinder = this.f349477g;
        try {
            C36729v.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC36699e abstractC36699e = this.f349478h;
            if (abstractC36699e.h().equals(interfaceDescriptor) && (iInterfaceE = abstractC36699e.e(iBinder)) != null && (AbstractC36699e.k(abstractC36699e, 2, 4, iInterfaceE) || AbstractC36699e.k(abstractC36699e, 3, 4, iInterfaceE))) {
                abstractC36699e.f349394A = null;
                Bundle connectionHint = abstractC36699e.getConnectionHint();
                AbstractC36699e.a aVar = abstractC36699e.f349418v;
                if (aVar == null) {
                    return true;
                }
                aVar.onConnected(connectionHint);
                return true;
            }
        } catch (RemoteException unused) {
        }
        return false;
    }
}
