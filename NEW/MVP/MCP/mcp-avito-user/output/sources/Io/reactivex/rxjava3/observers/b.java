package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: DefaultObserver.java */
/* loaded from: classes8.dex */
public abstract class b<T> implements G<T> {

    /* renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f404862b;

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        io.reactivex.rxjava3.disposables.d dVar2 = this.f404862b;
        Class<?> cls = getClass();
        Objects.requireNonNull(dVar, "next is null");
        if (dVar2 == null) {
            this.f404862b = dVar;
            return;
        }
        dVar.dispose();
        if (dVar2 != DisposableHelper.f401986b) {
            io.reactivex.rxjava3.internal.util.g.a(cls);
        }
    }
}
