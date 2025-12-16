package io.reactivex.rxjava3.disposables;

import java.util.Objects;
import java.util.concurrent.Future;
import l41.InterfaceC43543a;

/* compiled from: Disposable.java */
/* loaded from: classes8.dex */
public interface d {
    @j41.e
    static d E(@j41.e Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        Objects.requireNonNull(runnable, "value is null");
        return new h(runnable);
    }

    @j41.e
    static d O(@j41.e Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return new f(future);
    }

    @j41.e
    static d Q(@j41.e InterfaceC43543a interfaceC43543a) {
        return new a(interfaceC43543a);
    }

    void dispose();

    boolean i();
}
