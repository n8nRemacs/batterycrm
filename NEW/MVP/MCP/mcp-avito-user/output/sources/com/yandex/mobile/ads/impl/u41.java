package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class u41 {

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f390449b = new HashSet(Arrays.asList(c91.f384210b, c91.f384209a));

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.video.parser.offset.a f390450a = new com.yandex.mobile.ads.video.parser.offset.a(f390449b);

    @j.P
    public final i60 a(@j.N im imVar) throws NumberFormatException {
        int iD2 = imVar.d();
        v41 v41VarG = imVar.g();
        if (v41VarG == null) {
            return null;
        }
        VastTimeOffset vastTimeOffsetA = this.f390450a.a(v41VarG.a());
        if (vastTimeOffsetA == null) {
            return null;
        }
        float fD2 = vastTimeOffsetA.d();
        if (VastTimeOffset.b.f392907b.equals(vastTimeOffsetA.c())) {
            fD2 = (long) ((fD2 / 100.0f) * iD2);
        }
        return new i60((long) fD2);
    }
}
