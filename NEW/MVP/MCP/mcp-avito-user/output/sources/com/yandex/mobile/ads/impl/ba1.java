package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ba1 implements rg {

    /* renamed from: A, reason: collision with root package name */
    public static final ba1 f383823A = new ba1(new a());

    /* renamed from: a, reason: collision with root package name */
    public final int f383824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f383825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f383826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f383827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f383828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f383829f;

    /* renamed from: g, reason: collision with root package name */
    public final int f383830g;

    /* renamed from: h, reason: collision with root package name */
    public final int f383831h;

    /* renamed from: i, reason: collision with root package name */
    public final int f383832i;

    /* renamed from: j, reason: collision with root package name */
    public final int f383833j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f383834k;

    /* renamed from: l, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f383835l;

    /* renamed from: m, reason: collision with root package name */
    public final int f383836m;

    /* renamed from: n, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f383837n;

    /* renamed from: o, reason: collision with root package name */
    public final int f383838o;

    /* renamed from: p, reason: collision with root package name */
    public final int f383839p;

    /* renamed from: q, reason: collision with root package name */
    public final int f383840q;

    /* renamed from: r, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f383841r;

    /* renamed from: s, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f383842s;

    /* renamed from: t, reason: collision with root package name */
    public final int f383843t;

    /* renamed from: u, reason: collision with root package name */
    public final int f383844u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f383845v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f383846w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f383847x;

    /* renamed from: y, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.q<v91, aa1> f383848y;

    /* renamed from: z, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.r<Integer> f383849z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f383850a;

        /* renamed from: b, reason: collision with root package name */
        private int f383851b;

        /* renamed from: c, reason: collision with root package name */
        private int f383852c;

        /* renamed from: d, reason: collision with root package name */
        private int f383853d;

        /* renamed from: e, reason: collision with root package name */
        private int f383854e;

        /* renamed from: f, reason: collision with root package name */
        private int f383855f;

        /* renamed from: g, reason: collision with root package name */
        private int f383856g;

        /* renamed from: h, reason: collision with root package name */
        private int f383857h;

        /* renamed from: i, reason: collision with root package name */
        private int f383858i;

        /* renamed from: j, reason: collision with root package name */
        private int f383859j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f383860k;

        /* renamed from: l, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f383861l;

        /* renamed from: m, reason: collision with root package name */
        private int f383862m;

        /* renamed from: n, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f383863n;

        /* renamed from: o, reason: collision with root package name */
        private int f383864o;

        /* renamed from: p, reason: collision with root package name */
        private int f383865p;

        /* renamed from: q, reason: collision with root package name */
        private int f383866q;

        /* renamed from: r, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f383867r;

        /* renamed from: s, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f383868s;

        /* renamed from: t, reason: collision with root package name */
        private int f383869t;

        /* renamed from: u, reason: collision with root package name */
        private int f383870u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f383871v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f383872w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f383873x;

        /* renamed from: y, reason: collision with root package name */
        private HashMap<v91, aa1> f383874y;

        /* renamed from: z, reason: collision with root package name */
        private HashSet<Integer> f383875z;

        @Deprecated
        public a() {
            this.f383850a = Integer.MAX_VALUE;
            this.f383851b = Integer.MAX_VALUE;
            this.f383852c = Integer.MAX_VALUE;
            this.f383853d = Integer.MAX_VALUE;
            this.f383858i = Integer.MAX_VALUE;
            this.f383859j = Integer.MAX_VALUE;
            this.f383860k = true;
            this.f383861l = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f383862m = 0;
            this.f383863n = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f383864o = 0;
            this.f383865p = Integer.MAX_VALUE;
            this.f383866q = Integer.MAX_VALUE;
            this.f383867r = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f383868s = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f383869t = 0;
            this.f383870u = 0;
            this.f383871v = false;
            this.f383872w = false;
            this.f383873x = false;
            this.f383874y = new HashMap<>();
            this.f383875z = new HashSet<>();
        }

        public a a(int i12, int i13) {
            this.f383858i = i12;
            this.f383859j = i13;
            this.f383860k = true;
            return this;
        }

        public void b(Context context) {
            Point pointC = pc1.c(context);
            a(pointC.x, pointC.y);
        }

        public void a(Context context) {
            CaptioningManager captioningManager;
            int i12 = pc1.f388768a;
            if (i12 >= 19) {
                if ((i12 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.f383869t = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.f383868s = com.yandex.mobile.ads.embedded.guava.collect.p.a(pc1.a(locale));
                    }
                }
            }
        }

        private static com.yandex.mobile.ads.embedded.guava.collect.p<String> a(String[] strArr) {
            int i12 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
            p.a aVar = new p.a();
            for (String str : strArr) {
                str.getClass();
                aVar.b(pc1.d(str));
            }
            return aVar.a();
        }

        public a(Context context) {
            this();
            a(context);
            b(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
        public a(Bundle bundle) {
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA;
            String strA = ba1.a(6);
            ba1 ba1Var = ba1.f383823A;
            this.f383850a = bundle.getInt(strA, ba1Var.f383824a);
            this.f383851b = bundle.getInt(ba1.a(7), ba1Var.f383825b);
            this.f383852c = bundle.getInt(ba1.a(8), ba1Var.f383826c);
            this.f383853d = bundle.getInt(ba1.a(9), ba1Var.f383827d);
            this.f383854e = bundle.getInt(ba1.a(10), ba1Var.f383828e);
            this.f383855f = bundle.getInt(ba1.a(11), ba1Var.f383829f);
            this.f383856g = bundle.getInt(ba1.a(12), ba1Var.f383830g);
            this.f383857h = bundle.getInt(ba1.a(13), ba1Var.f383831h);
            this.f383858i = bundle.getInt(ba1.a(14), ba1Var.f383832i);
            this.f383859j = bundle.getInt(ba1.a(15), ba1Var.f383833j);
            this.f383860k = bundle.getBoolean(ba1.a(16), ba1Var.f383834k);
            this.f383861l = com.yandex.mobile.ads.embedded.guava.collect.p.b((String[]) hh0.a(bundle.getStringArray(ba1.a(17)), new String[0]));
            this.f383862m = bundle.getInt(ba1.a(25), ba1Var.f383836m);
            this.f383863n = a((String[]) hh0.a(bundle.getStringArray(ba1.a(1)), new String[0]));
            this.f383864o = bundle.getInt(ba1.a(2), ba1Var.f383838o);
            this.f383865p = bundle.getInt(ba1.a(18), ba1Var.f383839p);
            this.f383866q = bundle.getInt(ba1.a(19), ba1Var.f383840q);
            this.f383867r = com.yandex.mobile.ads.embedded.guava.collect.p.b((String[]) hh0.a(bundle.getStringArray(ba1.a(20)), new String[0]));
            this.f383868s = a((String[]) hh0.a(bundle.getStringArray(ba1.a(3)), new String[0]));
            this.f383869t = bundle.getInt(ba1.a(4), ba1Var.f383843t);
            this.f383870u = bundle.getInt(ba1.a(26), ba1Var.f383844u);
            this.f383871v = bundle.getBoolean(ba1.a(5), ba1Var.f383845v);
            this.f383872w = bundle.getBoolean(ba1.a(21), ba1Var.f383846w);
            this.f383873x = bundle.getBoolean(ba1.a(22), ba1Var.f383847x);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(ba1.a(23));
            if (parcelableArrayList == null) {
                pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            } else {
                pVarA = sg.a(aa1.f383450c, parcelableArrayList);
            }
            this.f383874y = new HashMap<>();
            for (int i12 = 0; i12 < pVarA.size(); i12++) {
                aa1 aa1Var = (aa1) pVarA.get(i12);
                this.f383874y.put(aa1Var.f383451a, aa1Var);
            }
            int[] iArr = (int[]) hh0.a(bundle.getIntArray(ba1.a(24)), new int[0]);
            this.f383875z = new HashSet<>();
            for (int i13 : iArr) {
                this.f383875z.add(Integer.valueOf(i13));
            }
        }
    }

    public ba1(a aVar) {
        this.f383824a = aVar.f383850a;
        this.f383825b = aVar.f383851b;
        this.f383826c = aVar.f383852c;
        this.f383827d = aVar.f383853d;
        this.f383828e = aVar.f383854e;
        this.f383829f = aVar.f383855f;
        this.f383830g = aVar.f383856g;
        this.f383831h = aVar.f383857h;
        this.f383832i = aVar.f383858i;
        this.f383833j = aVar.f383859j;
        this.f383834k = aVar.f383860k;
        this.f383835l = aVar.f383861l;
        this.f383836m = aVar.f383862m;
        this.f383837n = aVar.f383863n;
        this.f383838o = aVar.f383864o;
        this.f383839p = aVar.f383865p;
        this.f383840q = aVar.f383866q;
        this.f383841r = aVar.f383867r;
        this.f383842s = aVar.f383868s;
        this.f383843t = aVar.f383869t;
        this.f383844u = aVar.f383870u;
        this.f383845v = aVar.f383871v;
        this.f383846w = aVar.f383872w;
        this.f383847x = aVar.f383873x;
        this.f383848y = com.yandex.mobile.ads.embedded.guava.collect.q.a(aVar.f383874y);
        this.f383849z = com.yandex.mobile.ads.embedded.guava.collect.r.a(aVar.f383875z);
    }

    public static ba1 a(Bundle bundle) {
        return new ba1(new a(bundle));
    }

    public boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ba1 ba1Var = (ba1) obj;
        return this.f383824a == ba1Var.f383824a && this.f383825b == ba1Var.f383825b && this.f383826c == ba1Var.f383826c && this.f383827d == ba1Var.f383827d && this.f383828e == ba1Var.f383828e && this.f383829f == ba1Var.f383829f && this.f383830g == ba1Var.f383830g && this.f383831h == ba1Var.f383831h && this.f383834k == ba1Var.f383834k && this.f383832i == ba1Var.f383832i && this.f383833j == ba1Var.f383833j && this.f383835l.equals(ba1Var.f383835l) && this.f383836m == ba1Var.f383836m && this.f383837n.equals(ba1Var.f383837n) && this.f383838o == ba1Var.f383838o && this.f383839p == ba1Var.f383839p && this.f383840q == ba1Var.f383840q && this.f383841r.equals(ba1Var.f383841r) && this.f383842s.equals(ba1Var.f383842s) && this.f383843t == ba1Var.f383843t && this.f383844u == ba1Var.f383844u && this.f383845v == ba1Var.f383845v && this.f383846w == ba1Var.f383846w && this.f383847x == ba1Var.f383847x && this.f383848y.equals(ba1Var.f383848y) && this.f383849z.equals(ba1Var.f383849z);
    }

    public int hashCode() {
        return this.f383849z.hashCode() + ((this.f383848y.hashCode() + ((((((((((((this.f383842s.hashCode() + ((this.f383841r.hashCode() + ((((((((this.f383837n.hashCode() + ((((this.f383835l.hashCode() + ((((((((((((((((((((((this.f383824a + 31) * 31) + this.f383825b) * 31) + this.f383826c) * 31) + this.f383827d) * 31) + this.f383828e) * 31) + this.f383829f) * 31) + this.f383830g) * 31) + this.f383831h) * 31) + (this.f383834k ? 1 : 0)) * 31) + this.f383832i) * 31) + this.f383833j) * 31)) * 31) + this.f383836m) * 31)) * 31) + this.f383838o) * 31) + this.f383839p) * 31) + this.f383840q) * 31)) * 31)) * 31) + this.f383843t) * 31) + this.f383844u) * 31) + (this.f383845v ? 1 : 0)) * 31) + (this.f383846w ? 1 : 0)) * 31) + (this.f383847x ? 1 : 0)) * 31)) * 31);
    }

    public static String a(int i12) {
        return Integer.toString(i12, 36);
    }
}
