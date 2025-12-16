package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.aki;
import defpackage.bfi;
import defpackage.bu6;
import defpackage.cwi;
import defpackage.es3;
import defpackage.fl;
import defpackage.goh;
import defpackage.h3j;
import defpackage.hci;
import defpackage.lm9;
import defpackage.mci;
import defpackage.nii;
import defpackage.oni;
import defpackage.p7j;
import defpackage.qt5;
import defpackage.rci;
import defpackage.s5j;
import defpackage.s6b;
import defpackage.sa7;
import defpackage.sli;
import defpackage.thg;
import defpackage.tv6;
import defpackage.uj0;
import defpackage.uv6;
import defpackage.vv6;
import defpackage.w7c;
import defpackage.wai;
import defpackage.wv6;
import defpackage.znd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements fl {
    public static final qt5[] H0 = new qt5[0];
    public final String A0;
    public volatile String B0;
    public es3 C0;
    public boolean D0;
    public volatile cwi E0;
    public final AtomicInteger F0;
    public final Set G0;
    public final Object X;
    public final Object Y;
    public rci Z;
    public volatile String a;
    public lm9 b;
    public final Context c;
    public final p7j d;
    public final bfi o;
    public uj0 s0;
    public IInterface t0;
    public final ArrayList u0;
    public aki v0;
    public int w0;
    public final s6b x0;
    public final w7c y0;
    public final int z0;

    public a(Context context, Looper looper, int i, goh gohVar, vv6 vv6Var, wv6 wv6Var, int i2) {
        synchronized (p7j.g) {
            try {
                if (p7j.h == null) {
                    p7j.h = new p7j(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p7j p7jVar = p7j.h;
        Object obj = tv6.c;
        s5j.g(vv6Var);
        s5j.g(wv6Var);
        s6b s6bVar = new s6b(vv6Var);
        w7c w7cVar = new w7c(wv6Var);
        String str = (String) gohVar.d;
        this.a = null;
        this.X = new Object();
        this.Y = new Object();
        this.u0 = new ArrayList();
        this.w0 = 1;
        this.C0 = null;
        this.D0 = false;
        this.E0 = null;
        this.F0 = new AtomicInteger(0);
        s5j.h(context, "Context must not be null");
        this.c = context;
        s5j.h(looper, "Looper must not be null");
        s5j.h(p7jVar, "Supervisor must not be null");
        this.d = p7jVar;
        this.o = new bfi(this, looper);
        this.z0 = i;
        this.x0 = s6bVar;
        this.y0 = w7cVar;
        this.A0 = str;
        Set set = (Set) gohVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.G0 = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.X) {
            try {
                if (aVar.w0 != i) {
                    return false;
                }
                aVar.v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fl
    public final Set a() {
        return j() ? this.G0 : Collections.EMPTY_SET;
    }

    @Override // defpackage.fl
    public final void b(String str) {
        this.a = str;
        disconnect();
    }

    @Override // defpackage.fl
    public final boolean c() {
        boolean z;
        synchronized (this.X) {
            int i = this.w0;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fl
    public final void d() {
        if (!isConnected() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // defpackage.fl
    public final void disconnect() {
        this.F0.incrementAndGet();
        synchronized (this.u0) {
            try {
                int size = this.u0.size();
                for (int i = 0; i < size; i++) {
                    mci mciVar = (mci) this.u0.get(i);
                    synchronized (mciVar) {
                        mciVar.a = null;
                    }
                }
                this.u0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.Y) {
            this.Z = null;
        }
        v(1, null);
    }

    @Override // defpackage.fl
    public final void e(znd zndVar) {
        ((wai) zndVar.a).o.w0.post(new thg(9, zndVar));
    }

    @Override // defpackage.fl
    public final void f(uj0 uj0Var) {
        this.s0 = uj0Var;
        v(2, null);
    }

    @Override // defpackage.fl
    public final qt5[] h() {
        cwi cwiVar = this.E0;
        if (cwiVar == null) {
            return null;
        }
        return cwiVar.b;
    }

    @Override // defpackage.fl
    public final String i() {
        return this.a;
    }

    @Override // defpackage.fl
    public final boolean isConnected() {
        boolean z;
        synchronized (this.X) {
            z = this.w0 == 4;
        }
        return z;
    }

    @Override // defpackage.fl
    public boolean j() {
        return false;
    }

    @Override // defpackage.fl
    public final void k(sa7 sa7Var, Set set) {
        Bundle bundleN = n();
        String str = this.B0;
        int i = uv6.a;
        Scope[] scopeArr = bu6.y0;
        Bundle bundle = new Bundle();
        int i2 = this.z0;
        qt5[] qt5VarArr = bu6.z0;
        bu6 bu6Var = new bu6(6, i2, i, null, null, scopeArr, bundle, null, qt5VarArr, qt5VarArr, true, 0, false, str);
        bu6Var.d = this.c.getPackageName();
        bu6Var.Y = bundleN;
        if (set != null) {
            bu6Var.X = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            bu6Var.Z = new Account("<<default account>>", "com.google");
            if (sa7Var != null) {
                bu6Var.o = sa7Var.asBinder();
            }
        }
        bu6Var.s0 = H0;
        bu6Var.t0 = m();
        if (t()) {
            bu6Var.w0 = true;
        }
        try {
            synchronized (this.Y) {
                try {
                    rci rciVar = this.Z;
                    if (rciVar != null) {
                        rciVar.i(new nii(this, this.F0.get()), bu6Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.F0.get();
            bfi bfiVar = this.o;
            bfiVar.sendMessage(bfiVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.F0.get();
            sli sliVar = new sli(this, 8, null, null);
            bfi bfiVar2 = this.o;
            bfiVar2.sendMessage(bfiVar2.obtainMessage(1, i4, -1, sliVar));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.F0.get();
            sli sliVar2 = new sli(this, 8, null, null);
            bfi bfiVar22 = this.o;
            bfiVar22.sendMessage(bfiVar22.obtainMessage(1, i42, -1, sliVar2));
        }
    }

    public abstract IInterface l(IBinder iBinder);

    public qt5[] m() {
        return H0;
    }

    public Bundle n() {
        return new Bundle();
    }

    public final IInterface o() {
        IInterface iInterface;
        synchronized (this.X) {
            try {
                if (this.w0 == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.t0;
                s5j.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String p();

    public abstract String q();

    public boolean r() {
        return g() >= 211700000;
    }

    public void s() {
        System.currentTimeMillis();
    }

    public boolean t() {
        return this instanceof hci;
    }

    public final void v(int i, IInterface iInterface) {
        lm9 lm9Var;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.X) {
            try {
                this.w0 = i;
                this.t0 = iInterface;
                if (i == 1) {
                    aki akiVar = this.v0;
                    if (akiVar != null) {
                        p7j p7jVar = this.d;
                        String str = this.b.c;
                        s5j.g(str);
                        this.b.getClass();
                        if (this.A0 == null) {
                            this.c.getClass();
                        }
                        p7jVar.a(str, akiVar, this.b.b);
                        this.v0 = null;
                    }
                } else if (i == 2 || i == 3) {
                    aki akiVar2 = this.v0;
                    if (akiVar2 != null && (lm9Var = this.b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + lm9Var.c + " on com.google.android.gms");
                        p7j p7jVar2 = this.d;
                        String str2 = this.b.c;
                        s5j.g(str2);
                        this.b.getClass();
                        if (this.A0 == null) {
                            this.c.getClass();
                        }
                        p7jVar2.a(str2, akiVar2, this.b.b);
                        this.F0.incrementAndGet();
                    }
                    aki akiVar3 = new aki(this, this.F0.get());
                    this.v0 = akiVar3;
                    String strQ = q();
                    boolean zR = r();
                    this.b = new lm9(strQ, zR, 2);
                    if (zR && g() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.c)));
                    }
                    p7j p7jVar3 = this.d;
                    String str3 = this.b.c;
                    s5j.g(str3);
                    this.b.getClass();
                    String name = this.A0;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    if (!p7jVar3.b(new h3j(str3, this.b.b), akiVar3, name)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.b.c + " on com.google.android.gms");
                        int i2 = this.F0.get();
                        oni oniVar = new oni(this, 16);
                        bfi bfiVar = this.o;
                        bfiVar.sendMessage(bfiVar.obtainMessage(7, i2, -1, oniVar));
                    }
                } else if (i == 4) {
                    s5j.g(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
