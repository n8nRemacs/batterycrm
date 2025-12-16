package io.reactivex.rxjava3.internal.util;

import java.util.Collections;
import java.util.List;

/* compiled from: SorterFunction.java */
/* loaded from: classes8.dex */
public final class q<T> implements l41.o<List<T>, List<T>> {
    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, null);
        return list;
    }
}
