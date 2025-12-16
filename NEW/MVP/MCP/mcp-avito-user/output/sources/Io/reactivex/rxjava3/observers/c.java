package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableCompletableObserver.java */
/* loaded from: classes8.dex */
public abstract class c implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404863b = new AtomicReference<>();

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        io.reactivex.rxjava3.internal.util.g.b(this.f404863b, dVar, getClass());
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this.f404863b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f404863b.get() == DisposableHelper.f401986b;
    }
}
