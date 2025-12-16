package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;
import j.P;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public final class D {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f358017n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f358018a;

    /* renamed from: b, reason: collision with root package name */
    public final s f358019b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f358024g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f358025h;

    /* renamed from: l, reason: collision with root package name */
    @P
    public ServiceConnection f358029l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public l f358030m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f358021d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public final HashSet f358022e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f358023f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final v f358027j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.appupdate.internal.v
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            D d12 = this.f358049a;
            d12.f358019b.c("reportBinderDeath", new Object[0]);
            y yVar = (y) d12.f358026i.get();
            if (yVar != null) {
                d12.f358019b.c("calling onBinderDied", new Object[0]);
                yVar.zza();
            } else {
                d12.f358019b.c("%s : Binder has died.", d12.f358020c);
                Iterator it = d12.f358021d.iterator();
                while (it.hasNext()) {
                    t tVar = (t) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(d12.f358020c).concat(" : Binder has died."));
                    C37028k c37028k = tVar.f358046b;
                    if (c37028k != null) {
                        c37028k.c(remoteException);
                    }
                }
                d12.f358021d.clear();
            }
            synchronized (d12.f358023f) {
                d12.e();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    @j.B
    public final AtomicInteger f358028k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f358020c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f358026i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.appupdate.internal.v] */
    public D(Context context, s sVar, Intent intent) {
        this.f358018a = context;
        this.f358019b = sVar;
        this.f358025h = intent;
    }

    public static void b(D d12, t tVar) {
        l lVar = d12.f358030m;
        ArrayList arrayList = d12.f358021d;
        s sVar = d12.f358019b;
        if (lVar != null || d12.f358024g) {
            if (!d12.f358024g) {
                tVar.run();
                return;
            } else {
                sVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(tVar);
                return;
            }
        }
        sVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(tVar);
        C c12 = new C(d12, null);
        d12.f358029l = c12;
        d12.f358024g = true;
        if (d12.f358018a.bindService(d12.f358025h, c12, 1)) {
            return;
        }
        sVar.c("Failed to bind to the service.", new Object[0]);
        d12.f358024g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar2 = (t) it.next();
            zzy zzyVar = new zzy();
            C37028k c37028k = tVar2.f358046b;
            if (c37028k != null) {
                c37028k.c(zzyVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f358017n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f358020c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f358020c, 10);
                    handlerThread.start();
                    map.put(this.f358020c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f358020c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(t tVar, @P C37028k c37028k) {
        a().post(new w(this, tVar.f358046b, c37028k, tVar));
    }

    public final void d(C37028k c37028k) {
        synchronized (this.f358023f) {
            this.f358022e.remove(c37028k);
        }
        a().post(new x(this));
    }

    @j.B
    public final void e() {
        HashSet hashSet = this.f358022e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C37028k) it.next()).c(new RemoteException(String.valueOf(this.f358020c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
