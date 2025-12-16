package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class d3 {

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final long f384512d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final z2 f384513a;

    /* renamed from: b, reason: collision with root package name */
    private final h60 f384514b = h60.a();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Handler f384515c = new Handler(Looper.getMainLooper());

    public d3(@Y61.k z2 z2Var) {
        this.f384513a = z2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d3 d3Var, h3 h3Var) {
        if (kotlin.jvm.internal.L.f(d3Var.f384513a.e(), h3Var)) {
            qg1 qg1VarB = h3Var.b();
            l60 l60VarA = h3Var.a();
            if (qg1VarB.a().ordinal() != 0) {
                return;
            }
            l60VarA.d();
        }
    }

    public final void c() {
        h3 h3VarE = this.f384513a.e();
        if (h3VarE != null) {
            qg1 qg1VarB = h3VarE.b();
            l60 l60VarA = h3VarE.a();
            int iOrdinal = qg1VarB.a().ordinal();
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 6 || iOrdinal == 7) {
                l60VarA.g();
            }
        }
        this.f384515c.removeCallbacksAndMessages(null);
    }

    public final void b() {
        h3 h3VarE;
        if (!this.f384514b.b() || (h3VarE = this.f384513a.e()) == null) {
            return;
        }
        this.f384515c.postDelayed(new H(9, this, h3VarE), f384512d);
    }

    public final void a() {
        l60 l60VarA;
        h3 h3VarE = this.f384513a.e();
        if (h3VarE != null && (l60VarA = h3VarE.a()) != null) {
            l60VarA.a();
        }
        this.f384515c.removeCallbacksAndMessages(null);
    }
}
