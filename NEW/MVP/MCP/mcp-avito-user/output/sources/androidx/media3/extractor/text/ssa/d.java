package androidx.media3.extractor.text.ssa;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SsaSubtitle.java */
/* loaded from: classes.dex */
final class d implements androidx.media3.extractor.text.e {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f51353b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f51354c;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.f51353b = arrayList;
        this.f51354c = arrayList2;
    }

    @Override // androidx.media3.extractor.text.e
    public final long a(int i12) {
        C23110a.b(i12 >= 0);
        ArrayList arrayList = this.f51354c;
        C23110a.b(i12 < arrayList.size());
        return ((Long) arrayList.get(i12)).longValue();
    }

    @Override // androidx.media3.extractor.text.e
    public final int b() {
        return this.f51354c.size();
    }

    @Override // androidx.media3.extractor.text.e
    public final int c(long j12) {
        int i12;
        Long lValueOf = Long.valueOf(j12);
        int i13 = M.f47887a;
        ArrayList arrayList = this.f51354c;
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

    @Override // androidx.media3.extractor.text.e
    public final List<androidx.media3.common.text.a> d(long j12) {
        int iD2 = M.d(this.f51354c, Long.valueOf(j12), true, false);
        return iD2 == -1 ? Collections.emptyList() : (List) this.f51353b.get(iD2);
    }
}
