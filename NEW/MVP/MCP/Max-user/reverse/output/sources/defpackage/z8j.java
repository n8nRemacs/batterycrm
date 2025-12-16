package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class z8j {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final hx5 b;
    public boolean g;
    public final Intent h;
    public r6j l;
    public qli m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final awi j = new awi(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public z8j(Context context, hx5 hx5Var, Intent intent) {
        this.a = context;
        this.b = hx5Var;
        this.h = intent;
    }

    public static void b(z8j z8jVar, pli pliVar) {
        qli qliVar = z8jVar.m;
        hx5 hx5Var = z8jVar.b;
        ArrayList arrayList = z8jVar.d;
        if (qliVar != null || z8jVar.g) {
            if (!z8jVar.g) {
                pliVar.run();
                return;
            } else {
                hx5Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(pliVar);
                return;
            }
        }
        hx5Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(pliVar);
        r6j r6jVar = new r6j(0, z8jVar);
        z8jVar.l = r6jVar;
        z8jVar.g = true;
        if (z8jVar.a.bindService(z8jVar.h, r6jVar, 1)) {
            return;
        }
        hx5Var.a("Failed to bind to the service.", new Object[0]);
        z8jVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uti utiVar = (uti) it.next();
            zzu zzuVar = new zzu();
            n2g n2gVar = utiVar.a;
            if (n2gVar != null) {
                n2gVar.c(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((n2g) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
