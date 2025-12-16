package net.bytebuddy.jar.asm;

import java.io.IOException;

/* compiled from: ClassVisitor.java */
/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public final int f418174b;

    /* renamed from: c, reason: collision with root package name */
    public f f418175c;

    public f(int i12, f fVar) throws IOException {
        if (i12 != 589824 && i12 != 524288 && i12 != 458752 && i12 != 393216 && i12 != 327680 && i12 != 262144 && i12 != 17432576) {
            throw new IllegalArgumentException(AK.c.g(i12, "Unsupported api "));
        }
        if (i12 == 17432576) {
            i.a(this);
        }
        this.f418174b = i12;
        this.f418175c = fVar;
    }

    public void c(int i12, int i13, String str, String str2, String str3, String[] strArr) {
        if (this.f418174b < 524288 && (65536 & i13) != 0) {
            throw new UnsupportedOperationException("Records requires ASM8");
        }
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.c(i12, i13, str, str2, str3, strArr);
        }
    }

    public AbstractC44388a d(String str, boolean z12) {
        f fVar = this.f418175c;
        if (fVar != null) {
            return fVar.d(str, z12);
        }
        return null;
    }

    public void e(C44390c c44390c) {
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.e(c44390c);
        }
    }

    public void f() {
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.f();
        }
    }

    public m g(int i12, String str, String str2, String str3, Object obj) {
        f fVar = this.f418175c;
        if (fVar != null) {
            return fVar.g(i12, str, str2, str3, obj);
        }
        return null;
    }

    public void h(int i12, String str, String str2, String str3) {
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.h(i12, str, str2, str3);
        }
    }

    public s i(int i12, String str, String str2, String str3, String[] strArr) {
        f fVar = this.f418175c;
        if (fVar != null) {
            return fVar.i(i12, str, str2, str3, strArr);
        }
        return null;
    }

    public u j(int i12, String str, String str2) {
        if (this.f418174b < 393216) {
            throw new UnsupportedOperationException("Module requires ASM6");
        }
        f fVar = this.f418175c;
        if (fVar != null) {
            return fVar.j(i12, str, str2);
        }
        return null;
    }

    public void k(String str) {
        if (this.f418174b < 458752) {
            throw new UnsupportedOperationException("NestHost requires ASM7");
        }
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.k(str);
        }
    }

    public void l(String str) {
        if (this.f418174b < 458752) {
            throw new UnsupportedOperationException("NestMember requires ASM7");
        }
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.l(str);
        }
    }

    public void m(String str, String str2, String str3) {
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.m(str, str2, str3);
        }
    }

    public void n(String str) {
        if (this.f418174b < 589824) {
            throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
        }
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.n(str);
        }
    }

    public x o(String str, String str2, String str3) {
        if (this.f418174b < 524288) {
            throw new UnsupportedOperationException("Record requires ASM8");
        }
        f fVar = this.f418175c;
        if (fVar != null) {
            return fVar.o(str, str2, str3);
        }
        return null;
    }

    public void p(String str, String str2) {
        f fVar = this.f418175c;
        if (fVar != null) {
            fVar.p(str, str2);
        }
    }

    public AbstractC44388a q(int i12, C c12, String str, boolean z12) {
        if (this.f418174b < 327680) {
            throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
        }
        f fVar = this.f418175c;
        if (fVar != null) {
            return fVar.q(i12, c12, str, z12);
        }
        return null;
    }
}
