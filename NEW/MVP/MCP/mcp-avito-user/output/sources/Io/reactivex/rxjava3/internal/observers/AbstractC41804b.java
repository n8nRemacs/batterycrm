package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: BasicFuseableObserver.java */
/* renamed from: io.reactivex.rxjava3.internal.observers.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41804b<T, R> implements io.reactivex.rxjava3.core.G<T>, InterfaceC47199b<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.G<? super R> f402097b;

    /* renamed from: c, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f402098c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC47199b<T> f402099d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f402100e;

    /* renamed from: f, reason: collision with root package name */
    public int f402101f;

    public AbstractC41804b(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f402097b = g12;
    }

    public final void a(Throwable th2) {
        io.reactivex.rxjava3.exceptions.a.a(th2);
        this.f402098c.dispose();
        onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.f(this.f402098c, dVar)) {
            this.f402098c = dVar;
            if (dVar instanceof InterfaceC47199b) {
                this.f402099d = (InterfaceC47199b) dVar;
            }
            this.f402097b.b(this);
        }
    }

    @Override // q41.g
    public void clear() {
        this.f402099d.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f402098c.dispose();
    }

    @Override // io.reactivex.rxjava3.core.G
    public void e() {
        if (this.f402100e) {
            return;
        }
        this.f402100e = true;
        this.f402097b.e();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f402098c.getF318621e();
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return this.f402099d.isEmpty();
    }

    @Override // q41.g
    public final boolean offer(R r12) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.G
    public void onError(Throwable th2) {
        if (this.f402100e) {
            C47998a.b(th2);
        } else {
            this.f402100e = true;
            this.f402097b.onError(th2);
        }
    }

    public int v(int i12) {
        InterfaceC47199b<T> interfaceC47199b = this.f402099d;
        if (interfaceC47199b == null || (i12 & 4) != 0) {
            return 0;
        }
        int iV2 = interfaceC47199b.v(i12);
        if (iV2 == 0) {
            return iV2;
        }
        this.f402101f = iV2;
        return iV2;
    }
}
