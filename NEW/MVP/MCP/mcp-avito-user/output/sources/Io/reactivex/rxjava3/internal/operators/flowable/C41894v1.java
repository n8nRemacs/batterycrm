package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.C41891u1;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import n41.InterfaceC44186c;

/* compiled from: FlowableSequenceEqualSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41894v1<T> extends io.reactivex.rxjava3.core.I<Boolean> implements InterfaceC44186c<Boolean> {

    /* compiled from: FlowableSequenceEqualSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v1$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, C41891u1.b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super Boolean> f403058b;

        /* renamed from: c, reason: collision with root package name */
        public final C41891u1.c<T> f403059c = new C41891u1.c<>(this);

        /* renamed from: d, reason: collision with root package name */
        public final C41891u1.c<T> f403060d = new C41891u1.c<>(this);

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403061e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public T f403062f;

        /* renamed from: g, reason: collision with root package name */
        public T f403063g;

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f403058b = l12;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41891u1.b
        public final void a(Throwable th2) {
            if (this.f403061e.b(th2)) {
                c();
            }
        }

        public final void b() {
            C41891u1.c<T> cVar = this.f403059c;
            cVar.getClass();
            SubscriptionHelper.a(cVar);
            cVar.a();
            C41891u1.c<T> cVar2 = this.f403060d;
            cVar2.getClass();
            SubscriptionHelper.a(cVar2);
            cVar2.a();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41891u1.b
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                q41.g<T> gVar = this.f403059c.f403036c;
                q41.g<T> gVar2 = this.f403060d.f403036c;
                if (gVar == null || gVar2 == null) {
                    if (getF318621e()) {
                        this.f403059c.a();
                        this.f403060d.a();
                        return;
                    } else if (this.f403061e.get() != null) {
                        b();
                        this.f403061e.f(this.f403058b);
                        return;
                    }
                } else {
                    if (getF318621e()) {
                        this.f403059c.a();
                        this.f403060d.a();
                        return;
                    }
                    if (this.f403061e.get() != null) {
                        b();
                        this.f403061e.f(this.f403058b);
                        return;
                    }
                    boolean z12 = this.f403059c.f403037d;
                    T tPoll = this.f403062f;
                    if (tPoll == null) {
                        try {
                            tPoll = gVar.poll();
                            this.f403062f = tPoll;
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            b();
                            this.f403061e.b(th2);
                            this.f403061e.f(this.f403058b);
                            return;
                        }
                    }
                    boolean z13 = tPoll == null;
                    boolean z14 = this.f403060d.f403037d;
                    T tPoll2 = this.f403063g;
                    if (tPoll2 == null) {
                        try {
                            tPoll2 = gVar2.poll();
                            this.f403063g = tPoll2;
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.a.a(th3);
                            b();
                            this.f403061e.b(th3);
                            this.f403061e.f(this.f403058b);
                            return;
                        }
                    }
                    boolean z15 = tPoll2 == null;
                    if (z12 && z14 && z13 && z15) {
                        this.f403058b.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z12 && z14 && z13 != z15) {
                        b();
                        this.f403058b.onSuccess(Boolean.FALSE);
                        return;
                    } else if (!z13 && !z15) {
                        try {
                            throw null;
                        } catch (Throwable th4) {
                            io.reactivex.rxjava3.exceptions.a.a(th4);
                            b();
                            this.f403061e.b(th4);
                            this.f403061e.f(this.f403058b);
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            C41891u1.c<T> cVar = this.f403059c;
            cVar.getClass();
            SubscriptionHelper.a(cVar);
            C41891u1.c<T> cVar2 = this.f403060d;
            cVar2.getClass();
            SubscriptionHelper.a(cVar2);
            this.f403061e.c();
            if (getAndIncrement() == 0) {
                cVar.a();
                cVar2.a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403059c.get() == SubscriptionHelper.f404813b;
        }
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<Boolean> f() {
        return new C41891u1();
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
        l12.b(new a(l12));
        throw null;
    }
}
