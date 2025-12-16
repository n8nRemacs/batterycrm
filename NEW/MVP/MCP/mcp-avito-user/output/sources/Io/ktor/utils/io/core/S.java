package io.ktor.utils.io.core;

import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.C0;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import okhttp3.internal.http2.Settings;

/* compiled from: Strings.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class S {
    @X
    @Y61.k
    public static final void a(int i12) {
        throw new EOFException(androidx.camera.camera2.internal.G.e(i12, "Premature end of stream: expected ", " bytes"));
    }

    public static byte[] b(C41641n c41641n) {
        long jO2 = c41641n.o();
        if (jO2 > 2147483647L) {
            throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
        }
        int i12 = (int) jO2;
        if (i12 == 0) {
            return io.ktor.utils.io.core.internal.i.f400900a;
        }
        byte[] bArr = new byte[i12];
        A.c(c41641n, bArr, 0, i12);
        return bArr;
    }

    public static String c(x xVar, Charset charset) {
        return W31.b.a(charset.newDecoder(), xVar);
    }

    public static void d(C41640m c41640m, CharSequence charSequence) {
        int length = charSequence.length();
        C43047d c43047d = C43047d.f410588a;
        io.ktor.utils.io.core.internal.b bVarM = c41640m.m(1);
        int i12 = 0;
        while (true) {
            try {
                int iB2 = io.ktor.utils.io.core.internal.h.b(bVarM.f400874a, charSequence, i12, length, bVarM.f400876c, bVarM.f400878e);
                int i13 = C0.f406602c;
                int i14 = ((short) (iB2 >>> 16)) & 65535;
                i12 += i14;
                bVarM.a(((short) (iB2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & 65535);
                int i15 = (i14 != 0 || i12 >= length) ? i12 < length ? 1 : 0 : 8;
                if (i15 <= 0) {
                    return;
                } else {
                    bVarM = io.ktor.utils.io.core.internal.i.c(c41640m, i15, bVarM);
                }
            } finally {
                c41640m.a();
            }
        }
    }
}
