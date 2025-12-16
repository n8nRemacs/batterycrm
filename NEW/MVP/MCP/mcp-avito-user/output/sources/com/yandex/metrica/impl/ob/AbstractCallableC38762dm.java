package com.yandex.metrica.impl.ob;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.dm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractCallableC38762dm<T> implements Callable<T> {
    public abstract T a();

    @Override // java.util.concurrent.Callable
    @j.P
    public T call() {
        try {
            return a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
