package com.google.common.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/* compiled from: ReaderInputStream.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
final class P extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public CharBuffer f360314b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f360315c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f360316d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f360317e;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(null) != 1) {
            return -1;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r6, int r7, int r8) throws java.nio.charset.CharacterCodingException {
        /*
            r5 = this;
            int r0 = r7 + r8
            int r1 = r6.length
            com.google.common.base.M.l(r7, r0, r1)
            r0 = 0
            if (r8 != 0) goto La
            return r0
        La:
            r1 = r0
        Lb:
            boolean r2 = r5.f360316d
            if (r2 == 0) goto L37
            int r2 = r7 + r1
            int r3 = r8 - r1
            java.nio.ByteBuffer r4 = r5.f360315c
            int r4 = r4.remaining()
            int r3 = java.lang.Math.min(r3, r4)
            java.nio.ByteBuffer r4 = r5.f360315c
            r4.get(r6, r2, r3)
            int r1 = r1 + r3
            if (r1 == r8) goto L32
            boolean r2 = r5.f360317e
            if (r2 == 0) goto L2a
            goto L32
        L2a:
            r5.f360316d = r0
            java.nio.ByteBuffer r2 = r5.f360315c
            r2.clear()
            goto L37
        L32:
            if (r1 <= 0) goto L35
            goto L36
        L35:
            r1 = -1
        L36:
            return r1
        L37:
            boolean r2 = r5.f360317e
            r3 = 0
            if (r2 == 0) goto Lca
            java.nio.charset.CoderResult r2 = java.nio.charset.CoderResult.UNDERFLOW
            boolean r4 = r2.isOverflow()
            if (r4 == 0) goto L64
            java.nio.ByteBuffer r2 = r5.f360315c
            r2.flip()
            java.nio.ByteBuffer r2 = r5.f360315c
            int r2 = r2.remaining()
            if (r2 != 0) goto L60
            java.nio.ByteBuffer r2 = r5.f360315c
            int r2 = r2.capacity()
            int r2 = r2 * 2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r5.f360315c = r2
            goto Lb
        L60:
            r2 = 1
            r5.f360316d = r2
            goto Lb
        L64:
            boolean r4 = r2.isUnderflow()
            if (r4 == 0) goto Lc0
            java.nio.CharBuffer r6 = r5.f360314b
            int r7 = r6.capacity()
            int r6 = r6.limit()
            int r7 = r7 - r6
            if (r7 != 0) goto Lad
            java.nio.CharBuffer r6 = r5.f360314b
            int r6 = r6.position()
            if (r6 <= 0) goto L89
            java.nio.CharBuffer r6 = r5.f360314b
            java.nio.CharBuffer r6 = r6.compact()
            r6.flip()
            goto Lad
        L89:
            java.nio.CharBuffer r6 = r5.f360314b
            char[] r7 = r6.array()
            int r8 = r6.capacity()
            int r8 = r8 * 2
            char[] r7 = java.util.Arrays.copyOf(r7, r8)
            java.nio.CharBuffer r7 = java.nio.CharBuffer.wrap(r7)
            int r8 = r6.position()
            r7.position(r8)
            int r6 = r6.limit()
            r7.limit(r6)
            r5.f360314b = r7
        Lad:
            java.nio.CharBuffer r6 = r5.f360314b
            r6.limit()
            java.nio.CharBuffer r6 = r5.f360314b
            r6.array()
            java.nio.CharBuffer r6 = r5.f360314b
            r6.capacity()
            r6.limit()
            throw r3
        Lc0:
            boolean r3 = r2.isError()
            if (r3 == 0) goto L37
            r2.throwException()
            return r0
        Lca:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.P.read(byte[], int, int):int");
    }
}
