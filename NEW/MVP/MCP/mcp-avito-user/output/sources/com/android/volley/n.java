package com.android.volley;

import android.os.Handler;
import com.android.volley.w;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes10.dex */
public class n implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f67087a;

    /* compiled from: ExecutorDelivery.java */
    public class a implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Handler f67088b;

        public a(Handler handler) {
            this.f67088b = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f67088b.post(runnable);
        }
    }

    /* compiled from: ExecutorDelivery.java */
    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Request f67089b;

        /* renamed from: c, reason: collision with root package name */
        public final w f67090c;

        /* renamed from: d, reason: collision with root package name */
        public final Runnable f67091d;

        public b(Request request, w wVar, Runnable runnable) {
            this.f67089b = request;
            this.f67090c = wVar;
            this.f67091d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            w.a aVar;
            if (this.f67089b.k()) {
                this.f67089b.d("canceled-at-delivery");
                return;
            }
            w wVar = this.f67090c;
            VolleyError volleyError = wVar.f67164c;
            if (volleyError == null) {
                this.f67089b.c(wVar.f67162a);
            } else {
                Request request = this.f67089b;
                synchronized (request.f67029f) {
                    aVar = request.f67030g;
                }
                if (aVar != null) {
                    aVar.a(volleyError);
                }
            }
            if (this.f67090c.f67165d) {
                this.f67089b.a("intermediate-response");
            } else {
                this.f67089b.d(PaymentStateKt.PAYMENT_STATE_DONE);
            }
            Runnable runnable = this.f67091d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public n(Handler handler) {
        this.f67087a = new a(handler);
    }

    @Override // com.android.volley.x
    public final void a(Request<?> request, w<?> wVar, Runnable runnable) {
        synchronized (request.f67029f) {
            request.f67035l = true;
        }
        request.a("post-response");
        ((a) this.f67087a).execute(new b(request, wVar, runnable));
    }

    @Override // com.android.volley.x
    public final void b(Request<?> request, w<?> wVar) {
        a(request, wVar, null);
    }

    @Override // com.android.volley.x
    public final void c(Request<?> request, VolleyError volleyError) {
        request.a("post-error");
        w wVar = new w(volleyError);
        ((a) this.f67087a).execute(new b(request, wVar, null));
    }
}
