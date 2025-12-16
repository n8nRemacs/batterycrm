package androidx.media3.extractor.ogg;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;
import j.P;
import java.math.BigInteger;

/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes.dex */
final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final e f51083a;

    /* renamed from: b, reason: collision with root package name */
    public final long f51084b;

    /* renamed from: c, reason: collision with root package name */
    public final long f51085c;

    /* renamed from: d, reason: collision with root package name */
    public final h f51086d;

    /* renamed from: e, reason: collision with root package name */
    public int f51087e;

    /* renamed from: f, reason: collision with root package name */
    public long f51088f;

    /* renamed from: g, reason: collision with root package name */
    public long f51089g;

    /* renamed from: h, reason: collision with root package name */
    public long f51090h;

    /* renamed from: i, reason: collision with root package name */
    public long f51091i;

    /* renamed from: j, reason: collision with root package name */
    public long f51092j;

    /* renamed from: k, reason: collision with root package name */
    public long f51093k;

    /* renamed from: l, reason: collision with root package name */
    public long f51094l;

    /* compiled from: DefaultOggSeeker.java */
    public final class b implements H {
        public b(C1858a c1858a) {
        }

        @Override // androidx.media3.extractor.H
        public final long d() {
            return (a.this.f51088f * 1000000) / r0.f51086d.f51128i;
        }

        @Override // androidx.media3.extractor.H
        public final H.a f(long j12) {
            a aVar = a.this;
            BigInteger bigIntegerValueOf = BigInteger.valueOf((aVar.f51086d.f51128i * j12) / 1000000);
            long j13 = aVar.f51085c;
            long j14 = aVar.f51084b;
            I i12 = new I(j12, M.l((bigIntegerValueOf.multiply(BigInteger.valueOf(j13 - j14)).divide(BigInteger.valueOf(aVar.f51088f)).longValue() + j14) - 30000, aVar.f51084b, j13 - 1));
            return new H.a(i12, i12);
        }

        @Override // androidx.media3.extractor.H
        public final boolean g() {
            return true;
        }
    }

    public a(h hVar, long j12, long j13, long j14, long j15, boolean z12) {
        C23110a.b(j12 >= 0 && j13 > j12);
        this.f51086d = hVar;
        this.f51084b = j12;
        this.f51085c = j13;
        if (j14 == j13 - j12 || z12) {
            this.f51088f = j15;
            this.f51087e = 4;
        } else {
            this.f51087e = 0;
        }
        this.f51083a = new e();
    }

    @Override // androidx.media3.extractor.ogg.f
    @P
    public final H b() {
        if (this.f51088f != 0) {
            return new b(null);
        }
        return null;
    }

    @Override // androidx.media3.extractor.ogg.f
    public final void c(long j12) {
        this.f51090h = M.l(j12, 0L, this.f51088f - 1);
        this.f51087e = 2;
        this.f51091i = this.f51084b;
        this.f51092j = this.f51085c;
        this.f51093k = 0L;
        this.f51094l = this.f51088f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // androidx.media3.extractor.ogg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(androidx.media3.extractor.C23191j r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.a.d(androidx.media3.extractor.j):long");
    }
}
