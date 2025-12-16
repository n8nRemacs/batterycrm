package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
public final class as3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ as3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                bs3 bs3Var = (bs3) this.b;
                wqi.c(bs3Var.o, "onAvailable", new Object[0]);
                bs3Var.p(zr3.a((zr3) bs3Var.m.get(), true, 60));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                bs3 bs3Var = (bs3) this.b;
                bs3Var.j = bs3.j(networkCapabilities, bs3Var.l(network));
                bs3 bs3Var2 = (bs3) this.b;
                String str = bs3Var2.o;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "onCapabilitiesChanged, current connection is " + bs3Var2.j + ", capabilities=" + networkCapabilities + ", net=" + network, null);
                    }
                }
                ((bs3) this.b).q(network, networkCapabilities);
                break;
            default:
                cei.g().c(iea.a, "Network capabilities changed: " + networkCapabilities);
                hea heaVar = (hea) this.b;
                heaVar.q(iea.a(heaVar.f));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                String str = ((bs3) this.b).o;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "onLost", null);
                    }
                }
                bs3 bs3Var = (bs3) this.b;
                bs3Var.p(zr3.a((zr3) bs3Var.m.get(), false, 62));
                break;
            default:
                cei.g().c(iea.a, "Network connection lost");
                hea heaVar = (hea) this.b;
                heaVar.q(iea.a(heaVar.f));
                break;
        }
    }
}
