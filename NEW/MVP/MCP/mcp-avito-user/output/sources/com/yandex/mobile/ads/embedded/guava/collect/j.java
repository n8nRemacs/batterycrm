package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.iu0;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes8.dex */
final class j<T> extends d0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Comparator<T> f382776a;

    public j(Comparator<T> comparator) {
        this.f382776a = (Comparator) iu0.a(comparator);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0, java.util.Comparator
    public final int compare(T t12, T t13) {
        return this.f382776a.compare(t12, t13);
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f382776a.equals(((j) obj).f382776a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f382776a.hashCode();
    }

    public final String toString() {
        return this.f382776a.toString();
    }
}
