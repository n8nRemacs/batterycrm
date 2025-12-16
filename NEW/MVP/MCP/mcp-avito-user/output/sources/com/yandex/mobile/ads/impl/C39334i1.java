package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39334i1 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private static final Object f386261f = new Object();

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private static volatile C39334i1 f386262g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f386263h = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final mz f386264a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final C39343l1 f386265b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final C39340k1 f386266c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f386267d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final b f386268e;

    /* renamed from: com.yandex.mobile.ads.impl.i1$a */
    public static final class a {
        @X41.n
        @Y61.k
        public static C39334i1 a(@Y61.k Context context) {
            if (C39334i1.f386262g == null) {
                synchronized (C39334i1.f386261f) {
                    try {
                        if (C39334i1.f386262g == null) {
                            C39334i1.f386262g = new C39334i1(context);
                        }
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return C39334i1.f386262g;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i1$b */
    public final class b implements InterfaceC39337j1 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39337j1
        public final void a() {
            Object obj = C39334i1.f386261f;
            C39334i1 c39334i1 = C39334i1.this;
            synchronized (obj) {
                c39334i1.f386267d = false;
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            C39334i1.this.f386266c.a();
        }
    }

    public C39334i1(@Y61.k Context context, @Y61.k mz mzVar, @Y61.k C39343l1 c39343l1, @Y61.k C39340k1 c39340k1) {
        this.f386264a = mzVar;
        this.f386265b = c39343l1;
        this.f386266c = c39340k1;
        this.f386268e = new b();
    }

    public final void a(@Y61.k InterfaceC39337j1 interfaceC39337j1) {
        synchronized (f386261f) {
            this.f386266c.b(interfaceC39337j1);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final void b(@Y61.k InterfaceC39337j1 interfaceC39337j1) {
        boolean z12;
        if (this.f386265b.a()) {
            synchronized (f386261f) {
                try {
                    if (this.f386267d) {
                        z12 = false;
                    } else {
                        z12 = true;
                        this.f386267d = true;
                    }
                    this.f386266c.a(interfaceC39337j1);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                this.f386264a.a(this.f386268e);
                return;
            }
            return;
        }
        interfaceC39337j1.a();
    }

    public /* synthetic */ C39334i1(Context context) {
        this(context, new mz(context), new C39343l1(context), new C39340k1());
    }
}
