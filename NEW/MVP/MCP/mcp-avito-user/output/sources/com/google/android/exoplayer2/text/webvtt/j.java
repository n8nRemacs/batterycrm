package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WebvttSubtitle.java */
/* loaded from: classes6.dex */
final class j implements com.google.android.exoplayer2.text.h {

    /* renamed from: b, reason: collision with root package name */
    public final List<e> f347130b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f347131c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f347132d;

    public j(ArrayList arrayList) {
        this.f347130b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f347131c = new long[arrayList.size() * 2];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            e eVar = (e) arrayList.get(i12);
            int i13 = i12 * 2;
            long[] jArr = this.f347131c;
            jArr[i13] = eVar.f347100b;
            jArr[i13 + 1] = eVar.f347101c;
        }
        long[] jArr2 = this.f347131c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f347132d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.exoplayer2.text.h
    public final long a(int i12) {
        C36585a.b(i12 >= 0);
        long[] jArr = this.f347132d;
        C36585a.b(i12 < jArr.length);
        return jArr[i12];
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int b() {
        return this.f347132d.length;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int c(long j12) {
        long[] jArr = this.f347132d;
        int iB2 = U.b(jArr, j12, false);
        if (iB2 < jArr.length) {
            return iB2;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final List<com.google.android.exoplayer2.text.a> d(long j12) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        while (true) {
            List<e> list = this.f347130b;
            if (i12 >= list.size()) {
                break;
            }
            int i13 = i12 * 2;
            long[] jArr = this.f347131c;
            if (jArr[i13] <= j12 && j12 < jArr[i13 + 1]) {
                e eVar = list.get(i12);
                com.google.android.exoplayer2.text.a aVar = eVar.f347099a;
                if (aVar.f346721f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
            i12++;
        }
        Collections.sort(arrayList2, new g(1));
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            a.c cVar = new a.c(((e) arrayList2.get(i14)).f347099a, null);
            cVar.f346738e = (-1) - i14;
            cVar.f346739f = 1;
            arrayList.add(cVar.a());
        }
        return arrayList;
    }
}
