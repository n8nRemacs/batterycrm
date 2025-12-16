package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import s41.C47998a;

/* compiled from: SerializedObserver.java */
/* loaded from: classes8.dex */
public final class m<T> implements G<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final G<? super T> f404878b;

    /* renamed from: c, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f404879c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f404880d;

    /* renamed from: e, reason: collision with root package name */
    public io.reactivex.rxjava3.internal.util.a<Object> f404881e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f404882f;

    public m() {
        throw null;
    }

    public m(@j41.e G<? super T> g12) {
        this.f404878b = g12;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.f(this.f404879c, dVar)) {
            this.f404879c = dVar;
            this.f404878b.b(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f404882f = true;
        this.f404879c.dispose();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (this.f404882f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f404882f) {
                    return;
                }
                if (!this.f404880d) {
                    this.f404882f = true;
                    this.f404880d = true;
                    this.f404878b.e();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404881e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.f404881e = aVar;
                    }
                    aVar.b(NotificationLite.f404825b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this.f404879c.i();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(@j41.e Throwable th2) {
        if (this.f404882f) {
            C47998a.b(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z12 = true;
                if (!this.f404882f) {
                    if (this.f404880d) {
                        this.f404882f = true;
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404881e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>();
                            this.f404881e = aVar;
                        }
                        aVar.f404830a[0] = NotificationLite.e(th2);
                        return;
                    }
                    this.f404882f = true;
                    this.f404880d = true;
                    z12 = false;
                }
                if (z12) {
                    C47998a.b(th2);
                } else {
                    this.f404878b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(@j41.e T t12) {
        Object[] objArr;
        if (this.f404882f) {
            return;
        }
        if (t12 == null) {
            this.f404879c.dispose();
            onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f404882f) {
                    return;
                }
                if (this.f404880d) {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404881e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.f404881e = aVar;
                    }
                    aVar.b(t12);
                    return;
                }
                this.f404880d = true;
                this.f404878b.onNext(t12);
                while (true) {
                    synchronized (this) {
                        try {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar2 = this.f404881e;
                            if (aVar2 == null) {
                                this.f404880d = false;
                                return;
                            }
                            this.f404881e = null;
                            G<? super T> g12 = this.f404878b;
                            for (Object[] objArr2 = aVar2.f404830a; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i12 = 0; i12 < 4 && (objArr = objArr2[i12]) != null; i12++) {
                                    if (NotificationLite.c(g12, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }
}
