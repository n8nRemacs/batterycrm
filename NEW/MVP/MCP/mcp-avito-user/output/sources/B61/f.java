package b61;

import net.bytebuddy.jar.asm.u;

/* compiled from: ModuleRemapper.java */
/* loaded from: classes7.dex */
public class f extends u {

    /* renamed from: b, reason: collision with root package name */
    public final j f56928b;

    public f(int i12, u uVar, j jVar) {
        super(i12, uVar);
        this.f56928b = jVar;
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void b(String str, int i12, String... strArr) {
        String[] strArr2;
        j jVar = this.f56928b;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i13 = 0; i13 < strArr.length; i13++) {
                String str2 = strArr[i13];
                jVar.getClass();
                strArr2[i13] = str2;
            }
        } else {
            strArr2 = null;
        }
        jVar.getClass();
        super.b(str, i12, strArr2);
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void c(String str) {
        super.c(this.f56928b.i(str));
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void d(String str, int i12, String... strArr) {
        String[] strArr2;
        j jVar = this.f56928b;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i13 = 0; i13 < strArr.length; i13++) {
                String str2 = strArr[i13];
                jVar.getClass();
                strArr2[i13] = str2;
            }
        } else {
            strArr2 = null;
        }
        jVar.getClass();
        super.d(str, i12, strArr2);
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void e(String str) {
        this.f56928b.getClass();
        super.e(str);
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void f(String str, String... strArr) {
        String[] strArr2 = new String[strArr.length];
        int i12 = 0;
        while (true) {
            int length = strArr.length;
            j jVar = this.f56928b;
            if (i12 >= length) {
                super.f(jVar.i(str), strArr2);
                return;
            } else {
                strArr2[i12] = jVar.i(strArr[i12]);
                i12++;
            }
        }
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void g(int i12, String str, String str2) {
        this.f56928b.getClass();
        super.g(i12, str, str2);
    }

    @Override // net.bytebuddy.jar.asm.u
    public final void h(String str) {
        super.h(this.f56928b.i(str));
    }
}
