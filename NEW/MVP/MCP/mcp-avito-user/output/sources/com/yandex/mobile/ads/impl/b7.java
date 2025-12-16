package com.yandex.mobile.ads.impl;

import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class b7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private String f383802a;

    @Y61.l
    public final String a() {
        return this.f383802a;
    }

    public final void a(@Y61.l String str) {
        if (str == null || C43066x.K(str)) {
            h70.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = this.f383802a;
        if (str2 == null || str2.equals(str)) {
            this.f383802a = str;
        } else {
            h70.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }
}
