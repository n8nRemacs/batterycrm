package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class aki implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public aki(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.X) {
                i = aVar.w0;
            }
            if (i == 3) {
                aVar.D0 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            bfi bfiVar = aVar.o;
            bfiVar.sendMessage(bfiVar.obtainMessage(i2, aVar.F0.get(), 16));
            return;
        }
        synchronized (aVar.Y) {
            try {
                a aVar2 = this.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.Z = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof rci)) ? new rci(iBinder) : (rci) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar3 = this.b;
        int i3 = this.a;
        oni oniVar = new oni(aVar3, 0);
        bfi bfiVar2 = aVar3.o;
        bfiVar2.sendMessage(bfiVar2.obtainMessage(7, i3, -1, oniVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.b.Y) {
            aVar = this.b;
            aVar.Z = null;
        }
        int i = this.a;
        bfi bfiVar = aVar.o;
        bfiVar.sendMessage(bfiVar.obtainMessage(6, i, 1));
    }
}
