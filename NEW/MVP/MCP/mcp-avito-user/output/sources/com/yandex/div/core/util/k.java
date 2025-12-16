package com.yandex.div.core.util;

import androidx.collection.q1;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SparseArrays.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/util/k;", "T", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class k<T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q1<T> f367798b;

    /* renamed from: c, reason: collision with root package name */
    public int f367799c;

    public k(@Y61.k q1<T> q1Var) {
        this.f367798b = q1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f367798b.j() > this.f367799c;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i12 = this.f367799c;
        this.f367799c = i12 + 1;
        return this.f367798b.k(i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
