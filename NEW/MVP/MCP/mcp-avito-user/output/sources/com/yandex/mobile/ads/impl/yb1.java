package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class yb1 {
    @j.N
    public static com.google.android.exoplayer2.source.ads.a a(@j.N com.google.android.exoplayer2.source.ads.a aVar, long j12) {
        if (aVar.f346185e != j12) {
            aVar = new com.google.android.exoplayer2.source.ads.a(aVar.f346182b, aVar.f346187g, aVar.f346184d, j12, aVar.f346186f);
        }
        for (int i12 = 0; i12 < aVar.f346183c; i12++) {
            if (aVar.a(i12).f346189b > j12) {
                aVar = aVar.h(i12);
            }
        }
        return aVar;
    }
}
