package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.U;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import j.P;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f344975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344979e;

    /* renamed from: f, reason: collision with root package name */
    public final int f344980f;

    /* renamed from: g, reason: collision with root package name */
    public final int f344981g;

    /* renamed from: h, reason: collision with root package name */
    public final int f344982h;

    /* renamed from: i, reason: collision with root package name */
    public final int f344983i;

    /* renamed from: j, reason: collision with root package name */
    public final long f344984j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final a f344985k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final Metadata f344986l;

    /* compiled from: FlacStreamMetadata.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f344987a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f344988b;

        public a(long[] jArr, long[] jArr2) {
            this.f344987a = jArr;
            this.f344988b = jArr2;
        }
    }

    public r(byte[] bArr, int i12) {
        com.google.android.exoplayer2.util.E e12 = new com.google.android.exoplayer2.util.E(bArr, bArr.length);
        e12.k(i12 * 8);
        this.f344975a = e12.g(16);
        this.f344976b = e12.g(16);
        this.f344977c = e12.g(24);
        this.f344978d = e12.g(24);
        int iG2 = e12.g(20);
        this.f344979e = iG2;
        this.f344980f = d(iG2);
        this.f344981g = e12.g(3) + 1;
        int iG3 = e12.g(5) + 1;
        this.f344982h = iG3;
        this.f344983i = a(iG3);
        int iG4 = e12.g(4);
        int iG5 = e12.g(32);
        int i13 = U.f348106a;
        this.f344984j = ((iG4 & 4294967295L) << 32) | (iG5 & 4294967295L);
        this.f344985k = null;
        this.f344986l = null;
    }

    public static int a(int i12) {
        if (i12 == 8) {
            return 1;
        }
        if (i12 == 12) {
            return 2;
        }
        if (i12 == 16) {
            return 4;
        }
        if (i12 != 20) {
            return i12 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i12) {
        switch (i12) {
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j12 = this.f344984j;
        if (j12 == 0) {
            return -9223372036854775807L;
        }
        return (j12 * 1000000) / this.f344979e;
    }

    public final I c(byte[] bArr, @P Metadata metadata) {
        bArr[4] = -128;
        int i12 = this.f344978d;
        if (i12 <= 0) {
            i12 = -1;
        }
        Metadata metadata2 = this.f344986l;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f345623b;
                if (entryArr.length != 0) {
                    int i13 = U.f348106a;
                    Metadata.Entry[] entryArr2 = metadata2.f345623b;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata2 = new Metadata((Metadata.Entry[]) objArrCopyOf);
                }
            }
            metadata = metadata2;
        }
        I.b bVar = new I.b();
        bVar.f343504k = "audio/flac";
        bVar.f343505l = i12;
        bVar.f343517x = this.f344981g;
        bVar.f343518y = this.f344979e;
        bVar.f343506m = Collections.singletonList(bArr);
        bVar.f343502i = metadata;
        return bVar.a();
    }

    public r(int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, @P a aVar, @P Metadata metadata) {
        this.f344975a = i12;
        this.f344976b = i13;
        this.f344977c = i14;
        this.f344978d = i15;
        this.f344979e = i16;
        this.f344980f = d(i16);
        this.f344981g = i17;
        this.f344982h = i18;
        this.f344983i = a(i18);
        this.f344984j = j12;
        this.f344985k = aVar;
        this.f344986l = metadata;
    }
}
