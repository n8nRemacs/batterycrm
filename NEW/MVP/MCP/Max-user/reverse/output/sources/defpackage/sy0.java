package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sy0 {
    public static final /* synthetic */ zg5 A0;
    public static final kc3 X;
    public static final ArrayList Y;
    public static final ArrayList Z;
    public static final sy0 s0;
    public static final sy0 t0;
    public static final sy0 u0;
    public static final sy0 v0;
    public static final sy0 w0;
    public static final sy0 x0;
    public static final sy0 y0;
    public static final /* synthetic */ sy0[] z0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;

    static {
        sy0 sy0Var = new sy0("IMAGES", 0, tbb.u, tbb.j, tbb.i, ubb.t, ubb.m);
        s0 = sy0Var;
        sy0 sy0Var2 = new sy0("AUDIO", 1, tbb.q, tbb.d, tbb.c, ubb.e, ubb.i);
        t0 = sy0Var2;
        sy0 sy0Var3 = new sy0("GIF", 2, tbb.t, tbb.h, tbb.g, ubb.s, ubb.l);
        u0 = sy0Var3;
        sy0 sy0Var4 = new sy0("STICKERS", 3, tbb.z, tbb.n, tbb.m, ubb.z, ubb.o);
        v0 = sy0Var4;
        sy0 sy0Var5 = new sy0("MUSIC", 4, tbb.v, tbb.l, tbb.k, ubb.u, ubb.n);
        w0 = sy0Var5;
        sy0 sy0Var6 = new sy0("VIDEO", 5, tbb.B, tbb.p, tbb.o, ubb.A, ubb.p);
        x0 = sy0Var6;
        sy0 sy0Var7 = new sy0("OTHERS", 6, tbb.s, tbb.f, tbb.e, ubb.r, ubb.k);
        y0 = sy0Var7;
        sy0[] sy0VarArr = {sy0Var, sy0Var2, sy0Var3, sy0Var4, sy0Var5, sy0Var6, sy0Var7};
        z0 = sy0VarArr;
        zg5 zg5Var = new zg5(sy0VarArr);
        A0 = zg5Var;
        X = new kc3(15);
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            arrayList.add(Integer.valueOf(((sy0) f2Var.next()).a));
        }
        Y = arrayList;
        zg5 zg5Var2 = A0;
        ArrayList arrayList2 = new ArrayList(we3.q(zg5Var2, 10));
        f2 f2Var2 = new f2(0, zg5Var2);
        while (f2Var2.hasNext()) {
            arrayList2.add(Integer.valueOf(((sy0) f2Var2.next()).b));
        }
        Z = arrayList2;
    }

    public sy0(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.o = i6;
    }

    public static sy0 valueOf(String str) {
        return (sy0) Enum.valueOf(sy0.class, str);
    }

    public static sy0[] values() {
        return (sy0[]) z0.clone();
    }
}
