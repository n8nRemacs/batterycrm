package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class b4 implements bbd, bk5 {
    public static final s55 X = new s55(20);
    public static int Y;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public b4(Long l, String str, String str2, String str3, String str4) {
        this.d = str;
        this.a = str2;
        this.b = l;
        this.c = str3;
        this.o = str4;
    }

    public static void c(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public static int g(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        return (a4) this.o;
    }

    @Override // defpackage.bk5
    public ExecutorService a() {
        return (ExecutorService) this.b;
    }

    public void b() {
        jei.b();
        kw6 kw6Var = (kw6) this.c;
        kw6Var.getClass();
        jei.b();
        q90 q90Var = (q90) kw6Var.d;
        Objects.requireNonNull(q90Var);
        ov8 ov8Var = (ov8) kw6Var.b;
        Objects.requireNonNull(ov8Var);
        cg7 cg7Var = q90Var.b;
        Objects.requireNonNull(cg7Var);
        cg7Var.a();
        cg7 cg7Var2 = q90Var.b;
        Objects.requireNonNull(cg7Var2);
        wsf.g(cg7Var2.e).d(new k52(ov8Var, 0), ayi.d());
        cg7 cg7Var3 = q90Var.c;
        if (cg7Var3 != null) {
            cg7Var3.a();
            wsf.g(q90Var.c.e).d(new k52(null, 1), ayi.d());
        }
        ((hac) this.d).getClass();
    }

    @Override // defpackage.bk5
    public ExecutorService d() {
        return (ExecutorService) this.d;
    }

    @Override // defpackage.bk5
    public ExecutorService e() {
        return (ExecutorService) this.c;
    }

    @Override // defpackage.bk5
    public ExecutorService f() {
        return (ExecutorService) this.a;
    }

    @Override // defpackage.bk5
    public ExecutorService h() {
        return (ExecutorService) this.a;
    }

    @Override // defpackage.bk5
    public ExecutorService i() {
        return (ExecutorService) this.a;
    }

    public boolean j(float[] fArr) {
        lmb[] lmbVarArr = (lmb[]) this.d;
        if (lmbVarArr != null && lmbVarArr.length > 0) {
            for (lmb lmbVar : lmbVarArr) {
                lmbVar.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ b4(String str, String str2, Long l, String str3, int i) {
        this((i & 4) != 0 ? null : l, str, (i & 2) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (String) null);
    }
}
