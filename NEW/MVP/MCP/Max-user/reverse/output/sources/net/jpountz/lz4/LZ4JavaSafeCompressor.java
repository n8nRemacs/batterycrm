package net.jpountz.lz4;

/* loaded from: classes.dex */
final class LZ4JavaSafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r2 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r17, r15, r8, r1, r9);
        r8 = r8 - r2;
        r15 = r15 - r2;
        r2 = r8 - r9;
        r11 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((((r11 + r2) + 8) + (r2 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r2 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r20[r10] = (byte) 240;
        r11 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r2 - 15, r20, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r20[r10] = (byte) (r2 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r17, r9, r20, r11, r2);
        r11 = r11 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r2 = (short) (r8 - r15);
        r20[r11] = (byte) r2;
        r20[r11 + 1] = (byte) (r2 >>> 8);
        r2 = r11 + 2;
        r8 = r8 + 4;
        r9 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r17, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (((r11 + 8) + (r9 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        r8 = r8 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        if (r9 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        r20[r10] = (byte) (r20[r10] | 15);
        r2 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r9 - 15, r20, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r20[r10] = (byte) (r9 | r20[r10]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        r2 = r8 - 2;
        r19[net.jpountz.lz4.LZ4Utils.hash64k(defpackage.ywd.d(r2, r17))] = (short) (r2 - r1);
        r2 = net.jpountz.lz4.LZ4Utils.hash64k(defpackage.ywd.d(r8, r17));
        r15 = r1 + (r19[r2] & 65535);
        r19[r2] = (short) (r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r17, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        r11 = r10 + 1;
        r20[r10] = (byte) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r18, r15, r10, r19, r7);
        r10 = r10 - r11;
        r15 = r15 - r11;
        r11 = r10 - r7;
        r12 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r11 < 15) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r3[r9] = (byte) 240;
        r12 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r3[r9] = (byte) (r11 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r18, r7, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        r3[r12] = (byte) r2;
        r3[r12 + 1] = (byte) (r2 >>> 8);
        r2 = r12 + 2;
        r10 = r10 + 4;
        r7 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r18, r15 + 4, r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (((r12 + 8) + (r7 >>> 8)) > r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        r10 = r10 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r7 < 15) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r3[r9] = (byte) (r3[r9] | 15);
        r2 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r7 - 15, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        r3[r9] = (byte) (r7 | r3[r9]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r10 <= r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        r2 = r10 - 2;
        r8[net.jpountz.lz4.LZ4Utils.hash(defpackage.ywd.d(r2, r18))] = r2;
        r2 = net.jpountz.lz4.LZ4Utils.hash(defpackage.ywd.d(r10, r18));
        r15 = r8[r2];
        r8[r2] = r10;
        r2 = r10 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r2 >= 65536) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r18, r15, r10) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        r12 = r9 + 1;
        r21[r9] = (byte) 0;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010c, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r18, int r19, int r20, byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r2 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r17, r15, r8, r1, r9);
        r8 = r8 - r2;
        r15 = r15 - r2;
        r2 = r8 - r9;
        r11 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((((r11 + r2) + 8) + (r2 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r2 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r20.put(r10, (byte) 240);
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r2 - 15, r20, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r20.put(r10, (byte) (r2 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r17, r9, r20, r11, r2);
        r11 = r11 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        defpackage.px0.g(r20, r11, (short) (r8 - r15));
        r2 = r11 + 2;
        r8 = r8 + 4;
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r17, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (((r11 + 8) + (r9 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        r8 = r8 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r9 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        r20.put(r10, (byte) (r20.get(r10) | 15));
        r2 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r9 - 15, r20, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        r20.put(r10, (byte) (r9 | r20.get(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        r2 = r8 - 2;
        r19[net.jpountz.lz4.LZ4Utils.hash64k(r17.getInt(r2))] = (short) (r2 - r1);
        r2 = net.jpountz.lz4.LZ4Utils.hash64k(r17.getInt(r8));
        r15 = r1 + (r19[r2] & 65535);
        r19[r2] = (short) (r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r17, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        r11 = r10 + 1;
        r20.put(r10, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r1, r15, r10, r20, r7);
        r10 = r10 - r11;
        r15 = r15 - r11;
        r11 = r10 - r7;
        r12 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r11 < 15) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        r4.put(r9, (byte) 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        r4.put(r9, (byte) (r11 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r1, r7, r4, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        defpackage.px0.g(r4, r12, r2);
        r2 = r12 + 2;
        r10 = r10 + 4;
        r7 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r1, r15 + 4, r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if (((r12 + 8) + (r7 >>> 8)) > r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        r10 = r10 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if (r7 < 15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        r4.put(r9, (byte) (r4.get(r9) | 15));
        r2 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r7 - 15, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
    
        r4.put(r9, (byte) (r7 | r4.get(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
    
        if (r10 <= r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        r2 = r10 - 2;
        r8[net.jpountz.lz4.LZ4Utils.hash(r1.getInt(r2))] = r2;
        r2 = net.jpountz.lz4.LZ4Utils.hash(r1.getInt(r10));
        r15 = r8[r2];
        r8[r2] = r10;
        r2 = r10 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012d, code lost:
    
        if (r2 >= 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r1, r15, r10) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0136, code lost:
    
        r12 = r9 + 1;
        r4.put(r9, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0151, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(java.nio.ByteBuffer r19, int r20, int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
