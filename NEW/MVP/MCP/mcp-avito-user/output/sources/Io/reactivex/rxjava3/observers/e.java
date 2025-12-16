package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableObserver.java */
/* loaded from: classes8.dex */
public abstract class e<T> implements G<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404865b = new AtomicReference<>();

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        if (io.reactivex.rxjava3.internal.util.g.b(this.f404865b, dVar, getClass())) {
            a();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this.f404865b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f404865b.get() == DisposableHelper.f401986b;
    }

    public void a() {
    }
}
