package b61;

import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.p;
import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;

/* compiled from: MethodRemapper.java */
/* loaded from: classes7.dex */
public class d extends s {

    /* renamed from: d, reason: collision with root package name */
    public final j f56924d;

    public d(int i12, s sVar, j jVar) {
        super(i12, sVar);
        this.f56924d = jVar;
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void A(String str, String str2, String str3, int i12, boolean z12) {
        if (this.f418281b < 327680 && (i12 & 256) == 0) {
            super.A(str, str2, str3, i12, z12);
        } else {
            j jVar = this.f56924d;
            super.A(jVar.i(str), jVar.g(str, str2, str3), jVar.f(str3), i12, z12);
        }
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void B(int i12, String str) {
        super.B(i12, this.f56924d.c(str));
    }

    @Override // net.bytebuddy.jar.asm.s
    public final AbstractC44388a D(int i12, String str, boolean z12) {
        AbstractC44388a abstractC44388aD = super.D(i12, this.f56924d.c(str), z12);
        return abstractC44388aD == null ? abstractC44388aD : K(str, abstractC44388aD);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final AbstractC44388a F(int i12, C c12, String str, boolean z12) {
        AbstractC44388a abstractC44388aF = super.F(i12, c12, this.f56924d.c(str), z12);
        return abstractC44388aF == null ? abstractC44388aF : K(str, abstractC44388aF);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void G(r rVar, r rVar2, r rVar3, String str) {
        super.G(rVar, rVar2, rVar3, str == null ? null : this.f56924d.i(str));
    }

    @Override // net.bytebuddy.jar.asm.s
    public final AbstractC44388a H(int i12, C c12, String str, boolean z12) {
        AbstractC44388a abstractC44388aH = super.H(i12, c12, this.f56924d.c(str), z12);
        return abstractC44388aH == null ? abstractC44388aH : K(str, abstractC44388aH);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void I(int i12, String str) {
        super.I(i12, this.f56924d.i(str));
    }

    public final AbstractC44388a K(String str, AbstractC44388a abstractC44388a) {
        j jVar = this.f56924d;
        int i12 = this.f418281b;
        return new C25417a(i12, str, abstractC44388a, jVar).f(new C25417a(i12, null, abstractC44388a, jVar));
    }

    public final Object[] L(int i12, Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        Object[] objArr2 = null;
        for (int i13 = 0; i13 < i12; i13++) {
            if (objArr[i13] instanceof String) {
                if (objArr2 == null) {
                    objArr2 = new Object[i12];
                    System.arraycopy(objArr, 0, objArr2, 0, i12);
                }
                objArr2[i13] = this.f56924d.i((String) objArr[i13]);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Override // net.bytebuddy.jar.asm.s
    public final AbstractC44388a e(String str, boolean z12) {
        AbstractC44388a abstractC44388aE = super.e(this.f56924d.c(str), z12);
        return abstractC44388aE == null ? abstractC44388aE : K(str, abstractC44388aE);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final AbstractC44388a f() {
        AbstractC44388a abstractC44388aF = super.f();
        return abstractC44388aF == null ? abstractC44388aF : K(null, abstractC44388aF);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void j(int i12, String str, String str2, String str3) {
        j jVar = this.f56924d;
        super.j(i12, jVar.i(str), jVar.d(str, str2), jVar.c(str3));
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void k(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        super.k(L(i13, objArr), i12, L(i14, objArr2), i13, i14);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final AbstractC44388a n(int i12, C c12, String str, boolean z12) {
        AbstractC44388a abstractC44388aN = super.n(i12, c12, this.f56924d.c(str), z12);
        return abstractC44388aN == null ? abstractC44388aN : K(str, abstractC44388aN);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void p(String str, String str2, p pVar, Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        int i12 = 0;
        while (true) {
            int length = objArr.length;
            j jVar = this.f56924d;
            if (i12 >= length) {
                super.p(jVar.e(str, str2), jVar.f(str2), (p) jVar.l(pVar), objArr2);
                return;
            } else {
                objArr2[i12] = jVar.l(objArr[i12]);
                i12++;
            }
        }
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void t(Object obj) {
        super.t(this.f56924d.l(obj));
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void v(String str, String str2, String str3, r rVar, r rVar2, int i12) {
        j jVar = this.f56924d;
        super.v(str, jVar.c(str2), jVar.h(str3, true), rVar, rVar2, i12);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final AbstractC44388a w(int i12, C c12, r[] rVarArr, r[] rVarArr2, int[] iArr, String str, boolean z12) {
        AbstractC44388a abstractC44388aW = super.w(i12, c12, rVarArr, rVarArr2, iArr, this.f56924d.c(str), z12);
        return abstractC44388aW == null ? abstractC44388aW : K(str, abstractC44388aW);
    }
}
