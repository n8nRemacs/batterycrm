package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ByteStreams.java */
@Nullsafe
/* loaded from: classes5.dex */
public final class d {

    /* compiled from: ByteStreams.java */
    public static final class b extends ByteArrayOutputStream {
        public b() {
        }
    }

    public static int a(InputStream inputStream, byte[] bArr, int i12) throws IOException {
        inputStream.getClass();
        if (i12 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i13 = 0;
        while (i13 < i12) {
            int i14 = inputStream.read(bArr, i13, i12 - i13);
            if (i14 == -1) {
                break;
            }
            i13 += i14;
        }
        return i13;
    }
}
