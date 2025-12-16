package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class jcj {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final ulc b;
    public boolean g;
    public final Intent h;
    public r6j l;
    public oli m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final awi j = new awi(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public jcj(Context context, ulc ulcVar, Intent intent) {
        this.a = context;
        this.b = ulcVar;
        this.h = intent;
    }

    public static void b(jcj jcjVar, m0j m0jVar) {
        oli oliVar = jcjVar.m;
        ulc ulcVar = jcjVar.b;
        ArrayList arrayList = jcjVar.d;
        if (oliVar != null || jcjVar.g) {
            if (!jcjVar.g) {
                m0jVar.run();
                return;
            } else {
                ulcVar.v("Waiting to bind to the service.", new Object[0]);
                arrayList.add(m0jVar);
                return;
            }
        }
        ulcVar.v("Initiate binding to the service.", new Object[0]);
        arrayList.add(m0jVar);
        r6j r6jVar = new r6j(1, jcjVar);
        jcjVar.l = r6jVar;
        jcjVar.g = true;
        if (jcjVar.a.bindService(jcjVar.h, r6jVar, 1)) {
            return;
        }
        ulcVar.v("Failed to bind to the service.", new Object[0]);
        jcjVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z1j z1jVar = (z1j) it.next();
            zzy zzyVar = new zzy();
            n2g n2gVar = z1jVar.a;
            if (n2gVar != null) {
                n2gVar.c(zzyVar);
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

    public final void c(n2g n2gVar) {
        synchronized (this.f) {
            this.e.remove(n2gVar);
        }
        a().post(new q6j(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((n2g) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
