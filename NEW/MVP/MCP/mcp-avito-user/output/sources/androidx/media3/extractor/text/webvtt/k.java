package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.a;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WebvttSubtitle.java */
/* loaded from: classes.dex */
final class k implements androidx.media3.extractor.text.e {

    /* renamed from: b, reason: collision with root package name */
    public final List<e> f51492b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f51493c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f51494d;

    public k(ArrayList arrayList) {
        this.f51492b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f51493c = new long[arrayList.size() * 2];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            e eVar = (e) arrayList.get(i12);
            int i13 = i12 * 2;
            long[] jArr = this.f51493c;
            jArr[i13] = eVar.f51463b;
            jArr[i13 + 1] = eVar.f51464c;
        }
        long[] jArr2 = this.f51493c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f51494d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // androidx.media3.extractor.text.e
    public final long a(int i12) {
        C23110a.b(i12 >= 0);
        long[] jArr = this.f51494d;
        C23110a.b(i12 < jArr.length);
        return jArr[i12];
    }

    @Override // androidx.media3.extractor.text.e
    public final int b() {
        return this.f51494d.length;
    }

    @Override // androidx.media3.extractor.text.e
    public final int c(long j12) {
        long[] jArr = this.f51494d;
        int iB2 = M.b(jArr, j12, false);
        if (iB2 < jArr.length) {
            return iB2;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.e
    public final List<androidx.media3.common.text.a> d(long j12) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        while (true) {
            List<e> list = this.f51492b;
            if (i12 >= list.size()) {
                break;
            }
            int i13 = i12 * 2;
            long[] jArr = this.f51493c;
            if (jArr[i13] <= j12 && j12 < jArr[i13 + 1]) {
                e eVar = list.get(i12);
                androidx.media3.common.text.a aVar = eVar.f51462a;
                if (aVar.f47826f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
            i12++;
        }
        Collections.sort(arrayList2, new h(1));
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            androidx.media3.common.text.a aVar2 = ((e) arrayList2.get(i14)).f51462a;
            aVar2.getClass();
            a.c cVar = new a.c(aVar2, null);
            cVar.f47843e = (-1) - i14;
            cVar.f47844f = 1;
            arrayList.add(cVar.a());
        }
        return arrayList;
    }
}
