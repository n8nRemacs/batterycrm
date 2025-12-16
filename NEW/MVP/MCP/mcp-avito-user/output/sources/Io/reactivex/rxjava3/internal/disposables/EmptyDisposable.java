package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.core.t;
import j41.f;
import q41.InterfaceC47199b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EmptyDisposable implements InterfaceC47199b<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final EmptyDisposable f401988b;

    /* renamed from: c, reason: collision with root package name */
    public static final EmptyDisposable f401989c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EmptyDisposable[] f401990d;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        f401988b = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        f401989c = emptyDisposable2;
        f401990d = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    public EmptyDisposable() {
        throw null;
    }

    public static void a(G<?> g12) {
        g12.b(f401988b);
        g12.e();
    }

    public static void b(Throwable th2, InterfaceC41771d interfaceC41771d) {
        interfaceC41771d.b(f401988b);
        interfaceC41771d.onError(th2);
    }

    public static void c(Throwable th2, t<?> tVar) {
        tVar.b(f401988b);
        tVar.onError(th2);
    }

    public static void d(Throwable th2, G<?> g12) {
        g12.b(f401988b);
        g12.onError(th2);
    }

    public static void e(Throwable th2, L<?> l12) {
        l12.b(f401988b);
        l12.onError(th2);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) f401990d.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this == f401988b;
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // q41.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // q41.g
    @f
    public final Object poll() {
        return null;
    }

    @Override // q41.InterfaceC47200c
    public final int v(int i12) {
        return 2;
    }

    @Override // q41.g
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
    }
}
