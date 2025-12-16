package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public abstract class h07 {
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0426, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0478 A[LOOP:0: B:6:0x0020->B:212:0x0478, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x047f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(java.nio.ByteBuffer r20, defpackage.lbg r21, defpackage.i62 r22) throws tech.kwik.agent15.TlsProtocolException {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h07.c(java.nio.ByteBuffer, lbg, i62):java.util.ArrayList");
    }

    public abstract byte[] a();

    public abstract lbg b();

    public final int d(ByteBuffer byteBuffer, lbg lbgVar, int i) {
        if (byteBuffer.remaining() < 4) {
            throw new DecodeErrorException("handshake message underflow");
        }
        if ((byteBuffer.get() & 255) != lbgVar.a) {
            throw new IllegalStateException();
        }
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        if (i2 + 4 >= i) {
            if (byteBuffer.remaining() >= i2) {
                return i2;
            }
            throw new DecodeErrorException("handshake message underflow");
        }
        throw new DecodeErrorException(getClass().getSimpleName() + " can't be less than " + i + " bytes");
    }
}
