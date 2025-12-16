package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
@KeepName
/* loaded from: classes6.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.r> extends com.google.android.gms.common.api.m<R> {

    /* renamed from: o, reason: collision with root package name */
    public static final ThreadLocal f348966o = new x1();
    public static final /* synthetic */ int zad = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f348967a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final a f348968b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final WeakReference f348969c;

    /* renamed from: d, reason: collision with root package name */
    public final CountDownLatch f348970d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f348971e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public com.google.android.gms.common.api.s f348972f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f348973g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public com.google.android.gms.common.api.r f348974h;

    /* renamed from: i, reason: collision with root package name */
    public Status f348975i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f348976j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f348977k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f348978l;

    /* renamed from: m, reason: collision with root package name */
    public volatile C36648i1 f348979m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f348980n;

    @KeepName
    private z1 resultGuardian;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @j.k0
    public static class a<R extends com.google.android.gms.common.api.r> extends zau {
        public a() {
            super(Looper.getMainLooper());
        }

        public final void a(@j.N com.google.android.gms.common.api.s sVar, @j.N com.google.android.gms.common.api.r rVar) {
            ThreadLocal threadLocal = BasePendingResult.f348966o;
            C36729v.j(sVar);
            sendMessage(obtainMessage(1, new Pair(sVar, rVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@j.N Message message) {
            int i12 = message.what;
            if (i12 != 1) {
                if (i12 != 2) {
                    Log.wtf("BasePendingResult", AK.c.g(i12, "Don't know how to handle message: "), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f348903i);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.s sVar = (com.google.android.gms.common.api.s) pair.first;
            com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) pair.second;
            try {
                sVar.a(rVar);
            } catch (RuntimeException e12) {
                BasePendingResult.zal(rVar);
                throw e12;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f348967a = new Object();
        this.f348970d = new CountDownLatch(1);
        this.f348971e = new ArrayList();
        this.f348973g = new AtomicReference();
        this.f348980n = false;
        this.f348968b = new a(Looper.getMainLooper());
        this.f348969c = new WeakReference(null);
    }

    public static void zal(@j.P com.google.android.gms.common.api.r rVar) {
        if (rVar instanceof com.google.android.gms.common.api.o) {
            try {
                ((com.google.android.gms.common.api.o) rVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(rVar));
            }
        }
    }

    public final com.google.android.gms.common.api.r a() {
        com.google.android.gms.common.api.r rVar;
        synchronized (this.f348967a) {
            C36729v.l("Result has already been consumed.", !this.f348976j);
            C36729v.l("Result is not ready.", isReady());
            rVar = this.f348974h;
            this.f348974h = null;
            this.f348972f = null;
            this.f348976j = true;
        }
        C36651j1 c36651j1 = (C36651j1) this.f348973g.getAndSet(null);
        if (c36651j1 != null) {
            c36651j1.f349146a.f349172a.remove(this);
        }
        C36729v.j(rVar);
        return rVar;
    }

    @Override // com.google.android.gms.common.api.m
    public final void addStatusListener(@j.N m.a aVar) {
        C36729v.a("Callback cannot be null.", aVar != null);
        synchronized (this.f348967a) {
            try {
                if (isReady()) {
                    aVar.a(this.f348975i);
                } else {
                    this.f348971e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.m
    @ResultIgnorabilityUnspecified
    @j.N
    public final R await() throws InterruptedException {
        C36729v.i("await must not be called on the UI thread");
        C36729v.l("Result has already been consumed", !this.f348976j);
        C36729v.l("Cannot await if then() has been called.", this.f348979m == null);
        try {
            this.f348970d.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f348901g);
        }
        C36729v.l("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.r rVar) {
        this.f348974h = rVar;
        this.f348975i = rVar.getStatus();
        this.f348970d.countDown();
        if (this.f348977k) {
            this.f348972f = null;
        } else {
            com.google.android.gms.common.api.s sVar = this.f348972f;
            if (sVar != null) {
                a aVar = this.f348968b;
                aVar.removeMessages(2);
                aVar.a(sVar, a());
            } else if (this.f348974h instanceof com.google.android.gms.common.api.o) {
                this.resultGuardian = new z1(this, null);
            }
        }
        ArrayList arrayList = this.f348971e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((m.a) arrayList.get(i12)).a(this.f348975i);
        }
        arrayList.clear();
    }

    @Override // com.google.android.gms.common.api.m
    @RX0.a
    public void cancel() {
        synchronized (this.f348967a) {
            try {
                if (!this.f348977k && !this.f348976j) {
                    zal(this.f348974h);
                    this.f348977k = true;
                    b(createFailedResult(Status.f348904j));
                }
            } finally {
            }
        }
    }

    @j.N
    @RX0.a
    public abstract R createFailedResult(@j.N Status status);

    @RX0.a
    @Deprecated
    public final void forceFailureUnlessReady(@j.N Status status) {
        synchronized (this.f348967a) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.f348978l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean isCanceled() {
        boolean z12;
        synchronized (this.f348967a) {
            z12 = this.f348977k;
        }
        return z12;
    }

    @RX0.a
    public final boolean isReady() {
        return this.f348970d.getCount() == 0;
    }

    @RX0.a
    public final void setResult(@j.N R r12) {
        synchronized (this.f348967a) {
            try {
                if (this.f348978l || this.f348977k) {
                    zal(r12);
                    return;
                }
                isReady();
                C36729v.l("Results have already been set", !isReady());
                C36729v.l("Result has already been consumed", !this.f348976j);
                b(r12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.m
    @RX0.a
    public final void setResultCallback(@j.P com.google.android.gms.common.api.s<? super R> sVar) {
        synchronized (this.f348967a) {
            try {
                if (sVar == null) {
                    this.f348972f = null;
                    return;
                }
                boolean z12 = true;
                C36729v.l("Result has already been consumed.", !this.f348976j);
                if (this.f348979m != null) {
                    z12 = false;
                }
                C36729v.l("Cannot set callbacks if then() has been called.", z12);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f348968b.a(sVar, a());
                } else {
                    this.f348972f = sVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.m
    @j.N
    public final <S extends com.google.android.gms.common.api.r> com.google.android.gms.common.api.v<S> then(@j.N com.google.android.gms.common.api.u<? super R, ? extends S> uVar) {
        C36648i1 c36648i1;
        boolean z12 = true;
        C36729v.l("Result has already been consumed.", !this.f348976j);
        synchronized (this.f348967a) {
            try {
                C36729v.l("Cannot call then() twice.", this.f348979m == null);
                C36729v.l("Cannot call then() if callbacks are set.", this.f348972f == null);
                C36729v.l("Cannot call then() if result was canceled.", !this.f348977k);
                this.f348980n = true;
                this.f348979m = new C36648i1(this.f348969c);
                C36648i1 c36648i12 = this.f348979m;
                synchronized (c36648i12.f349140d) {
                    if (c36648i12.f349137a != null) {
                        z12 = false;
                    }
                    C36729v.l("Cannot call then() twice.", z12);
                    c36648i12.f349137a = uVar;
                    c36648i1 = new C36648i1(c36648i12.f349142f);
                    c36648i12.f349138b = c36648i1;
                    c36648i12.c();
                }
                if (isReady()) {
                    this.f348968b.a(this.f348979m, a());
                } else {
                    this.f348972f = this.f348979m;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c36648i1;
    }

    public final void zak() {
        boolean z12 = true;
        if (!this.f348980n && !((Boolean) f348966o.get()).booleanValue()) {
            z12 = false;
        }
        this.f348980n = z12;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.f348967a) {
            try {
                if (((com.google.android.gms.common.api.i) this.f348969c.get()) == null || !this.f348980n) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zIsCanceled;
    }

    public final void zan(@j.P C36651j1 c36651j1) {
        this.f348973g.set(c36651j1);
    }

    @RX0.a
    public BasePendingResult(@j.P com.google.android.gms.common.api.i iVar) {
        this.f348967a = new Object();
        this.f348970d = new CountDownLatch(1);
        this.f348971e = new ArrayList();
        this.f348973g = new AtomicReference();
        this.f348980n = false;
        this.f348968b = new a(iVar != null ? iVar.i() : Looper.getMainLooper());
        this.f348969c = new WeakReference(iVar);
    }

    @Override // com.google.android.gms.common.api.m
    @ResultIgnorabilityUnspecified
    @j.N
    public final R await(long j12, @j.N TimeUnit timeUnit) {
        if (j12 > 0) {
            C36729v.i("await must not be called on the UI thread when time is greater than zero.");
        }
        C36729v.l("Result has already been consumed.", !this.f348976j);
        C36729v.l("Cannot await if then() has been called.", this.f348979m == null);
        try {
            if (!this.f348970d.await(j12, timeUnit)) {
                forceFailureUnlessReady(Status.f348903i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f348901g);
        }
        C36729v.l("Result is not ready.", isReady());
        return (R) a();
    }

    @Override // com.google.android.gms.common.api.m
    @RX0.a
    public final void setResultCallback(@j.N com.google.android.gms.common.api.s<? super R> sVar, long j12, @j.N TimeUnit timeUnit) {
        synchronized (this.f348967a) {
            try {
                if (sVar == null) {
                    this.f348972f = null;
                    return;
                }
                boolean z12 = true;
                C36729v.l("Result has already been consumed.", !this.f348976j);
                if (this.f348979m != null) {
                    z12 = false;
                }
                C36729v.l("Cannot set callbacks if then() has been called.", z12);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f348968b.a(sVar, a());
                } else {
                    this.f348972f = sVar;
                    a aVar = this.f348968b;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j12));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
