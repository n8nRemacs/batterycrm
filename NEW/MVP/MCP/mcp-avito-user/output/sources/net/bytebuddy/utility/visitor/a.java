package net.bytebuddy.utility.visitor;

import net.bytebuddy.jar.asm.p;
import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;

/* compiled from: ExceptionTableSensitiveMethodVisitor.java */
/* loaded from: classes7.dex */
public abstract class a extends s {

    /* renamed from: d, reason: collision with root package name */
    public boolean f418994d;

    public a(int i12, s sVar) {
        super(i12, sVar);
        this.f418994d = true;
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void A(String str, String str2, String str3, int i12, boolean z12) {
        K();
        super.A(str, str2, str3, i12, z12);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void B(int i12, String str) {
        K();
        super.B(i12, str);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void E(int i12, int i13, r rVar, r... rVarArr) {
        K();
        super.E(i12, i13, rVar, rVarArr);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void I(int i12, String str) {
        K();
        super.I(i12, str);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void J(int i12, int i13) {
        K();
        P(i12, i13);
    }

    public final void K() {
        if (this.f418994d) {
            this.f418994d = false;
            L();
        }
    }

    public abstract void L();

    public void M(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        super.k(objArr, i12, objArr2, i13, i14);
    }

    public void N(int i12, int i13) {
        super.l(i12, i13);
    }

    public void O(int i12) {
        super.m(i12);
    }

    public void P(int i12, int i13) {
        super.J(i12, i13);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void j(int i12, String str, String str2, String str3) {
        K();
        super.j(i12, str, str2, str3);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void k(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        K();
        M(objArr, i12, objArr2, i13, i14);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void l(int i12, int i13) {
        K();
        N(i12, i13);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void m(int i12) {
        K();
        O(i12);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void o(int i12, int i13) {
        K();
        super.o(i12, i13);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void p(String str, String str2, p pVar, Object... objArr) {
        K();
        super.p(str, str2, pVar, objArr);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void r(int i12, r rVar) {
        K();
        super.r(i12, rVar);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void s(r rVar) {
        K();
        super.s(rVar);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void t(Object obj) {
        K();
        super.t(obj);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void x(r rVar, int[] iArr, r[] rVarArr) {
        K();
        super.x(rVar, iArr, rVarArr);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void z(int i12, String str, String str2, String str3) {
        K();
        super.z(i12, str, str2, str3);
    }
}
