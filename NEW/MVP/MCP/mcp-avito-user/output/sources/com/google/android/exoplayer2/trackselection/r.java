package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.H1;
import com.google.common.collect.O4;
import j.P;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import v61.InterfaceC49173d;

/* compiled from: TrackSelectionParameters.java */
/* loaded from: classes6.dex */
public class r implements InterfaceC36525h {

    /* renamed from: B, reason: collision with root package name */
    public static final r f347281B = new r(new a());

    /* renamed from: A, reason: collision with root package name */
    public final H1<Integer> f347282A;

    /* renamed from: b, reason: collision with root package name */
    public final int f347283b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347284c;

    /* renamed from: d, reason: collision with root package name */
    public final int f347285d;

    /* renamed from: e, reason: collision with root package name */
    public final int f347286e;

    /* renamed from: f, reason: collision with root package name */
    public final int f347287f;

    /* renamed from: g, reason: collision with root package name */
    public final int f347288g;

    /* renamed from: h, reason: collision with root package name */
    public final int f347289h;

    /* renamed from: i, reason: collision with root package name */
    public final int f347290i;

    /* renamed from: j, reason: collision with root package name */
    public final int f347291j;

    /* renamed from: k, reason: collision with root package name */
    public final int f347292k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f347293l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC37401r1<String> f347294m;

    /* renamed from: n, reason: collision with root package name */
    public final int f347295n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC37401r1<String> f347296o;

    /* renamed from: p, reason: collision with root package name */
    public final int f347297p;

    /* renamed from: q, reason: collision with root package name */
    public final int f347298q;

    /* renamed from: r, reason: collision with root package name */
    public final int f347299r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC37401r1<String> f347300s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC37401r1<String> f347301t;

    /* renamed from: u, reason: collision with root package name */
    public final int f347302u;

    /* renamed from: v, reason: collision with root package name */
    public final int f347303v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f347304w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f347305x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f347306y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC37412t1<V, q> f347307z;

    /* compiled from: TrackSelectionParameters.java */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public int f347312e;

        /* renamed from: f, reason: collision with root package name */
        public int f347313f;

        /* renamed from: g, reason: collision with root package name */
        public int f347314g;

        /* renamed from: h, reason: collision with root package name */
        public int f347315h;

        /* renamed from: a, reason: collision with root package name */
        public int f347308a = Integer.MAX_VALUE;

        /* renamed from: b, reason: collision with root package name */
        public int f347309b = Integer.MAX_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f347310c = Integer.MAX_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f347311d = Integer.MAX_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public int f347316i = Integer.MAX_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public int f347317j = Integer.MAX_VALUE;

        /* renamed from: k, reason: collision with root package name */
        public boolean f347318k = true;

        /* renamed from: l, reason: collision with root package name */
        public AbstractC37401r1<String> f347319l = AbstractC37401r1.C();

        /* renamed from: m, reason: collision with root package name */
        public int f347320m = 0;

        /* renamed from: n, reason: collision with root package name */
        public AbstractC37401r1<String> f347321n = AbstractC37401r1.C();

        /* renamed from: o, reason: collision with root package name */
        public int f347322o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f347323p = Integer.MAX_VALUE;

        /* renamed from: q, reason: collision with root package name */
        public int f347324q = Integer.MAX_VALUE;

        /* renamed from: r, reason: collision with root package name */
        public AbstractC37401r1<String> f347325r = AbstractC37401r1.C();

        /* renamed from: s, reason: collision with root package name */
        public AbstractC37401r1<String> f347326s = AbstractC37401r1.C();

        /* renamed from: t, reason: collision with root package name */
        public int f347327t = 0;

        /* renamed from: u, reason: collision with root package name */
        public int f347328u = 0;

        /* renamed from: v, reason: collision with root package name */
        public boolean f347329v = false;

        /* renamed from: w, reason: collision with root package name */
        public boolean f347330w = false;

        /* renamed from: x, reason: collision with root package name */
        public boolean f347331x = false;

        /* renamed from: y, reason: collision with root package name */
        public HashMap<V, q> f347332y = new HashMap<>();

        /* renamed from: z, reason: collision with root package name */
        public HashSet<Integer> f347333z = new HashSet<>();

        @Deprecated
        public a() {
        }

        public static AbstractC37401r1<String> d(String[] strArr) {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            for (String str : strArr) {
                str.getClass();
                aVar.g(U.I(str));
            }
            return aVar.i();
        }

        public r a() {
            return new r(this);
        }

        public a b(int i12) {
            Iterator<q> it = this.f347332y.values().iterator();
            while (it.hasNext()) {
                if (it.next().f347279b.f346150d == i12) {
                    it.remove();
                }
            }
            return this;
        }

