package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SsaSubtitle.java */
/* loaded from: classes6.dex */
final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f346988b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f346989c;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.f346988b = arrayList;
        this.f346989c = arrayList2;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final long a(int i12) {
        C36585a.b(i12 >= 0);
        ArrayList arrayList = this.f346989c;
        C36585a.b(i12 < arrayList.size());
        return ((Long) arrayList.get(i12)).longValue();
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int b() {
        return this.f346989c.size();
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int c(long j12) {
        int i12;
        Long lValueOf = Long.valueOf(j12);
        int i13 = U.f348106a;
        ArrayList arrayList = this.f346989c;
        int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            int size = arrayList.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i12 = iBinarySearch;
        }
        if (i12 < arrayList.size()) {
            return i12;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final List<com.google.android.exoplayer2.text.a> d(long j12) {
        int iD2 = U.d(this.f346989c, Long.valueOf(j12), false);
        return iD2 == -1 ? Collections.emptyList() : (List) this.f346988b.get(iD2);
    }
}
