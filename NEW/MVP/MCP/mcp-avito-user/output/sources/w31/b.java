package W31;

import V31.e;
import V31.h;
import Y61.k;
import io.ktor.utils.io.core.C41641n;
import io.ktor.utils.io.core.E;
import io.ktor.utils.io.core.internal.i;
import io.ktor.utils.io.core.x;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Encoding.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final String a(@k CharsetDecoder charsetDecoder, @k x xVar) throws Throwable {
        CoderResult coderResultDecode;
        io.ktor.utils.io.core.internal.b bVarB;
        boolean z12 = true;
        StringBuilder sb2 = new StringBuilder((int) Math.min(Integer.MAX_VALUE, xVar instanceof C41641n ? xVar.o() : Math.max(xVar.o(), 16L)));
        CharBuffer charBuffer = a.f17734a;
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        io.ktor.utils.io.core.internal.b bVarU = xVar.u(1);
        int iRemaining = 0;
        if (bVarU != null) {
            int i12 = 1;
            int i13 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int i14 = bVarU.f400876c;
                    int i15 = bVarU.f400875b;
                    int i16 = i14 - i15;
                    if (i16 >= i12) {
                        int i17 = Integer.MAX_VALUE - iRemaining2;
                        if (i17 == 0) {
                            i12 = 0;
                        } else {
                            try {
                                ByteBuffer byteBuffer = bVarU.f400874a;
                                e.a aVar = e.f16906b;
                                ByteBuffer byteBufferC = h.c(byteBuffer, i15, i16);
                                charBufferAllocate.clear();
                                if (i17 < 8192) {
                                    charBufferAllocate.limit(i17);
                                }
                                CoderResult coderResultDecode2 = charsetDecoder.decode(byteBufferC, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                sb2.append((CharSequence) charBufferAllocate);
                                if (coderResultDecode2.isMalformed() || coderResultDecode2.isUnmappable()) {
                                    a.d(coderResultDecode2);
                                }
                                i13 = (coderResultDecode2.isUnderflow() && byteBufferC.hasRemaining()) ? i13 + 1 : 1;
                                if (byteBufferC.limit() != i16) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                bVarU.c(byteBufferC.position());
                                i12 = i13;
                            } finally {
                            }
                        }
                        i16 = bVarU.f400876c - bVarU.f400875b;
                    }
                    if (i16 == 0) {
                        try {
                            bVarB = i.b(xVar, bVarU);
                        } catch (Throwable th2) {
                            th = th2;
                            z12 = false;
                            if (z12) {
                                i.a(xVar, bVarU);
                            }
                            throw th;
                        }
                    } else if (i16 < i12 || bVarU.f400879f - bVarU.f400878e < 8) {
                        i.a(xVar, bVarU);
                        bVarB = xVar.u(i12);
                    } else {
                        bVarB = bVarU;
                    }
                    if (bVarB == null) {
                        break;
                    }
                    if (i12 <= 0) {
                        iRemaining = 1;
                        bVarU = bVarB;
                        break;
                    }
                    bVarU = bVarB;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (iRemaining != 0) {
                i.a(xVar, bVarU);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i18 = Integer.MAX_VALUE - iRemaining;
            if (i18 == 0) {
                break;
            }
            if (i18 < 8192) {
                charBufferAllocate.limit(i18);
            }
            coderResultDecode = charsetDecoder.decode(a.f17735b, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            sb2.append((CharSequence) charBufferAllocate);
            if (coderResultDecode.isUnmappable() || coderResultDecode.isMalformed()) {
                a.d(coderResultDecode);
            }
        } while (coderResultDecode.isOverflow());
        return sb2.toString();
    }

    public static final void b(@k CharsetEncoder charsetEncoder, @k E e12, @k CharSequence charSequence, int i12, int i13) {
        if (i12 >= i13) {
            return;
        }
        io.ktor.utils.io.core.internal.b bVarM = e12.m(1);
        while (true) {
            try {
                int iB2 = a.b(charsetEncoder, charSequence, i12, i13, bVarM);
                if (iB2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i12 += iB2;
                int i14 = i12 >= i13 ? 0 : iB2 == 0 ? 8 : 1;
                if (i14 > 0) {
                    bVarM = i.c(e12, i14, bVarM);
                } else {
                    e12.a();
                    io.ktor.utils.io.core.internal.b bVarM2 = e12.m(1);
                    int i15 = 1;
                    while (true) {
                        try {
                            i15 = a.a(charsetEncoder, bVarM2) ? 0 : i15 + 1;
                            if (i15 <= 0) {
                                return;
                            } else {
                                bVarM2 = i.c(e12, 1, bVarM2);
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }
}
