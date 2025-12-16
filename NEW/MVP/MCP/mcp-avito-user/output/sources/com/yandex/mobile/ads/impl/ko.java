package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.impl.gp0;
import com.yandex.mobile.ads.impl.pd;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class ko implements pd, ua1 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f387215n = com.yandex.mobile.ads.embedded.guava.collect.p.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f387216o = com.yandex.mobile.ads.embedded.guava.collect.p.a(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f387217p = com.yandex.mobile.ads.embedded.guava.collect.p.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f387218q = com.yandex.mobile.ads.embedded.guava.collect.p.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f387219r = com.yandex.mobile.ads.embedded.guava.collect.p.a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f387220s = com.yandex.mobile.ads.embedded.guava.collect.p.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t, reason: collision with root package name */
    @j.P
    private static ko f387221t;

    /* renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.embedded.guava.collect.q<Integer, Long> f387222a;

    /* renamed from: b, reason: collision with root package name */
    private final pd.a.C10980a f387223b;

    /* renamed from: c, reason: collision with root package name */
    private final b51 f387224c;

    /* renamed from: d, reason: collision with root package name */
    private final hj f387225d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f387226e;

    /* renamed from: f, reason: collision with root package name */
    private int f387227f;

    /* renamed from: g, reason: collision with root package name */
    private long f387228g;

    /* renamed from: h, reason: collision with root package name */
    private long f387229h;

    /* renamed from: i, reason: collision with root package name */
    private int f387230i;

    /* renamed from: j, reason: collision with root package name */
    private long f387231j;

    /* renamed from: k, reason: collision with root package name */
    private long f387232k;

    /* renamed from: l, reason: collision with root package name */
    private long f387233l;

    /* renamed from: m, reason: collision with root package name */
    private long f387234m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private final Context f387235a;

        /* renamed from: b, reason: collision with root package name */
        private HashMap f387236b;

        /* renamed from: c, reason: collision with root package name */
        private int f387237c;

        /* renamed from: d, reason: collision with root package name */
        private c81 f387238d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f387239e;

        public a(Context context) {
            this.f387235a = context == null ? null : context.getApplicationContext();
            this.f387236b = a(pc1.b(context));
            this.f387237c = 2000;
            this.f387238d = hj.f386146a;
            this.f387239e = true;
        }

        public final ko a() {
            return new ko(this.f387235a, this.f387236b, this.f387237c, this.f387238d, this.f387239e, 0);
        }

        private static HashMap a(String str) {
            int[] iArrB = ko.b(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            com.yandex.mobile.ads.embedded.guava.collect.p<Long> pVar = ko.f387215n;
            map.put(2, pVar.get(iArrB[0]));
            map.put(3, ko.f387216o.get(iArrB[1]));
            map.put(4, ko.f387217p.get(iArrB[2]));
            map.put(5, ko.f387218q.get(iArrB[3]));
            map.put(10, ko.f387219r.get(iArrB[4]));
            map.put(9, ko.f387220s.get(iArrB[5]));
            map.put(7, pVar.get(iArrB[0]));
            return map;
        }
    }

    public /* synthetic */ ko(Context context, HashMap map, int i12, c81 c81Var, boolean z12, int i13) {
        this(context, map, i12, c81Var, z12);
    }

    @Override // com.yandex.mobile.ads.impl.ua1
    public final void b() {
    }

    private ko(@j.P Context context, HashMap map, int i12, c81 c81Var, boolean z12) {
        this.f387222a = com.yandex.mobile.ads.embedded.guava.collect.q.a(map);
        this.f387223b = new pd.a.C10980a();
        this.f387224c = new b51(i12);
        this.f387225d = c81Var;
        this.f387226e = z12;
        if (context == null) {
            this.f387230i = 0;
            this.f387233l = a(0);
            return;
        }
        gp0 gp0VarB = gp0.b(context);
        int iA2 = gp0VarB.a();
        this.f387230i = iA2;
        this.f387233l = a(iA2);
        gp0VarB.b(new gp0.b() { // from class: com.yandex.mobile.ads.impl.N0
            @Override // com.yandex.mobile.ads.impl.gp0.b
            public final void a(int i13) {
                this.f383266a.b(i13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i12) {
        int i13 = this.f387230i;
        if (i13 == 0 || this.f387226e) {
            if (i13 == i12) {
                return;
            }
            this.f387230i = i12;
            if (i12 != 1 && i12 != 0 && i12 != 8) {
                this.f387233l = a(i12);
                long jC2 = this.f387225d.c();
                int i14 = this.f387227f > 0 ? (int) (jC2 - this.f387228g) : 0;
                long j12 = this.f387229h;
                long j13 = this.f387233l;
                if (i14 != 0 || j12 != 0 || j13 != this.f387234m) {
                    this.f387234m = j13;
                    this.f387223b.a(i14, j12, j13);
                }
                this.f387228g = jC2;
                this.f387229h = 0L;
                this.f387232k = 0L;
                this.f387231j = 0L;
                this.f387224c.b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.pd
    public final ko a() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.pd
    public final void a(Handler handler, j9 j9Var) {
        j9Var.getClass();
        this.f387223b.a(handler, j9Var);
    }

    public static synchronized ko a(Context context) {
        try {
            if (f387221t == null) {
                f387221t = new a(context).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f387221t;
    }

    @Override // com.yandex.mobile.ads.impl.pd
    public final void a(j9 j9Var) {
        this.f387223b.a(j9Var);
    }

    private long a(int i12) {
        Long l12 = this.f387222a.get(Integer.valueOf(i12));
        if (l12 == null) {
            l12 = this.f387222a.get(0);
        }
        if (l12 == null) {
            l12 = 1000000L;
        }
        return l12.longValue();
    }

    @Override // com.yandex.mobile.ads.impl.ua1
    public final synchronized void a(kn knVar, boolean z12, int i12) {
        if (z12) {
            if (!knVar.a(8)) {
                this.f387229h += i12;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ua1
    public final synchronized void b(kn knVar, boolean z12) {
        if (z12) {
            try {
                if (!knVar.a(8)) {
                    if (this.f387227f == 0) {
                        this.f387228g = this.f387225d.c();
                    }
                    this.f387227f++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ua1
    public final synchronized void a(kn knVar, boolean z12) {
        if (z12) {
            try {
                if (!knVar.a(8)) {
                    db.b(this.f387227f > 0);
                    long jC2 = this.f387225d.c();
                    int i12 = (int) (jC2 - this.f387228g);
                    this.f387231j += i12;
                    long j12 = this.f387232k;
                    long j13 = this.f387229h;
                    this.f387232k = j12 + j13;
                    if (i12 > 0) {
                        this.f387224c.a((int) Math.sqrt(j13), (j13 * 8000.0f) / i12);
                        if (this.f387231j >= 2000 || this.f387232k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                            this.f387233l = (long) this.f387224c.a();
                        }
                        long j14 = this.f387229h;
                        long j15 = this.f387233l;
                        if (i12 != 0 || j14 != 0 || j15 != this.f387234m) {
                            this.f387234m = j15;
                            this.f387223b.a(i12, j14, j15);
                        }
                        this.f387228g = jC2;
                        this.f387229h = 0L;
                    }
                    this.f387227f--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] b(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ko.b(java.lang.String):int[]");
    }
}
