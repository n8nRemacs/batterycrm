package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C20199a;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class E implements H0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f348987a;

    /* renamed from: b, reason: collision with root package name */
    public final C36653k0 f348988b;

    /* renamed from: p, reason: collision with root package name */
    public final Looper f348989p;

    /* renamed from: q, reason: collision with root package name */
    public final C36661o0 f348990q;

    /* renamed from: r, reason: collision with root package name */
    public final C36661o0 f348991r;

    /* renamed from: s, reason: collision with root package name */
    public final Map f348992s;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public final C36616a.f f348994u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    public Bundle f348995v;

    /* renamed from: z, reason: collision with root package name */
    public final ReentrantLock f348999z;

    /* renamed from: t, reason: collision with root package name */
    public final Set f348993t = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: w, reason: collision with root package name */
    @j.P
    public ConnectionResult f348996w = null;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    public ConnectionResult f348997x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f348998y = false;

    /* renamed from: A, reason: collision with root package name */
    @InterfaceC25600a
    public int f348986A = 0;

    public E(Context context, C36653k0 c36653k0, ReentrantLock reentrantLock, Looper looper, C36688g c36688g, C20199a c20199a, C20199a c20199a2, C36703g c36703g, C36616a.AbstractC10618a abstractC10618a, @j.P C36616a.f fVar, ArrayList arrayList, ArrayList arrayList2, C20199a c20199a3, C20199a c20199a4) {
        this.f348987a = context;
        this.f348988b = c36653k0;
        this.f348999z = reentrantLock;
        this.f348989p = looper;
        this.f348994u = fVar;
        this.f348990q = new C36661o0(context, c36653k0, reentrantLock, looper, c36688g, c20199a2, null, c20199a4, null, arrayList2, new E1(this, null));
        this.f348991r = new C36661o0(context, c36653k0, reentrantLock, looper, c36688g, c20199a, c36703g, c20199a3, abstractC10618a, arrayList, new G1(this, null));
        C20199a c20199a5 = new C20199a();
        Iterator it = c20199a2.keySet().iterator();
        while (it.hasNext()) {
            c20199a5.put((C36616a.c) it.next(), this.f348990q);
        }
        Iterator it2 = c20199a.keySet().iterator();
        while (it2.hasNext()) {
            c20199a5.put((C36616a.c) it2.next(), this.f348991r);
        }
        this.f348992s = Collections.unmodifiableMap(c20199a5);
    }

    public static void m(E e12) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3 = e12.f348996w;
        boolean z12 = connectionResult3 != null && connectionResult3.i();
        C36661o0 c36661o0 = e12.f348990q;
        if (!z12) {
            ConnectionResult connectionResult4 = e12.f348996w;
            C36661o0 c36661o02 = e12.f348991r;
            if (connectionResult4 != null && (connectionResult2 = e12.f348997x) != null && connectionResult2.i()) {
                c36661o02.f();
                ConnectionResult connectionResult5 = e12.f348996w;
                C36729v.j(connectionResult5);
                e12.j(connectionResult5);
                return;
            }
            ConnectionResult connectionResult6 = e12.f348996w;
            if (connectionResult6 == null || (connectionResult = e12.f348997x) == null) {
                return;
            }
            if (c36661o02.f349200y < c36661o0.f349200y) {
                connectionResult6 = connectionResult;
            }
            e12.j(connectionResult6);
            return;
        }
        ConnectionResult connectionResult7 = e12.f348997x;
        if (!(connectionResult7 != null && connectionResult7.i()) && !e12.l()) {
            ConnectionResult connectionResult8 = e12.f348997x;
            if (connectionResult8 != null) {
                if (e12.f348986A == 1) {
                    e12.k();
                    return;
                } else {
                    e12.j(connectionResult8);
                    c36661o0.f();
                    return;
                }
            }
            return;
        }
        int i12 = e12.f348986A;
        if (i12 == 1) {
            e12.k();
        } else if (i12 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            C36653k0 c36653k0 = e12.f348988b;
            C36729v.j(c36653k0);
            c36653k0.b(e12.f348995v);
            e12.k();
        }
        e12.f348986A = 0;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final C36634e.a a(@j.N C36634e.a aVar) {
        PendingIntent activity;
        C36661o0 c36661o0 = (C36661o0) this.f348992s.get(aVar.getClientKey());
        C36729v.k(c36661o0, "GoogleApiClient is not configured to use the API required for this call.");
        if (!c36661o0.equals(this.f348991r)) {
            C36661o0 c36661o02 = this.f348990q;
            c36661o02.getClass();
            aVar.zak();
            c36661o02.f349199x.f(aVar);
            return aVar;
        }
        if (!l()) {
            C36661o0 c36661o03 = this.f348991r;
            c36661o03.getClass();
            aVar.zak();
            c36661o03.f349199x.f(aVar);
            return aVar;
        }
        C36616a.f fVar = this.f348994u;
        if (fVar == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(this.f348987a, System.identityHashCode(this.f348988b), fVar.getSignInIntent(), zap.zaa | 134217728);
        }
        aVar.setFailedResult(new Status(4, null, activity, null));
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final C36634e.a b(@j.N C36634e.a aVar) {
        PendingIntent activity;
        C36661o0 c36661o0 = (C36661o0) this.f348992s.get(aVar.getClientKey());
        C36729v.k(c36661o0, "GoogleApiClient is not configured to use the API required for this call.");
        if (!c36661o0.equals(this.f348991r)) {
            C36661o0 c36661o02 = this.f348990q;
            c36661o02.getClass();
            aVar.zak();
            return c36661o02.f349199x.h(aVar);
        }
        if (!l()) {
            C36661o0 c36661o03 = this.f348991r;
            c36661o03.getClass();
            aVar.zak();
            return c36661o03.f349199x.h(aVar);
        }
        C36616a.f fVar = this.f348994u;
        if (fVar == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(this.f348987a, System.identityHashCode(this.f348988b), fVar.getSignInIntent(), zap.zaa | 134217728);
        }
        aVar.setFailedResult(new Status(4, null, activity, null));
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final void c() {
        this.f348986A = 2;
        this.f348998y = false;
        this.f348997x = null;
        this.f348996w = null;
        this.f348990q.c();
        this.f348991r.c();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final void d() {
        this.f348990q.d();
        this.f348991r.d();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void e() {
        ReentrantLock reentrantLock = this.f348999z;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                boolean z12 = this.f348986A == 2;
                reentrantLock.unlock();
                this.f348991r.f();
                this.f348997x = new ConnectionResult(4);
                if (z12) {
                    new zau(this.f348989p).post(new C1(this));
                } else {
                    k();
                }
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final void f() {
        this.f348997x = null;
        this.f348996w = null;
        this.f348986A = 0;
        this.f348990q.f();
        this.f348991r.f();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void g(String str, @j.P FileDescriptor fileDescriptor, PrintWriter printWriter, @j.P String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f348991r.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f348990q.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.google.android.gms.common.api.internal.H0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f348999z
            r0.lock()
            com.google.android.gms.common.api.internal.o0 r0 = r3.f348990q     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.api.internal.l0 r0 = r0.f349199x     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.N     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.o0 r0 = r3.f348991r     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.api.internal.l0 r0 = r0.f349199x     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.N     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.l()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.f348986A     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.ReentrantLock r0 = r3.f348999z
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.ReentrantLock r1 = r3.f348999z
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.E.h():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean i(com.google.android.gms.auth.api.signin.internal.f fVar) {
        ReentrantLock reentrantLock;
        this.f348999z.lock();
        try {
            reentrantLock = this.f348999z;
            reentrantLock.lock();
            try {
                boolean z12 = false;
                boolean z13 = this.f348986A == 2;
                reentrantLock.unlock();
                if (z13 || h()) {
                    if (!(this.f348991r.f349199x instanceof N)) {
                        this.f348993t.add(fVar);
                        if (this.f348986A == 0) {
                            this.f348986A = 1;
                        }
                        this.f348997x = null;
                        this.f348991r.c();
                        z12 = true;
                    }
                }
                reentrantLock = this.f348999z;
                return z12;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            reentrantLock = this.f348999z;
            throw th2;
        }
    }

    @InterfaceC25600a
    public final void j(ConnectionResult connectionResult) {
        int i12 = this.f348986A;
        if (i12 == 1) {
            k();
        } else if (i12 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f348988b.c(connectionResult);
            k();
        }
        this.f348986A = 0;
    }

    @InterfaceC25600a
    public final void k() {
        Set set = this.f348993t;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC36675w) it.next()).onComplete();
        }
        set.clear();
    }

    @InterfaceC25600a
    public final boolean l() {
        ConnectionResult connectionResult = this.f348997x;
        return connectionResult != null && connectionResult.f348860c == 4;
    }
}
