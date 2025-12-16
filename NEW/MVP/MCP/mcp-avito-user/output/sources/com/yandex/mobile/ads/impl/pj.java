package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class pj {
    @j.N
    public static oj a(@j.N FrameLayout frameLayout, @j.N AdResponse adResponse, @j.N pn pnVar, boolean z12) {
        Long lT2 = adResponse.t();
        if (z12 && lT2 == null) {
            return new sh0(frameLayout, new ic1());
        }
        return new mo(frameLayout, new yj1(), pnVar, new gv0(), lT2 != null ? lT2.longValue() : 0L);
    }
}
