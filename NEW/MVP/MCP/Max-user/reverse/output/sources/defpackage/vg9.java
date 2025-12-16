package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class vg9 implements bn5 {
    public final bn5 a;
    public final lfg b;

    public vg9(bn5 bn5Var, lfg lfgVar) {
        this.a = bn5Var;
        this.b = lfgVar;
    }

    @Override // defpackage.bn5
    public final lfg a() {
        return this.b;
    }

    @Override // defpackage.bn5
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.bn5
    public final void c(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.bn5
    public final hf6 d(int i) {
        return this.b.d[this.a.f(i)];
    }

    @Override // defpackage.bn5
    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof vg9)) {
            return this.b.equals(((vg9) obj).b);
        }
        return false;
    }

    @Override // defpackage.bn5
    public final int f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.bn5
    public final int g(long j, List list) {
        return this.a.g(j, list);
    }

    @Override // defpackage.bn5
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bn5
    public final int i() {
        return this.a.i();
    }

    @Override // defpackage.bn5
    public final hf6 j() {
        return this.b.d[this.a.i()];
    }

    @Override // defpackage.bn5
    public final int k() {
        return this.a.k();
    }

    @Override // defpackage.bn5
    public final void l(float f) {
        this.a.l(f);
    }

    @Override // defpackage.bn5
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.bn5
    public final Object m() {
        return this.a.m();
    }

    @Override // defpackage.bn5
    public final void n() {
        this.a.n();
    }

    @Override // defpackage.bn5
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.bn5
    public final int p(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.bn5
    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    @Override // defpackage.bn5
    public final void r(long j, long j2, long j3, List list, cw8[] cw8VarArr) {
        this.a.r(j, j2, j3, list, cw8VarArr);
    }

    @Override // defpackage.bn5
    public final int s(hf6 hf6Var) {
        return this.a.p(this.b.b(hf6Var));
    }

    @Override // defpackage.bn5
    public final boolean t(long j, e93 e93Var, List list) {
        return this.a.t(j, e93Var, list);
    }

    @Override // defpackage.bn5
    public final boolean u(int i, long j) {
        return this.a.u(i, j);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vg9) {
            return this.a.equals(((vg9) obj).a);
        }
        return false;
    }
}
