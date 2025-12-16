package net.bytebuddy.jar.asm;

import net.bytebuddy.jar.asm.A;

/* compiled from: ModuleWriter.java */
/* loaded from: classes7.dex */
final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    public final A f418336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f418337c;

    /* renamed from: d, reason: collision with root package name */
    public final int f418338d;

    /* renamed from: e, reason: collision with root package name */
    public final int f418339e;

    /* renamed from: f, reason: collision with root package name */
    public int f418340f;

    /* renamed from: g, reason: collision with root package name */
    public final C44391d f418341g;

    /* renamed from: h, reason: collision with root package name */
    public int f418342h;

    /* renamed from: i, reason: collision with root package name */
    public final C44391d f418343i;

    /* renamed from: j, reason: collision with root package name */
    public int f418344j;

    /* renamed from: k, reason: collision with root package name */
    public final C44391d f418345k;

    /* renamed from: l, reason: collision with root package name */
    public int f418346l;

    /* renamed from: m, reason: collision with root package name */
    public final C44391d f418347m;

    /* renamed from: n, reason: collision with root package name */
    public int f418348n;

    /* renamed from: o, reason: collision with root package name */
    public final C44391d f418349o;

    /* renamed from: p, reason: collision with root package name */
    public int f418350p;

    /* renamed from: q, reason: collision with root package name */
    public final C44391d f418351q;

    /* renamed from: r, reason: collision with root package name */
    public int f418352r;

    public v(A a12, int i12, int i13, int i14) {
        super(589824, null);
        this.f418336b = a12;
        this.f418337c = i12;
        this.f418338d = i13;
        this.f418339e = i14;
        this.f418341g = new C44391d();
        this.f418343i = new C44391d();
        this.f418345k = new C44391d();
        this.f418347m = new C44391d();
        this.f418349o = new C44391d();
        this.f418351q = new C44391d();
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void b(String str, int i12, String... strArr) {
        A a12 = this.f418336b;
        A.a aVarK = a12.k(20, str);
        C44391d c44391d = this.f418343i;
        c44391d.j(aVarK.f418364a);
        c44391d.j(i12);
        if (strArr == null) {
            c44391d.j(0);
        } else {
            c44391d.j(strArr.length);
            for (String str2 : strArr) {
                c44391d.j(a12.k(19, str2).f418364a);
            }
        }
        this.f418342h++;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void c(String str) {
        this.f418352r = this.f418336b.k(7, str).f418364a;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void d(String str, int i12, String... strArr) {
        A a12 = this.f418336b;
        A.a aVarK = a12.k(20, str);
        C44391d c44391d = this.f418345k;
        c44391d.j(aVarK.f418364a);
        c44391d.j(i12);
        if (strArr == null) {
            c44391d.j(0);
        } else {
            c44391d.j(strArr.length);
            for (String str2 : strArr) {
                c44391d.j(a12.k(19, str2).f418364a);
            }
        }
        this.f418344j++;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void e(String str) {
        this.f418351q.j(this.f418336b.k(20, str).f418364a);
        this.f418350p++;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void f(String str, String... strArr) {
        A a12 = this.f418336b;
        A.a aVarK = a12.k(7, str);
        C44391d c44391d = this.f418349o;
        c44391d.j(aVarK.f418364a);
        c44391d.j(strArr.length);
        for (String str2 : strArr) {
            c44391d.j(a12.k(7, str2).f418364a);
        }
        this.f418348n++;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void g(int i12, String str, String str2) {
        A a12 = this.f418336b;
        A.a aVarK = a12.k(19, str);
        C44391d c44391d = this.f418341g;
        c44391d.j(aVarK.f418364a);
        c44391d.j(i12);
        c44391d.j(str2 == null ? 0 : a12.j(str2));
        this.f418340f++;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void h(String str) {
        this.f418347m.j(this.f418336b.k(7, str).f418364a);
        this.f418346l++;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void a() {
    }
}
