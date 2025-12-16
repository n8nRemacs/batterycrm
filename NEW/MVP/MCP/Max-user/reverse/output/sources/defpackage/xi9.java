package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xi9 {
    public static final xi9 X;
    public static final xi9 Y;
    public static final /* synthetic */ xi9[] Z;
    public static final List b;
    public static final xi9 c;
    public static final xi9 d;
    public static final xi9 o;
    public final int a;

    static {
        xi9 xi9Var = new xi9("UNKNOWN", 0, 0);
        c = xi9Var;
        xi9 xi9Var2 = new xi9("SENDING", 1, 10);
        d = xi9Var2;
        xi9 xi9Var3 = new xi9("SENT", 2, 20);
        o = xi9Var3;
        xi9 xi9Var4 = new xi9("READ", 3, 30);
        X = xi9Var4;
        xi9 xi9Var5 = new xi9("ERROR", 4, 40);
        Y = xi9Var5;
        xi9[] xi9VarArr = {xi9Var, xi9Var2, xi9Var3, xi9Var4, xi9Var5};
        Z = xi9VarArr;
        b = ue3.d0(new zg5(xi9VarArr));
    }

    public xi9(String str, int i, int i2) {
        this.a = i2;
    }

    public static xi9 valueOf(String str) {
        return (xi9) Enum.valueOf(xi9.class, str);
    }

    public static xi9[] values() {
        return (xi9[]) Z.clone();
    }
}
