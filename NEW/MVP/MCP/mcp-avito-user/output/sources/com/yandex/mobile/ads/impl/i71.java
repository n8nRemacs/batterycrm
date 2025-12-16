package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes8.dex */
final class i71 implements sb<String> {
    @Override // com.yandex.mobile.ads.impl.sb
    public final /* bridge */ /* synthetic */ boolean a(@j.N String str) {
        return a2(str);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public static boolean a2(@j.N String str) {
        return !(TextUtils.isEmpty(str) || "null".equals(str));
    }
}
