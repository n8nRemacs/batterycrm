package com.yandex.div.internal.viewpool;

import j.k0;
import kotlin.Metadata;

/* compiled from: ProfilingSession.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d {
    @k0
    public static final long a(long j12) {
        long j13;
        if (j12 < 0) {
            return 0L;
        }
        long j14 = 100;
        if (j12 < 100) {
            j14 = 20;
            j13 = j12 / 20;
        } else if (j12 < 1000) {
            j13 = j12 / 100;
        } else {
            j14 = 2000;
            if (j12 < 2000) {
                j14 = 200;
                j13 = j12 / 200;
            } else if (j12 < 5000) {
                j14 = 500;
                j13 = j12 / 500;
            } else {
                if (j12 < 10000) {
                    return (j12 / 1000) * 1000;
                }
                if (j12 >= 20000) {
                    if (j12 < 50000) {
                        return (j12 / 5000) * 5000;
                    }
                    return 50000L;
                }
                j13 = j12 / 2000;
            }
        }
        return j14 * j13;
    }
}
