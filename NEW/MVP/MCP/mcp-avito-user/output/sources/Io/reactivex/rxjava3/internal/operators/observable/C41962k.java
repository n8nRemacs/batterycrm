package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p41.AbstractC46894a;

/* compiled from: ObservableAutoConnect.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41962k<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC46894a<? extends T> f404110b;

    /* renamed from: d, reason: collision with root package name */
    public final l41.g<? super io.reactivex.rxjava3.disposables.d> f404112d;

    /* renamed from: c, reason: collision with root package name */
    public final int f404111c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f404113e = new AtomicInteger();

    public C41962k(AbstractC46894a abstractC46894a, l41.g gVar) {
        this.f404110b = abstractC46894a;
        this.f404112d = gVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        AbstractC46894a<? extends T> abstractC46894a = this.f404110b;
        abstractC46894a.c(g12);
        if (this.f404113e.incrementAndGet() == this.f404111c) {
            abstractC46894a.O0(this.f404112d);
        }
    }
}
