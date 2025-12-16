package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: DisposeOnCancel.java */
/* loaded from: classes8.dex */
final class c implements Future<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.disposables.d f404681b;

    public c(io.reactivex.rxjava3.disposables.d dVar) {
        this.f404681b = dVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        this.f404681b.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j12, @j41.e TimeUnit timeUnit) {
        return null;
    }
}
