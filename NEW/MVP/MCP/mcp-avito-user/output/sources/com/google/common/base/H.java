package com.google.common.base;

import com.google.common.collect.AbstractC37431x0;
import java.io.Serializable;

/* compiled from: Optional.java */
@InterfaceC37268l
@XY0.b
@aZ0.f
/* loaded from: classes6.dex */
public abstract class H<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> H<T> a() {
        return C37255a.f358985b;
    }

    public static <T> H<T> d(T t12) {
        t12.getClass();
        return new P(t12);
    }

    public abstract T b();

    public abstract boolean c();

    public abstract Object e(AbstractC37431x0 abstractC37431x0);

    @I41.a
    public abstract T f();
}
