package com.squareup.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: Stats.java */
/* loaded from: classes7.dex */
class E {

    /* renamed from: a, reason: collision with root package name */
    public final r f366331a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f366332b;

    /* renamed from: c, reason: collision with root package name */
    public long f366333c;

    /* renamed from: d, reason: collision with root package name */
    public long f366334d;

    /* renamed from: e, reason: collision with root package name */
    public long f366335e;

    /* renamed from: f, reason: collision with root package name */
    public long f366336f;

    /* renamed from: g, reason: collision with root package name */
    public long f366337g;

    /* renamed from: h, reason: collision with root package name */
    public long f366338h;

    /* renamed from: i, reason: collision with root package name */
    public long f366339i;

    /* renamed from: j, reason: collision with root package name */
    public long f366340j;

    /* renamed from: k, reason: collision with root package name */
    public int f366341k;

    /* renamed from: l, reason: collision with root package name */
    public int f366342l;

    /* renamed from: m, reason: collision with root package name */
    public int f366343m;

    /* compiled from: Stats.java */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final E f366344a;

        /* compiled from: Stats.java */
        /* renamed from: com.squareup.picasso.E$a$a, reason: collision with other inner class name */
        public class RunnableC10809a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Message f366345b;

            public RunnableC10809a(Message message) {
                this.f366345b = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new AssertionError("Unhandled stats message." + this.f366345b.what);
            }
        }

        public a(Looper looper, E e12) {
            super(looper);
            this.f366344a = e12;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i12 = message.what;
            E e12 = this.f366344a;
            if (i12 == 0) {
                e12.f366333c++;
                return;
            }
            if (i12 == 1) {
                e12.f366334d++;
                return;
            }
            if (i12 == 2) {
                long j12 = message.arg1;
                int i13 = e12.f366342l + 1;
                e12.f366342l = i13;
                long j13 = e12.f366336f + j12;
                e12.f366336f = j13;
                e12.f366339i = j13 / i13;
                return;
            }
            if (i12 == 3) {
                long j14 = message.arg1;
                e12.f366343m++;
                long j15 = e12.f366337g + j14;
                e12.f366337g = j15;
                e12.f366340j = j15 / e12.f366342l;
                return;
            }
            if (i12 != 4) {
                Picasso.f366365k.post(new RunnableC10809a(message));
                return;
            }
            Long l12 = (Long) message.obj;
            e12.f366341k++;
            long jLongValue = l12.longValue() + e12.f366335e;
            e12.f366335e = jLongValue;
            e12.f366338h = jLongValue / e12.f366341k;
        }
    }

    public E(r rVar) {
        this.f366331a = rVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb2 = K.f366360a;
        J j12 = new J(looper);
        j12.sendMessageDelayed(j12.obtainMessage(), 1000L);
        this.f366332b = new a(handlerThread.getLooper(), this);
    }

    public final F a() {
        r rVar = this.f366331a;
        return new F(rVar.f366450a.maxSize(), rVar.f366450a.size(), this.f366333c, this.f366334d, this.f366335e, this.f366336f, this.f366337g, this.f366338h, this.f366339i, this.f366340j, this.f366341k, this.f366342l, this.f366343m, System.currentTimeMillis());
    }
}
