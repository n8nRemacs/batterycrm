package com.google.android.gms.common.api.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.collection.C20199a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.C37028k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import r61.InterfaceC47501c;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36676w0 implements i.b, i.c, B1 {

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC47501c
    public final C36616a.f f349233b;

    /* renamed from: p, reason: collision with root package name */
    public final C36628c f349234p;

    /* renamed from: q, reason: collision with root package name */
    public final H f349235q;

    /* renamed from: t, reason: collision with root package name */
    public final int f349238t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public final BinderC36624a1 f349239u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f349240v;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C36646i f349244z;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f349232a = new LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f349236r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f349237s = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f349241w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    @j.P
    public ConnectionResult f349242x = null;

    /* renamed from: y, reason: collision with root package name */
    public int f349243y = 0;

    @j.l0
    public C36676w0(C36646i c36646i, com.google.android.gms.common.api.h hVar) {
        this.f349244z = c36646i;
        C36616a.f fVarZab = hVar.zab(c36646i.f349134o.getLooper(), this);
        this.f349233b = fVarZab;
        this.f349234p = hVar.getApiKey();
        this.f349235q = new H();
        this.f349238t = hVar.zaa();
        if (!fVarZab.requiresSignIn()) {
            this.f349239u = null;
        } else {
            this.f349239u = hVar.zac(c36646i.f349125f, c36646i.f349134o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.P
    @j.l0
    public final Feature a(@j.P Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f349233b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C20199a c20199a = new C20199a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                c20199a.put(feature.f348866b, Long.valueOf(feature.h()));
            }
            for (Feature feature2 : featureArr) {
                Long l12 = (Long) c20199a.get(feature2.f348866b);
                if (l12 == null || l12.longValue() < feature2.h()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @j.l0
    public final void b(ConnectionResult connectionResult) {
        HashSet hashSet = this.f349236r;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        s1 s1Var = (s1) it.next();
        if (C36727t.a(connectionResult, ConnectionResult.f348858f)) {
            this.f349233b.getEndpointPackageName();
        }
        s1Var.getClass();
        throw null;
    }

    @j.l0
    public final void c(Status status) {
        C36729v.d(this.f349244z.f349134o);
        d(status, null, false);
    }

    @j.l0
    public final void d(@j.P Status status, @j.P RuntimeException runtimeException, boolean z12) {
        C36729v.d(this.f349244z.f349134o);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f349232a.iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if (!z12 || p1Var.f349204a == 2) {
                if (status != null) {
                    p1Var.a(status);
                } else {
                    p1Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    @j.l0
    public final void e() {
        LinkedList linkedList = this.f349232a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            p1 p1Var = (p1) arrayList.get(i12);
            if (!this.f349233b.isConnected()) {
                return;
            }
            if (i(p1Var)) {
                linkedList.remove(p1Var);
            }
        }
    }

    @j.l0
    public final void f() {
        C36616a.f fVar = this.f349233b;
        C36646i c36646i = this.f349244z;
        C36729v.d(c36646i.f349134o);
        this.f349242x = null;
        b(ConnectionResult.f348858f);
        if (this.f349240v) {
            zau zauVar = c36646i.f349134o;
            C36628c c36628c = this.f349234p;
            zauVar.removeMessages(11, c36628c);
            c36646i.f349134o.removeMessages(9, c36628c);
            this.f349240v = false;
        }
        Iterator it = this.f349237s.values().iterator();
        while (it.hasNext()) {
            P0 p02 = (P0) it.next();
            if (a(p02.f349047a.f349209b) != null) {
                it.remove();
            } else {
                try {
                    p02.f349047a.a(fVar, new C37028k<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    fVar.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    @j.l0
    public final void g(int i12) {
        C36646i c36646i = this.f349244z;
        C36729v.d(c36646i.f349134o);
        this.f349242x = null;
        this.f349240v = true;
        String lastDisconnectMessage = this.f349233b.getLastDisconnectMessage();
        H h12 = this.f349235q;
        h12.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i12 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i12 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        h12.a(new Status(20, sb2.toString(), null, null), true);
        zau zauVar = c36646i.f349134o;
        C36628c c36628c = this.f349234p;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c36628c), 5000L);
        zau zauVar2 = c36646i.f349134o;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, c36628c), 120000L);
        c36646i.f349127h.f349386a.clear();
        Iterator it = this.f349237s.values().iterator();
        while (it.hasNext()) {
            ((P0) it.next()).f349049c.run();
        }
    }

    public final void h() {
        C36646i c36646i = this.f349244z;
        zau zauVar = c36646i.f349134o;
        C36628c c36628c = this.f349234p;
        zauVar.removeMessages(12, c36628c);
        zau zauVar2 = c36646i.f349134o;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, c36628c), c36646i.f349121b);
    }

    @j.l0
    public final boolean i(p1 p1Var) throws Resources.NotFoundException {
        if (!(p1Var instanceof G0)) {
            C36616a.f fVar = this.f349233b;
            p1Var.d(this.f349235q, fVar.requiresSignIn());
            try {
                p1Var.c(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                fVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        G0 g02 = (G0) p1Var;
        Feature featureA = a(g02.g(this));
        if (featureA == null) {
            C36616a.f fVar2 = this.f349233b;
            p1Var.d(this.f349235q, fVar2.requiresSignIn());
            try {
                p1Var.c(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                fVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        this.f349233b.getClass();
        if (!this.f349244z.f349135p || !g02.f(this)) {
            g02.b(new UnsupportedApiCallException(featureA));
            return true;
        }
        C36680y0 c36680y0 = new C36680y0(this.f349234p, featureA, null);
        int iIndexOf = this.f349241w.indexOf(c36680y0);
        if (iIndexOf >= 0) {
            C36680y0 c36680y02 = (C36680y0) this.f349241w.get(iIndexOf);
            this.f349244z.f349134o.removeMessages(15, c36680y02);
            zau zauVar = this.f349244z.f349134o;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, c36680y02), 5000L);
            return false;
        }
        this.f349241w.add(c36680y0);
        zau zauVar2 = this.f349244z.f349134o;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, c36680y0), 5000L);
        zau zauVar3 = this.f349244z.f349134o;
        zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, c36680y0), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (j(connectionResult)) {
            return false;
        }
        this.f349244z.d(connectionResult, this.f349238t);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r5.get() == null) goto L30;
     */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(@j.N com.google.android.gms.common.ConnectionResult r5) {
        /*
            r4 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C36646i.f349119s
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.i r1 = r4.f349244z     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.api.internal.I r2 = r1.f349131l     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            androidx.collection.c r1 = r1.f349132m     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.api.internal.c r2 = r4.f349234p     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            com.google.android.gms.common.api.internal.i r1 = r4.f349244z     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.api.internal.I r1 = r1.f349131l     // Catch: java.lang.Throwable -> L44
            int r2 = r4.f349238t     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.api.internal.t1 r3 = new com.google.android.gms.common.api.internal.t1     // Catch: java.lang.Throwable -> L44
            r3.<init>(r5, r2)     // Catch: java.lang.Throwable -> L44
        L21:
            java.util.concurrent.atomic.AtomicReference r5 = r1.f349246d     // Catch: java.lang.Throwable -> L44
        L23:
            r2 = 0
            boolean r2 = r5.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L35
            com.google.android.gms.internal.base.zau r5 = r1.f349247e     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.api.internal.v1 r2 = new com.google.android.gms.common.api.internal.v1     // Catch: java.lang.Throwable -> L44
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L44
            r5.post(r2)     // Catch: java.lang.Throwable -> L44
            goto L41
        L35:
            java.lang.Object r2 = r5.get()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L23
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r5 = 1
            return r5
        L44:
            r5 = move-exception
            goto L49
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r5 = 0
            return r5
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C36676w0.j(com.google.android.gms.common.ConnectionResult):boolean");
    }

    @j.l0
    public final boolean k(boolean z12) {
        C36729v.d(this.f349244z.f349134o);
        C36616a.f fVar = this.f349233b;
        if (!fVar.isConnected() || !this.f349237s.isEmpty()) {
            return false;
        }
        H h12 = this.f349235q;
        if (h12.f349006a.isEmpty() && h12.f349007b.isEmpty()) {
            fVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z12) {
            return false;
        }
        h();
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.common.api.a$f, com.google.android.gms.signin.f] */
    @j.l0
    public final void l() {
        C36646i c36646i = this.f349244z;
        C36729v.d(c36646i.f349134o);
        C36616a.f fVar = this.f349233b;
        if (fVar.isConnected() || fVar.isConnecting()) {
            return;
        }
        try {
            int iA2 = c36646i.f349127h.a(c36646i.f349125f, fVar);
            if (iA2 != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iA2, null);
                connectionResult.toString();
                n(connectionResult, null);
                return;
            }
            A0 a02 = new A0(c36646i, fVar, this.f349234p);
            if (fVar.requiresSignIn()) {
                BinderC36624a1 binderC36624a1 = this.f349239u;
                C36729v.j(binderC36624a1);
                com.google.android.gms.signin.f fVar2 = binderC36624a1.f349075s;
                if (fVar2 != null) {
                    fVar2.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(binderC36624a1));
                C36703g c36703g = binderC36624a1.f349074r;
                c36703g.f349431h = numValueOf;
                C36616a.AbstractC10618a abstractC10618a = binderC36624a1.f349072p;
                Handler handler = binderC36624a1.f349071b;
                binderC36624a1.f349075s = abstractC10618a.buildClient(binderC36624a1.f349070a, handler.getLooper(), c36703g, (C36703g) c36703g.f349430g, (i.b) binderC36624a1, (i.c) binderC36624a1);
                binderC36624a1.f349076t = a02;
                Set set = binderC36624a1.f349073q;
                if (set == null || set.isEmpty()) {
                    handler.post(new X0(binderC36624a1));
                } else {
                    binderC36624a1.f349075s.a();
                }
            }
            try {
                fVar.connect(a02);
            } catch (SecurityException e12) {
                n(new ConnectionResult(10), e12);
            }
        } catch (IllegalStateException e13) {
            n(new ConnectionResult(10), e13);
        }
    }

    @j.l0
    public final void m(p1 p1Var) {
        C36729v.d(this.f349244z.f349134o);
        boolean zIsConnected = this.f349233b.isConnected();
        LinkedList linkedList = this.f349232a;
        if (zIsConnected) {
            if (i(p1Var)) {
                h();
                return;
            } else {
                linkedList.add(p1Var);
                return;
            }
        }
        linkedList.add(p1Var);
        ConnectionResult connectionResult = this.f349242x;
        if (connectionResult == null || !connectionResult.h()) {
            l();
        } else {
            n(this.f349242x, null);
        }
    }

    @j.l0
    public final void n(@j.N ConnectionResult connectionResult, @j.P RuntimeException runtimeException) {
        com.google.android.gms.signin.f fVar;
        C36729v.d(this.f349244z.f349134o);
        BinderC36624a1 binderC36624a1 = this.f349239u;
        if (binderC36624a1 != null && (fVar = binderC36624a1.f349075s) != null) {
            fVar.disconnect();
        }
        C36729v.d(this.f349244z.f349134o);
        this.f349242x = null;
        this.f349244z.f349127h.f349386a.clear();
        b(connectionResult);
        if ((this.f349233b instanceof com.google.android.gms.common.internal.service.q) && connectionResult.f348860c != 24) {
            C36646i c36646i = this.f349244z;
            c36646i.f349122c = true;
            zau zauVar = c36646i.f349134o;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.f348860c == 4) {
            c(C36646i.f349118r);
            return;
        }
        if (this.f349232a.isEmpty()) {
            this.f349242x = connectionResult;
            return;
        }
        if (runtimeException != null) {
            C36729v.d(this.f349244z.f349134o);
            d(null, runtimeException, false);
            return;
        }
        if (!this.f349244z.f349135p) {
            c(C36646i.e(this.f349234p, connectionResult));
            return;
        }
        d(C36646i.e(this.f349234p, connectionResult), null, true);
        if (this.f349232a.isEmpty() || j(connectionResult) || this.f349244z.d(connectionResult, this.f349238t)) {
            return;
        }
        if (connectionResult.f348860c == 18) {
            this.f349240v = true;
        }
        if (!this.f349240v) {
            c(C36646i.e(this.f349234p, connectionResult));
            return;
        }
        C36646i c36646i2 = this.f349244z;
        C36628c c36628c = this.f349234p;
        zau zauVar2 = c36646i2.f349134o;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, c36628c), 5000L);
    }

    @j.l0
    public final void o(@j.N ConnectionResult connectionResult) {
        C36729v.d(this.f349244z.f349134o);
        C36616a.f fVar = this.f349233b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        n(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnected(@j.P Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        C36646i c36646i = this.f349244z;
        if (looperMyLooper == c36646i.f349134o.getLooper()) {
            f();
        } else {
            c36646i.f349134o.post(new RunnableC36668s0(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36664q
    @j.l0
    public final void onConnectionFailed(@j.N ConnectionResult connectionResult) {
        n(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnectionSuspended(int i12) {
        Looper looperMyLooper = Looper.myLooper();
        C36646i c36646i = this.f349244z;
        if (looperMyLooper == c36646i.f349134o.getLooper()) {
            g(i12);
        } else {
            c36646i.f349134o.post(new RunnableC36670t0(this, i12));
        }
    }

    @j.l0
    public final void p() {
        C36729v.d(this.f349244z.f349134o);
        Status status = C36646i.f349117q;
        c(status);
        H h12 = this.f349235q;
        h12.getClass();
        h12.a(status, false);
        for (C36658n.a aVar : (C36658n.a[]) this.f349237s.keySet().toArray(new C36658n.a[0])) {
            m(new o1(aVar, new C37028k()));
        }
        b(new ConnectionResult(4));
        C36616a.f fVar = this.f349233b;
        if (fVar.isConnected()) {
            fVar.onUserSignOut(new C36674v0(this));
        }
    }
}
