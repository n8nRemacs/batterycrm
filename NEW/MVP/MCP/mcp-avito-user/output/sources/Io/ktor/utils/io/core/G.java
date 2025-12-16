package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Output.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class G {
    public static final void a(@Y61.k C41640m c41640m, @Y61.k C41628a c41628a, int i12) {
        io.ktor.utils.io.core.internal.b bVarM = c41640m.m(1);
        while (true) {
            try {
                int iMin = Math.min(i12, bVarM.f400878e - bVarM.f400876c);
                C41634g.c(bVarM, c41628a, iMin);
                i12 -= iMin;
                if (i12 <= 0) {
                    return;
                } else {
                    bVarM = io.ktor.utils.io.core.internal.i.c(c41640m, 1, bVarM);
                }
            } finally {
                c41640m.a();
            }
        }
    }

    public static final void b(@Y61.k E e12, @Y61.k byte[] bArr, int i12, int i13) {
        io.ktor.utils.io.core.internal.b bVarM = e12.m(1);
        while (true) {
            try {
                int iMin = Math.min(i13, bVarM.f400878e - bVarM.f400876c);
                int i14 = bVarM.f400876c;
                int i15 = bVarM.f400878e - i14;
                if (i15 < iMin) {
                    throw new InsufficientSpaceException("byte array", iMin, i15);
                }
                V31.e.b(ByteBuffer.wrap(bArr, i12, iMin).slice().order(java.nio.ByteOrder.BIG_ENDIAN), bVarM.f400874a, 0, iMin, i14);
                bVarM.a(iMin);
                i12 += iMin;
                i13 -= iMin;
                if (i13 <= 0) {
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
