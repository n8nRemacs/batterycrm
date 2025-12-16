package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.a;
import s41.C47998a;

/* compiled from: SerializedSubject.java */
/* loaded from: classes8.dex */
final class g<T> extends i<T> implements a.InterfaceC11520a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final i<T> f405015b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f405016c;

    /* renamed from: d, reason: collision with root package name */
    public io.reactivex.rxjava3.internal.util.a<Object> f405017d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f405018e;

    public g(i<T> iVar) {
        this.f405015b = iVar;
    }

    public final void N0() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f405017d;
                    if (aVar == null) {
                        this.f405016c = false;
                        return;
                    }
                    this.f405017d = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.c(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        boolean z12 = true;
        if (!this.f405018e) {
            synchronized (this) {
                try {
                    if (!this.f405018e) {
                        if (this.f405016c) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f405017d;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>();
                                this.f405017d = aVar;
                            }
                            aVar.b(NotificationLite.d(dVar));
                            return;
                        }
                        this.f405016c = true;
                        z12 = false;
                    }
                } finally {
                }
            }
        }
        if (z12) {
            dVar.dispose();
        } else {
            this.f405015b.b(dVar);
            N0();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (this.f405018e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f405018e) {
                    return;
                }
                this.f405018e = true;
                if (!this.f405016c) {
                    this.f405016c = true;
                    this.f405015b.e();
                    return;
                }
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f405017d;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>();
                    this.f405017d = aVar;
                }
                aVar.b(NotificationLite.f404825b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        if (this.f405018e) {
            C47998a.b(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z12 = true;
                if (!this.f405018e) {
                    this.f405018e = true;
                    if (this.f405016c) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f405017d;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>();
                            this.f405017d = aVar;
                        }
                        aVar.f404830a[0] = NotificationLite.e(th2);
                        return;
                    }
                    this.f405016c = true;
                    z12 = false;
                }
                if (z12) {
                    C47998a.b(th2);
                } else {
                    this.f405015b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        if (this.f405018e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f405018e) {
                    return;
                }
                if (!this.f405016c) {
                    this.f405016c = true;
                    this.f405015b.onNext(t12);
                    N0();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f405017d;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.f405017d = aVar;
                    }
                    aVar.b(t12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return NotificationLite.c(this.f405015b, obj);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f405015b.c(g12);
    }
}
