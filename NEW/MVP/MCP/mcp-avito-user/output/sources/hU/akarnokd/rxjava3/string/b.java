package hu.akarnokd.rxjava3.string;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableSplit.java */
/* loaded from: classes8.dex */
final class b extends AbstractC41777j<String> implements InterfaceC41783p<String, String> {

    /* compiled from: FlowableSplit.java */
    public static final class a extends AtomicInteger implements ConditionalSubscriber<String>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398267b;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f398271f;

        /* renamed from: g, reason: collision with root package name */
        public String[] f398272g;

        /* renamed from: h, reason: collision with root package name */
        public int f398273h;

        /* renamed from: i, reason: collision with root package name */
        public int f398274i;

        /* renamed from: e, reason: collision with root package name */
        public final int f398270e = 0;

        /* renamed from: c, reason: collision with root package name */
        public final SimplePlainQueue<String[]> f398268c = new SpscArrayQueue(0);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f398269d = new AtomicLong();

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398267b = interfaceC41782o;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimplePlainQueue<String[]> simplePlainQueue = this.f398268c;
            int i12 = this.f398273h;
            String[] strArr = this.f398272g;
            int i13 = this.f398274i;
            InterfaceC41782o interfaceC41782o = this.f398267b;
            int iAddAndGet = 1;
            int i14 = 0;
            do {
                long j12 = this.f398269d.get();
                long j13 = 0;
                while (j13 != j12) {
                    if (this.f398271f) {
                        this.f398272g = null;
                        simplePlainQueue.clear();
                        return;
                    }
                    if (strArr == null && (strArr = (String[]) simplePlainQueue.poll()) != null) {
                        this.f398272g = strArr;
                        i12++;
                        if (i12 == this.f398270e) {
                            throw null;
                        }
                    }
                    if (strArr == null) {
                        break;
                    }
                    int i15 = i14 + 1;
                    if (strArr.length == i15) {
                        this.f398272g = null;
                        strArr = null;
                        i14 = 0;
                    } else {
                        String str = strArr[i14];
                        if (str.isEmpty()) {
                            i13++;
                        } else {
                            while (i13 != 0 && j13 != j12) {
                                if (this.f398271f) {
                                    this.f398272g = null;
                                    simplePlainQueue.clear();
                                    return;
                                } else {
                                    interfaceC41782o.onNext("");
                                    j13++;
                                    i13--;
                                }
                            }
                            if (j13 != j12 && i13 == 0) {
                                interfaceC41782o.onNext(str);
                                j13++;
                            }
                        }
                        i14 = i15;
                    }
                }
                if (j13 == j12) {
                    if (this.f398271f) {
                        this.f398272g = null;
                        simplePlainQueue.clear();
                        return;
                    } else if (strArr == null && (strArr = (String[]) simplePlainQueue.poll()) != null) {
                        this.f398272g = strArr;
                        i12++;
                        if (i12 == this.f398270e) {
                            throw null;
                        }
                    }
                }
                if (j13 != 0) {
                    io.reactivex.rxjava3.internal.util.c.e(this.f398269d, j13);
                }
                this.f398274i = i13;
                this.f398273h = i12;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398271f = true;
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f398269d, j12);
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super String> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
