package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import okhttp3.internal.http.StatusLine;

/* compiled from: WavExtractor.java */
/* loaded from: classes6.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public l f345348a;

    /* renamed from: b, reason: collision with root package name */
    public A f345349b;

    /* renamed from: e, reason: collision with root package name */
    public b f345352e;

    /* renamed from: c, reason: collision with root package name */
    public int f345350c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f345351d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f345353f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f345354g = -1;

    /* compiled from: WavExtractor.java */
    /* renamed from: com.google.android.exoplayer2.extractor.wav.a$a, reason: collision with other inner class name */
    public static final class C10584a implements b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f345355m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f345356n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final l f345357a;

        /* renamed from: b, reason: collision with root package name */
        public final A f345358b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.wav.b f345359c;

        /* renamed from: d, reason: collision with root package name */
        public final int f345360d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f345361e;

        /* renamed from: f, reason: collision with root package name */
        public final F f345362f;

        /* renamed from: g, reason: collision with root package name */
        public final int f345363g;

        /* renamed from: h, reason: collision with root package name */
        public final I f345364h;

        /* renamed from: i, reason: collision with root package name */
        public int f345365i;

        /* renamed from: j, reason: collision with root package name */
        public long f345366j;

        /* renamed from: k, reason: collision with root package name */
        public int f345367k;

        /* renamed from: l, reason: collision with root package name */
        public long f345368l;

        public C10584a(l lVar, A a12, com.google.android.exoplayer2.extractor.wav.b bVar) throws ParserException {
            this.f345357a = lVar;
            this.f345358b = a12;
            this.f345359c = bVar;
            int i12 = bVar.f345378b;
            int iMax = Math.max(1, i12 / 10);
            this.f345363g = iMax;
            F f12 = new F(bVar.f345381e);
            f12.k();
            int iK2 = f12.k();
            this.f345360d = iK2;
            int i13 = bVar.f345377a;
            int i14 = bVar.f345379c;
            int i15 = (((i14 - (i13 * 4)) * 8) / (bVar.f345380d * i13)) + 1;
            if (iK2 != i15) {
                throw ParserException.a("Expected frames per block: " + i15 + "; got: " + iK2, null);
            }
            int iG2 = U.g(iMax, iK2);
            this.f345361e = new byte[iG2 * i14];
            this.f345362f = new F(iK2 * 2 * i13 * iG2);
            int i16 = ((i14 * i12) * 8) / iK2;
            I.b bVar2 = new I.b();
            bVar2.f343504k = "audio/raw";
            bVar2.f343499f = i16;
            bVar2.f343500g = i16;
            bVar2.f343505l = iMax * 2 * i13;
            bVar2.f343517x = i13;
            bVar2.f343518y = i12;
            bVar2.f343519z = 2;
            this.f345364h = bVar2.a();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.a.b
        public final void a(int i12, long j12) {
            this.f345357a.i(new d(this.f345359c, this.f345360d, i12, j12));
            this.f345358b.a(this.f345364h);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.a.b
        public final void b(long j12) {
            this.f345365i = 0;
            this.f345366j = j12;
            this.f345367k = 0;
            this.f345368l = 0L;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
        @Override // com.google.android.exoplayer2.extractor.wav.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(com.google.android.exoplayer2.extractor.f r26, long r27) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.a.C10584a.c(com.google.android.exoplayer2.extractor.f, long):boolean");
        }

        public final void d(int i12) {
            long j12 = this.f345366j;
            long j13 = this.f345368l;
            com.google.android.exoplayer2.extractor.wav.b bVar = this.f345359c;
            long jM2 = j12 + U.M(j13, 1000000L, bVar.f345378b);
            int i13 = i12 * 2 * bVar.f345377a;
            this.f345358b.f(jM2, 1, i13, this.f345367k - i13, null);
            this.f345368l += i12;
            this.f345367k -= i13;
        }
    }

    /* compiled from: WavExtractor.java */
    public interface b {
        void a(int i12, long j12);

        void b(long j12);

        boolean c(f fVar, long j12);
    }

    /* compiled from: WavExtractor.java */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final l f345369a;

        /* renamed from: b, reason: collision with root package name */
        public final A f345370b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.wav.b f345371c;

        /* renamed from: d, reason: collision with root package name */
        public final I f345372d;

        /* renamed from: e, reason: collision with root package name */
        public final int f345373e;

        /* renamed from: f, reason: collision with root package name */
        public long f345374f;

        /* renamed from: g, reason: collision with root package name */
        public int f345375g;

        /* renamed from: h, reason: collision with root package name */
        public long f345376h;

        public c(l lVar, A a12, com.google.android.exoplayer2.extractor.wav.b bVar, String str, int i12) throws ParserException {
            this.f345369a = lVar;
            this.f345370b = a12;
            this.f345371c = bVar;
            int i13 = bVar.f345380d;
            int i14 = bVar.f345377a;
            int i15 = (i13 * i14) / 8;
            int i16 = bVar.f345379c;
            if (i16 != i15) {
                throw ParserException.a("Expected block size: " + i15 + "; got: " + i16, null);
            }
            int i17 = bVar.f345378b;
            int i18 = i17 * i15;
            int i19 = i18 * 8;
            int iMax = Math.max(i15, i18 / 10);
            this.f345373e = iMax;
            I.b bVar2 = new I.b();
            bVar2.f343504k = str;
            bVar2.f343499f = i19;
            bVar2.f343500g = i19;
            bVar2.f343505l = iMax;
            bVar2.f343517x = i14;
            bVar2.f343518y = i17;
            bVar2.f343519z = i12;
            this.f345372d = bVar2.a();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.a.b
        public final void a(int i12, long j12) {
            this.f345369a.i(new d(this.f345371c, 1, i12, j12));
            this.f345370b.a(this.f345372d);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.a.b
        public final void b(long j12) {
            this.f345374f = j12;
            this.f345375g = 0;
            this.f345376h = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.a.b
        public final boolean c(f fVar, long j12) {
            int i12;
            int i13;
            long j13 = j12;
            while (j13 > 0 && (i12 = this.f345375g) < (i13 = this.f345373e)) {
                int iB2 = this.f345370b.b(fVar, (int) Math.min(i13 - i12, j13), true);
                if (iB2 == -1) {
                    j13 = 0;
                } else {
                    this.f345375g += iB2;
                    j13 -= iB2;
                }
            }
            com.google.android.exoplayer2.extractor.wav.b bVar = this.f345371c;
            int i14 = this.f345375g;
            int i15 = bVar.f345379c;
            int i16 = i14 / i15;
            if (i16 > 0) {
                long jM2 = this.f345374f + U.M(this.f345376h, 1000000L, bVar.f345378b);
                int i17 = i16 * i15;
                int i18 = this.f345375g - i17;
                this.f345370b.f(jM2, 1, i17, i18, null);
                this.f345376h += i16;
                this.f345375g = i18;
            }
            return j13 <= 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f345350c = j12 == 0 ? 0 : 4;
        b bVar = this.f345352e;
        if (bVar != null) {
            bVar.b(j13);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f345348a = lVar;
        this.f345349b = lVar.c(0, 1);
        lVar.b();
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) {
        return com.google.android.exoplayer2.extractor.wav.c.a((f) kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019c  */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r25, com.google.android.exoplayer2.extractor.w r26) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.a.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
