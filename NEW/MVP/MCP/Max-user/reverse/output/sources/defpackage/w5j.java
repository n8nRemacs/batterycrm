package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class w5j {
    public static final /* synthetic */ int a = 0;

    public static void a(rv3 rv3Var, String str, String str2) {
        if (str == null) {
            rv3Var.f.remove(0);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (rv3Var.f.isEmpty()) {
            rv3Var.f.add(0, new tv3(str, sv3.d, str2));
        } else {
            rv3Var.f.set(0, new tv3(str, ((tv3) rv3Var.f.get(0)).c, str2));
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static zv3 c(gx3 gx3Var, yv3 yv3Var, long j, long j2) {
        long j3 = gx3Var.a;
        ArrayList arrayListH = po8.h(gx3Var.o);
        String str = gx3Var.u0;
        String str2 = gx3Var.v0;
        long j4 = gx3Var.X;
        lz7 lz7Var = gx3Var.x0;
        uv3 uv3Var = lz7Var == null ? null : new uv3((String) lz7Var.a);
        rv3 rv3Var = new rv3();
        rv3Var.a = j3;
        rv3Var.f = arrayListH;
        rv3Var.o = str;
        rv3Var.p = str2;
        rv3Var.k = yv3Var;
        rv3Var.b = null;
        rv3Var.c = null;
        rv3Var.e = j4;
        rv3Var.s = j;
        rv3Var.t = j2;
        rv3Var.u = uv3Var;
        rv3Var.v = gx3Var.y0;
        return rv3Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(java.util.List r18, defpackage.kv3 r19, defpackage.kv3 r20, defpackage.yv3 r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5j.d(java.util.List, kv3, kv3, yv3, long, long):java.util.List");
    }
}
