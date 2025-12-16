package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.C36585a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BaseMediaSource.java */
/* renamed from: com.google.android.exoplayer2.source.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36538a implements y {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<y.c> f346158b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public final HashSet<y.c> f346159c = new HashSet<>(1);

    /* renamed from: d, reason: collision with root package name */
    public final A.a f346160d = new A.a();

    /* renamed from: e, reason: collision with root package name */
    public final e.a f346161e = new e.a();

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Looper f346162f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public s0 f346163g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.analytics.p f346164h;

    public abstract void B(@j.P com.google.android.exoplayer2.upstream.M m12);

    public final void C(s0 s0Var) {
        this.f346163g = s0Var;
        Iterator<y.c> it = this.f346158b.iterator();
        while (it.hasNext()) {
            it.next().v(this, s0Var);
        }
    }

    public abstract void D();

    @Override // com.google.android.exoplayer2.source.y
    public final void h(Handler handler, A a12) {
        handler.getClass();
        this.f346160d.a(handler, a12);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void j(Handler handler, com.google.android.exoplayer2.drm.e eVar) {
        handler.getClass();
        this.f346161e.a(handler, eVar);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void n(y.c cVar) {
        ArrayList<y.c> arrayList = this.f346158b;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            w(cVar);
            return;
        }
        this.f346162f = null;
        this.f346163g = null;
        this.f346164h = null;
        this.f346159c.clear();
        D();
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void o(A a12) {
        CopyOnWriteArrayList<A.a.C10591a> copyOnWriteArrayList = this.f346160d.f345904c;
        Iterator<A.a.C10591a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            A.a.C10591a next = it.next();
            if (next.f345906b == a12) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void s(y.c cVar, @j.P com.google.android.exoplayer2.upstream.M m12, com.google.android.exoplayer2.analytics.p pVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f346162f;
        C36585a.b(looper == null || looper == looperMyLooper);
        this.f346164h = pVar;
        s0 s0Var = this.f346163g;
        this.f346158b.add(cVar);
        if (this.f346162f == null) {
            this.f346162f = looperMyLooper;
            this.f346159c.add(cVar);
            B(m12);
        } else if (s0Var != null) {
            u(cVar);
            cVar.v(this, s0Var);
        }
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void u(y.c cVar) {
        this.f346162f.getClass();
        HashSet<y.c> hashSet = this.f346159c;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (zIsEmpty) {
            A();
        }
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void w(y.c cVar) {
        HashSet<y.c> hashSet = this.f346159c;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        z();
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void x(com.google.android.exoplayer2.drm.e eVar) {
        this.f346161e.g(eVar);
    }

    public final A.a y(@j.P y.b bVar) {
        return new A.a(this.f346160d.f345904c, 0, bVar);
    }

    public void A() {
    }

    public void z() {
    }
}
