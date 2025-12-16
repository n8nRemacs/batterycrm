package com.google.common.collect;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: CartesianList.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class D<E> extends AbstractList<List<E>> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f359282b = 0;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@I41.a Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@I41.a Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(@I41.a Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        throw null;
    }
}
