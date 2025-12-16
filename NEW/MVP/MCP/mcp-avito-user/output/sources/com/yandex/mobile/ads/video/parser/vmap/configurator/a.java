package com.yandex.mobile.ads.video.parser.vmap.configurator;

import com.yandex.mobile.ads.impl.mu;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import j.N;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class a {
    @N
    public static AdBreakParameters a(@N ArrayList arrayList) {
        String strB;
        int i12 = 0;
        AdBreakParameters.b bVar = new AdBreakParameters.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mu muVar = (mu) it.next();
            String strA = muVar.a();
            strB = muVar.b();
            strA.getClass();
            switch (strA) {
                case "PageID":
                    bVar.b(strB);
                    break;
                case "SessionID":
                    bVar.c(strB);
                    break;
                case "CategoryID":
                    bVar.a(strB);
                    break;
            }
        }
        return new AdBreakParameters(bVar, i12);
    }
}
