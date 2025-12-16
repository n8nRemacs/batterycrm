package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class xod implements s12 {
    public final s12 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xod(s12 s12Var) {
        this(s12Var, (byte) 0);
        this.c = 0;
        this.d = s12Var;
    }

    @Override // defpackage.s12
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.s12
    public ha8 b(float f) {
        switch (this.c) {
            case 0:
                return ((s12) this.d).b(f);
            default:
                return this.b.b(f);
        }
    }

    @Override // defpackage.s12
    public final void c(ao3 ao3Var) {
        this.b.c(ao3Var);
    }

    @Override // defpackage.s12
    public ha8 d(float f) {
        switch (this.c) {
            case 0:
                return ((s12) this.d).d(f);
            default:
                return this.b.d(f);
        }
    }

    @Override // defpackage.s12
    public final Rect e() {
        return this.b.e();
    }

    @Override // defpackage.s12
    public final void f(int i) {
        this.b.f(i);
    }

    @Override // defpackage.s12
    public final void g(de7 de7Var) {
        this.b.g(de7Var);
    }

    @Override // defpackage.s12
    public ha8 h(z95 z95Var) {
        switch (this.c) {
            case 0:
                return ((s12) this.d).h(z95Var);
            default:
                return this.b.h(z95Var);
        }
    }

    @Override // defpackage.s12
    public ha8 i(ArrayList arrayList, int i, int i2) {
        switch (this.c) {
            case 1:
                z5j.a("Only support one capture config.", arrayList.size() == 1);
                ha8 ha8VarL = this.b.l(i, i2);
                sn6 sn6VarA = sn6.a(ha8VarL);
                wn6 wn6Var = new wn6(ha8VarL, 2);
                ex4 ex4VarA = ayi.a();
                sn6VarA.getClass();
                return wsf.c(Collections.singletonList(wsf.l(wsf.l(wsf.l(sn6VarA, wn6Var, ex4VarA), new c5g(this, 17, arrayList), ayi.a()), new wn6(ha8VarL, 3), ayi.a())));
            default:
                return this.b.i(arrayList, i, i2);
        }
    }

    @Override // defpackage.s12
    public final void j(die dieVar) {
        this.b.j(dieVar);
    }

    @Override // defpackage.s12
    public ha8 k(boolean z) {
        switch (this.c) {
            case 0:
                return ((s12) this.d).k(z);
            default:
                return this.b.k(z);
        }
    }

    @Override // defpackage.s12
    public final ha8 l(int i, int i2) {
        return this.b.l(i, i2);
    }

    @Override // defpackage.s12
    public final ao3 m() {
        return this.b.m();
    }

    @Override // defpackage.s12
    public final void n() {
        this.b.n();
    }

    @Override // defpackage.s12
    public final void o() {
        this.b.o();
    }

    public xod(s12 s12Var, byte b) {
        this.b = s12Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xod(s12 s12Var, u4e u4eVar) {
        this(s12Var, (byte) 0);
        this.c = 1;
        this.d = u4eVar;
    }
}
