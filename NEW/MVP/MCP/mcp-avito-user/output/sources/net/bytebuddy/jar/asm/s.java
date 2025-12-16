package net.bytebuddy.jar.asm;

import java.io.IOException;

/* compiled from: MethodVisitor.java */
/* loaded from: classes7.dex */
public abstract class s {

    /* renamed from: b, reason: collision with root package name */
    public final int f418281b;

    /* renamed from: c, reason: collision with root package name */
    public s f418282c;

    public s(int i12, s sVar) throws IOException {
        if (i12 != 589824 && i12 != 524288 && i12 != 458752 && i12 != 393216 && i12 != 327680 && i12 != 262144 && i12 != 17432576) {
            throw new IllegalArgumentException(AK.c.g(i12, "Unsupported api "));
        }
        if (i12 == 17432576) {
            i.a(this);
        }
        this.f418281b = i12;
        this.f418282c = sVar;
    }

    public void A(String str, String str2, String str3, int i12, boolean z12) {
        if (this.f418281b < 327680 && (i12 & 256) == 0) {
            if (z12 != (i12 == 185)) {
                throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
            }
            z(i12, str, str2, str3);
        } else {
            s sVar = this.f418282c;
            if (sVar != null) {
                sVar.A(str, str2, str3, i12 & (-257), z12);
            }
        }
    }

    public void B(int i12, String str) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.B(i12, str);
        }
    }

    public void C(int i12, String str) {
        if (this.f418281b < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.C(i12, str);
        }
    }

    public AbstractC44388a D(int i12, String str, boolean z12) {
        s sVar = this.f418282c;
        if (sVar != null) {
            return sVar.D(i12, str, z12);
        }
        return null;
    }

    public void E(int i12, int i13, r rVar, r... rVarArr) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.E(i12, i13, rVar, rVarArr);
        }
    }

    public AbstractC44388a F(int i12, C c12, String str, boolean z12) {
        if (this.f418281b < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        s sVar = this.f418282c;
        if (sVar != null) {
            return sVar.F(i12, c12, str, z12);
        }
        return null;
    }

    public void G(r rVar, r rVar2, r rVar3, String str) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.G(rVar, rVar2, rVar3, str);
        }
    }

    public AbstractC44388a H(int i12, C c12, String str, boolean z12) {
        if (this.f418281b < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        s sVar = this.f418282c;
        if (sVar != null) {
            return sVar.H(i12, c12, str, z12);
        }
        return null;
    }

    public void I(int i12, String str) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.I(i12, str);
        }
    }

    public void J(int i12, int i13) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.J(i12, i13);
        }
    }

    public void d(int i12, boolean z12) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.d(i12, z12);
        }
    }

    public AbstractC44388a e(String str, boolean z12) {
        s sVar = this.f418282c;
        if (sVar != null) {
            return sVar.e(str, z12);
        }
        return null;
    }

    public AbstractC44388a f() {
        s sVar = this.f418282c;
        if (sVar != null) {
            return sVar.f();
        }
        return null;
    }

    public void g(C44390c c44390c) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.g(c44390c);
        }
    }

    public void h() {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.h();
        }
    }

    public void i() {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.i();
        }
    }

    public void j(int i12, String str, String str2, String str3) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.j(i12, str, str2, str3);
        }
    }

    public void k(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.k(objArr, i12, objArr2, i13, i14);
        }
    }

    public void l(int i12, int i13) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.l(i12, i13);
        }
    }

    public void m(int i12) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.m(i12);
        }
    }

    public AbstractC44388a n(int i12, C c12, String str, boolean z12) {
        if (this.f418281b < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        s sVar = this.f418282c;
        if (sVar != null) {
            return sVar.n(i12, c12, str, z12);
        }
        return null;
    }

    public void o(int i12, int i13) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.o(i12, i13);
        }
    }

    public void p(String str, String str2, p pVar, Object... objArr) {
        if (this.f418281b < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.p(str, str2, pVar, objArr);
        }
    }

    public void r(int i12, r rVar) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.r(i12, rVar);
        }
    }

    public void s(r rVar) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.s(rVar);
        }
    }

    public void t(Object obj) {
        int i12 = this.f418281b;
        if (i12 < 327680 && ((obj instanceof p) || ((obj instanceof B) && ((B) obj).t() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (i12 < 458752 && (obj instanceof h)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.t(obj);
        }
    }

    public void u(int i12, r rVar) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.u(i12, rVar);
        }
    }

    public void v(String str, String str2, String str3, r rVar, r rVar2, int i12) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.v(str, str2, str3, rVar, rVar2, i12);
        }
    }

    public AbstractC44388a w(int i12, C c12, r[] rVarArr, r[] rVarArr2, int[] iArr, String str, boolean z12) {
        if (this.f418281b < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        s sVar = this.f418282c;
        if (sVar != null) {
            return sVar.w(i12, c12, rVarArr, rVarArr2, iArr, str, z12);
        }
        return null;
    }

    public void x(r rVar, int[] iArr, r[] rVarArr) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.x(rVar, iArr, rVarArr);
        }
    }

    public void y(int i12, int i13) {
        s sVar = this.f418282c;
        if (sVar != null) {
            sVar.y(i12, i13);
        }
    }

    @Deprecated
    public void z(int i12, String str, String str2, String str3) {
        A(str, str2, str3, i12 | (this.f418281b < 327680 ? 256 : 0), i12 == 185);
    }
}
