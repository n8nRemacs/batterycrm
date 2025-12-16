package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class Bb {

    /* renamed from: a, reason: collision with root package name */
    private volatile Ab f377829a;

    /* renamed from: b, reason: collision with root package name */
    private CountDownLatch f377830b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private final long f377831c = 20;

    /* renamed from: d, reason: collision with root package name */
    private final S21.a f377832d = new a();

    /* renamed from: e, reason: collision with root package name */
    private final Context f377833e;

    /* renamed from: f, reason: collision with root package name */
    private final S21.c f377834f;

    @j.k0
    public Bb(@Y61.k Context context, @Y61.k S21.c cVar) {
        this.f377833e = context;
        this.f377834f = cVar;
    }

    public static final class a implements S21.a {
        public a() {
        }

        @Override // S21.a
        @j.K
        public void a(@Y61.l String str, @Y61.k com.yandex.metrica.appsetid.c cVar) {
            Bb.this.f377829a = new Ab(str, cVar);
            Bb.this.f377830b.countDown();
        }

        @Override // S21.a
        @j.K
        public void a(@Y61.l Throwable th2) {
            Bb.this.f377830b.countDown();
        }
    }

    @Y61.k
    @j.l0
    public final synchronized Ab a() {
        Ab ab2;
        if (this.f377829a == null) {
            try {
                this.f377830b = new CountDownLatch(1);
                this.f377834f.a(this.f377833e, this.f377832d);
                this.f377830b.await(this.f377831c, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        ab2 = this.f377829a;
        if (ab2 == null) {
            ab2 = new Ab(null, com.yandex.metrica.appsetid.c.UNKNOWN);
            this.f377829a = ab2;
        }
        return ab2;
    }
}
