package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class Q {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f358358n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f358359a;

    /* renamed from: b, reason: collision with root package name */
    public final F f358360b;

    /* renamed from: c, reason: collision with root package name */
    public final String f358361c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f358365g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f358366h;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public ServiceConnection f358370l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public w f358371m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f358362d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public final HashSet f358363e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f358364f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final I f358368j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.assetpacks.internal.I
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            Q q12 = this.f358349a;
            q12.f358360b.d("reportBinderDeath", new Object[0]);
            L l12 = (L) q12.f358367i.get();
            if (l12 != null) {
                q12.f358360b.d("calling onBinderDied", new Object[0]);
                l12.a();
            } else {
                q12.f358360b.d("%s : Binder has died.", q12.f358361c);
                Iterator it = q12.f358362d.iterator();
                while (it.hasNext()) {
                    G g12 = (G) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(q12.f358361c).concat(" : Binder has died."));
                    C37028k c37028k = g12.f358346b;
                    if (c37028k != null) {
                        c37028k.c(remoteException);
                    }
                }
                q12.f358362d.clear();
            }
            synchronized (q12.f358364f) {
                q12.e();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    @j.B
    public final AtomicInteger f358369k = new AtomicInteger(0);

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f358367i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.assetpacks.internal.I] */
    public Q(Context context, F f12, String str, Intent intent) {
        this.f358359a = context;
        this.f358360b = f12;
        this.f358361c = str;
        this.f358366h = intent;
    }

    public static void b(Q q12, G g12) {
        w wVar = q12.f358371m;
        ArrayList arrayList = q12.f358362d;
        F f12 = q12.f358360b;
        if (wVar != null || q12.f358365g) {
            if (!q12.f358365g) {
                g12.run();
                return;
            } else {
                f12.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(g12);
                return;
            }
        }
        f12.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(g12);
        P p12 = new P(q12, null);
        q12.f358370l = p12;
        q12.f358365g = true;
        if (q12.f358359a.bindService(q12.f358366h, p12, 1)) {
            return;
        }
        f12.d("Failed to bind to the service.", new Object[0]);
        q12.f358365g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            G g13 = (G) it.next();
            aa aaVar = new aa();
            C37028k c37028k = g13.f358346b;
            if (c37028k != null) {
                c37028k.c(aaVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f358358n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f358361c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f358361c, 10);
                    handlerThread.start();
                    map.put(this.f358361c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f358361c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(G g12, @j.P C37028k c37028k) {
        a().post(new J(this, g12.f358346b, c37028k, g12));
    }

    public final void d(C37028k c37028k) {
        synchronized (this.f358364f) {
            this.f358363e.remove(c37028k);
        }
        a().post(new K(this));
    }

    @j.B
    public final void e() {
        HashSet hashSet = this.f358363e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C37028k) it.next()).c(new RemoteException(String.valueOf(this.f358361c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
