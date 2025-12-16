package io.ktor.utils.io.core;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ByteBuffers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41638k {
    public static final int a(C41641n c41641n, ByteBuffer byteBuffer) throws EOFException {
        int i12 = 0;
        while (byteBuffer.hasRemaining()) {
            io.ktor.utils.io.core.internal.b bVarQ = c41641n.q(1);
            if (bVarQ == null) {
                return i12;
            }
            int iRemaining = byteBuffer.remaining();
            int i13 = bVarQ.f400876c - bVarQ.f400875b;
            if (iRemaining < i13) {
                C41635h.a(bVarQ, byteBuffer, iRemaining);
                c41641n.f400910e = bVarQ.f400875b;
                return i12 + iRemaining;
            }
            C41635h.a(bVarQ, byteBuffer, i13);
            c41641n.A(bVarQ);
            i12 += i13;
        }
        return i12;
    }
}
