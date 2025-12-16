package net.bytebuddy.jar.asm;

/* compiled from: FieldWriter.java */
/* loaded from: classes7.dex */
final class n extends m {

    /* renamed from: c, reason: collision with root package name */
    public final A f418236c;

    /* renamed from: d, reason: collision with root package name */
    public final int f418237d;

    /* renamed from: e, reason: collision with root package name */
    public final int f418238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f418239f;

    /* renamed from: g, reason: collision with root package name */
    public final int f418240g;

    /* renamed from: h, reason: collision with root package name */
    public final int f418241h;

    /* renamed from: i, reason: collision with root package name */
    public C44389b f418242i;

    /* renamed from: j, reason: collision with root package name */
    public C44389b f418243j;

    /* renamed from: k, reason: collision with root package name */
    public C44389b f418244k;

    /* renamed from: l, reason: collision with root package name */
    public C44389b f418245l;

    /* renamed from: m, reason: collision with root package name */
    public C44390c f418246m;

    public n(A a12, int i12, String str, String str2, String str3, Object obj) {
        super(589824, null);
        this.f418236c = a12;
        this.f418237d = i12;
        this.f418238e = a12.j(str);
        this.f418239f = a12.j(str2);
        if (str3 != null) {
            this.f418240g = a12.j(str3);
        }
        if (obj != null) {
            this.f418241h = a12.c(obj).f418364a;
        }
    }

    @Override // net.bytebuddy.jar.asm.m
    public final AbstractC44388a a(String str, boolean z12) {
        A a12 = this.f418236c;
        if (z12) {
            C44389b c44389bJ = C44389b.j(a12, str, this.f418242i);
            this.f418242i = c44389bJ;
            return c44389bJ;
        }
        C44389b c44389bJ2 = C44389b.j(a12, str, this.f418243j);
        this.f418243j = c44389bJ2;
        return c44389bJ2;
    }

    @Override // net.bytebuddy.jar.asm.m
    public final void b(C44390c c44390c) {
        c44390c.f418162c = this.f418246m;
        this.f418246m = c44390c;
    }

    @Override // net.bytebuddy.jar.asm.m
    public final AbstractC44388a d(int i12, C c12, String str, boolean z12) {
        A a12 = this.f418236c;
        if (z12) {
            C44389b c44389bI = C44389b.i(a12, i12, c12, str, this.f418244k);
            this.f418244k = c44389bI;
            return c44389bI;
        }
        C44389b c44389bI2 = C44389b.i(a12, i12, c12, str, this.f418245l);
        this.f418245l = c44389bI2;
        return c44389bI2;
    }

    @Override // net.bytebuddy.jar.asm.m
    public final void c() {
    }
}
