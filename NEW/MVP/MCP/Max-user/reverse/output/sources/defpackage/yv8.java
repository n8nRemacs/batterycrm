package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class yv8 {
    public static final /* synthetic */ yv8[] X;
    public static final /* synthetic */ zg5 Y;
    public static final u1j d;
    public static final ArrayList o;
    public final int a;
    public final int b;
    public final int c;

    static {
        yv8[] yv8VarArr = {new yv8(0, 0, tbb.A, ubb.d, "UNLIMITED"), new yv8(1, 1, tbb.y, ubb.c, "SIX_MONTH"), new yv8(2, 2, tbb.w, ubb.a, "ONE_MONTH"), new yv8(3, 3, tbb.x, ubb.b, "ONE_WEEK")};
        X = yv8VarArr;
        zg5 zg5Var = new zg5(yv8VarArr);
        Y = zg5Var;
        d = new u1j(23);
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            arrayList.add(Integer.valueOf(((yv8) f2Var.next()).b));
        }
        o = arrayList;
    }

    public yv8(int i, int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    public static yv8 valueOf(String str) {
        return (yv8) Enum.valueOf(yv8.class, str);
    }

    public static yv8[] values() {
        return (yv8[]) X.clone();
    }
}
