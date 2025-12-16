package net.bytebuddy.utility.visitor;

import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.C44390c;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.jar.asm.x;

/* compiled from: MetadataAwareClassVisitor.java */
/* loaded from: classes7.dex */
public abstract class d extends net.bytebuddy.jar.asm.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f418998d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f418999e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f419000f;

    public d(int i12, net.bytebuddy.jar.asm.f fVar) {
        super(i12, fVar);
        this.f418998d = true;
        this.f418999e = true;
        this.f419000f = true;
    }

    public void A(int i12, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
        super.h(i12, str, str2, str3);
    }

    @net.bytebuddy.utility.nullability.b
    public s B(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
        return super.i(i12, str, str2, str3, strArr);
    }

    public void C(String str) {
        super.k(str);
    }

    public void D(String str) {
        super.l(str);
    }

    public void E(String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
        super.m(str, str2, str3);
    }

    public void F(String str) {
        super.n(str);
    }

    @net.bytebuddy.utility.nullability.b
    public x G(String str, String str2, @net.bytebuddy.utility.nullability.b String str3) {
        return super.o(str, str2, str3);
    }

    @net.bytebuddy.utility.nullability.b
    public AbstractC44388a H(int i12, C c12, String str, boolean z12) {
        return super.q(i12, c12, str, z12);
    }

    @Override // net.bytebuddy.jar.asm.f
    @net.bytebuddy.utility.nullability.b
    public final AbstractC44388a d(String str, boolean z12) {
        s();
        t();
        return x(str, z12);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void e(C44390c c44390c) {
        s();
        t();
        super.e(c44390c);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void f() {
        s();
        t();
        r();
        y();
    }

    @Override // net.bytebuddy.jar.asm.f
    @net.bytebuddy.utility.nullability.b
    public final m g(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
        s();
        t();
        r();
        return z(i12, str, str2, str3, obj);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void h(int i12, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
        s();
        t();
        r();
        A(i12, str, str2, str3);
    }

    @Override // net.bytebuddy.jar.asm.f
    @net.bytebuddy.utility.nullability.b
    public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
        s();
        t();
        r();
        return B(i12, str, str2, str3, strArr);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void k(String str) {
        this.f418998d = false;
        C(str);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void l(String str) {
        s();
        t();
        r();
        D(str);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void m(String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
        s();
        this.f418999e = false;
        E(str, str2, str3);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void n(String str) {
        s();
        t();
        r();
        F(str);
    }

    @Override // net.bytebuddy.jar.asm.f
    @net.bytebuddy.utility.nullability.b
    public final x o(String str, String str2, @net.bytebuddy.utility.nullability.b String str3) {
        s();
        t();
        r();
        return G(str, str2, str3);
    }

    @Override // net.bytebuddy.jar.asm.f
    @net.bytebuddy.utility.nullability.b
    public final AbstractC44388a q(int i12, C c12, String str, boolean z12) {
        s();
        t();
        return H(i12, c12, str, z12);
    }

    public final void r() {
        if (this.f419000f) {
            this.f419000f = false;
            u();
        }
    }

    public final void s() {
        if (this.f418998d) {
            this.f418998d = false;
            v();
        }
    }

    public final void t() {
        if (this.f418999e) {
            this.f418999e = false;
            w();
        }
    }

    @net.bytebuddy.utility.nullability.b
    public AbstractC44388a x(String str, boolean z12) {
        return super.d(str, z12);
    }

    public void y() {
        super.f();
    }

    @net.bytebuddy.utility.nullability.b
    public m z(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
        return super.g(i12, str, str2, str3, obj);
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }
}
