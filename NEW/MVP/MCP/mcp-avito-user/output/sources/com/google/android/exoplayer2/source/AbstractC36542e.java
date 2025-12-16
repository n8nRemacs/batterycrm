package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42153i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: CompositeMediaSource.java */
/* renamed from: com.google.android.exoplayer2.source.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36542e<T> extends AbstractC36538a {

    /* renamed from: i, reason: collision with root package name */
    public final HashMap<T, b<T>> f346236i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public Handler f346237j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.upstream.M f346238k;

    /* compiled from: CompositeMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.e$a */
    public final class a implements A, com.google.android.exoplayer2.drm.e {

        /* renamed from: b, reason: collision with root package name */
        @com.google.android.exoplayer2.util.Q
        public final T f346239b;

        /* renamed from: c, reason: collision with root package name */
        public A.a f346240c;

        /* renamed from: d, reason: collision with root package name */
        public e.a f346241d;

        public a(@com.google.android.exoplayer2.util.Q T t12) {
            this.f346240c = AbstractC36542e.this.y(null);
            this.f346241d = new e.a(AbstractC36542e.this.f346161e.f344338c, 0, null);
            this.f346239b = t12;
        }

        public final boolean a(int i12, @j.P y.b bVar) {
            y.b bVarE;
            T t12 = this.f346239b;
            AbstractC36542e abstractC36542e = AbstractC36542e.this;
            if (bVar != null) {
                bVarE = abstractC36542e.E(t12, bVar);
                if (bVarE == null) {
                    return false;
                }
            } else {
                bVarE = null;
            }
            int iF2 = abstractC36542e.F(i12, t12);
            A.a aVar = this.f346240c;
            if (aVar.f345902a != iF2 || !com.google.android.exoplayer2.util.U.a(aVar.f345903b, bVarE)) {
                this.f346240c = new A.a(abstractC36542e.f346160d.f345904c, iF2, bVarE);
            }
            e.a aVar2 = this.f346241d;
            if (aVar2.f344336a == iF2 && com.google.android.exoplayer2.util.U.a(aVar2.f344337b, bVarE)) {
                return true;
            }
            this.f346241d = new e.a(abstractC36542e.f346161e.f344338c, iF2, bVarE);
            return true;
        }

        public final C36557u b(C36557u c36557u) {
            AbstractC36542e.this.getClass();
            long j12 = c36557u.f346693f;
            long j13 = c36557u.f346693f;
            long j14 = c36557u.f346694g;
            if (j13 == j12 && j14 == j14) {
                return c36557u;
            }
            return new C36557u(c36557u.f346688a, c36557u.f346689b, c36557u.f346690c, c36557u.f346691d, c36557u.f346692e, j13, j14);
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void d(int i12, @j.P y.b bVar, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f346240c.m(b(c36557u));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void e(int i12, @j.P y.b bVar, int i13) {
            if (a(i12, bVar)) {
                this.f346241d.d(i13);
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void f(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u, IOException iOException, boolean z12) {
            if (a(i12, bVar)) {
                this.f346240c.j(c36554q, b(c36557u), iOException, z12);
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void g(int i12, @j.P y.b bVar) {
            if (a(i12, bVar)) {
                this.f346241d.c();
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void i(int i12, @j.P y.b bVar, Exception exc) {
            if (a(i12, bVar)) {
                this.f346241d.e(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void k(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f346240c.g(c36554q, b(c36557u));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void l(int i12, @j.P y.b bVar) {
            if (a(i12, bVar)) {
                this.f346241d.f();
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void m(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f346240c.e(c36554q, b(c36557u));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void p(int i12, @j.P y.b bVar) {
            if (a(i12, bVar)) {
                this.f346241d.b();
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void q(int i12, @j.P y.b bVar, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f346240c.c(b(c36557u));
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void r(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f346240c.l(c36554q, b(c36557u));
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.e$b */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final y f346243a;

        /* renamed from: b, reason: collision with root package name */
        public final C36541d f346244b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC36542e<T>.a f346245c;

        public b(y yVar, C36541d c36541d, a aVar) {
            this.f346243a = yVar;
            this.f346244b = c36541d;
            this.f346245c = aVar;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    @InterfaceC42153i
    public void A() {
        for (b<T> bVar : this.f346236i.values()) {
            bVar.f346243a.u(bVar.f346244b);
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    @InterfaceC42153i
    public void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        this.f346238k = m12;
        this.f346237j = com.google.android.exoplayer2.util.U.n(null);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    @InterfaceC42153i
    public void D() {
        HashMap<T, b<T>> map = this.f346236i;
        for (b<T> bVar : map.values()) {
            bVar.f346243a.n(bVar.f346244b);
            AbstractC36542e<T>.a aVar = bVar.f346245c;
            y yVar = bVar.f346243a;
            yVar.o(aVar);
            yVar.x(aVar);
        }
        map.clear();
    }

    public abstract void G(@com.google.android.exoplayer2.util.Q Object obj, AbstractC36538a abstractC36538a, s0 s0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.exoplayer2.source.d, com.google.android.exoplayer2.source.y$c] */
    public final void H(@com.google.android.exoplayer2.util.Q final T t12, y yVar) {
        HashMap<T, b<T>> map = this.f346236i;
        C36585a.b(!map.containsKey(t12));
        ?? r12 = new y.c() { // from class: com.google.android.exoplayer2.source.d
            @Override // com.google.android.exoplayer2.source.y.c
            public final void v(AbstractC36538a abstractC36538a, s0 s0Var) {
                this.f346234b.G(t12, abstractC36538a, s0Var);
            }
        };
        a aVar = new a(t12);
        map.put(t12, new b<>(yVar, r12, aVar));
        Handler handler = this.f346237j;
        handler.getClass();
        yVar.h(handler, aVar);
        Handler handler2 = this.f346237j;
        handler2.getClass();
        yVar.j(handler2, aVar);
        com.google.android.exoplayer2.upstream.M m12 = this.f346238k;
        com.google.android.exoplayer2.analytics.p pVar = this.f346164h;
        C36585a.e(pVar);
        yVar.s(r12, m12, pVar);
        if (this.f346159c.isEmpty()) {
            yVar.w(r12);
        }
    }

    public final void I(@com.google.android.exoplayer2.util.Q y.b bVar) {
        b<T> bVarRemove = this.f346236i.remove(bVar);
        bVarRemove.getClass();
        C36541d c36541d = bVarRemove.f346244b;
        y yVar = bVarRemove.f346243a;
        yVar.n(c36541d);
        AbstractC36542e<T>.a aVar = bVarRemove.f346245c;
        yVar.o(aVar);
        yVar.x(aVar);
    }

    @Override // com.google.android.exoplayer2.source.y
    @InterfaceC42153i
    public void maybeThrowSourceInfoRefreshError() {
        Iterator<b<T>> it = this.f346236i.values().iterator();
        while (it.hasNext()) {
            it.next().f346243a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    @InterfaceC42153i
    public void z() {
        for (b<T> bVar : this.f346236i.values()) {
            bVar.f346243a.w(bVar.f346244b);
        }
    }

    @j.P
    public y.b E(@com.google.android.exoplayer2.util.Q T t12, y.b bVar) {
        return bVar;
    }

    public int F(int i12, @com.google.android.exoplayer2.util.Q Object obj) {
        return i12;
    }
}
