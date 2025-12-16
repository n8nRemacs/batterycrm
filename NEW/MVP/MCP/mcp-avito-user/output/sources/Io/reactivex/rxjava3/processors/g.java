package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import s41.C47998a;

/* compiled from: SerializedProcessor.java */
/* loaded from: classes8.dex */
final class g<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    public final c<T> f404925c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f404926d;

    /* renamed from: e, reason: collision with root package name */
    public io.reactivex.rxjava3.internal.util.a<Object> f404927e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f404928f;

    public g(c<T> cVar) {
        this.f404925c = cVar;
    }

    public final void A() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f404927e;
                    if (aVar == null) {
                        this.f404926d = false;
                        return;
                    }
                    this.f404927e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.a(this.f404925c);
        }
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        boolean z12 = true;
        if (!this.f404928f) {
            synchronized (this) {
                try {
                    if (!this.f404928f) {
                        if (this.f404926d) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404927e;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>();
                                this.f404927e = aVar;
                            }
                            aVar.b(NotificationLite.k(eVar));
                            return;
                        }
                        this.f404926d = true;
                        z12 = false;
                    }
                } finally {
                }
            }
        }
        if (z12) {
            eVar.cancel();
        } else {
            this.f404925c.K(eVar);
            A();
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        if (this.f404928f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f404928f) {
                    return;
                }
                this.f404928f = true;
                if (!this.f404926d) {
                    this.f404926d = true;
                    this.f404925c.e();
                    return;
                }
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404927e;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>();
                    this.f404927e = aVar;
                }
                aVar.b(NotificationLite.f404825b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        if (this.f404928f) {
            C47998a.b(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z12 = true;
                if (!this.f404928f) {
                    this.f404928f = true;
                    if (this.f404926d) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404927e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>();
                            this.f404927e = aVar;
                        }
                        aVar.f404830a[0] = NotificationLite.e(th2);
                        return;
                    }
                    this.f404926d = true;
                    z12 = false;
                }
                if (z12) {
                    C47998a.b(th2);
                } else {
                    this.f404925c.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        if (this.f404928f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f404928f) {
                    return;
                }
                if (!this.f404926d) {
                    this.f404926d = true;
                    this.f404925c.onNext(t12);
                    A();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404927e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.f404927e = aVar;
                    }
                    aVar.b(t12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f404925c.d(dVar);
    }
}
