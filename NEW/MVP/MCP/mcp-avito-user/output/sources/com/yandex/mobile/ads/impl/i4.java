package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.a;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39312c2 f386293a;

    public i4(@j.N hh1 hh1Var) {
        this.f386293a = new C39312c2(hh1Var);
    }

    @j.N
    public final com.google.android.exoplayer2.source.ads.a a(@j.N InstreamAd instreamAd, @j.P Object obj) {
        List<? extends InstreamAdBreak> adBreaks = instreamAd.getAdBreaks();
        if (adBreaks.isEmpty()) {
            return com.google.android.exoplayer2.source.ads.a.f346179h;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends InstreamAdBreak> it = adBreaks.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            long jA2 = this.f386293a.a(it.next().getAdBreakPosition());
            if (jA2 == Long.MIN_VALUE) {
                i12 = 1;
            } else if (jA2 != -1) {
                arrayList.add(Long.valueOf(com.google.android.exoplayer2.util.U.H(jA2)));
            }
        }
        int size = arrayList.size() + i12;
        long[] jArr = new long[size];
        if (i12 != 0) {
            jArr[size - 1] = Long.MIN_VALUE;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            jArr[i13] = ((Long) arrayList.get(i13)).longValue();
        }
        Arrays.sort(jArr, 0, arrayList.size());
        a.b[] bVarArr = new a.b[size];
        for (int i14 = 0; i14 < size; i14++) {
            bVarArr[i14] = new a.b(jArr[i14]);
        }
        return new com.google.android.exoplayer2.source.ads.a(obj, bVarArr, 0L, -9223372036854775807L, 0);
    }
}
