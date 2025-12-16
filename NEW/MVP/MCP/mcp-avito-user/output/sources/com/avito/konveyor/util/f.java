package com.avito.konveyor.util;

import Y61.k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: DataSources.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/konveyor/util/f;", "T", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class f<T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UV0.a<T> f338564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338565c;

    /* renamed from: d, reason: collision with root package name */
    public int f338566d;

    public f(@k UV0.a<T> aVar) {
        this.f338564b = aVar;
        this.f338565c = aVar.getCount();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f338565c > this.f338566d;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            int i12 = this.f338566d;
            this.f338566d = i12 + 1;
            return this.f338564b.getItem(i12);
        }
        throw new NoSuchElementException("count=" + this.f338565c + " but index=" + this.f338566d);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
