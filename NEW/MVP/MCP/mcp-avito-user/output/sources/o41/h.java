package o41;

import androidx.compose.foundation.text.selection.C21030p;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SubscriptionArbiter.java */
/* loaded from: classes8.dex */
public class h extends AtomicInteger implements org.reactivestreams.e {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: b, reason: collision with root package name */
    public org.reactivestreams.e f419380b;

    /* renamed from: c, reason: collision with root package name */
    public long f419381c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f419382d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f419383e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f419384f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f419385g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f419386h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f419387i;

    public h(boolean z12) {
        this.f419385g = z12;
    }

    public void K(org.reactivestreams.e eVar) {
        g(eVar);
    }

    public final void b() {
        int iAddAndGet = 1;
        long jC2 = 0;
        org.reactivestreams.e eVar = null;
        do {
            org.reactivestreams.e andSet = this.f419382d.get();
            if (andSet != null) {
                andSet = this.f419382d.getAndSet(null);
            }
            long andSet2 = this.f419383e.get();
            if (andSet2 != 0) {
                andSet2 = this.f419383e.getAndSet(0L);
            }
            long andSet3 = this.f419384f.get();
            if (andSet3 != 0) {
                andSet3 = this.f419384f.getAndSet(0L);
            }
            org.reactivestreams.e eVar2 = this.f419380b;
            if (this.f419386h) {
                if (eVar2 != null) {
                    eVar2.cancel();
                    this.f419380b = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jC3 = this.f419381c;
                if (jC3 != Long.MAX_VALUE) {
                    jC3 = io.reactivex.rxjava3.internal.util.c.c(jC3, andSet2);
                    if (jC3 != Long.MAX_VALUE) {
                        jC3 -= andSet3;
                        if (jC3 < 0) {
                            C47998a.b(new ProtocolViolationException(C21030p.a(jC3, "More produced than requested: ")));
                            jC3 = 0;
                        }
                    }
                    this.f419381c = jC3;
                }
                if (andSet != null) {
                    if (eVar2 != null && this.f419385g) {
                        eVar2.cancel();
                    }
                    this.f419380b = andSet;
                    if (jC3 != 0) {
                        jC2 = io.reactivex.rxjava3.internal.util.c.c(jC2, jC3);
                        eVar = andSet;
                    }
                } else if (eVar2 != null && andSet2 != 0) {
                    jC2 = io.reactivex.rxjava3.internal.util.c.c(jC2, andSet2);
                    eVar = eVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC2 != 0) {
            eVar.request(jC2);
        }
    }

    public void cancel() {
        if (this.f419386h) {
            return;
        }
        this.f419386h = true;
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public final boolean d() {
        return this.f419386h;
    }

    public final void f(long j12) {
        if (this.f419387i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            io.reactivex.rxjava3.internal.util.c.a(this.f419384f, j12);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j13 = this.f419381c;
        if (j13 != Long.MAX_VALUE) {
            long j14 = j13 - j12;
            if (j14 < 0) {
                C47998a.b(new ProtocolViolationException(C21030p.a(j14, "More produced than requested: ")));
                j14 = 0;
            }
            this.f419381c = j14;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        b();
    }

    public final void g(org.reactivestreams.e eVar) {
        if (this.f419386h) {
            eVar.cancel();
            return;
        }
        Objects.requireNonNull(eVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            org.reactivestreams.e andSet = this.f419382d.getAndSet(eVar);
            if (andSet != null && this.f419385g) {
                andSet.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        org.reactivestreams.e eVar2 = this.f419380b;
        if (eVar2 != null && this.f419385g) {
            eVar2.cancel();
        }
        this.f419380b = eVar;
        long j12 = this.f419381c;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j12 != 0) {
            eVar.request(j12);
        }
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        if (!SubscriptionHelper.h(j12) || this.f419387i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            io.reactivex.rxjava3.internal.util.c.a(this.f419383e, j12);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j13 = this.f419381c;
        if (j13 != Long.MAX_VALUE) {
            long jC2 = io.reactivex.rxjava3.internal.util.c.c(j13, j12);
            this.f419381c = jC2;
            if (jC2 == Long.MAX_VALUE) {
                this.f419387i = true;
            }
        }
        org.reactivestreams.e eVar = this.f419380b;
        if (decrementAndGet() != 0) {
            b();
        }
        if (eVar != null) {
            eVar.request(j12);
        }
    }
}
