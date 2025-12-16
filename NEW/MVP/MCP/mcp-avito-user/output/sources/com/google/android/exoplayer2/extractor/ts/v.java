package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.O;
import com.google.android.exoplayer2.util.U;

/* compiled from: PsDurationReader.java */
/* loaded from: classes6.dex */
final class v {

    /* renamed from: c, reason: collision with root package name */
    public boolean f345310c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f345311d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f345312e;

    /* renamed from: a, reason: collision with root package name */
    public final O f345308a = new O(0);

    /* renamed from: f, reason: collision with root package name */
    public long f345313f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f345314g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f345315h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345309b = new com.google.android.exoplayer2.util.F();

    public static int b(int i12, byte[] bArr) {
        return (bArr[i12 + 3] & 255) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
    }

    public static long c(com.google.android.exoplayer2.util.F f12) {
        int i12 = f12.f348071b;
        if (f12.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        f12.c(0, 9, bArr);
        f12.B(i12);
        byte b12 = bArr[0];
        if ((b12 & 196) == 68) {
            byte b13 = bArr[2];
            if ((b13 & 4) == 4) {
                byte b14 = bArr[4];
                if ((b14 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j12 = b12;
                    long j13 = b13;
                    return ((j13 & 3) << 13) | ((j12 & 3) << 28) | (((56 & j12) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j13 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b14 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(com.google.android.exoplayer2.extractor.f fVar) {
        byte[] bArr = U.f348110e;
        com.google.android.exoplayer2.util.F f12 = this.f345309b;
        f12.getClass();
        f12.z(bArr.length, bArr);
        this.f345310c = true;
        fVar.f344497f = 0;
    }
}
