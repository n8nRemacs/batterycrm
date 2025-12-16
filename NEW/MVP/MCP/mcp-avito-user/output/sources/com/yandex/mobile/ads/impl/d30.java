package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d30 {
    public static boolean a(@Y61.k b30 b30Var, @Y61.k Map map) {
        Bitmap bitmap = (Bitmap) map.get(b30Var.d());
        return bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1;
    }
}
