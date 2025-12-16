package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.rg;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class sg {
    private sg() {
    }

    public static com.yandex.mobile.ads.embedded.guava.collect.p a(rg.a aVar, ArrayList arrayList) {
        int i12 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
        p.a aVar2 = new p.a();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            Bundle bundle = (Bundle) arrayList.get(i13);
            bundle.getClass();
            aVar2.b(aVar.fromBundle(bundle));
        }
        return aVar2.a();
    }
}
