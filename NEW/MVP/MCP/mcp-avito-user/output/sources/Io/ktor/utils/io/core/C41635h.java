package io.ktor.utils.io.core;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BufferUtilsJvm.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41635h {
    public static final void a(@Y61.k C41628a c41628a, @Y61.k ByteBuffer byteBuffer, int i12) throws EOFException {
        ByteBuffer byteBuffer2 = c41628a.f400874a;
        int i13 = c41628a.f400875b;
        if (c41628a.f400876c - i13 < i12) {
            throw new EOFException(androidx.appcompat.app.r.p("Not enough bytes to read a buffer content of size ", i12, '.'));
        }
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i12);
            V31.h.a(byteBuffer2, byteBuffer, i13);
            byteBuffer.limit(iLimit);
            G0 g02 = G0.f406611a;
            c41628a.c(i12);
        } catch (Throwable th2) {
            byteBuffer.limit(iLimit);
            throw th2;
        }
    }
}
