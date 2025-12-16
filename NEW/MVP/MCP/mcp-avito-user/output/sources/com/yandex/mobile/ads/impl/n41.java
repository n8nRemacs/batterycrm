package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class n41 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private SizeInfo f388163a;

    @Y61.l
    public final SizeInfo a() {
        return this.f388163a;
    }

    public final void a(@Y61.l SizeInfo sizeInfo) {
        if (sizeInfo == null) {
            h70.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        SizeInfo sizeInfo2 = this.f388163a;
        if (sizeInfo2 == null || sizeInfo2.equals(sizeInfo)) {
            this.f388163a = sizeInfo;
        } else {
            h70.c("Ad size can't be set twice.", new Object[0]);
        }
    }
}
