package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class s61 implements t71 {

    /* renamed from: a, reason: collision with root package name */
    private final List<List<vm>> f389797a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Long> f389798b;

    public s61(ArrayList arrayList, ArrayList arrayList2) {
        this.f389797a = arrayList;
        this.f389798b = arrayList2;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a(long j12) {
        int i12;
        List<Long> list = this.f389798b;
        Long lValueOf = Long.valueOf(j12);
        int i13 = pc1.f388768a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i12 = iBinarySearch;
        }
        if (i12 < this.f389798b.size()) {
            return i12;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final List<vm> b(long j12) {
        int i12;
        List<Long> list = this.f389798b;
        Long lValueOf = Long.valueOf(j12);
        int i13 = pc1.f388768a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i14 = iBinarySearch - 1;
                if (i14 < 0 || list.get(i14).compareTo(lValueOf) != 0) {
                    break;
                }
                iBinarySearch = i14;
            }
            i12 = iBinarySearch;
        }
        return i12 == -1 ? Collections.emptyList() : this.f389797a.get(i12);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a() {
        return this.f389798b.size();
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final long a(int i12) {
        db.a(i12 >= 0);
        db.a(i12 < this.f389798b.size());
        return this.f389798b.get(i12).longValue();
    }
}
