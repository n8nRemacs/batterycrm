package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class gt implements sz0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f385823a;

    public class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f385824a;

        public a(Handler handler) {
            this.f385824a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f385824a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final qy0 f385825b;

        /* renamed from: c, reason: collision with root package name */
        private final kz0 f385826c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f385827d;

        public b(qy0 qy0Var, kz0 kz0Var, Runnable runnable) {
            this.f385825b = qy0Var;
            this.f385826c = kz0Var;
            this.f385827d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f385825b.o()) {
                this.f385825b.c("canceled-at-delivery");
                return;
            }
            kz0 kz0Var = this.f385826c;
            ok1 ok1Var = kz0Var.f387336c;
            if (ok1Var == null) {
                this.f385825b.a((qy0) kz0Var.f387334a);
            } else {
                this.f385825b.a(ok1Var);
            }
            if (this.f385826c.f387337d) {
                this.f385825b.a("intermediate-response");
            } else {
                this.f385825b.c(PaymentStateKt.PAYMENT_STATE_DONE);
            }
            Runnable runnable = this.f385827d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public gt(Handler handler) {
        this.f385823a = new a(handler);
    }

    public final void a(qy0<?> qy0Var, kz0<?> kz0Var, Runnable runnable) {
        qy0Var.p();
        qy0Var.a("post-response");
        Executor executor = this.f385823a;
        ((a) executor).f385824a.post(new b(qy0Var, kz0Var, runnable));
    }

    public final void a(qy0<?> qy0Var, ok1 ok1Var) {
        qy0Var.a("post-error");
        kz0 kz0VarA = kz0.a(ok1Var);
        Executor executor = this.f385823a;
        ((a) executor).f385824a.post(new b(qy0Var, kz0VarA, null));
    }
}
