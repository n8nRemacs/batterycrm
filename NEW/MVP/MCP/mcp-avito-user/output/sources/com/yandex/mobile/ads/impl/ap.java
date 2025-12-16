package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.s90;
import java.io.FileNotFoundException;

/* loaded from: classes8.dex */
public final class ap implements p90 {
    public ap() {
        this(0);
    }

    @Override // com.yandex.mobile.ads.impl.p90
    public final int a(int i12) {
        return i12 == 7 ? 6 : 3;
    }

    public ap(int i12) {
    }

    @Override // com.yandex.mobile.ads.impl.p90
    public final long a(p90.a aVar) {
        Throwable cause = aVar.f388743a;
        if (!(cause instanceof tr0) && !(cause instanceof FileNotFoundException) && !(cause instanceof d10) && !(cause instanceof s90.g)) {
            int i12 = hn.f386175b;
            while (cause != null) {
                if (!(cause instanceof hn) || ((hn) cause).f386176a != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((aVar.f388744b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }
}
