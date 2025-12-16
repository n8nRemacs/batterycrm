package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;

/* loaded from: classes8.dex */
public final class md<T extends View> implements x9<T> {
    @Override // com.yandex.mobile.ads.impl.x9
    public final void a(@j.N View view) {
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // com.yandex.mobile.ads.impl.x9
    public final void cancel() {
    }
}
