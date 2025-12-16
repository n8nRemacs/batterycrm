package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C20199a;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36729v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import r61.InterfaceC47501c;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36661o0 implements H0, B1 {

    /* renamed from: A, reason: collision with root package name */
    public final F0 f349188A;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f349189a;

    /* renamed from: b, reason: collision with root package name */
    public final Condition f349190b;

    /* renamed from: p, reason: collision with root package name */
    public final Context f349191p;

    /* renamed from: q, reason: collision with root package name */
    public final C36688g f349192q;

    /* renamed from: r, reason: collision with root package name */
    public final HandlerC36659n0 f349193r;

    /* renamed from: s, reason: collision with root package name */
    public final C20199a f349194s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f349195t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public final C36703g f349196u;

    /* renamed from: v, reason: collision with root package name */
    public final C20199a f349197v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    public final C36616a.AbstractC10618a f349198w;

    /* renamed from: x, reason: collision with root package name */
    @InterfaceC47501c
    public volatile InterfaceC36655l0 f349199x;

    /* renamed from: y, reason: collision with root package name */
    public int f349200y;

    /* renamed from: z, reason: collision with root package name */
    public final C36653k0 f349201z;

    public C36661o0(Context context, C36653k0 c36653k0, ReentrantLock reentrantLock, Looper looper, C36688g c36688g, C20199a c20199a, @j.P C36703g c36703g, C20199a c20199a2, @j.P C36616a.AbstractC10618a abstractC10618a, ArrayList arrayList, F0 f02) {
        this.f349191p = context;
        this.f349189a = reentrantLock;
        this.f349192q = c36688g;
        this.f349194s = c20199a;
        this.f349196u = c36703g;
        this.f349197v = c20199a2;
        this.f349198w = abstractC10618a;
        this.f349201z = c36653k0;
        this.f349188A = f02;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((A1) arrayList.get(i12)).f348964p = this;
        }
        this.f349193r = new HandlerC36659n0(this, looper);
        this.f349190b = reentrantLock.newCondition();
        this.f349199x = new C36629c0(this);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final C36634e.a a(@j.N C36634e.a aVar) {
        aVar.zak();
        this.f349199x.f(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final C36634e.a b(@j.N C36634e.a aVar) {
        aVar.zak();
        return this.f349199x.h(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final void c() {
        this.f349199x.d();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final void d() {
        if (this.f349199x instanceof N) {
            N n12 = (N) this.f349199x;
            if (n12.f349037b) {
                n12.f349037b = false;
                n12.f349036a.f349201z.f349169x.a();
                n12.g();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @InterfaceC25600a
    public final void f() {
        if (this.f349199x.g()) {
            this.f349195t.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void g(String str, @j.P FileDescriptor fileDescriptor, PrintWriter printWriter, @j.P String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f349199x);
        for (C36616a c36616a : this.f349197v.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) c36616a.f348912c).println(":");
            C36616a.f fVar = (C36616a.f) this.f349194s.get(c36616a.f348911b);
            C36729v.j(fVar);
            fVar.dump(strValueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean h() {
        return this.f349199x instanceof N;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean i(com.google.android.gms.auth.api.signin.internal.f fVar) {
        return false;
    }

    public final void j() {
        this.f349189a.lock();
        try {
            this.f349199x = new C36629c0(this);
            this.f349199x.c();
            this.f349190b.signalAll();
        } finally {
            this.f349189a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnected(@j.P Bundle bundle) {
        this.f349189a.lock();
        try {
            this.f349199x.a(bundle);
        } finally {
            this.f349189a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnectionSuspended(int i12) {
        this.f349189a.lock();
        try {
            this.f349199x.e(i12);
        } finally {
            this.f349189a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void e() {
    }
}
