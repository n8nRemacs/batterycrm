package net.bytebuddy.jar.asm;

/* compiled from: RecordComponentWriter.java */
/* loaded from: classes7.dex */
final class y extends x {

    /* renamed from: c, reason: collision with root package name */
    public final A f418355c;

    /* renamed from: d, reason: collision with root package name */
    public final int f418356d;

    /* renamed from: e, reason: collision with root package name */
    public final int f418357e;

    /* renamed from: f, reason: collision with root package name */
    public final int f418358f;

    /* renamed from: g, reason: collision with root package name */
    public C44389b f418359g;

    /* renamed from: h, reason: collision with root package name */
    public C44389b f418360h;

    /* renamed from: i, reason: collision with root package name */
    public C44389b f418361i;

    /* renamed from: j, reason: collision with root package name */
    public C44389b f418362j;

    /* renamed from: k, reason: collision with root package name */
    public C44390c f418363k;

    public y(A a12, String str, String str2, String str3) {
        super(589824, null);
        this.f418355c = a12;
        this.f418356d = a12.j(str);
        this.f418357e = a12.j(str2);
        if (str3 != null) {
            this.f418358f = a12.j(str3);
        }
    }

    @Override // net.bytebuddy.jar.asm.x
    public final AbstractC44388a a(String str, boolean z12) {
        A a12 = this.f418355c;
        if (z12) {
            C44389b c44389bJ = C44389b.j(a12, str, this.f418359g);
            this.f418359g = c44389bJ;
            return c44389bJ;
        }
        C44389b c44389bJ2 = C44389b.j(a12, str, this.f418360h);
        this.f418360h = c44389bJ2;
        return c44389bJ2;
    }

    @Override // net.bytebuddy.jar.asm.x
    public final void b(C44390c c44390c) {
        c44390c.f418162c = this.f418363k;
        this.f418363k = c44390c;
    }

    @Override // net.bytebuddy.jar.asm.x
    public final AbstractC44388a d(int i12, C c12, String str, boolean z12) {
        A a12 = this.f418355c;
        if (z12) {
            C44389b c44389bI = C44389b.i(a12, i12, c12, str, this.f418361i);
            this.f418361i = c44389bI;
            return c44389bI;
        }
        C44389b c44389bI2 = C44389b.i(a12, i12, c12, str, this.f418362j);
        this.f418362j = c44389bI2;
        return c44389bI2;
    }

    @Override // net.bytebuddy.jar.asm.x
    public final void c() {
    }
}
