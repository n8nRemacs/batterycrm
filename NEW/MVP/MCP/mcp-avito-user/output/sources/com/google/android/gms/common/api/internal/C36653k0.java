package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C20199a;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36690i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36653k0 extends com.google.android.gms.common.api.i implements F0 {

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f349147b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.internal.U f349148c;

    /* renamed from: e, reason: collision with root package name */
    public final int f349150e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f349151f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f349152g;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f349154i;

    /* renamed from: l, reason: collision with root package name */
    public final HandlerC36647i0 f349157l;

    /* renamed from: m, reason: collision with root package name */
    public final C36687f f349158m;

    /* renamed from: n, reason: collision with root package name */
    @j.k0
    @j.P
    public D0 f349159n;

    /* renamed from: o, reason: collision with root package name */
    public final C20199a f349160o;

    /* renamed from: q, reason: collision with root package name */
    public final C36703g f349162q;

    /* renamed from: r, reason: collision with root package name */
    public final C20199a f349163r;

    /* renamed from: s, reason: collision with root package name */
    public final C36616a.AbstractC10618a f349164s;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f349166u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f349167v;

    /* renamed from: x, reason: collision with root package name */
    public final k1 f349169x;

    /* renamed from: y, reason: collision with root package name */
    public final com.google.android.gms.common.internal.T f349170y;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public H0 f349149d = null;

    /* renamed from: h, reason: collision with root package name */
    @j.k0
    public final LinkedList f349153h = new LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public final long f349155j = 120000;

    /* renamed from: k, reason: collision with root package name */
    public final long f349156k = 5000;

    /* renamed from: p, reason: collision with root package name */
    public Set f349161p = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final C36660o f349165t = new C36660o();

    /* renamed from: w, reason: collision with root package name */
    @j.P
    public HashSet f349168w = null;

    public C36653k0(Context context, ReentrantLock reentrantLock, Looper looper, C36703g c36703g, C36687f c36687f, C36616a.AbstractC10618a abstractC10618a, C20199a c20199a, ArrayList arrayList, ArrayList arrayList2, C20199a c20199a2, int i12, int i13, ArrayList arrayList3) {
        this.f349167v = null;
        C36632d0 c36632d0 = new C36632d0(this);
        this.f349151f = context;
        this.f349147b = reentrantLock;
        this.f349148c = new com.google.android.gms.common.internal.U(looper, c36632d0);
        this.f349152g = looper;
        this.f349157l = new HandlerC36647i0(this, looper);
        this.f349158m = c36687f;
        this.f349150e = i12;
        if (i12 >= 0) {
            this.f349167v = Integer.valueOf(i13);
        }
        this.f349163r = c20199a;
        this.f349160o = c20199a2;
        this.f349166u = arrayList3;
        this.f349169x = new k1();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i.b bVar = (i.b) it.next();
            com.google.android.gms.common.internal.U u12 = this.f349148c;
            u12.getClass();
            C36729v.j(bVar);
            synchronized (u12.f349385j) {
                try {
                    if (u12.f349378c.contains(bVar)) {
                        String.valueOf(bVar);
                    } else {
                        u12.f349378c.add(bVar);
                    }
                } finally {
                }
            }
            if (((C36632d0) u12.f349377b).isConnected()) {
                zau zauVar = u12.f349384i;
                zauVar.sendMessage(zauVar.obtainMessage(1, bVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            i.c cVar = (i.c) it2.next();
            com.google.android.gms.common.internal.U u13 = this.f349148c;
            u13.getClass();
            C36729v.j(cVar);
            synchronized (u13.f349385j) {
                try {
                    if (u13.f349380e.contains(cVar)) {
                        String.valueOf(cVar);
                    } else {
                        u13.f349380e.add(cVar);
                    }
                } finally {
                }
            }
        }
        this.f349162q = c36703g;
        this.f349164s = abstractC10618a;
    }

    public static int n(Collection collection, boolean z12) {
        Iterator it = collection.iterator();
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        while (it.hasNext()) {
            C36616a.f fVar = (C36616a.f) it.next();
            zRequiresSignIn |= fVar.requiresSignIn();
            zProvidesSignIn |= fVar.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z12) ? 2 : 1;
        }
        return 3;
    }

    public static /* bridge */ /* synthetic */ void o(C36653k0 c36653k0) {
        c36653k0.f349147b.lock();
        try {
            if (c36653k0.f349154i) {
                c36653k0.r();
            }
        } finally {
            c36653k0.f349147b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    @InterfaceC25600a
    public final void a(int i12, boolean z12) {
        if (i12 == 1) {
            if (!z12 && !this.f349154i) {
                this.f349154i = true;
                if (this.f349159n == null) {
                    try {
                        C36687f c36687f = this.f349158m;
                        Context applicationContext = this.f349151f.getApplicationContext();
                        C36650j0 c36650j0 = new C36650j0(this);
                        c36687f.getClass();
                        this.f349159n = C36687f.g(applicationContext, c36650j0);
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC36647i0 handlerC36647i0 = this.f349157l;
                handlerC36647i0.sendMessageDelayed(handlerC36647i0.obtainMessage(1), this.f349155j);
                HandlerC36647i0 handlerC36647i02 = this.f349157l;
                handlerC36647i02.sendMessageDelayed(handlerC36647i02.obtainMessage(2), this.f349156k);
            }
            i12 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f349169x.f349172a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(k1.f349171c);
        }
        com.google.android.gms.common.internal.U u12 = this.f349148c;
        if (Looper.myLooper() != u12.f349384i.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        u12.f349384i.removeMessages(1);
        synchronized (u12.f349385j) {
            try {
                u12.f349383h = true;
                ArrayList arrayList = new ArrayList(u12.f349378c);
                int i13 = u12.f349382g.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i.b bVar = (i.b) it.next();
                    if (!u12.f349381f || u12.f349382g.get() != i13) {
                        break;
                    } else if (u12.f349378c.contains(bVar)) {
                        bVar.onConnectionSuspended(i12);
                    }
                }
                u12.f349379d.clear();
                u12.f349383h = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.common.internal.U u13 = this.f349148c;
        u13.f349381f = false;
        u13.f349382g.incrementAndGet();
        if (i12 == 2) {
            r();
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    @InterfaceC25600a
    public final void b(@j.P Bundle bundle) {
        while (!this.f349153h.isEmpty()) {
            g((C36634e.a) this.f349153h.remove());
        }
        com.google.android.gms.common.internal.U u12 = this.f349148c;
        if (Looper.myLooper() != u12.f349384i.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (u12.f349385j) {
            try {
                C36729v.m(!u12.f349383h);
                u12.f349384i.removeMessages(1);
                u12.f349383h = true;
                C36729v.m(u12.f349379d.isEmpty());
                ArrayList arrayList = new ArrayList(u12.f349378c);
                int i12 = u12.f349382g.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i.b bVar = (i.b) it.next();
                    if (!u12.f349381f || !((C36632d0) u12.f349377b).isConnected() || u12.f349382g.get() != i12) {
                        break;
                    } else if (!u12.f349379d.contains(bVar)) {
                        bVar.onConnected(bundle);
                    }
                }
                u12.f349379d.clear();
                u12.f349383h = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    @InterfaceC25600a
    public final void c(ConnectionResult connectionResult) {
        C36687f c36687f = this.f349158m;
        Context context = this.f349151f;
        int i12 = connectionResult.f348860c;
        c36687f.getClass();
        AtomicBoolean atomicBoolean = C36690i.f349291a;
        if (!(i12 == 18 ? true : i12 == 1 ? C36690i.c(context) : false)) {
            p();
        }
        if (this.f349154i) {
            return;
        }
        com.google.android.gms.common.internal.U u12 = this.f349148c;
        if (Looper.myLooper() != u12.f349384i.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        u12.f349384i.removeMessages(1);
        synchronized (u12.f349385j) {
            try {
                ArrayList arrayList = new ArrayList(u12.f349380e);
                int i13 = u12.f349382g.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i.c cVar = (i.c) it.next();
                    if (u12.f349381f && u12.f349382g.get() == i13) {
                        if (u12.f349380e.contains(cVar)) {
                            cVar.onConnectionFailed(connectionResult);
                        }
                    }
                }
            } finally {
            }
        }
        com.google.android.gms.common.internal.U u13 = this.f349148c;
        u13.f349381f = false;
        u13.f349382g.incrementAndGet();
    }

    @Override // com.google.android.gms.common.api.i
    public final void d() {
        ReentrantLock reentrantLock = this.f349147b;
        reentrantLock.lock();
        try {
            int i12 = 2;
            boolean z12 = false;
            if (this.f349150e >= 0) {
                C36729v.l("Sign-in mode should have been set explicitly by auto-manage.", this.f349167v != null);
            } else {
                Integer num = this.f349167v;
                if (num == null) {
                    this.f349167v = Integer.valueOf(n(this.f349160o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f349167v;
            C36729v.j(num2);
            int iIntValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i12 = iIntValue;
                    }
                    C36729v.a("Illegal sign-in mode: " + i12, z12);
                    q(i12);
                    r();
                    reentrantLock.unlock();
                    return;
                }
                i12 = iIntValue;
                C36729v.a("Illegal sign-in mode: " + i12, z12);
                q(i12);
                r();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z12 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void e() {
        ReentrantLock reentrantLock = this.f349147b;
        reentrantLock.lock();
        try {
            this.f349169x.a();
            H0 h02 = this.f349149d;
            if (h02 != null) {
                h02.f();
            }
            Set set = this.f349165t.f349187a;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C36658n) it.next()).a();
            }
            set.clear();
            LinkedList<C36634e.a> linkedList = this.f349153h;
            for (C36634e.a aVar : linkedList) {
                aVar.zan(null);
                aVar.cancel();
            }
            linkedList.clear();
            if (this.f349149d != null) {
                p();
                com.google.android.gms.common.internal.U u12 = this.f349148c;
                u12.f349381f = false;
                u12.f349382g.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.i
    @ResultIgnorabilityUnspecified
    public final <A extends C36616a.b, R extends com.google.android.gms.common.api.r, T extends C36634e.a<R, A>> T f(@j.N T t12) {
        C36616a<?> api = t12.getApi();
        C36729v.a("GoogleApiClient is not configured to use " + (api != null ? api.f348912c : "the API") + " required for this call.", this.f349160o.containsKey(t12.getClientKey()));
        ReentrantLock reentrantLock = this.f349147b;
        reentrantLock.lock();
        try {
            H0 h02 = this.f349149d;
            if (h02 == null) {
                this.f349153h.add(t12);
            } else {
                t12 = (T) h02.a(t12);
            }
            reentrantLock.unlock();
            return t12;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.i
    @ResultIgnorabilityUnspecified
    public final <A extends C36616a.b, T extends C36634e.a<? extends com.google.android.gms.common.api.r, A>> T g(@j.N T t12) {
        C20199a c20199a = this.f349160o;
        C36616a<?> api = t12.getApi();
        C36729v.a("GoogleApiClient is not configured to use " + (api != null ? api.f348912c : "the API") + " required for this call.", c20199a.containsKey(t12.getClientKey()));
        this.f349147b.lock();
        try {
            H0 h02 = this.f349149d;
            if (h02 == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f349154i) {
                this.f349153h.add(t12);
                while (!this.f349153h.isEmpty()) {
                    C36634e.a aVar = (C36634e.a) this.f349153h.remove();
                    k1 k1Var = this.f349169x;
                    k1Var.f349172a.add(aVar);
                    aVar.zan(k1Var.f349173b);
                    aVar.setFailedResult(Status.f348902h);
                }
            } else {
                t12 = (T) h02.b(t12);
            }
            this.f349147b.unlock();
            return t12;
        } catch (Throwable th2) {
            this.f349147b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.i
    @j.N
    public final C36616a.f h(@j.N C36616a.g gVar) {
        C36616a.f fVar = (C36616a.f) this.f349160o.get(gVar);
        C36729v.k(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // com.google.android.gms.common.api.i
    public final Looper i() {
        return this.f349152g;
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean j(com.google.android.gms.auth.api.signin.internal.f fVar) {
        H0 h02 = this.f349149d;
        return h02 != null && h02.i(fVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final void k() {
        H0 h02 = this.f349149d;
        if (h02 != null) {
            h02.e();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void l(C36648i1 c36648i1) {
        ReentrantLock reentrantLock = this.f349147b;
        reentrantLock.lock();
        try {
            if (this.f349168w == null) {
                this.f349168w = new HashSet();
            }
            this.f349168w.add(c36648i1);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void m(C36648i1 c36648i1) {
        ReentrantLock reentrantLock = this.f349147b;
        reentrantLock.lock();
        try {
            HashSet hashSet = this.f349168w;
            if (hashSet == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (hashSet.remove(c36648i1)) {
                reentrantLock.lock();
                try {
                    HashSet hashSet2 = this.f349168w;
                    if (hashSet2 == null) {
                        reentrantLock.unlock();
                    } else {
                        boolean zIsEmpty = hashSet2.isEmpty();
                        reentrantLock.unlock();
                        if (zIsEmpty) {
                        }
                    }
                    H0 h02 = this.f349149d;
                    if (h02 != null) {
                        h02.d();
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC25600a
    public final boolean p() {
        if (!this.f349154i) {
            return false;
        }
        this.f349154i = false;
        this.f349157l.removeMessages(2);
        this.f349157l.removeMessages(1);
        D0 d02 = this.f349159n;
        if (d02 != null) {
            d02.a();
            this.f349159n = null;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(int i12) {
        Integer num = this.f349167v;
        if (num == null) {
            this.f349167v = Integer.valueOf(i12);
        } else if (num.intValue() != i12) {
            int iIntValue = this.f349167v.intValue();
            throw new IllegalStateException(androidx.camera.camera2.internal.G.g(new StringBuilder("Cannot use sign-in mode: "), i12 != 1 ? i12 != 2 ? i12 != 3 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", ". Mode was already set to ", iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED"));
        }
        if (this.f349149d != null) {
            return;
        }
        C20199a c20199a = this.f349160o;
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (C36616a.f fVar : c20199a.values()) {
            zRequiresSignIn |= fVar.requiresSignIn();
            zProvidesSignIn |= fVar.providesSignIn();
        }
        int iIntValue2 = this.f349167v.intValue();
        C36616a.AbstractC10618a abstractC10618a = this.f349164s;
        ReentrantLock reentrantLock = this.f349147b;
        ArrayList arrayList = this.f349166u;
        C20199a c20199a2 = this.f349163r;
        if (iIntValue2 == 1) {
            if (!zRequiresSignIn) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue2 == 2 && zRequiresSignIn) {
            C20199a c20199a3 = new C20199a();
            C20199a c20199a4 = new C20199a();
            C36616a.f fVar2 = null;
            for (Map.Entry entry : c20199a.entrySet()) {
                C36616a.f fVar3 = (C36616a.f) entry.getValue();
                if (true == fVar3.providesSignIn()) {
                    fVar2 = fVar3;
                }
                if (fVar3.requiresSignIn()) {
                    c20199a3.put((C36616a.c) entry.getKey(), fVar3);
                } else {
                    c20199a4.put((C36616a.c) entry.getKey(), fVar3);
                }
            }
            C36729v.l("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c20199a3.isEmpty());
            C20199a c20199a5 = new C20199a();
            C20199a c20199a6 = new C20199a();
            for (C36616a c36616a : c20199a2.keySet()) {
                C36616a.g gVar = c36616a.f348911b;
                if (c20199a3.containsKey(gVar)) {
                    c20199a5.put(c36616a, (Boolean) c20199a2.get(c36616a));
                } else {
                    if (!c20199a4.containsKey(gVar)) {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                    c20199a6.put(c36616a, (Boolean) c20199a2.get(c36616a));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                A1 a12 = (A1) arrayList.get(i13);
                if (c20199a5.containsKey(a12.f348962a)) {
                    arrayList2.add(a12);
                } else {
                    if (!c20199a6.containsKey(a12.f348962a)) {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                    arrayList3.add(a12);
                }
            }
            this.f349149d = new E(this.f349151f, this, reentrantLock, this.f349152g, this.f349158m, c20199a3, c20199a4, this.f349162q, abstractC10618a, fVar2, arrayList2, arrayList3, c20199a5, c20199a6);
            return;
        }
        this.f349149d = new C36661o0(this.f349151f, this, reentrantLock, this.f349152g, this.f349158m, c20199a, this.f349162q, c20199a2, abstractC10618a, arrayList, this);
    }

    @InterfaceC25600a
    public final void r() {
        this.f349148c.f349381f = true;
        H0 h02 = this.f349149d;
        C36729v.j(h02);
        h02.c();
    }
}
