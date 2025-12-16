package androidx.media3.extractor;

import androidx.media3.common.C23108t;
import androidx.media3.common.Metadata;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import j.P;
import java.util.Collections;

/* compiled from: FlacStreamMetadata.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f51891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51893c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51894d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51895e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51896f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51897g;

    /* renamed from: h, reason: collision with root package name */
    public final int f51898h;

    /* renamed from: i, reason: collision with root package name */
    public final int f51899i;

    /* renamed from: j, reason: collision with root package name */
    public final long f51900j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final a f51901k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final Metadata f51902l;

    /* compiled from: FlacStreamMetadata.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f51903a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f51904b;

        public a(long[] jArr, long[] jArr2) {
            this.f51903a = jArr;
            this.f51904b = jArr2;
        }
    }

    public x(byte[] bArr, int i12) {
        androidx.media3.common.util.y yVar = new androidx.media3.common.util.y(bArr, bArr.length);
        yVar.l(i12 * 8);
        this.f51891a = yVar.g(16);
        this.f51892b = yVar.g(16);
        this.f51893c = yVar.g(24);
        this.f51894d = yVar.g(24);
        int iG2 = yVar.g(20);
        this.f51895e = iG2;
        this.f51896f = d(iG2);
        this.f51897g = yVar.g(3) + 1;
        int iG3 = yVar.g(5) + 1;
        this.f51898h = iG3;
        this.f51899i = a(iG3);
        int iG4 = yVar.g(4);
        int iG5 = yVar.g(32);
        int i13 = androidx.media3.common.util.M.f47887a;
        this.f51900j = ((iG4 & 4294967295L) << 32) | (iG5 & 4294967295L);
        this.f51901k = null;
        this.f51902l = null;
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
        long j12 = this.f51900j;
        if (j12 == 0) {
            return -9223372036854775807L;
        }
        return (j12 * 1000000) / this.f51895e;
    }

    public final C23108t c(byte[] bArr, @P Metadata metadata) {
        bArr[4] = -128;
        int i12 = this.f51894d;
        if (i12 <= 0) {
            i12 = -1;
        }
        Metadata metadata2 = this.f51902l;
        if (metadata2 != null) {
            metadata = metadata == null ? metadata2 : metadata2.a(metadata.f47361b);
        }
        C23108t.b bVar = new C23108t.b();
        bVar.f47787k = "audio/flac";
        bVar.f47788l = i12;
        bVar.f47800x = this.f51897g;
        bVar.f47801y = this.f51895e;
        bVar.f47789m = Collections.singletonList(bArr);
        bVar.f47785i = metadata;
        return bVar.a();
    }

    public x(int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, @P a aVar, @P Metadata metadata) {
        this.f51891a = i12;
        this.f51892b = i13;
        this.f51893c = i14;
        this.f51894d = i15;
        this.f51895e = i16;
        this.f51896f = d(i16);
        this.f51897g = i17;
        this.f51898h = i18;
        this.f51899i = a(i18);
        this.f51900j = j12;
        this.f51901k = aVar;
        this.f51902l = metadata;
    }
}
