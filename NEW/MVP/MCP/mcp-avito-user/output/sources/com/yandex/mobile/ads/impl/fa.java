package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.ea;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class fa {

    /* renamed from: f, reason: collision with root package name */
    private static final long f385232f = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private static final Object f385233g = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ea f385234a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ia f385235b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Handler f385236c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final WeakHashMap<cd, Object> f385237d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f385238e;

    public final class a implements ea.a {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ea.a
        public final void a(@Y61.l String str) {
            fa.this.a(str);
        }

        @Override // com.yandex.mobile.ads.impl.ea.a
        public final void b(@Y61.l String str) {
            fa.b(fa.this);
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            fa.this.f385235b.getClass();
            ia.a();
            fa.b(fa.this);
            return kotlin.G0.f406611a;
        }
    }

    public fa(@Y61.k ea eaVar, @Y61.k ia iaVar, @Y61.k Handler handler) {
        this.f385234a = eaVar;
        this.f385235b = iaVar;
        this.f385236c = handler;
    }

    public final void b(@Y61.k cd cdVar) {
        boolean z12;
        Object obj = f385233g;
        synchronized (obj) {
            this.f385237d.put(cdVar, null);
        }
        try {
            synchronized (obj) {
                try {
                    if (this.f385238e) {
                        z12 = false;
                    } else {
                        z12 = true;
                        this.f385238e = true;
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } finally {
                }
            }
            if (z12) {
                a();
                this.f385234a.a(new a());
            }
        } catch (Throwable unused) {
            this.f385235b.getClass();
            a((String) null);
        }
    }

    public final void a(@Y61.k cd cdVar) {
        synchronized (f385233g) {
            this.f385237d.remove(cdVar);
        }
    }

    private final void a() {
        this.f385236c.postDelayed(new I(0, new b()), f385232f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.a aVar) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[LOOP:0: B:10:0x0025->B:12:0x002b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = com.yandex.mobile.ads.impl.fa.f385233g
            monitor-enter(r0)
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L36
            java.util.WeakHashMap<com.yandex.mobile.ads.impl.cd, java.lang.Object> r2 = r4.f385237d     // Catch: java.lang.Throwable -> L36
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.util.WeakHashMap<com.yandex.mobile.ads.impl.cd, java.lang.Object> r2 = r4.f385237d     // Catch: java.lang.Throwable -> L36
            r2.clear()     // Catch: java.lang.Throwable -> L36
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L36
            android.os.Handler r2 = r4.f385236c     // Catch: java.lang.Throwable -> L38
            r3 = 0
            r2.removeCallbacksAndMessages(r3)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r4.f385238e = r2     // Catch: java.lang.Throwable -> L38
            kotlin.G0 r2 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            java.util.Iterator r0 = r1.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.cd r1 = (com.yandex.mobile.ads.impl.cd) r1
            r1.a(r5)
            goto L25
        L35:
            return
        L36:
            r5 = move-exception
            goto L3b
        L38:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r5     // Catch: java.lang.Throwable -> L36
        L3b:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fa.a(java.lang.String):void");
    }

    public static final void b(fa faVar) {
        faVar.a((String) null);
    }
}
