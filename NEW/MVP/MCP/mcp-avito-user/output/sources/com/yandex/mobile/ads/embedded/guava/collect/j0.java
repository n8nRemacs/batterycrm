package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.iu0;
import java.io.Serializable;

/* loaded from: classes8.dex */
final class j0<T> extends d0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final d0<? super T> f382777a;

    public j0(d0<? super T> d0Var) {
        this.f382777a = (d0) iu0.a(d0Var);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0
    public final <S extends T> d0<S> b() {
        return this.f382777a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0, java.util.Comparator
    public final int compare(T t12, T t13) {
        return this.f382777a.compare(t13, t12);
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f382777a.equals(((j0) obj).f382777a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f382777a.hashCode();
    }

    public final String toString() {
        return this.f382777a + ".reverse()";
    }
}
