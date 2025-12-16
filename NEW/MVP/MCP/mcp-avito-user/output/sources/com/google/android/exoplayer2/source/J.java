package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.source.L;
import com.google.android.exoplayer2.upstream.C36571a;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.util.C36585a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: SampleDataQueue.java */
/* loaded from: classes6.dex */
class J {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36572b f346024a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346025b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f346026c;

    /* renamed from: d, reason: collision with root package name */
    public a f346027d;

    /* renamed from: e, reason: collision with root package name */
    public a f346028e;

    /* renamed from: f, reason: collision with root package name */
    public a f346029f;

    /* renamed from: g, reason: collision with root package name */
    public long f346030g;

    /* compiled from: SampleDataQueue.java */
    public static final class a implements InterfaceC36572b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f346031a;

        /* renamed from: b, reason: collision with root package name */
        public long f346032b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public C36571a f346033c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public a f346034d;

        public a(long j12, int i12) {
            C36585a.d(this.f346033c == null);
            this.f346031a = j12;
            this.f346032b = j12 + i12;
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36572b.a
        public final C36571a a() {
            C36571a c36571a = this.f346033c;
            c36571a.getClass();
            return c36571a;
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36572b.a
        @j.P
        public final InterfaceC36572b.a next() {
            a aVar = this.f346034d;
            if (aVar == null || aVar.f346033c == null) {
                return null;
            }
            return aVar;
        }
    }

    public J(InterfaceC36572b interfaceC36572b) {
        this.f346024a = interfaceC36572b;
        int iB2 = interfaceC36572b.b();
        this.f346025b = iB2;
        this.f346026c = new com.google.android.exoplayer2.util.F(32);
        a aVar = new a(0L, iB2);
        this.f346027d = aVar;
        this.f346028e = aVar;
        this.f346029f = aVar;
    }

    public static a c(a aVar, long j12, ByteBuffer byteBuffer, int i12) {
        while (j12 >= aVar.f346032b) {
            aVar = aVar.f346034d;
        }
        while (i12 > 0) {
            int iMin = Math.min(i12, (int) (aVar.f346032b - j12));
            C36571a c36571a = aVar.f346033c;
            byteBuffer.put(c36571a.f347794a, ((int) (j12 - aVar.f346031a)) + c36571a.f347795b, iMin);
            i12 -= iMin;
            j12 += iMin;
            if (j12 == aVar.f346032b) {
                aVar = aVar.f346034d;
            }
        }
        return aVar;
    }

    public static a d(a aVar, long j12, byte[] bArr, int i12) {
        while (j12 >= aVar.f346032b) {
            aVar = aVar.f346034d;
        }
        int i13 = i12;
        while (i13 > 0) {
            int iMin = Math.min(i13, (int) (aVar.f346032b - j12));
            C36571a c36571a = aVar.f346033c;
            System.arraycopy(c36571a.f347794a, ((int) (j12 - aVar.f346031a)) + c36571a.f347795b, bArr, i12 - i13, iMin);
            i13 -= iMin;
            j12 += iMin;
            if (j12 == aVar.f346032b) {
                aVar = aVar.f346034d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, DecoderInputBuffer decoderInputBuffer, L.b bVar, com.google.android.exoplayer2.util.F f12) {
        a aVarD;
        int iW2;
        if (decoderInputBuffer.f(1073741824)) {
            long j12 = bVar.f346070b;
            f12.y(1);
            a aVarD2 = d(aVar, j12, f12.f348070a, 1);
            long j13 = j12 + 1;
            byte b12 = f12.f348070a[0];
            boolean z12 = (b12 & 128) != 0;
            int i12 = b12 & 127;
            com.google.android.exoplayer2.decoder.d dVar = decoderInputBuffer.f344204c;
            byte[] bArr = dVar.f344211a;
            if (bArr == null) {
                dVar.f344211a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVarD = d(aVarD2, j13, dVar.f344211a, i12);
            long j14 = j13 + i12;
            if (z12) {
                f12.y(2);
                aVarD = d(aVarD, j14, f12.f348070a, 2);
                j14 += 2;
                iW2 = f12.w();
            } else {
                iW2 = 1;
            }
            int[] iArr = dVar.f344214d;
            if (iArr == null || iArr.length < iW2) {
                iArr = new int[iW2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = dVar.f344215e;
            if (iArr3 == null || iArr3.length < iW2) {
                iArr3 = new int[iW2];
            }
            int[] iArr4 = iArr3;
            if (z12) {
                int i13 = iW2 * 6;
                f12.y(i13);
                aVarD = d(aVarD, j14, f12.f348070a, i13);
                j14 += i13;
                f12.B(0);
                for (int i14 = 0; i14 < iW2; i14++) {
                    iArr2[i14] = f12.w();
                    iArr4[i14] = f12.u();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = bVar.f346069a - ((int) (j14 - bVar.f346070b));
            }
            A.a aVar2 = bVar.f346071c;
            int i15 = com.google.android.exoplayer2.util.U.f348106a;
            dVar.a(iW2, iArr2, iArr4, aVar2.f344373b, dVar.f344211a, aVar2.f344372a, aVar2.f344374c, aVar2.f344375d);
            long j15 = bVar.f346070b;
            int i16 = (int) (j14 - j15);
            bVar.f346070b = j15 + i16;
            bVar.f346069a -= i16;
        } else {
            aVarD = aVar;
        }
        if (!decoderInputBuffer.f(268435456)) {
            decoderInputBuffer.j(bVar.f346069a);
            return c(aVarD, bVar.f346070b, decoderInputBuffer.f344205d, bVar.f346069a);
        }
        f12.y(4);
        a aVarD3 = d(aVarD, bVar.f346070b, f12.f348070a, 4);
        int iU2 = f12.u();
        bVar.f346070b += 4;
        bVar.f346069a -= 4;
        decoderInputBuffer.j(iU2);
        a aVarC = c(aVarD3, bVar.f346070b, decoderInputBuffer.f344205d, iU2);
        bVar.f346070b += iU2;
        int i17 = bVar.f346069a - iU2;
        bVar.f346069a = i17;
        ByteBuffer byteBuffer = decoderInputBuffer.f344208g;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            decoderInputBuffer.f344208g = ByteBuffer.allocate(i17);
        } else {
            decoderInputBuffer.f344208g.clear();
        }
        return c(aVarC, bVar.f346070b, decoderInputBuffer.f344208g, bVar.f346069a);
    }

    public final void a(long j12) {
        a aVar;
        if (j12 == -1) {
            return;
        }
        while (true) {
            aVar = this.f346027d;
            if (j12 < aVar.f346032b) {
                break;
            }
            this.f346024a.d(aVar.f346033c);
            a aVar2 = this.f346027d;
            aVar2.f346033c = null;
            a aVar3 = aVar2.f346034d;
            aVar2.f346034d = null;
            this.f346027d = aVar3;
        }
        if (this.f346028e.f346031a < aVar.f346031a) {
            this.f346028e = aVar;
        }
    }

    public final int b(int i12) {
        a aVar = this.f346029f;
        if (aVar.f346033c == null) {
            C36571a c36571aC = this.f346024a.c();
            a aVar2 = new a(this.f346029f.f346032b, this.f346025b);
            aVar.f346033c = c36571aC;
            aVar.f346034d = aVar2;
        }
        return Math.min(i12, (int) (this.f346029f.f346032b - this.f346030g));
    }
}
