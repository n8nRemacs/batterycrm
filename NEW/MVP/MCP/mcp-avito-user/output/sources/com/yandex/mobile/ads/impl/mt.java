package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Looper;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.lp;
import com.yandex.mobile.ads.impl.mt;
import com.yandex.mobile.ads.impl.po;
import com.yandex.mobile.ads.impl.q7;
import com.yandex.mobile.ads.impl.yo;

/* loaded from: classes8.dex */
public interface mt extends gt0 {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Context f388065a;

        /* renamed from: b, reason: collision with root package name */
        c81 f388066b;

        /* renamed from: c, reason: collision with root package name */
        z71<xx0> f388067c;

        /* renamed from: d, reason: collision with root package name */
        z71<jd0.a> f388068d;

        /* renamed from: e, reason: collision with root package name */
        z71<ca1> f388069e;

        /* renamed from: f, reason: collision with root package name */
        z71<o90> f388070f;

        /* renamed from: g, reason: collision with root package name */
        z71<pd> f388071g;

        /* renamed from: h, reason: collision with root package name */
        ly<hj, j9> f388072h;

        /* renamed from: i, reason: collision with root package name */
        Looper f388073i;

        /* renamed from: j, reason: collision with root package name */
        jc f388074j;

        /* renamed from: k, reason: collision with root package name */
        int f388075k;

        /* renamed from: l, reason: collision with root package name */
        boolean f388076l;

        /* renamed from: m, reason: collision with root package name */
        y21 f388077m;

        /* renamed from: n, reason: collision with root package name */
        yo f388078n;

        /* renamed from: o, reason: collision with root package name */
        long f388079o;

        /* renamed from: p, reason: collision with root package name */
        long f388080p;

        /* renamed from: q, reason: collision with root package name */
        boolean f388081q;

        /* renamed from: r, reason: collision with root package name */
        boolean f388082r;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(final Context context) {
            final int i12 = 0;
            final int i13 = 1;
            this(context, new z71() { // from class: com.yandex.mobile.ads.impl.Y0
                @Override // com.yandex.mobile.ads.impl.z71
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return mt.b.a(context);
                        case 1:
                            return mt.b.b(context);
                        case 2:
                            return mt.b.c(context);
                        default:
                            return ko.a(context);
                    }
                }
            }, new z71() { // from class: com.yandex.mobile.ads.impl.Y0
                @Override // com.yandex.mobile.ads.impl.z71
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return mt.b.a(context);
                        case 1:
                            return mt.b.b(context);
                        case 2:
                            return mt.b.c(context);
                        default:
                            return ko.a(context);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ xx0 a(Context context) {
            return new gp(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static jd0.a b(Context context) {
            return new dp(new po.a(context), new uo());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ca1 c(Context context) {
            return new lp(context, lp.c.a(context), new q7.b(0));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private b(final Context context, z71<xx0> z71Var, z71<jd0.a> z71Var2) {
            final int i12 = 2;
            final int i13 = 3;
            this(context, z71Var, z71Var2, new z71() { // from class: com.yandex.mobile.ads.impl.Y0
                @Override // com.yandex.mobile.ads.impl.z71
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return mt.b.a(context);
                        case 1:
                            return mt.b.b(context);
                        case 2:
                            return mt.b.c(context);
                        default:
                            return ko.a(context);
                    }
                }
            }, new D0(1), new z71() { // from class: com.yandex.mobile.ads.impl.Y0
                @Override // com.yandex.mobile.ads.impl.z71
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return mt.b.a(context);
                        case 1:
                            return mt.b.b(context);
                        case 2:
                            return mt.b.c(context);
                        default:
                            return ko.a(context);
                    }
                }
            }, new Q0(1));
        }

        public final mt a() {
            db.b(!this.f388082r);
            this.f388082r = true;
            return new pt(this);
        }

        private b(Context context, z71<xx0> z71Var, z71<jd0.a> z71Var2, z71<ca1> z71Var3, z71<o90> z71Var4, z71<pd> z71Var5, ly<hj, j9> lyVar) {
            this.f388065a = context;
            this.f388067c = z71Var;
            this.f388068d = z71Var2;
            this.f388069e = z71Var3;
            this.f388070f = z71Var4;
            this.f388071g = z71Var5;
            this.f388072h = lyVar;
            this.f388073i = pc1.c();
            this.f388074j = jc.f386811g;
            this.f388075k = 1;
            this.f388076l = true;
            this.f388077m = y21.f391898c;
            this.f388078n = new yo.a().a();
            this.f388066b = hj.f386146a;
            this.f388079o = 500L;
            this.f388080p = 2000L;
            this.f388081q = true;
        }
    }

    void a(nv0 nv0Var);

    public interface a {
        default void a() {
        }
    }
}
