package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.operators.maybe.d0;

/* compiled from: SingleOnErrorComplete.java */
/* loaded from: classes8.dex */
public final class T<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I<T> f404523b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super Throwable> f404524c;

    public T(io.reactivex.rxjava3.core.I<T> i12, l41.r<? super Throwable> rVar) {
        this.f404523b = i12;
        this.f404524c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f404523b.a(new d0.a(tVar, this.f404524c));
    }
}
