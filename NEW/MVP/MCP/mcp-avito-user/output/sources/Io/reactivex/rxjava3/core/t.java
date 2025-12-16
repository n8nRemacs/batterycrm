package io.reactivex.rxjava3.core;

/* compiled from: MaybeObserver.java */
/* loaded from: classes8.dex */
public interface t<T> {
    void b(@j41.e io.reactivex.rxjava3.disposables.d dVar);

    void e();

    void onError(@j41.e Throwable th2);

    void onSuccess(@j41.e T t12);
}
