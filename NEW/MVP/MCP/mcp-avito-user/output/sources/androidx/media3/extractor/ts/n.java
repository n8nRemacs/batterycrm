package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;

/* compiled from: H265Reader.java */
@J
/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f51724a;

    /* renamed from: b, reason: collision with root package name */
    public String f51725b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.media3.extractor.J f51726c;

    /* renamed from: d, reason: collision with root package name */
    public a f51727d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51728e;

    /* renamed from: l, reason: collision with root package name */
    public long f51735l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f51729f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final r f51730g = new r(32);

    /* renamed from: h, reason: collision with root package name */
    public final r f51731h = new r(33);

    /* renamed from: i, reason: collision with root package name */
    public final r f51732i = new r(34);

    /* renamed from: j, reason: collision with root package name */
    public final r f51733j = new r(39);

    /* renamed from: k, reason: collision with root package name */
    public final r f51734k = new r(40);

    /* renamed from: m, reason: collision with root package name */
    public long f51736m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.media3.common.util.z f51737n = new androidx.media3.common.util.z();

    /* compiled from: H265Reader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.extractor.J f51738a;

        /* renamed from: b, reason: collision with root package name */
        public long f51739b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f51740c;

        /* renamed from: d, reason: collision with root package name */
        public int f51741d;

        /* renamed from: e, reason: collision with root package name */
        public long f51742e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f51743f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f51744g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f51745h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f51746i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f51747j;

        /* renamed from: k, reason: collision with root package name */
        public long f51748k;

        /* renamed from: l, reason: collision with root package name */
        public long f51749l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f51750m;

        public a(androidx.media3.extractor.J j12) {
            this.f51738a = j12;
        }
    }

    public n(z zVar) {
        this.f51724a = zVar;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51735l = 0L;
        this.f51736m = -9223372036854775807L;
        androidx.media3.container.b.a(this.f51729f);
        this.f51730g.c();
        this.f51731h.c();
        this.f51732i.c();
        this.f51733j.c();
        this.f51734k.c();
        a aVar = this.f51727d;
        if (aVar != null) {
            aVar.f51743f = false;
            aVar.f51744g = false;
            aVar.f51745h = false;
            aVar.f51746i = false;
            aVar.f51747j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023f  */
    @Override // androidx.media3.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.media3.common.util.z r33) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.n.c(androidx.media3.common.util.z):void");
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f51736m = j12;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51725b = eVar.f51542e;
        eVar.b();
        androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 2);
        this.f51726c = jC2;
        this.f51727d = new a(jC2);
        this.f51724a.a(rVar, eVar);
    }

    @v61.m
    public final void f(int i12, int i13, byte[] bArr) {
        a aVar = this.f51727d;
        if (aVar.f51743f) {
            int i14 = aVar.f51741d;
            int i15 = (i12 + 2) - i14;
            if (i15 < i13) {
                aVar.f51744g = (bArr[i15] & 128) != 0;
                aVar.f51743f = false;
            } else {
                aVar.f51741d = (i13 - i12) + i14;
            }
        }
        if (!this.f51728e) {
            this.f51730g.a(i12, i13, bArr);
            this.f51731h.a(i12, i13, bArr);
            this.f51732i.a(i12, i13, bArr);
        }
        this.f51733j.a(i12, i13, bArr);
        this.f51734k.a(i12, i13, bArr);
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}
