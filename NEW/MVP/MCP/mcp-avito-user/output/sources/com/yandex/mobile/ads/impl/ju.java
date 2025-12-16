package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class ju implements k80 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final RectF f386977a;

    /* renamed from: b, reason: collision with root package name */
    private final int f386978b;

    public ju(int i12, @j.P RectF rectF) {
        this.f386978b = i12;
        this.f386977a = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.k80
    @j.N
    public final String a() {
        String str;
        int i12 = this.f386978b;
        RectF rectF = this.f386977a;
        if (rectF != null) {
            str = "{x:" + rectF.left + ",y:" + rectF.top + ",width:" + rectF.width() + ",height:" + rectF.height() + "}";
        } else {
            str = null;
        }
        return "exposure:{exposedPercentage:" + i12 + ",visibleRectangle:" + str + ",occlusionRectangles:[]}";
    }
}
