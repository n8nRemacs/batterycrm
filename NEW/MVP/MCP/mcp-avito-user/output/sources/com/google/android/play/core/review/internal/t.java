package com.google.android.play.core.review.internal;

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
import j.B;
import j.P;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f358633n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f358634a;

    /* renamed from: b, reason: collision with root package name */
    public final i f358635b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f358640g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f358641h;

    /* renamed from: l, reason: collision with root package name */
    @P
    public ServiceConnection f358645l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public f f358646m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f358637d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @B
    public final HashSet f358638e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f358639f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final l f358643j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t tVar = this.f358625a;
            tVar.f358635b.a("reportBinderDeath", new Object[0]);
            o oVar = (o) tVar.f358642i.get();
            i iVar = tVar.f358635b;
            if (oVar != null) {
                iVar.a("calling onBinderDied", new Object[0]);
                oVar.zza();
            } else {
                String str = tVar.f358636c;
                iVar.a("%s : Binder has died.", str);
                ArrayList arrayList = tVar.f358637d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    C37028k c37028k = jVar.f358622b;
                    if (c37028k != null) {
                        c37028k.c(remoteException);
                    }
                }
                arrayList.clear();
            }
            tVar.d();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    @B
    public final AtomicInteger f358644k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f358636c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f358642i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.review.internal.l] */
    public t(Context context, i iVar, Intent intent) {
        this.f358634a = context;
        this.f358635b = iVar;
        this.f358641h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f358633n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f358636c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f358636c, 10);
                    handlerThread.start();
                    map.put(this.f358636c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f358636c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void b(j jVar, @P final C37028k c37028k) {
        synchronized (this.f358639f) {
            this.f358638e.add(c37028k);
            c37028k.f355672a.c(new InterfaceC37022e() { // from class: com.google.android.play.core.review.internal.k
                @Override // com.google.android.gms.tasks.InterfaceC37022e
                public final void onComplete(Task task) {
                    t tVar = this.f358623b;
                    C37028k c37028k2 = c37028k;
                    synchronized (tVar.f358639f) {
                        tVar.f358638e.remove(c37028k2);
                    }
                }
            });
        }
        synchronized (this.f358639f) {
            try {
                if (this.f358644k.getAndIncrement() > 0) {
                    i iVar = this.f358635b;
                    Object[] objArr = new Object[0];
                    iVar.getClass();
                    if (Log.isLoggable("PlayCore", 3)) {
                        i.b(iVar.f358621a, "Already connected to the service.", objArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a().post(new m(this, jVar.f358622b, jVar));
    }

    public final void c(C37028k c37028k) {
        synchronized (this.f358639f) {
            this.f358638e.remove(c37028k);
        }
        synchronized (this.f358639f) {
            try {
                if (this.f358644k.get() > 0 && this.f358644k.decrementAndGet() > 0) {
                    this.f358635b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    a().post(new n(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (this.f358639f) {
            try {
                Iterator it = this.f358638e.iterator();
                while (it.hasNext()) {
                    ((C37028k) it.next()).c(new RemoteException(String.valueOf(this.f358636c).concat(" : Binder has died.")));
                }
                this.f358638e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
