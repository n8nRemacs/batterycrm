package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import androidx.media3.extractor.C23196o;
import androidx.media3.extractor.ts.D;
import j.P;
import java.util.Arrays;

/* compiled from: AdtsReader.java */
@J
/* renamed from: androidx.media3.extractor.ts.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23202f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f51587v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f51588a;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f51591d;

    /* renamed from: e, reason: collision with root package name */
    public String f51592e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.media3.extractor.J f51593f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.media3.extractor.J f51594g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f51598k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51599l;

    /* renamed from: o, reason: collision with root package name */
    public int f51602o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51603p;

    /* renamed from: r, reason: collision with root package name */
    public int f51605r;

    /* renamed from: t, reason: collision with root package name */
    public androidx.media3.extractor.J f51607t;

    /* renamed from: u, reason: collision with root package name */
    public long f51608u;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.y f51589b = new androidx.media3.common.util.y(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.util.z f51590c = new androidx.media3.common.util.z(Arrays.copyOf(f51587v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f51595h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f51596i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f51597j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f51600m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f51601n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f51604q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f51606s = -9223372036854775807L;

    public C23202f(boolean z12, @P String str) {
        this.f51588a = z12;
        this.f51591d = str;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51606s = -9223372036854775807L;
        this.f51599l = false;
        this.f51595h = 0;
        this.f51596i = 0;
        this.f51597j = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e0  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.media3.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.media3.common.util.z r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.C23202f.c(androidx.media3.common.util.z):void");
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f51606s = j12;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51592e = eVar.f51542e;
        eVar.b();
        androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 1);
        this.f51593f = jC2;
        this.f51607t = jC2;
        if (!this.f51588a) {
            this.f51594g = new C23196o();
            return;
        }
        eVar.a();
        eVar.b();
        androidx.media3.extractor.J jC3 = rVar.c(eVar.f51541d, 5);
        this.f51594g = jC3;
        C23108t.b bVar = new C23108t.b();
        eVar.b();
        bVar.f47777a = eVar.f51542e;
        bVar.f47787k = "application/id3";
        jC3.b(bVar.a());
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}
