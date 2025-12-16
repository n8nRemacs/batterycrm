package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class qh1 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f389188c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private static volatile qh1 f389189d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f389190a;

    /* renamed from: b, reason: collision with root package name */
    private final bz0 f389191b;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        @X41.n
        @Y61.k
        public final qh1 a(@Y61.k Context context) {
            qh1 qh1Var = qh1.f389189d;
            if (qh1Var == null) {
                synchronized (this) {
                    qh1Var = qh1.f389189d;
                    if (qh1Var == null) {
                        qh1Var = new qh1(context, 0);
                        qh1.f389189d = qh1Var;
                    }
                }
            }
            return qh1Var;
        }

        private a() {
        }
    }

    public /* synthetic */ qh1(Context context, int i12) {
        this(context);
    }

    private qh1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f389190a = applicationContext;
        this.f389191b = vm1.a(applicationContext, 4);
    }

    public final void a(@Y61.k String str) {
        this.f389191b.a(tk1.a(this.f389190a, str));
    }
}
