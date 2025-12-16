package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class ns implements lj {
    @Override // com.yandex.mobile.ads.impl.lj
    public final void a(@j.N View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.lj
    public final void b(@j.N View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
