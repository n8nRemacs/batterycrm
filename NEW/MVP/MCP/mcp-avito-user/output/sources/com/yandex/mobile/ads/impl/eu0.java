package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes8.dex */
public enum eu0 {
    f385105b(InstreamAdBreakType.PREROLL),
    f385106c(InstreamAdBreakType.MIDROLL),
    f385107d(InstreamAdBreakType.POSTROLL),
    f385108e("standalone");


    /* renamed from: a, reason: collision with root package name */
    private final String f385110a;

    eu0(String str) {
        this.f385110a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f385110a;
    }
}
