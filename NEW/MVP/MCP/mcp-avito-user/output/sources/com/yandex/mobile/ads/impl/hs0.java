package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class hs0 implements w20 {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Bitmap> f386210a;

    @Override // com.yandex.mobile.ads.impl.w20
    public final void a(@j.N Map<String, Bitmap> map) {
        this.f386210a = map;
    }

    @Override // com.yandex.mobile.ads.impl.w20
    @j.P
    public final Bitmap a(@j.N b30 b30Var) {
        String strD = b30Var.d();
        Map<String, Bitmap> map = this.f386210a;
        if (map != null) {
            return map.get(strD);
        }
        return null;
    }
}
