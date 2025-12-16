package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.b81;
import com.yandex.mobile.ads.impl.dc;

/* loaded from: classes8.dex */
public final class cp implements ac0.b {
    @Override // com.yandex.mobile.ads.impl.ac0.b
    public final ac0 a(ac0.a aVar) {
        int i12 = pc1.f388768a;
        if (i12 < 23 || i12 < 31) {
            return new b81.a().a(aVar);
        }
        int iA2 = qg0.a(aVar.f383460c.f391181l);
        StringBuilder sbA = Cif.a("Creating an asynchronous MediaCodec adapter for track type ");
        sbA.append(pc1.d(iA2));
        ka0.c("DMCodecAdapterFactory", sbA.toString());
        return new dc.a(iA2).a(aVar);
    }
}
