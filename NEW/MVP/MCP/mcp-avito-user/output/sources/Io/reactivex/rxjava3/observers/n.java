package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.s;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: TestObserver.java */
/* loaded from: classes8.dex */
public class n<T> extends io.reactivex.rxjava3.observers.a<T, n<T>> implements G<T>, io.reactivex.rxjava3.disposables.d, t<T>, L<T>, InterfaceC41771d {

    /* renamed from: f, reason: collision with root package name */
    public final G<? super T> f404883f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404884g;

    public n() {
        a aVar = a.f404885b;
        this.f404884g = new AtomicReference<>();
        this.f404883f = aVar;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        Thread.currentThread();
        s sVar = this.f404860d;
        if (dVar == null) {
            sVar.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f404884g;
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                dVar.dispose();
                if (atomicReference.get() != DisposableHelper.f401986b) {
                    sVar.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + dVar));
                    return;
                }
                return;
            }
        }
        this.f404883f.getClass();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this.f404884g);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        CountDownLatch countDownLatch = this.f404858b;
        if (!this.f404861e) {
            this.f404861e = true;
            if (this.f404884g.get() == null) {
                this.f404860d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f404883f.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return DisposableHelper.b(this.f404884g.get());
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(@j41.e Throwable th2) {
        CountDownLatch countDownLatch = this.f404858b;
        boolean z12 = this.f404861e;
        s sVar = this.f404860d;
        if (!z12) {
            this.f404861e = true;
            if (this.f404884g.get() == null) {
                sVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th2 == null) {
                sVar.add(new NullPointerException("onError received a null Throwable"));
            } else {
                sVar.add(th2);
            }
            this.f404883f.getClass();
            countDownLatch.countDown();
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(@j41.e T t12) {
        boolean z12 = this.f404861e;
        s sVar = this.f404860d;
        if (!z12) {
            this.f404861e = true;
            if (this.f404884g.get() == null) {
                sVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f404859c.add(t12);
        if (t12 == null) {
            sVar.add(new NullPointerException("onNext received a null value"));
        }
        this.f404883f.getClass();
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(@j41.e T t12) {
        onNext(t12);
        e();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TestObserver.java */
    public static final class a implements G<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f404885b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f404886c;

        static {
            a aVar = new a("INSTANCE", 0);
            f404885b = aVar;
            f404886c = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f404886c.clone();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
        }
    }
}
