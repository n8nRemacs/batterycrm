package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.C20199a;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36717n;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36626b0 implements InterfaceC36655l0 {

    /* renamed from: a, reason: collision with root package name */
    public final C36661o0 f349077a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f349078b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f349079c;

    /* renamed from: d, reason: collision with root package name */
    public final C36688g f349080d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public ConnectionResult f349081e;

    /* renamed from: f, reason: collision with root package name */
    public int f349082f;

    /* renamed from: h, reason: collision with root package name */
    public int f349084h;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public com.google.android.gms.signin.f f349087k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f349088l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f349089m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f349090n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public InterfaceC36717n f349091o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f349092p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f349093q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    public final C36703g f349094r;

    /* renamed from: s, reason: collision with root package name */
    public final C20199a f349095s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public final C36616a.AbstractC10618a f349096t;

    /* renamed from: g, reason: collision with root package name */
    public int f349083g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f349085i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f349086j = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f349097u = new ArrayList();

    public C36626b0(C36661o0 c36661o0, @j.P C36703g c36703g, C20199a c20199a, C36688g c36688g, @j.P C36616a.AbstractC10618a abstractC10618a, ReentrantLock reentrantLock, Context context) {
        this.f349077a = c36661o0;
        this.f349094r = c36703g;
        this.f349095s = c20199a;
        this.f349080d = c36688g;
        this.f349096t = abstractC10618a;
        this.f349078b = reentrantLock;
        this.f349079c = context;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    @InterfaceC25600a
    public final void a(@j.P Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f349085i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    @InterfaceC25600a
    public final void b(ConnectionResult connectionResult, C36616a c36616a, boolean z12) {
        if (o(1)) {
            m(connectionResult, c36616a, z12);
            if (p()) {
                k();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.common.api.a$f, com.google.android.gms.signin.f] */
    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    @InterfaceC25600a
    public final void c() {
        C20199a c20199a;
        C36661o0 c36661o0 = this.f349077a;
        c36661o0.f349195t.clear();
        this.f349089m = false;
        X x12 = null;
        this.f349081e = null;
        this.f349083g = 0;
        this.f349088l = true;
        this.f349090n = false;
        this.f349092p = false;
        HashMap map = new HashMap();
        C20199a c20199a2 = this.f349095s;
        Iterator it = c20199a2.keySet().iterator();
        boolean z12 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            c20199a = c36661o0.f349194s;
            if (!zHasNext) {
                break;
            }
            C36616a c36616a = (C36616a) it.next();
            C36616a.f fVar = (C36616a.f) c20199a.get(c36616a.f348911b);
            C36729v.j(fVar);
            C36616a.f fVar2 = fVar;
            z12 |= c36616a.f348910a.getPriority() == 1;
            boolean zBooleanValue = ((Boolean) c20199a2.get(c36616a)).booleanValue();
            if (fVar2.requiresSignIn()) {
                this.f349089m = true;
                if (zBooleanValue) {
                    this.f349086j.add(c36616a.f348911b);
                } else {
                    this.f349088l = false;
                }
            }
            map.put(fVar2, new P(this, c36616a, zBooleanValue));
        }
        if (z12) {
            this.f349089m = false;
        }
        if (this.f349089m) {
            C36703g c36703g = this.f349094r;
            C36729v.j(c36703g);
            C36616a.AbstractC10618a abstractC10618a = this.f349096t;
            C36729v.j(abstractC10618a);
            C36653k0 c36653k0 = c36661o0.f349201z;
            c36703g.f349431h = Integer.valueOf(System.identityHashCode(c36653k0));
            Y y12 = new Y(this, x12);
            this.f349087k = abstractC10618a.buildClient(this.f349079c, c36653k0.f349152g, c36703g, (C36703g) c36703g.f349430g, (i.b) y12, (i.c) y12);
        }
        this.f349084h = c20199a.f25790d;
        this.f349097u.add(C36663p0.f349203a.submit(new T(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    @InterfaceC25600a
    public final void e(int i12) {
        l(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final C36634e.a f(C36634e.a aVar) {
        this.f349077a.f349201z.f349153h.add(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    @InterfaceC25600a
    public final boolean g() {
        ArrayList arrayList = this.f349097u;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((Future) arrayList.get(i12)).cancel(true);
        }
        arrayList.clear();
        j(true);
        this.f349077a.j();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final C36634e.a h(C36634e.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @InterfaceC25600a
    public final void i() {
        this.f349089m = false;
        C36661o0 c36661o0 = this.f349077a;
        c36661o0.f349201z.f349161p = Collections.emptySet();
        Iterator it = this.f349086j.iterator();
        while (it.hasNext()) {
            C36616a.c cVar = (C36616a.c) it.next();
            HashMap map = c36661o0.f349195t;
            if (!map.containsKey(cVar)) {
                map.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    @InterfaceC25600a
    public final void j(boolean z12) {
        com.google.android.gms.signin.f fVar = this.f349087k;
        if (fVar != null) {
            if (fVar.isConnected() && z12) {
                fVar.b();
            }
            fVar.disconnect();
            C36729v.j(this.f349094r);
            this.f349091o = null;
        }
    }

    @InterfaceC25600a
    public final void k() {
        C36661o0 c36661o0 = this.f349077a;
        c36661o0.f349189a.lock();
        try {
            c36661o0.f349201z.p();
            c36661o0.f349199x = new N(c36661o0);
            c36661o0.f349199x.c();
            c36661o0.f349190b.signalAll();
            c36661o0.f349189a.unlock();
            C36663p0.f349203a.execute(new O(this));
            com.google.android.gms.signin.f fVar = this.f349087k;
            if (fVar != null) {
                if (this.f349092p) {
                    InterfaceC36717n interfaceC36717n = this.f349091o;
                    C36729v.j(interfaceC36717n);
                    fVar.c(interfaceC36717n, this.f349093q);
                }
                j(false);
            }
            Iterator it = this.f349077a.f349195t.keySet().iterator();
            while (it.hasNext()) {
                C36616a.f fVar2 = (C36616a.f) this.f349077a.f349194s.get((C36616a.c) it.next());
                C36729v.j(fVar2);
                fVar2.disconnect();
            }
            this.f349077a.f349188A.b(this.f349085i.isEmpty() ? null : this.f349085i);
        } catch (Throwable th2) {
            c36661o0.f349189a.unlock();
            throw th2;
        }
    }

    @InterfaceC25600a
    public final void l(ConnectionResult connectionResult) {
        ArrayList arrayList = this.f349097u;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((Future) arrayList.get(i12)).cancel(true);
        }
        arrayList.clear();
        j(!connectionResult.h());
        C36661o0 c36661o0 = this.f349077a;
        c36661o0.j();
        c36661o0.f349188A.c(connectionResult);
    }

    @InterfaceC25600a
    public final void m(ConnectionResult connectionResult, C36616a c36616a, boolean z12) {
        int priority = c36616a.f348910a.getPriority();
        if ((!z12 || connectionResult.h() || this.f349080d.b(null, connectionResult.f348860c, null) != null) && (this.f349081e == null || priority < this.f349082f)) {
            this.f349081e = connectionResult;
            this.f349082f = priority;
        }
        this.f349077a.f349195t.put(c36616a.f348911b, connectionResult);
    }

    @InterfaceC25600a
    public final void n() {
        if (this.f349084h != 0) {
            return;
        }
        if (!this.f349089m || this.f349090n) {
            ArrayList arrayList = new ArrayList();
            this.f349083g = 1;
            C36661o0 c36661o0 = this.f349077a;
            C20199a c20199a = c36661o0.f349194s;
            this.f349084h = c20199a.f25790d;
            for (C36616a.c cVar : c20199a.keySet()) {
                if (!c36661o0.f349195t.containsKey(cVar)) {
                    arrayList.add((C36616a.f) c36661o0.f349194s.get(cVar));
                } else if (p()) {
                    k();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f349097u.add(C36663p0.f349203a.submit(new U(this, arrayList)));
        }
    }

    @InterfaceC25600a
    public final boolean o(int i12) {
        if (this.f349083g == i12) {
            return true;
        }
        C36653k0 c36653k0 = this.f349077a.f349201z;
        c36653k0.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(c36653k0.f349151f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(c36653k0.f349154i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(c36653k0.f349153h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(c36653k0.f349169x.f349172a.size());
        H0 h02 = c36653k0.f349149d;
        if (h02 != null) {
            h02.g("", null, printWriter, null);
        }
        stringWriter.toString();
        "Unexpected callback in ".concat(toString());
        new Exception();
        l(new ConnectionResult(8, null));
        return false;
    }

    @InterfaceC25600a
    public final boolean p() {
        int i12 = this.f349084h - 1;
        this.f349084h = i12;
        if (i12 > 0) {
            return false;
        }
        C36661o0 c36661o0 = this.f349077a;
        if (i12 >= 0) {
            ConnectionResult connectionResult = this.f349081e;
            if (connectionResult == null) {
                return true;
            }
            c36661o0.f349200y = this.f349082f;
            l(connectionResult);
            return false;
        }
        C36653k0 c36653k0 = c36661o0.f349201z;
        c36653k0.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(c36653k0.f349151f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(c36653k0.f349154i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(c36653k0.f349153h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(c36653k0.f349169x.f349172a.size());
        H0 h02 = c36653k0.f349149d;
        if (h02 != null) {
            h02.g("", null, printWriter, null);
        }
        stringWriter.toString();
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        l(new ConnectionResult(8, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36655l0
    public final void d() {
    }
}
