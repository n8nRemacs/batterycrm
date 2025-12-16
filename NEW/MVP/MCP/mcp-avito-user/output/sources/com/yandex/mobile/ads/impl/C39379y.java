package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: com.yandex.mobile.ads.impl.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39379y {
    @Y61.l
    public static Context a(@Y61.k View view) {
        while (view != null) {
            Context context = view.getContext();
            if (context instanceof Activity) {
                return context;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }
}
