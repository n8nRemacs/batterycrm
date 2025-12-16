package androidx.media3.exoplayer.source;

import androidx.media3.common.util.C23110a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.O;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.extractor.J;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: SampleDataQueue.java */
/* loaded from: classes.dex */
class M {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f49590a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49591b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.util.z f49592c;

    /* renamed from: d, reason: collision with root package name */
    public a f49593d;

    /* renamed from: e, reason: collision with root package name */
    public a f49594e;

    /* renamed from: f, reason: collision with root package name */
    public a f49595f;

    /* renamed from: g, reason: collision with root package name */
    public long f49596g;

    /* compiled from: SampleDataQueue.java */
    public static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f49597a;

        /* renamed from: b, reason: collision with root package name */
        public long f49598b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public androidx.media3.exoplayer.upstream.a f49599c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public a f49600d;

        public a(long j12, int i12) {
            C23110a.g(this.f49599c == null);
            this.f49597a = j12;
            this.f49598b = j12 + i12;
        }

        @Override // androidx.media3.exoplayer.upstream.b.a
        public final androidx.media3.exoplayer.upstream.a a() {
            androidx.media3.exoplayer.upstream.a aVar = this.f49599c;
            aVar.getClass();
            return aVar;
        }

        @Override // androidx.media3.exoplayer.upstream.b.a
        @j.P
        public final b.a next() {
            a aVar = this.f49600d;
            if (aVar == null || aVar.f49599c == null) {
                return null;
            }
            return aVar;
        }
    }

    public M(androidx.media3.exoplayer.upstream.b bVar) {
        this.f49590a = bVar;
        int iB2 = bVar.b();
        this.f49591b = iB2;
        this.f49592c = new androidx.media3.common.util.z(32);
        a aVar = new a(0L, iB2);
        this.f49593d = aVar;
        this.f49594e = aVar;
        this.f49595f = aVar;
    }

    public static a c(a aVar, long j12, ByteBuffer byteBuffer, int i12) {
        while (j12 >= aVar.f49598b) {
            aVar = aVar.f49600d;
        }
        while (i12 > 0) {
            int iMin = Math.min(i12, (int) (aVar.f49598b - j12));
            androidx.media3.exoplayer.upstream.a aVar2 = aVar.f49599c;
            byteBuffer.put(aVar2.f50063a, ((int) (j12 - aVar.f49597a)) + aVar2.f50064b, iMin);
            i12 -= iMin;
            j12 += iMin;
            if (j12 == aVar.f49598b) {
                aVar = aVar.f49600d;
            }
        }
        return aVar;
    }

    public static a d(a aVar, long j12, byte[] bArr, int i12) {
        while (j12 >= aVar.f49598b) {
            aVar = aVar.f49600d;
        }
        int i13 = i12;
        while (i13 > 0) {
            int iMin = Math.min(i13, (int) (aVar.f49598b - j12));
            androidx.media3.exoplayer.upstream.a aVar2 = aVar.f49599c;
            System.arraycopy(aVar2.f50063a, ((int) (j12 - aVar.f49597a)) + aVar2.f50064b, bArr, i12 - i13, iMin);
            i13 -= iMin;
            j12 += iMin;
            if (j12 == aVar.f49598b) {
                aVar = aVar.f49600d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, DecoderInputBuffer decoderInputBuffer, O.b bVar, androidx.media3.common.util.z zVar) {
        a aVarD;
        int iZ2;
        if (decoderInputBuffer.f(1073741824)) {
            long j12 = bVar.f49642b;
            zVar.C(1);
            a aVarD2 = d(aVar, j12, zVar.f47962a, 1);
            long j13 = j12 + 1;
            byte b12 = zVar.f47962a[0];
            boolean z12 = (b12 & 128) != 0;
            int i12 = b12 & 127;
            androidx.media3.decoder.d dVar = decoderInputBuffer.f48322c;
            byte[] bArr = dVar.f48329a;
            if (bArr == null) {
                dVar.f48329a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVarD = d(aVarD2, j13, dVar.f48329a, i12);
            long j14 = j13 + i12;
            if (z12) {
                zVar.C(2);
                aVarD = d(aVarD, j14, zVar.f47962a, 2);
                j14 += 2;
                iZ2 = zVar.z();
            } else {
                iZ2 = 1;
            }
            int[] iArr = dVar.f48332d;
            if (iArr == null || iArr.length < iZ2) {
                iArr = new int[iZ2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = dVar.f48333e;
            if (iArr3 == null || iArr3.length < iZ2) {
                iArr3 = new int[iZ2];
            }
            int[] iArr4 = iArr3;
            if (z12) {
                int i13 = iZ2 * 6;
                zVar.C(i13);
                aVarD = d(aVarD, j14, zVar.f47962a, i13);
                j14 += i13;
                zVar.F(0);
                for (int i14 = 0; i14 < iZ2; i14++) {
                    iArr2[i14] = zVar.z();
                    iArr4[i14] = zVar.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = bVar.f49641a - ((int) (j14 - bVar.f49642b));
            }
            J.a aVar2 = bVar.f49643c;
            int i15 = androidx.media3.common.util.M.f47887a;
            dVar.a(iZ2, iArr2, iArr4, aVar2.f50381b, dVar.f48329a, aVar2.f50380a, aVar2.f50382c, aVar2.f50383d);
            long j15 = bVar.f49642b;
            int i16 = (int) (j14 - j15);
            bVar.f49642b = j15 + i16;
            bVar.f49641a -= i16;
        } else {
            aVarD = aVar;
        }
        if (!decoderInputBuffer.f(268435456)) {
            decoderInputBuffer.j(bVar.f49641a);
            return c(aVarD, bVar.f49642b, decoderInputBuffer.f48323d, bVar.f49641a);
        }
        zVar.C(4);
        a aVarD3 = d(aVarD, bVar.f49642b, zVar.f47962a, 4);
        int iX2 = zVar.x();
        bVar.f49642b += 4;
        bVar.f49641a -= 4;
        decoderInputBuffer.j(iX2);
        a aVarC = c(aVarD3, bVar.f49642b, decoderInputBuffer.f48323d, iX2);
        bVar.f49642b += iX2;
        int i17 = bVar.f49641a - iX2;
        bVar.f49641a = i17;
        ByteBuffer byteBuffer = decoderInputBuffer.f48326g;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            decoderInputBuffer.f48326g = ByteBuffer.allocate(i17);
        } else {
            decoderInputBuffer.f48326g.clear();
        }
        return c(aVarC, bVar.f49642b, decoderInputBuffer.f48326g, bVar.f49641a);
    }

    public final void a(long j12) {
        a aVar;
        if (j12 == -1) {
            return;
        }
        while (true) {
            aVar = this.f49593d;
            if (j12 < aVar.f49598b) {
                break;
            }
            this.f49590a.e(aVar.f49599c);
            a aVar2 = this.f49593d;
            aVar2.f49599c = null;
            a aVar3 = aVar2.f49600d;
            aVar2.f49600d = null;
            this.f49593d = aVar3;
        }
        if (this.f49594e.f49597a < aVar.f49597a) {
            this.f49594e = aVar;
        }
    }

    public final int b(int i12) {
        a aVar = this.f49595f;
        if (aVar.f49599c == null) {
            androidx.media3.exoplayer.upstream.a aVarC = this.f49590a.c();
            a aVar2 = new a(this.f49595f.f49598b, this.f49591b);
            aVar.f49599c = aVarC;
            aVar.f49600d = aVar2;
        }
        return Math.min(i12, (int) (this.f49595f.f49598b - this.f49596g));
    }
}
