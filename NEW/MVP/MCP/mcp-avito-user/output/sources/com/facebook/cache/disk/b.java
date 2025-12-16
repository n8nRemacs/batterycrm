package com.facebook.cache.disk;

import com.facebook.cache.disk.e;

/* compiled from: DefaultEntryEvictionComparatorSupplier.java */
/* loaded from: classes5.dex */
class b implements i {
    @Override // java.util.Comparator
    public final int compare(e.c cVar, e.c cVar2) {
        long jA2 = cVar.a();
        long jA3 = cVar2.a();
        if (jA2 < jA3) {
            return -1;
        }
        return jA3 == jA2 ? 0 : 1;
    }
}
