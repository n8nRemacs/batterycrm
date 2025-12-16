package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43881c;

/* compiled from: ResourceMaybeObserver.java */
/* loaded from: classes8.dex */
public abstract class i<T> implements t<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404869b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public final C43881c f404870c = new C43881c();

    @Override // io.reactivex.rxjava3.core.t
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        io.reactivex.rxjava3.internal.util.g.b(this.f404869b, dVar, getClass());
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (DisposableHelper.a(this.f404869b)) {
            this.f404870c.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return DisposableHelper.b(this.f404869b.get());
    }
}
