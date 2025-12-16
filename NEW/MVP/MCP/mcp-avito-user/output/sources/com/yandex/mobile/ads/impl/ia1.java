package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;

/* loaded from: classes8.dex */
public final class ia1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f386423a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f386424b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    private final VastTimeOffset f386425c;

    public ia1(@j.N String str, @j.N String str2, @I41.h VastTimeOffset vastTimeOffset) {
        this.f386423a = str;
        this.f386424b = str2;
        this.f386425c = vastTimeOffset;
    }

    @j.N
    public final String a() {
        return this.f386423a;
    }

    @I41.h
    public final VastTimeOffset b() {
        return this.f386425c;
    }

    @j.N
    public final String c() {
        return this.f386424b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ia1.class != obj.getClass()) {
            return false;
        }
        ia1 ia1Var = (ia1) obj;
        if (!this.f386423a.equals(ia1Var.f386423a) || !this.f386424b.equals(ia1Var.f386424b)) {
            return false;
        }
        VastTimeOffset vastTimeOffset = this.f386425c;
        VastTimeOffset vastTimeOffset2 = ia1Var.f386425c;
        return vastTimeOffset == null ? vastTimeOffset2 == null : vastTimeOffset.equals(vastTimeOffset2);
    }

    public final int hashCode() {
        int iA2 = v2.a(this.f386424b, this.f386423a.hashCode() * 31, 31);
        VastTimeOffset vastTimeOffset = this.f386425c;
        return iA2 + (vastTimeOffset != null ? vastTimeOffset.hashCode() : 0);
    }
}