        @InterfaceC49173d
        public final void c(r rVar) {
            this.f347308a = rVar.f347283b;
            this.f347309b = rVar.f347284c;
            this.f347310c = rVar.f347285d;
            this.f347311d = rVar.f347286e;
            this.f347312e = rVar.f347287f;
            this.f347313f = rVar.f347288g;
            this.f347314g = rVar.f347289h;
            this.f347315h = rVar.f347290i;
            this.f347316i = rVar.f347291j;
            this.f347317j = rVar.f347292k;
            this.f347318k = rVar.f347293l;
            this.f347319l = rVar.f347294m;
            this.f347320m = rVar.f347295n;
            this.f347321n = rVar.f347296o;
            this.f347322o = rVar.f347297p;
            this.f347323p = rVar.f347298q;
            this.f347324q = rVar.f347299r;
            this.f347325r = rVar.f347300s;
            this.f347326s = rVar.f347301t;
            this.f347327t = rVar.f347302u;
            this.f347328u = rVar.f347303v;
            this.f347329v = rVar.f347304w;
            this.f347330w = rVar.f347305x;
            this.f347331x = rVar.f347306y;
            this.f347333z = new HashSet<>(rVar.f347282A);
            this.f347332y = new HashMap<>(rVar.f347307z);
        }

        public a e() {
            this.f347328u = -3;
            return this;
        }

        public a f(q qVar) {
            V v12 = qVar.f347279b;
            b(v12.f346150d);
            this.f347332y.put(v12, qVar);
            return this;
        }

        public a g(int i12) {
            this.f347333z.remove(Integer.valueOf(i12));
            return this;
        }

        public a h(int i12, int i13) {
            this.f347316i = i12;
            this.f347317j = i13;
            this.f347318k = true;
            return this;
        }
    }

    public r(a aVar) {
        this.f347283b = aVar.f347308a;
        this.f347284c = aVar.f347309b;
        this.f347285d = aVar.f347310c;
        this.f347286e = aVar.f347311d;
        this.f347287f = aVar.f347312e;
        this.f347288g = aVar.f347313f;
        this.f347289h = aVar.f347314g;
        this.f347290i = aVar.f347315h;
        this.f347291j = aVar.f347316i;
        this.f347292k = aVar.f347317j;
        this.f347293l = aVar.f347318k;
        this.f347294m = aVar.f347319l;
        this.f347295n = aVar.f347320m;
        this.f347296o = aVar.f347321n;
        this.f347297p = aVar.f347322o;
        this.f347298q = aVar.f347323p;
        this.f347299r = aVar.f347324q;
        this.f347300s = aVar.f347325r;
        this.f347301t = aVar.f347326s;
        this.f347302u = aVar.f347327t;
        this.f347303v = aVar.f347328u;
        this.f347304w = aVar.f347329v;
        this.f347305x = aVar.f347330w;
        this.f347306y = aVar.f347331x;
        this.f347307z = AbstractC37412t1.c(aVar.f347332y);
        this.f347282A = H1.v(aVar.f347333z);
    }

    public a a() {
        a aVar = new a();
        aVar.c(this);
        return aVar;
    }

    public boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f347283b == rVar.f347283b && this.f347284c == rVar.f347284c && this.f347285d == rVar.f347285d && this.f347286e == rVar.f347286e && this.f347287f == rVar.f347287f && this.f347288g == rVar.f347288g && this.f347289h == rVar.f347289h && this.f347290i == rVar.f347290i && this.f347293l == rVar.f347293l && this.f347291j == rVar.f347291j && this.f347292k == rVar.f347292k && this.f347294m.equals(rVar.f347294m) && this.f347295n == rVar.f347295n && this.f347296o.equals(rVar.f347296o) && this.f347297p == rVar.f347297p && this.f347298q == rVar.f347298q && this.f347299r == rVar.f347299r && this.f347300s.equals(rVar.f347300s) && this.f347301t.equals(rVar.f347301t) && this.f347302u == rVar.f347302u && this.f347303v == rVar.f347303v && this.f347304w == rVar.f347304w && this.f347305x == rVar.f347305x && this.f347306y == rVar.f347306y && this.f347307z.equals(rVar.f347307z) && this.f347282A.equals(rVar.f347282A);
    }

    public int hashCode() {
        return this.f347282A.hashCode() + ((this.f347307z.hashCode() + ((((((((((((this.f347301t.hashCode() + ((this.f347300s.hashCode() + ((((((((this.f347296o.hashCode() + ((((this.f347294m.hashCode() + ((((((((((((((((((((((this.f347283b + 31) * 31) + this.f347284c) * 31) + this.f347285d) * 31) + this.f347286e) * 31) + this.f347287f) * 31) + this.f347288g) * 31) + this.f347289h) * 31) + this.f347290i) * 31) + (this.f347293l ? 1 : 0)) * 31) + this.f347291j) * 31) + this.f347292k) * 31)) * 31) + this.f347295n) * 31)) * 31) + this.f347297p) * 31) + this.f347298q) * 31) + this.f347299r) * 31)) * 31)) * 31) + this.f347302u) * 31) + this.f347303v) * 31) + (this.f347304w ? 1 : 0)) * 31) + (this.f347305x ? 1 : 0)) * 31) + (this.f347306y ? 1 : 0)) * 31)) * 31);
    }
}
