package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;
import q41.InterfaceC47199b;

/* compiled from: ConcatMapXMainObserver.java */
/* loaded from: classes8.dex */
public abstract class c<T> extends AtomicInteger implements G<T>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = -3214213361171757852L;

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.internal.util.b f403349b = new io.reactivex.rxjava3.internal.util.b();

    /* renamed from: c, reason: collision with root package name */
    public final int f403350c;

    /* renamed from: d, reason: collision with root package name */
    public final ErrorMode f403351d;

    /* renamed from: e, reason: collision with root package name */
    public q41.g<T> f403352e;

    /* renamed from: f, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f403353f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f403354g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f403355h;

    public c(int i12, ErrorMode errorMode) {
        this.f403351d = errorMode;
        this.f403350c = i12;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.f(this.f403353f, dVar)) {
            this.f403353f = dVar;
            if (dVar instanceof InterfaceC47199b) {
                InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                int iV2 = interfaceC47199b.v(7);
                if (iV2 == 1) {
                    this.f403352e = interfaceC47199b;
                    this.f403354g = true;
                    f();
                    d();
                    return;
                }
                if (iV2 == 2) {
                    this.f403352e = interfaceC47199b;
                    f();
                    return;
                }
            }
            this.f403352e = new q41.i(this.f403350c);
            f();
        }
    }

    public abstract void c();

    public abstract void d();

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f403355h = true;
        this.f403353f.dispose();
        c();
        this.f403349b.c();
        if (getAndIncrement() == 0) {
            this.f403352e.clear();
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        this.f403354g = true;
        d();
    }

    public abstract void f();

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f403355h;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        if (this.f403349b.b(th2)) {
            if (this.f403351d == ErrorMode.f404819b) {
                c();
            }
            this.f403354g = true;
            d();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        if (t12 != null) {
            this.f403352e.offer(t12);
        }
        d();
    }

    public void a() {
    }
}
