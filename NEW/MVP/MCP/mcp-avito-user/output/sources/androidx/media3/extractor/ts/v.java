package androidx.media3.extractor.ts;

import androidx.media3.common.util.M;
import androidx.media3.extractor.C23191j;

/* compiled from: PsDurationReader.java */
/* loaded from: classes.dex */
final class v {

    /* renamed from: c, reason: collision with root package name */
    public boolean f51814c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f51815d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51816e;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.util.G f51812a = new androidx.media3.common.util.G(0);

    /* renamed from: f, reason: collision with root package name */
    public long f51817f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f51818g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f51819h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.z f51813b = new androidx.media3.common.util.z();

    public static int b(int i12, byte[] bArr) {
        return (bArr[i12 + 3] & 255) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
    }

    public static long c(androidx.media3.common.util.z zVar) {
        int i12 = zVar.f47963b;
        if (zVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zVar.e(0, 9, bArr);
        zVar.F(i12);
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

    public final void a(C23191j c23191j) {
        byte[] bArr = M.f47891e;
        androidx.media3.common.util.z zVar = this.f51813b;
        zVar.getClass();
        zVar.D(bArr.length, bArr);
        this.f51814c = true;
        c23191j.f50585f = 0;
    }
}
