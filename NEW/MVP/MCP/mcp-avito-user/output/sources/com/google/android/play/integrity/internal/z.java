package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import j.P;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f358929n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f358930a;

    /* renamed from: b, reason: collision with root package name */
    public final n f358931b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f358936g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f358937h;

    /* renamed from: l, reason: collision with root package name */
    @P
    public ServiceConnection f358941l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public k f358942m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f358933d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public final HashSet f358934e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f358935f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final q f358939j = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            z zVar = this.f358921a;
            zVar.f358931b.a("reportBinderDeath", new Object[0]);
            t tVar = (t) zVar.f358938i.get();
            n nVar = zVar.f358931b;
            if (tVar != null) {
                nVar.a("calling onBinderDied", new Object[0]);
                tVar.a();
            } else {
                String str = zVar.f358932c;
                nVar.a("%s : Binder has died.", str);
                ArrayList arrayList = zVar.f358933d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
                }
                arrayList.clear();
            }
            zVar.d();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    @j.B
    public final AtomicInteger f358940k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f358932c = "IntegrityService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f358938i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.integrity.internal.q] */
    public z(Context context, n nVar, Intent intent) {
        this.f358930a = context;
        this.f358931b = nVar;
        this.f358937h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f358929n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f358932c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f358932c, 10);
                    handlerThread.start();
                    map.put(this.f358932c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f358932c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void b(o oVar, @P final C37028k c37028k) {
        synchronized (this.f358935f) {
            this.f358934e.add(c37028k);
            c37028k.f355672a.c(new InterfaceC37022e() { // from class: com.google.android.play.integrity.internal.p
                @Override // com.google.android.gms.tasks.InterfaceC37022e
                public final void onComplete(Task task) {
                    z zVar = this.f358919b;
                    C37028k c37028k2 = c37028k;
                    synchronized (zVar.f358935f) {
                        zVar.f358934e.remove(c37028k2);
                    }
                }
            });
        }
        synchronized (this.f358935f) {
            try {
                if (this.f358940k.getAndIncrement() > 0) {
                    n nVar = this.f358931b;
                    Object[] objArr = new Object[0];
                    nVar.getClass();
                    if (Log.isLoggable("PlayCore", 3)) {
                        n.b(nVar.f358917a, "Already connected to the service.", objArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a().post(new r(this, oVar.f358918b, oVar));
    }

    public final void c(C37028k c37028k) {
        synchronized (this.f358935f) {
            this.f358934e.remove(c37028k);
        }
        synchronized (this.f358935f) {
            try {
                if (this.f358940k.get() > 0 && this.f358940k.decrementAndGet() > 0) {
                    this.f358931b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    a().post(new s(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (this.f358935f) {
            try {
                Iterator it = this.f358934e.iterator();
                while (it.hasNext()) {
                    ((C37028k) it.next()).c(new RemoteException(String.valueOf(this.f358932c).concat(" : Binder has died.")));
                }
                this.f358934e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
