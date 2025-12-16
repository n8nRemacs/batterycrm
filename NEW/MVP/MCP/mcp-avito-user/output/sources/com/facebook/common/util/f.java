package com.facebook.common.util;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;

/* compiled from: StreamUtil.java */
@Nullsafe
/* loaded from: classes5.dex */
public class f {
    public static void a(wW0.f fVar, long j12) throws IOException {
        if (!(j12 >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j12 > 0) {
            long jSkip = fVar.skip(j12);
            if (jSkip <= 0) {
                if (fVar.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j12 -= jSkip;
        }
    }
}
