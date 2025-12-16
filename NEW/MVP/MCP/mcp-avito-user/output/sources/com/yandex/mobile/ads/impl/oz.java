package com.yandex.mobile.ads.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes8.dex */
public final class oz {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final qz f388668a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final nz f388669b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Executor f388670c;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final pz f388671b;

        public a(pz pzVar) {
            this.f388671b = pzVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Boolean boolA;
            try {
                boolA = oz.a(oz.this);
            } catch (Throwable unused) {
                boolA = null;
            }
            this.f388671b.a(boolA);
        }
    }

    public oz(@Y61.k qz qzVar, @Y61.k nz nzVar, @Y61.k Executor executor) {
        this.f388668a = qzVar;
        this.f388669b = nzVar;
        this.f388670c = executor;
    }

    public static final Boolean a(oz ozVar) {
        ozVar.f388668a.getClass();
        FutureTask futureTaskA = qz.a("yandex.ru");
        ozVar.f388668a.getClass();
        FutureTask futureTaskA2 = qz.a("mobile.yandexadexchange.net");
        boolean zA2 = ((rz) futureTaskA.get()).a();
        boolean zA3 = ((rz) futureTaskA2.get()).a();
        ozVar.f388669b.getClass();
        if (!zA3 && zA2) {
            return Boolean.TRUE;
        }
        if (zA3 || zA2) {
            return Boolean.FALSE;
        }
        return null;
    }

    public /* synthetic */ oz() {
        this(new qz(), new nz(), Executors.newSingleThreadExecutor());
    }

    public final void a(@Y61.k pz pzVar) {
        this.f388670c.execute(new a(pzVar));
    }
}
