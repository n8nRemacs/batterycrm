package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes8.dex */
public final class ck0 implements ak0 {
    @Override // com.yandex.mobile.ads.impl.ak0
    @j.P
    public final ProgressBar a(@j.N View view) {
        return (ProgressBar) view.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.ak0
    @j.P
    public final View b(@j.N View view) {
        return view.findViewWithTag("close");
    }
}
