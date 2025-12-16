package io.ktor.utils.io.core;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BufferPrimitives.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41634g {
    public static final void a(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k C41628a c41628a, int i12) throws EOFException {
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i13 = c41628a.f400878e;
        int i14 = c41628a.f400876c;
        if (i12 > i13 - i14) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i15 = bVar.f400875b;
        if (bVar.f400876c - i15 < i12) {
            throw new EOFException(androidx.appcompat.app.r.p("Not enough bytes to read a buffer content of size ", i12, '.'));
        }
        V31.e.b(bVar.f400874a, c41628a.f400874a, i15, i12, i14);
        c41628a.a(i12);
        G0 g02 = G0.f406611a;
        bVar.c(i12);
    }

    public static final void b(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k byte[] bArr, int i12, int i13) throws EOFException {
        int i14 = bVar.f400875b;
        if (bVar.f400876c - i14 < i13) {
            throw new EOFException(androidx.appcompat.app.r.p("Not enough bytes to read a byte array of size ", i13, '.'));
        }
        ByteBuffer byteBuffer = bVar.f400874a;
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            byteBuffer.duplicate().get(bArr, i12, i13);
        } else {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i14, bArr, i12, i13);
        }
        G0 g02 = G0.f406611a;
        bVar.c(i13);
    }

    public static final void c(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k C41628a c41628a, int i12) throws InsufficientSpaceException {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "length shouldn't be negative: ").toString());
        }
        int i13 = c41628a.f400876c;
        int i14 = c41628a.f400875b;
        if (i12 > i13 - i14) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "length shouldn't be greater than the source read remaining: ", " > ");
            sbJ.append(c41628a.f400876c - c41628a.f400875b);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i15 = bVar.f400878e;
        int i16 = bVar.f400876c;
        int i17 = i15 - i16;
        if (i12 > i17) {
            StringBuilder sbJ2 = androidx.camera.camera2.internal.G.j(i12, "length shouldn't be greater than the destination write remaining space: ", " > ");
            sbJ2.append(bVar.f400878e - bVar.f400876c);
            throw new IllegalArgumentException(sbJ2.toString().toString());
        }
        if (i17 < i12) {
            throw new InsufficientSpaceException("buffer readable content", i12, i17);
        }
        V31.e.b(c41628a.f400874a, bVar.f400874a, i14, i12, i16);
        c41628a.c(i12);
        bVar.a(i12);
    }
}
