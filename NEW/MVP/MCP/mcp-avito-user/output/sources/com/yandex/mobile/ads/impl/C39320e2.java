package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39320e2 {
    public static void a(@j.N ArrayList arrayList, @j.N AdBreakParameters adBreakParameters) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C39366t1) it.next()).a(adBreakParameters);
        }
    }
}
