package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.cloudmessaging.zzf;
import j.K;
import j.P;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
final class q implements ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public r f348833d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f348836g;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public int f348831b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Messenger f348832c = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            q qVar = this.f348823b;
            int i12 = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            synchronized (qVar) {
                try {
                    t<?> tVar = qVar.f348835f.get(i12);
                    if (tVar == null) {
                        return true;
                    }
                    qVar.f348835f.remove(i12);
                    qVar.c();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        tVar.c(new zzq("Not supported by GmsCore", null));
                        return true;
                    }
                    tVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: e, reason: collision with root package name */
    @J41.a
    public final ArrayDeque f348834e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    @J41.a
    public final SparseArray<t<?>> f348835f = new SparseArray<>();

    public /* synthetic */ q(v vVar, p pVar) {
        this.f348836g = vVar;
    }

    public final synchronized void a(@P String str) {
        b(str, null);
    }

    public final synchronized void b(@P String str, @P SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    "Disconnected: ".concat(strValueOf);
                }
            }
            int i12 = this.f348831b;
            if (i12 == 0) {
                throw new IllegalStateException();
            }
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                this.f348831b = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f348831b = 4;
            ZX0.a.b().c(this.f348836g.f348844a, this);
            zzq zzqVar = new zzq(str, securityException);
            Iterator it = this.f348834e.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(zzqVar);
            }
            this.f348834e.clear();
            for (int i13 = 0; i13 < this.f348835f.size(); i13++) {
                this.f348835f.valueAt(i13).c(zzqVar);
            }
            this.f348835f.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        if (this.f348831b == 2 && this.f348834e.isEmpty() && this.f348835f.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f348831b = 3;
            ZX0.a.b().c(this.f348836g.f348844a, this);
        }
    }

    public final synchronized boolean d(t<?> tVar) {
        int i12 = this.f348831b;
        if (i12 != 0) {
            if (i12 == 1) {
                this.f348834e.add(tVar);
                return true;
            }
            if (i12 != 2) {
                return false;
            }
            this.f348834e.add(tVar);
            this.f348836g.f348845b.execute(new l(this));
            return true;
        }
        this.f348834e.add(tVar);
        C36729v.m(this.f348831b == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.f348831b = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ZX0.a.b().a(this.f348836g.f348844a, intent, this, 1)) {
                this.f348836g.f348845b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        q qVar = this.f348826b;
                        synchronized (qVar) {
                            if (qVar.f348831b == 1) {
                                qVar.a("Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e12) {
            b("Unable to bind to service", e12);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @K
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f348836g.f348845b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.n
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = this.f348827b;
                IBinder iBinder2 = iBinder;
                synchronized (qVar) {
                    if (iBinder2 == null) {
                        qVar.a("Null service connection");
                        return;
                    }
                    try {
                        qVar.f348833d = new r(iBinder2);
                        qVar.f348831b = 2;
                        qVar.f348836g.f348845b.execute(new l(qVar));
                    } catch (RemoteException e12) {
                        qVar.a(e12.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @K
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f348836g.f348845b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f348824b.a("Service disconnected");
            }
        });
    }
}
