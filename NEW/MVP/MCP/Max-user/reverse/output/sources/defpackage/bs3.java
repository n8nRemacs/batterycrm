package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class bs3 implements ur3 {
    public final Context a;
    public final ExecutorService b;
    public final y6i c;
    public final bwf d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final bwf h;
    public final bwf i;
    public volatile os3 j;
    public final CopyOnWriteArraySet k;
    public final as3 l;
    public final AtomicReference m;
    public final yr3 n;
    public final String o;

    public bs3(Context context, ExecutorService executorService, y6i y6iVar, bwf bwfVar) {
        this.a = context;
        this.b = executorService;
        this.c = y6iVar;
        this.d = bwfVar;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        final int i = 0;
        this.h = new bwf(new cm6(this) { // from class: xr3
            public final /* synthetic */ bs3 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (ConnectivityManager) this.b.a.getSystemService("connectivity");
                    default:
                        return (TelephonyManager) this.b.a.getSystemService("phone");
                }
            }
        });
        final int i2 = 1;
        this.i = new bwf(new cm6(this) { // from class: xr3
            public final /* synthetic */ bs3 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (ConnectivityManager) this.b.a.getSystemService("connectivity");
                    default:
                        return (TelephonyManager) this.b.a.getSystemService("phone");
                }
            }
        });
        this.j = os3.b;
        this.k = new CopyOnWriteArraySet();
        this.l = new as3(0, this);
        this.m = new AtomicReference(zr3.g);
        this.n = new yr3(0, y65.MILLISECONDS);
        this.o = bs3.class.getName();
        atomicBoolean.set(o(false));
        m();
    }

    public static os3 j(NetworkCapabilities networkCapabilities, NetworkInfo networkInfo) {
        int subtype;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                return os3.c;
            }
            if (!networkCapabilities.hasTransport(0) || networkInfo == null || ((subtype = networkInfo.getSubtype()) != 1 && subtype != 2 && subtype != 4 && subtype != 11 && subtype != 16)) {
                if (networkCapabilities.hasTransport(0)) {
                    int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
                    if (linkDownstreamBandwidthKbps > 1000) {
                        return linkDownstreamBandwidthKbps <= 23000 ? os3.o : os3.X;
                    }
                }
            }
            return os3.d;
        }
        return os3.b;
    }

    @Override // defpackage.ur3
    public final boolean a() {
        return k().getRestrictBackgroundStatus() != 3;
    }

    @Override // defpackage.ur3
    public final os3 b() {
        os3 os3Var = this.j;
        os3 os3VarJ = os3.b;
        if (os3Var != os3VarJ) {
            return this.j;
        }
        Network activeNetwork = k().getActiveNetwork();
        if (activeNetwork != null) {
            try {
                os3VarJ = j(k().getNetworkCapabilities(activeNetwork), l(null));
            } catch (SecurityException e) {
                n("failed getNetworkCapabilities", e);
            }
        }
        this.j = os3VarJ;
        return os3VarJ;
    }

    @Override // defpackage.ur3
    public final void c(tr3 tr3Var) {
        if (tr3Var != null) {
            this.k.add(tr3Var);
        }
    }

    @Override // defpackage.ur3
    public final boolean d() {
        zr3 zr3Var = (zr3) this.m.get();
        if (zr3Var != null && this.e.get()) {
            return zr3Var.f;
        }
        NetworkCapabilities networkCapabilitiesI = i(h());
        if (networkCapabilitiesI != null) {
            return networkCapabilitiesI.hasTransport(4);
        }
        return false;
    }

    @Override // defpackage.ur3
    public final void e(tr3 tr3Var) {
        if (tr3Var != null) {
            this.k.remove(tr3Var);
        }
    }

    @Override // defpackage.ur3
    public final boolean f() {
        if (this.e.get()) {
            return ((zr3) this.m.get()).a;
        }
        RuntimeException runtimeException = new RuntimeException() { // from class: one.me.net.connection.impl.internal.ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException
        };
        wqi.p(this.o, "default network callback is not registered yet", runtimeException);
        ((y3b) ((yi5) ((e28) this.d.getValue()).a.c(9))).a(runtimeException);
        NetworkInfo activeNetworkInfo = k().getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        String str = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("fallbackOnDeprecatedCheckOfConnection: isConnected = ", z), null);
            }
        }
        return z;
    }

    @Override // defpackage.ur3
    public final boolean g() {
        return ((TelephonyManager) this.i.getValue()).isNetworkRoaming();
    }

    public final Network h() {
        String str = this.o;
        try {
            Network activeNetwork = k().getActiveNetwork();
            if (activeNetwork != null) {
                return activeNetwork;
            }
            wqi.q(str, "Unable to get active network (background/blocked?)", new Object[0]);
            return null;
        } catch (Throwable th) {
            wqi.e(str, "Failed to get active network", th);
            return null;
        }
    }

    public final NetworkCapabilities i(Network network) {
        String str = this.o;
        try {
            NetworkCapabilities networkCapabilities = k().getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                return networkCapabilities;
            }
            wqi.q(str, "Unable to get network capabilities (background/blocked?)", new Object[0]);
            return null;
        } catch (Throwable th) {
            wqi.e(str, "Failed to get active network capabilities", th);
            return null;
        }
    }

    @Override // defpackage.ur3
    public final void invalidate() {
        String str = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "invalidate", null);
            }
        }
        m();
        this.e.set(o(true));
        if (this.e.get()) {
            return;
        }
        q(null, null);
    }

    public final ConnectivityManager k() {
        return (ConnectivityManager) this.h.getValue();
    }

    public final NetworkInfo l(Network network) {
        try {
            NetworkInfo networkInfo = network != null ? k().getNetworkInfo(network) : k().getActiveNetworkInfo();
            if (networkInfo == null) {
                String str = this.o;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.X;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "unable to get " + (network != null ? "" : "active ") + "network info", null);
                    }
                }
            }
            return networkInfo;
        } catch (Exception e) {
            wqi.e(this.o, "failed to get " + (network != null ? "" : "active ") + "network info", e);
            return null;
        }
    }

    public final void m() {
        boolean z = false;
        if (this.f.compareAndSet(false, true)) {
            String str = this.o;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "maybeRegisterBackRestrictionsChangesReceiver", null);
                }
            }
            AtomicBoolean atomicBoolean = this.f;
            try {
                Context context = this.a;
                eo eoVar = new eo(5, this);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
                z7.h(context, eoVar, intentFilter, null, 4);
                String str2 = this.o;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.o;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, str2, "maybeRegisterBackRestrictionsChangesReceiver, receiver successfully registered", null);
                    }
                }
                z = true;
            } catch (Throwable th) {
                wqi.e(this.o, "maybeRegisterBackRestrictionsChangesReceiver, failed to register receiver for background restrictions changes", th);
                if (this.g.compareAndSet(false, true)) {
                    ((y3b) ((yi5) ((e28) this.d.getValue()).a.c(9))).a(new RuntimeException(th) { // from class: one.me.net.connection.impl.internal.ConnectionInfoNougatImpl$RegisterBackRestrictionsChangesReceiverException
                    });
                }
            }
            atomicBoolean.set(z);
        }
    }

    public final void n(String str, Throwable th) {
        wqi.e(this.o, str, th);
        wqi.e("ConnectionInfo", str, th);
        ((vxf) ((w5) this.c.b).c(74)).d().a(null, th);
    }

    public final boolean o(boolean z) {
        String str = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "registerNetworkCallback", null);
            }
        }
        if (z) {
            try {
                k().unregisterNetworkCallback(this.l);
            } catch (Throwable th) {
                wqi.e(this.o, "registerNetworkCallback, unable to unregister default network callback", th);
            }
        }
        try {
            k().registerDefaultNetworkCallback(this.l);
            String str2 = this.o;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null) {
                lg8 lg8Var2 = lg8.o;
                if (l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, str2, "registerNetworkCallback, default network callback successfully registered", null);
                }
            }
            return true;
        } catch (Throwable th2) {
            n("Unable to register default network callback", th2);
            return false;
        }
    }

    public final void p(zr3 zr3Var) {
        if (fni.a((zr3) this.m.get(), zr3Var)) {
            wqi.c(this.o, "inet equals!", new Object[0]);
            return;
        }
        this.m.set(zr3Var);
        if (((zr3) this.m.get()).a) {
            String str = this.o;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.o;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "updateInet, " + zr3Var + " has working connection", null);
                }
            }
        } else {
            wqi.q(this.o, "updateInet, " + zr3Var + " has no working connection", new Object[0]);
        }
        this.b.execute(new vy1(22, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.net.Network r18, android.net.NetworkCapabilities r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs3.q(android.net.Network, android.net.NetworkCapabilities):void");
    }
}
