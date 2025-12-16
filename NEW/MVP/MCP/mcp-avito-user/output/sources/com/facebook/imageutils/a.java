package com.facebook.imageutils;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamProcessor.java */
@Nullsafe
/* loaded from: classes15.dex */
class a {
    public static int a(InputStream inputStream, int i12, boolean z12) throws IOException {
        int i13;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = inputStream.read();
            if (i16 == -1) {
                throw new IOException("no more bytes");
            }
            if (z12) {
                i13 = (i16 & 255) << (i15 * 8);
            } else {
                i14 <<= 8;
                i13 = i16 & 255;
            }
            i14 |= i13;
        }
        return i14;
    }
}
