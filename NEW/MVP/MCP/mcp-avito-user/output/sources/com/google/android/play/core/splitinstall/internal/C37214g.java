package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37214g {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f358758n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f358759a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f358760b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f358765g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f358766h;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public ServiceConnection f358770l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public N f358771m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f358762d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public final HashSet f358763e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f358764f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final v0 f358768j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.v0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C37214g c37214g = this.f358801a;
            c37214g.f358760b.d("reportBinderDeath", new Object[0]);
            InterfaceC37209b interfaceC37209b = (InterfaceC37209b) c37214g.f358767i.get();
            s0 s0Var = c37214g.f358760b;
            if (interfaceC37209b != null) {
                s0Var.d("calling onBinderDied", new Object[0]);
                interfaceC37209b.zza();
            } else {
                String str = c37214g.f358761c;
                s0Var.d("%s : Binder has died.", str);
                ArrayList arrayList = c37214g.f358762d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    t0 t0Var = (t0) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    C37028k c37028k = t0Var.f358798b;
                    if (c37028k != null) {
                        c37028k.c(remoteException);
                    }
                }
                arrayList.clear();
            }
            c37214g.e();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    @j.B
    public final AtomicInteger f358769k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f358761c = "SplitInstallService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f358767i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.splitinstall.internal.v0] */
    public C37214g(Context context, s0 s0Var, Intent intent) {
        this.f358759a = context;
        this.f358760b = s0Var;
        this.f358766h = intent;
    }

    public static void b(C37214g c37214g, t0 t0Var) {
        N n12 = c37214g.f358771m;
        ArrayList arrayList = c37214g.f358762d;
        s0 s0Var = c37214g.f358760b;
        if (n12 != null || c37214g.f358765g) {
            if (!c37214g.f358765g) {
                t0Var.run();
                return;
            } else {
                s0Var.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(t0Var);
                return;
            }
        }
        s0Var.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(t0Var);
        ServiceConnectionC37213f serviceConnectionC37213f = new ServiceConnectionC37213f(c37214g, null);
        c37214g.f358770l = serviceConnectionC37213f;
        c37214g.f358765g = true;
        if (c37214g.f358759a.bindService(c37214g.f358766h, serviceConnectionC37213f, 1)) {
            return;
        }
        s0Var.d("Failed to bind to the service.", new Object[0]);
        c37214g.f358765g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t0 t0Var2 = (t0) it.next();
            zzag zzagVar = new zzag();
            C37028k c37028k = t0Var2.f358798b;
            if (c37028k != null) {
                c37028k.c(zzagVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f358758n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f358761c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f358761c, 10);
                    handlerThread.start();
                    map.put(this.f358761c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f358761c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(t0 t0Var, @j.P final C37028k c37028k) {
        synchronized (this.f358764f) {
            this.f358763e.add(c37028k);
            c37028k.f355672a.c(new InterfaceC37022e() { // from class: com.google.android.play.core.splitinstall.internal.u0
                @Override // com.google.android.gms.tasks.InterfaceC37022e
                public final void onComplete(Task task) {
                    C37214g c37214g = this.f358799b;
                    C37028k c37028k2 = c37028k;
                    synchronized (c37214g.f358764f) {
                        c37214g.f358763e.remove(c37028k2);
                    }
                }
            });
        }
        synchronized (this.f358764f) {
            try {
                if (this.f358769k.getAndIncrement() > 0) {
                    this.f358760b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a().post(new w0(this, t0Var.f358798b, t0Var));
    }

    public final void d(C37028k c37028k) {
        synchronized (this.f358764f) {
            this.f358763e.remove(c37028k);
        }
        synchronized (this.f358764f) {
            try {
                if (this.f358769k.get() > 0 && this.f358769k.decrementAndGet() > 0) {
                    this.f358760b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    a().post(new x0(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f358764f) {
            try {
                Iterator it = this.f358763e.iterator();
                while (it.hasNext()) {
                    ((C37028k) it.next()).c(new RemoteException(String.valueOf(this.f358761c).concat(" : Binder has died.")));
                }
                this.f358763e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
