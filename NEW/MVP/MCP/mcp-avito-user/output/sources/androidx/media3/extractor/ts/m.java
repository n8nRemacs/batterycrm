package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.util.J;
import androidx.media3.container.b;
import androidx.media3.extractor.ts.D;
import j.P;

/* compiled from: H264Reader.java */
@J
/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f51675a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f51676b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f51677c;

    /* renamed from: g, reason: collision with root package name */
    public long f51681g;

    /* renamed from: i, reason: collision with root package name */
    public String f51683i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.media3.extractor.J f51684j;

    /* renamed from: k, reason: collision with root package name */
    public b f51685k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51686l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f51688n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f51682h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final r f51678d = new r(7);

    /* renamed from: e, reason: collision with root package name */
    public final r f51679e = new r(8);

    /* renamed from: f, reason: collision with root package name */
    public final r f51680f = new r(6);

    /* renamed from: m, reason: collision with root package name */
    public long f51687m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.media3.common.util.z f51689o = new androidx.media3.common.util.z();

    /* compiled from: H264Reader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.extractor.J f51690a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51691b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f51692c;

        /* renamed from: f, reason: collision with root package name */
        public final androidx.media3.container.c f51695f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f51696g;

        /* renamed from: h, reason: collision with root package name */
        public int f51697h;

        /* renamed from: i, reason: collision with root package name */
        public int f51698i;

        /* renamed from: j, reason: collision with root package name */
        public long f51699j;

        /* renamed from: l, reason: collision with root package name */
        public long f51701l;

        /* renamed from: m, reason: collision with root package name */
        public a f51702m;

        /* renamed from: n, reason: collision with root package name */
        public a f51703n;

        /* renamed from: p, reason: collision with root package name */
        public long f51705p;

        /* renamed from: q, reason: collision with root package name */
        public long f51706q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f51707r;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<b.c> f51693d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<b.C1819b> f51694e = new SparseArray<>();

        /* renamed from: k, reason: collision with root package name */
        public boolean f51700k = false;

        /* renamed from: o, reason: collision with root package name */
        public boolean f51704o = false;

        /* compiled from: H264Reader.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f51708a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f51709b;

            /* renamed from: c, reason: collision with root package name */
            @P
            public b.c f51710c;

            /* renamed from: d, reason: collision with root package name */
            public int f51711d;

            /* renamed from: e, reason: collision with root package name */
            public int f51712e;

            /* renamed from: f, reason: collision with root package name */
            public int f51713f;

            /* renamed from: g, reason: collision with root package name */
            public int f51714g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f51715h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f51716i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f51717j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f51718k;

            /* renamed from: l, reason: collision with root package name */
            public int f51719l;

            /* renamed from: m, reason: collision with root package name */
            public int f51720m;

            /* renamed from: n, reason: collision with root package name */
            public int f51721n;

            /* renamed from: o, reason: collision with root package name */
            public int f51722o;

            /* renamed from: p, reason: collision with root package name */
            public int f51723p;

            public a() {
            }
        }

        public b(androidx.media3.extractor.J j12, boolean z12, boolean z13) {
            this.f51690a = j12;
            this.f51691b = z12;
            this.f51692c = z13;
            this.f51702m = new a();
            this.f51703n = new a();
            byte[] bArr = new byte[128];
            this.f51696g = bArr;
            this.f51695f = new androidx.media3.container.c(bArr, 0, 0);
            a aVar = this.f51703n;
            aVar.f51709b = false;
            aVar.f51708a = false;
        }
    }

    public m(z zVar, boolean z12, boolean z13) {
        this.f51675a = zVar;
        this.f51676b = z12;
        this.f51677c = z13;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51681g = 0L;
        this.f51688n = false;
        this.f51687m = -9223372036854775807L;
        androidx.media3.container.b.a(this.f51682h);
        this.f51678d.c();
        this.f51679e.c();
        this.f51680f.c();
        b bVar = this.f51685k;
        if (bVar != null) {
            bVar.f51700k = false;
            bVar.f51704o = false;
            b.a aVar = bVar.f51703n;
            aVar.f51709b = false;
            aVar.f51708a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021b  */
    @Override // androidx.media3.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.media3.common.util.z r29) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.m.c(androidx.media3.common.util.z):void");
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f51687m = j12;
        }
        this.f51688n = ((i12 & 2) != 0) | this.f51688n;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51683i = eVar.f51542e;
        eVar.b();
        androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 2);
        this.f51684j = jC2;
        this.f51685k = new b(jC2, this.f51676b, this.f51677c);
        this.f51675a.a(rVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    @v61.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r18, int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.m.f(int, int, byte[]):void");
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}
