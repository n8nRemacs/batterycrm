package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@j.k0
/* loaded from: classes6.dex */
public final class w0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final int f349472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC36699e f349473c;

    public w0(AbstractC36699e abstractC36699e, int i12) {
        this.f349473c = abstractC36699e;
        this.f349472b = i12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i12;
        int i13;
        AbstractC36699e abstractC36699e = this.f349473c;
        if (iBinder == null) {
            synchronized (abstractC36699e.f349410n) {
                i12 = abstractC36699e.f349417u;
            }
            if (i12 == 3) {
                abstractC36699e.f349395B = true;
                i13 = 5;
            } else {
                i13 = 4;
            }
            Handler handler = abstractC36699e.f349409m;
            handler.sendMessage(handler.obtainMessage(i13, abstractC36699e.f349397D.get(), 16));
            return;
        }
        synchronized (abstractC36699e.f349411o) {
            try {
                AbstractC36699e abstractC36699e2 = this.f349473c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC36699e2.f349412p = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC36723q)) ? new C36714l0(iBinder) : (InterfaceC36723q) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC36699e abstractC36699e3 = this.f349473c;
        int i14 = this.f349472b;
        abstractC36699e3.getClass();
        y0 y0Var = new y0(abstractC36699e3, 0);
        Handler handler2 = abstractC36699e3.f349409m;
        handler2.sendMessage(handler2.obtainMessage(7, i14, -1, y0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC36699e abstractC36699e;
        synchronized (this.f349473c.f349411o) {
            abstractC36699e = this.f349473c;
            abstractC36699e.f349412p = null;
        }
        int i12 = this.f349472b;
        Handler handler = abstractC36699e.f349409m;
        handler.sendMessage(handler.obtainMessage(6, i12, 1));
    }
}
