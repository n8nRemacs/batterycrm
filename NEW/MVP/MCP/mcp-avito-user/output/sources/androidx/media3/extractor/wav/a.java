package androidx.media3.extractor.wav;

import androidx.media3.common.C23108t;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import okhttp3.internal.http.StatusLine;

/* compiled from: WavExtractor.java */
@J
/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public r f51850a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.extractor.J f51851b;

    /* renamed from: e, reason: collision with root package name */
    public b f51854e;

    /* renamed from: c, reason: collision with root package name */
    public int f51852c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f51853d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f51855f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f51856g = -1;

    /* compiled from: WavExtractor.java */
    /* renamed from: androidx.media3.extractor.wav.a$a, reason: collision with other inner class name */
    public static final class C1864a implements b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f51857m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f51858n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final r f51859a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.extractor.J f51860b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.extractor.wav.b f51861c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51862d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f51863e;

        /* renamed from: f, reason: collision with root package name */
        public final z f51864f;

        /* renamed from: g, reason: collision with root package name */
        public final int f51865g;

        /* renamed from: h, reason: collision with root package name */
        public final C23108t f51866h;

        /* renamed from: i, reason: collision with root package name */
        public int f51867i;

        /* renamed from: j, reason: collision with root package name */
        public long f51868j;

        /* renamed from: k, reason: collision with root package name */
        public int f51869k;

        /* renamed from: l, reason: collision with root package name */
        public long f51870l;

        public C1864a(r rVar, androidx.media3.extractor.J j12, androidx.media3.extractor.wav.b bVar) throws ParserException {
            this.f51859a = rVar;
            this.f51860b = j12;
            this.f51861c = bVar;
            int i12 = bVar.f51880b;
            int iMax = Math.max(1, i12 / 10);
            this.f51865g = iMax;
            z zVar = new z(bVar.f51883e);
            zVar.n();
            int iN2 = zVar.n();
            this.f51862d = iN2;
            int i13 = bVar.f51879a;
            int i14 = bVar.f51881c;
            int i15 = (((i14 - (i13 * 4)) * 8) / (bVar.f51882d * i13)) + 1;
            if (iN2 != i15) {
                throw ParserException.a("Expected frames per block: " + i15 + "; got: " + iN2, null);
            }
            int iG2 = M.g(iMax, iN2);
            this.f51863e = new byte[iG2 * i14];
            this.f51864f = new z(iN2 * 2 * i13 * iG2);
            int i16 = ((i14 * i12) * 8) / iN2;
            C23108t.b bVar2 = new C23108t.b();
            bVar2.f47787k = "audio/raw";
            bVar2.f47782f = i16;
            bVar2.f47783g = i16;
            bVar2.f47788l = iMax * 2 * i13;
            bVar2.f47800x = i13;
            bVar2.f47801y = i12;
            bVar2.f47802z = 2;
            this.f51866h = bVar2.a();
        }

        @Override // androidx.media3.extractor.wav.a.b
        public final void a(int i12, long j12) {
            this.f51859a.e(new d(this.f51861c, this.f51862d, i12, j12));
            this.f51860b.b(this.f51866h);
        }

        @Override // androidx.media3.extractor.wav.a.b
        public final void b(long j12) {
            this.f51867i = 0;
            this.f51868j = j12;
            this.f51869k = 0;
            this.f51870l = 0L;
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
        @Override // androidx.media3.extractor.wav.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(androidx.media3.extractor.C23191j r26, long r27) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.a.C1864a.c(androidx.media3.extractor.j, long):boolean");
        }

        public final void d(int i12) {
            long j12 = this.f51868j;
            long j13 = this.f51870l;
            androidx.media3.extractor.wav.b bVar = this.f51861c;
            long jK2 = j12 + M.K(j13, 1000000L, bVar.f51880b);
            int i13 = i12 * 2 * bVar.f51879a;
            this.f51860b.f(jK2, 1, i13, this.f51869k - i13, null);
            this.f51870l += i12;
            this.f51869k -= i13;
        }
    }

    /* compiled from: WavExtractor.java */
    public interface b {
        void a(int i12, long j12);

        void b(long j12);

        boolean c(C23191j c23191j, long j12);
    }

    /* compiled from: WavExtractor.java */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final r f51871a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.extractor.J f51872b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.extractor.wav.b f51873c;

        /* renamed from: d, reason: collision with root package name */
        public final C23108t f51874d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51875e;

        /* renamed from: f, reason: collision with root package name */
        public long f51876f;

        /* renamed from: g, reason: collision with root package name */
        public int f51877g;

        /* renamed from: h, reason: collision with root package name */
        public long f51878h;

        public c(r rVar, androidx.media3.extractor.J j12, androidx.media3.extractor.wav.b bVar, String str, int i12) throws ParserException {
            this.f51871a = rVar;
            this.f51872b = j12;
            this.f51873c = bVar;
            int i13 = bVar.f51882d;
            int i14 = bVar.f51879a;
            int i15 = (i13 * i14) / 8;
            int i16 = bVar.f51881c;
            if (i16 != i15) {
                throw ParserException.a("Expected block size: " + i15 + "; got: " + i16, null);
            }
            int i17 = bVar.f51880b;
            int i18 = i17 * i15;
            int i19 = i18 * 8;
            int iMax = Math.max(i15, i18 / 10);
            this.f51875e = iMax;
            C23108t.b bVar2 = new C23108t.b();
            bVar2.f47787k = str;
            bVar2.f47782f = i19;
            bVar2.f47783g = i19;
            bVar2.f47788l = iMax;
            bVar2.f47800x = i14;
            bVar2.f47801y = i17;
            bVar2.f47802z = i12;
            this.f51874d = bVar2.a();
        }

        @Override // androidx.media3.extractor.wav.a.b
        public final void a(int i12, long j12) {
            this.f51871a.e(new d(this.f51873c, 1, i12, j12));
            this.f51872b.b(this.f51874d);
        }

        @Override // androidx.media3.extractor.wav.a.b
        public final void b(long j12) {
            this.f51876f = j12;
            this.f51877g = 0;
            this.f51878h = 0L;
        }

        @Override // androidx.media3.extractor.wav.a.b
        public final boolean c(C23191j c23191j, long j12) {
            int i12;
            int i13;
            long j13 = j12;
            while (j13 > 0 && (i12 = this.f51877g) < (i13 = this.f51875e)) {
                int iA2 = this.f51872b.a(c23191j, (int) Math.min(i13 - i12, j13), true);
                if (iA2 == -1) {
                    j13 = 0;
                } else {
                    this.f51877g += iA2;
                    j13 -= iA2;
                }
            }
            androidx.media3.extractor.wav.b bVar = this.f51873c;
            int i14 = this.f51877g;
            int i15 = bVar.f51881c;
            int i16 = i14 / i15;
            if (i16 > 0) {
                long jK2 = this.f51876f + M.K(this.f51878h, 1000000L, bVar.f51880b);
                int i17 = i16 * i15;
                int i18 = this.f51877g - i17;
                this.f51872b.f(jK2, 1, i17, i18, null);
                this.f51878h += i16;
                this.f51877g = i18;
            }
            return j13 <= 0;
        }
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f51852c = j12 == 0 ? 0 : 4;
        b bVar = this.f51854e;
        if (bVar != null) {
            bVar.b(j13);
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        return androidx.media3.extractor.wav.c.a((C23191j) qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r25, androidx.media3.extractor.F r26) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.a.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f51850a = rVar;
        this.f51851b = rVar.c(0, 1);
        rVar.b();
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
