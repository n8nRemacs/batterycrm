package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OutputArraysJVM.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class F {
    public static final void a(@Y61.k E e12, @Y61.k ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        io.ktor.utils.io.core.internal.b bVarM = e12.m(1);
        while (true) {
            try {
                byteBuffer.limit(byteBuffer.position() + Math.min(byteBuffer.remaining(), bVarM.f400878e - bVarM.f400876c));
                int iRemaining = byteBuffer.remaining();
                int i12 = bVarM.f400876c;
                int i13 = bVarM.f400878e - i12;
                if (i13 < iRemaining) {
                    throw new InsufficientSpaceException("buffer content", iRemaining, i13);
                }
                V31.h.b(byteBuffer, bVarM.f400874a, i12);
                bVarM.a(iRemaining);
                byteBuffer.limit(iLimit);
                if (!byteBuffer.hasRemaining()) {
                    return;
                } else {
                    bVarM = io.ktor.utils.io.core.internal.i.c(e12, 1, bVarM);
                }
            } finally {
                e12.a();
            }
        }
    }
}
