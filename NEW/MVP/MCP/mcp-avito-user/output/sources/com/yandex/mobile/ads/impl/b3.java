package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* loaded from: classes8.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h4 f383765a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39312c2 f383766b;

    public b3(@j.N hh1 hh1Var, @j.N h4 h4Var) {
        this.f383765a = h4Var;
        this.f383766b = new C39312c2(hh1Var);
    }

    public final int a(@j.N InstreamAdBreakPosition instreamAdBreakPosition) {
        long jA2 = this.f383766b.a(instreamAdBreakPosition);
        com.google.android.exoplayer2.source.ads.a aVarA = this.f383765a.a();
        if (jA2 == Long.MIN_VALUE) {
            int i12 = aVarA.f346183c;
            if (i12 <= 0 || aVarA.a(i12 - 1).f346189b != Long.MIN_VALUE) {
                return -1;
            }
            return aVarA.f346183c - 1;
        }
        long jH2 = com.google.android.exoplayer2.util.U.H(jA2);
        for (int i13 = 0; i13 < aVarA.f346183c; i13++) {
            long j12 = aVarA.a(i13).f346189b;
            if (j12 != Long.MIN_VALUE && Math.abs(j12 - jH2) <= 1000) {
                return i13;
            }
        }
        return -1;
    }
}
