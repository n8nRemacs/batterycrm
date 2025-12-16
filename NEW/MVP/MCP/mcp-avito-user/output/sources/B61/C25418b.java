package b61;

import java.util.ArrayList;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.C44390c;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.jar.asm.u;
import net.bytebuddy.jar.asm.x;

/* compiled from: ClassRemapper.java */
/* renamed from: b61.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C25418b extends net.bytebuddy.jar.asm.f {

    /* renamed from: d, reason: collision with root package name */
    public final j f56921d;

    /* renamed from: e, reason: collision with root package name */
    public String f56922e;

    public C25418b(int i12, TypeWriter.Default.ForInlining.WithFullProcessing.b bVar, j jVar) {
        super(i12, bVar);
        this.f56921d = jVar;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void c(int i12, int i13, String str, String str2, String str3, String[] strArr) {
        this.f56922e = str;
        j jVar = this.f56921d;
        super.c(i12, i13, jVar.i(str), jVar.h(str2, false), jVar.i(str3), strArr == null ? null : jVar.k(strArr));
    }

    @Override // net.bytebuddy.jar.asm.f
    public final AbstractC44388a d(String str, boolean z12) {
        j jVar = this.f56921d;
        AbstractC44388a abstractC44388aD = super.d(jVar.c(str), z12);
        if (abstractC44388aD == null) {
            return null;
        }
        int i12 = this.f418174b;
        return new C25417a(i12, str, abstractC44388aD, jVar).f(new C25417a(i12, null, abstractC44388aD, jVar));
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void e(C44390c c44390c) {
        if (c44390c instanceof e) {
            ArrayList arrayList = ((e) c44390c).f56926e;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                String str = (String) arrayList.get(i12);
                this.f56921d.getClass();
                arrayList.set(i12, str);
            }
        }
        super.e(c44390c);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final m g(int i12, String str, String str2, String str3, Object obj) {
        String str4 = this.f56922e;
        j jVar = this.f56921d;
        m mVarG = super.g(i12, jVar.d(str4, str), jVar.c(str2), jVar.h(str3, true), obj == null ? null : jVar.l(obj));
        if (mVarG == null) {
            return null;
        }
        return new C25419c(this.f418174b, mVarG, jVar);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void h(int i12, String str, String str2, String str3) {
        j jVar = this.f56921d;
        String strI = jVar.i(str);
        String str4 = null;
        String strI2 = str2 == null ? null : jVar.i(str2);
        if (str3 != null) {
            String strI3 = jVar.i(str);
            if (strI3.contains("$")) {
                int iLastIndexOf = strI3.lastIndexOf(36);
                do {
                    iLastIndexOf++;
                    if (iLastIndexOf >= strI3.length()) {
                        break;
                    }
                } while (Character.isDigit(strI3.charAt(iLastIndexOf)));
                str3 = strI3.substring(iLastIndexOf);
            }
            str4 = str3;
        }
        super.h(i12, strI, strI2, str4);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final s i(int i12, String str, String str2, String str3, String[] strArr) {
        j jVar = this.f56921d;
        s sVarI = super.i(i12, jVar.g(this.f56922e, str, str2), jVar.f(str2), jVar.h(str3, false), strArr == null ? null : jVar.k(strArr));
        if (sVarI == null) {
            return null;
        }
        return new d(this.f418174b, sVarI, jVar);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final u j(int i12, String str, String str2) {
        j jVar = this.f56921d;
        jVar.getClass();
        u uVarJ = super.j(i12, str, str2);
        if (uVarJ == null) {
            return null;
        }
        return new f(this.f418174b, uVarJ, jVar);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void k(String str) {
        super.k(this.f56921d.i(str));
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void l(String str) {
        super.l(this.f56921d.i(str));
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void m(String str, String str2, String str3) {
        j jVar = this.f56921d;
        super.m(jVar.i(str), str2 == null ? null : jVar.g(str, str2, str3), str3 != null ? jVar.f(str3) : null);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void n(String str) {
        super.n(this.f56921d.i(str));
    }

    @Override // net.bytebuddy.jar.asm.f
    public final x o(String str, String str2, String str3) {
        j jVar = this.f56921d;
        jVar.getClass();
        x xVarO = super.o(str, jVar.c(str2), jVar.h(str3, true));
        if (xVarO == null) {
            return null;
        }
        return new g(this.f418174b, xVarO, jVar);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final AbstractC44388a q(int i12, C c12, String str, boolean z12) {
        j jVar = this.f56921d;
        AbstractC44388a abstractC44388aQ = super.q(i12, c12, jVar.c(str), z12);
        if (abstractC44388aQ == null) {
            return null;
        }
        int i13 = this.f418174b;
        return new C25417a(i13, str, abstractC44388aQ, jVar).f(new C25417a(i13, null, abstractC44388aQ, jVar));
    }
}
