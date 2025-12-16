package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;
import j.P;
import java.util.Arrays;

/* compiled from: H263Reader.java */
@J
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f51649l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @P
    public final F f51650a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final androidx.media3.common.util.z f51651b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f51652c;

    /* renamed from: d, reason: collision with root package name */
    public final a f51653d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final r f51654e;

    /* renamed from: f, reason: collision with root package name */
    public b f51655f;

    /* renamed from: g, reason: collision with root package name */
    public long f51656g;

    /* renamed from: h, reason: collision with root package name */
    public String f51657h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.media3.extractor.J f51658i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f51659j;

    /* renamed from: k, reason: collision with root package name */
    public long f51660k;

    /* compiled from: H263Reader.java */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f51661f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f51662a;

        /* renamed from: b, reason: collision with root package name */
        public int f51663b;

        /* renamed from: c, reason: collision with root package name */
        public int f51664c;

        /* renamed from: d, reason: collision with root package name */
        public int f51665d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f51666e;

        public final void a(int i12, int i13, byte[] bArr) {
            if (this.f51662a) {
                int i14 = i13 - i12;
                byte[] bArr2 = this.f51666e;
                int length = bArr2.length;
                int i15 = this.f51664c + i14;
                if (length < i15) {
                    this.f51666e = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i12, this.f51666e, this.f51664c, i14);
                this.f51664c += i14;
            }
        }
    }

    /* compiled from: H263Reader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.extractor.J f51667a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f51668b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f51669c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f51670d;

        /* renamed from: e, reason: collision with root package name */
        public int f51671e;

        /* renamed from: f, reason: collision with root package name */
        public int f51672f;

        /* renamed from: g, reason: collision with root package name */
        public long f51673g;

        /* renamed from: h, reason: collision with root package name */
        public long f51674h;

        public b(androidx.media3.extractor.J j12) {
            this.f51667a = j12;
        }

        public final void a(int i12, int i13, byte[] bArr) {
            if (this.f51669c) {
                int i14 = this.f51672f;
                int i15 = (i12 + 1) - i14;
                if (i15 >= i13) {
                    this.f51672f = (i13 - i12) + i14;
                } else {
                    this.f51670d = ((bArr[i15] & 192) >> 6) == 0;
                    this.f51669c = false;
                }
            }
        }
    }

    public l() {
        this(null);
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        androidx.media3.container.b.a(this.f51652c);
        a aVar = this.f51653d;
        aVar.f51662a = false;
        aVar.f51664c = 0;
        aVar.f51663b = 0;
        b bVar = this.f51655f;
        if (bVar != null) {
            bVar.f51668b = false;
            bVar.f51669c = false;
            bVar.f51670d = false;
            bVar.f51671e = -1;
        }
        r rVar = this.f51654e;
        if (rVar != null) {
            rVar.c();
        }
        this.f51656g = 0L;
        this.f51660k = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0226 A[ADDED_TO_REGION] */
    @Override // androidx.media3.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.media3.common.util.z r26) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.l.c(androidx.media3.common.util.z):void");
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f51660k = j12;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51657h = eVar.f51542e;
        eVar.b();
        androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 2);
        this.f51658i = jC2;
        this.f51655f = new b(jC2);
        F f12 = this.f51650a;
        if (f12 != null) {
            f12.b(rVar, eVar);
        }
    }

    public l(@P F f12) {
        this.f51650a = f12;
        this.f51652c = new boolean[4];
        a aVar = new a();
        aVar.f51666e = new byte[128];
        this.f51653d = aVar;
        this.f51660k = -9223372036854775807L;
        if (f12 != null) {
            this.f51654e = new r(178);
            this.f51651b = new androidx.media3.common.util.z();
        } else {
            this.f51654e = null;
            this.f51651b = null;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}
