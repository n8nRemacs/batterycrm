package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ch0 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f384297e = new a(0);

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private static volatile ch0 f384298f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f384299a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f384300b = true;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final C39374w0 f384301c = new C39374w0();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final gs0 f384302d = new gs0();

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        @X41.n
        @Y61.k
        public final ch0 a() {
            ch0 ch0Var = ch0.f384298f;
            if (ch0Var == null) {
                synchronized (this) {
                    ch0Var = ch0.f384298f;
                    if (ch0Var == null) {
                        ch0Var = new ch0();
                        ch0.f384298f = ch0Var;
                    }
                }
            }
            return ch0Var;
        }

        private a() {
        }
    }

    public final void a(@Y61.k Context context) {
        if (this.f384300b) {
            synchronized (this.f384299a) {
                try {
                    if (this.f384300b) {
                        if (h7.a(context)) {
                            this.f384301c.a(context);
                            this.f384302d.getClass();
                            gs0.a(context);
                        }
                        this.f384300b = false;
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
