package com.avito.konveyor.util;

import Y61.k;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: DataSources.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/konveyor/util/h;", "T", "LUV0/a;", "LUV0/b;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class h<T> implements UV0.a<T>, UV0.b<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UV0.a<T> f338567b;

    public h(@k UV0.a<T> aVar) {
        this.f338567b = aVar;
    }

    @Override // UV0.a
    public final int getCount() {
        return this.f338567b.getCount();
    }

    @Override // UV0.a
    public final T getItem(int i12) {
        return this.f338567b.getItem(i12);
    }

    @Override // UV0.a
    public final boolean isEmpty() {
        return this.f338567b.isEmpty();
    }

    @Override // java.lang.Iterable
    @k
    public final Iterator<T> iterator() {
        return new f(this.f338567b);
    }
}
