package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hjd extends b69 implements ServiceConnection {
    public static final boolean A0 = Log.isLoggable("MediaRouteProviderProxy", 3);
    public final ComponentName s0;
    public final y1a t0;
    public final ArrayList u0;
    public boolean v0;
    public boolean w0;
    public cjd x0;
    public boolean y0;
    public xu9 z0;

    public hjd(Context context, ComponentName componentName) {
        super(context, new a3b(25, componentName));
        this.u0 = new ArrayList();
        this.s0 = componentName;
        this.t0 = new y1a();
    }

    @Override // defpackage.b69
    public final z59 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        c69 c69Var = this.Y;
        if (c69Var == null) {
            return null;
        }
        List list = c69Var.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((h59) list.get(i)).c().equals(str)) {
                fjd fjdVar = new fjd(this, str);
                this.u0.add(fjdVar);
                if (this.y0) {
                    fjdVar.b(this.x0);
                }
                o();
                return fjdVar;
            }
        }
        return null;
    }

    @Override // defpackage.b69
    public final a69 d(String str) {
        if (str != null) {
            return j(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // defpackage.b69
    public final a69 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return j(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // defpackage.b69
    public final void f(j59 j59Var) {
        if (this.y0) {
            cjd cjdVar = this.x0;
            int i = cjdVar.d;
            cjdVar.d = i + 1;
            cjdVar.b(10, i, 0, j59Var != null ? j59Var.a : null, null);
        }
        o();
    }

    public final void i() {
        if (this.w0) {
            return;
        }
        boolean z = A0;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.s0);
        try {
            boolean zBindService = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
            this.w0 = zBindService;
            if (zBindService || !z) {
                return;
            }
            Log.d("MediaRouteProviderProxy", this + ": Bind failed");
        } catch (SecurityException e) {
            if (z) {
                Log.d("MediaRouteProviderProxy", this + ": Bind failed", e);
            }
        }
    }

    public final gjd j(String str, String str2) {
        c69 c69Var = this.Y;
        if (c69Var == null) {
            return null;
        }
        List list = c69Var.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((h59) list.get(i)).c().equals(str)) {
                gjd gjdVar = new gjd(this, str, str2);
                this.u0.add(gjdVar);
                if (this.y0) {
                    gjdVar.b(this.x0);
                }
                o();
                return gjdVar;
            }
        }
        return null;
    }

    public final void k() {
        if (this.x0 != null) {
            g(null);
            this.y0 = false;
            ArrayList arrayList = this.u0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((djd) arrayList.get(i)).c();
            }
            cjd cjdVar = this.x0;
            cjdVar.b(2, 0, 0, null, null);
            cjdVar.b.b.clear();
            cjdVar.a.getBinder().unlinkToDeath(cjdVar, 0);
            cjdVar.i.t0.post(new bjd(cjdVar, 0));
            this.x0 = null;
        }
    }

    public final void l(cjd cjdVar, c69 c69Var) {
        if (this.x0 == cjdVar) {
            if (A0) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + c69Var);
            }
            g(c69Var);
        }
    }

    public final void m() {
        if (this.v0) {
            return;
        }
        if (A0) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.v0 = true;
        o();
    }

    public final void n() {
        if (this.w0) {
            if (A0) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.w0 = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void o() {
        if (!this.v0 || (this.o == null && this.u0.isEmpty())) {
            n();
        } else {
            i();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        boolean z = A0;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.w0) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        cjd cjdVar = new cjd(this, messenger);
                        int i = cjdVar.d;
                        cjdVar.d = i + 1;
                        cjdVar.g = i;
                        if (cjdVar.b(1, i, 4, null, null)) {
                            try {
                                cjdVar.a.getBinder().linkToDeath(cjdVar, 0);
                                this.x0 = cjdVar;
                                return;
                            } catch (RemoteException unused) {
                                cjdVar.binderDied();
                            }
                        }
                        if (z) {
                            Log.d("MediaRouteProviderProxy", this + ": Registration failed");
                            return;
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (A0) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        k();
    }

    public final String toString() {
        return "Service connection " + this.s0.flattenToShortString();
    }
}
