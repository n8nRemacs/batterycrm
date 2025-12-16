package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;
import j.P;
import java.util.Arrays;

/* compiled from: H262Reader.java */
@J
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f51627q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f51628a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.extractor.J f51629b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final F f51630c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final androidx.media3.common.util.z f51631d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final r f51632e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f51633f;

    /* renamed from: g, reason: collision with root package name */
    public final a f51634g;

    /* renamed from: h, reason: collision with root package name */
    public long f51635h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f51636i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f51637j;

    /* renamed from: k, reason: collision with root package name */
    public long f51638k;

    /* renamed from: l, reason: collision with root package name */
    public long f51639l;

    /* renamed from: m, reason: collision with root package name */
    public long f51640m;

    /* renamed from: n, reason: collision with root package name */
    public long f51641n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f51642o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51643p;

    /* compiled from: H262Reader.java */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f51644e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f51645a;

        /* renamed from: b, reason: collision with root package name */
        public int f51646b;

        /* renamed from: c, reason: collision with root package name */
        public int f51647c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f51648d;

        public final void a(int i12, int i13, byte[] bArr) {
            if (this.f51645a) {
                int i14 = i13 - i12;
                byte[] bArr2 = this.f51648d;
                int length = bArr2.length;
                int i15 = this.f51646b + i14;
                if (length < i15) {
                    this.f51648d = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i12, this.f51648d, this.f51646b, i14);
                this.f51646b += i14;
            }
        }
    }

    public k() {
        this(null);
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        androidx.media3.container.b.a(this.f51633f);
        a aVar = this.f51634g;
        aVar.f51645a = false;
        aVar.f51646b = 0;
        aVar.f51647c = 0;
        r rVar = this.f51632e;
        if (rVar != null) {
            rVar.c();
        }
        this.f51635h = 0L;
        this.f51636i = false;
        this.f51639l = -9223372036854775807L;
        this.f51641n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
    @Override // androidx.media3.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.media3.common.util.z r27) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.k.c(androidx.media3.common.util.z):void");
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        this.f51639l = j12;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51628a = eVar.f51542e;
        eVar.b();
        this.f51629b = rVar.c(eVar.f51541d, 2);
        F f12 = this.f51630c;
        if (f12 != null) {
            f12.b(rVar, eVar);
        }
    }

    public k(@P F f12) {
        this.f51630c = f12;
        this.f51633f = new boolean[4];
        a aVar = new a();
        aVar.f51648d = new byte[128];
        this.f51634g = aVar;
        if (f12 != null) {
            this.f51632e = new r(178);
            this.f51631d = new androidx.media3.common.util.z();
        } else {
            this.f51632e = null;
            this.f51631d = null;
        }
        this.f51639l = -9223372036854775807L;
        this.f51641n = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}
