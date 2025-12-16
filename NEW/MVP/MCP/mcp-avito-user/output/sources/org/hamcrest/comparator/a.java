package org.hamcrest.comparator;

import java.util.Comparator;

/* compiled from: ComparatorMatcherBuilder.java */
/* loaded from: classes7.dex */
final class a implements Comparator<Comparable<Object>> {
    @Override // java.util.Comparator
    public final int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        return comparable.compareTo(comparable2);
    }
}
