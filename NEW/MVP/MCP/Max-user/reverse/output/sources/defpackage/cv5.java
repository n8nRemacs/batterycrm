package defpackage;

import android.os.Build;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class cv5 {
    public final String a = cv5.class.getName();
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final k18 m;

    public cv5(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12) {
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        this.f = k18Var5;
        this.g = k18Var6;
        this.h = k18Var7;
        this.i = k18Var8;
        this.j = k18Var9;
        this.k = k18Var10;
        this.l = k18Var11;
        this.m = k18Var12;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:21:0x004c, B:24:0x0053, B:28:0x006d, B:30:0x0073, B:46:0x00f9, B:51:0x0104, B:54:0x0128, B:55:0x0131, B:56:0x0136, B:57:0x0137, B:58:0x013d, B:27:0x0060), top: B:71:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r17, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, defpackage.q44 r25) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv5.a(long, long, java.lang.String, java.lang.String, java.lang.String, int, q44):java.lang.Object");
    }

    public final Object b(long j, long j2, long j3, String str, long j4, q44 q44Var) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        String str2 = this.a;
        if (j3 == 0) {
            wqi.c(str2, "File attach click. Start process delete message", new Object[0]);
            wi9 wi9Var = (wi9) this.f.getValue();
            wi9Var.getClass();
            Object objA = wi9Var.a(q44Var, Collections.singletonList(new Long(j2)), true);
            if (objA != g84Var) {
                objA = qqgVar;
            }
            if (objA == g84Var) {
                return objA;
            }
        } else {
            wqi.c(str2, "File attach click. Start process cancel download", new Object[0]);
            ((zz) this.m.getValue()).a(new r8d(j2, j4));
            Object objA2 = ((htg) this.e.getValue()).a(j, j2, str, p10.b, q44Var);
            if (objA2 == g84Var) {
                return objA2;
            }
        }
        return qqgVar;
    }

    public final Object c(long j, long j2, long j3, long j4, String str, String str2, long j5, q44 q44Var) {
        iz5 iz5Var = (iz5) this.c.getValue();
        if (Build.VERSION.SDK_INT >= 29) {
            iz5Var.getClass();
        } else if (z7.b(iz5Var.c, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return obf.a;
        }
        return svi.i(((q2b) ((lzf) this.g.getValue())).b(), new bv5(this, j3, j4, j5, j, j2, str, str2, null), q44Var);
    }
}
