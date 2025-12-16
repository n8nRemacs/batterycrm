package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class il0 {
    public static final /* synthetic */ il0[] X;
    public static final il0 a;
    public static final il0 b;
    public static final il0 c;
    public static final il0 d;
    public static final il0 o;

    static {
        il0 il0Var = new il0("SMALLEST", 0);
        a = il0Var;
        il0 il0Var2 = new il0("SMALL", 1);
        b = il0Var2;
        il0 il0Var3 = new il0("MEDIUM", 2);
        c = il0Var3;
        il0 il0Var4 = new il0("BIG", 3);
        d = il0Var4;
        il0 il0Var5 = new il0("MAX", 4);
        o = il0Var5;
        X = new il0[]{il0Var, il0Var2, il0Var3, il0Var4, il0Var5};
    }

    public static il0 valueOf(String str) {
        return (il0) Enum.valueOf(il0.class, str);
    }

    public static il0[] values() {
        return (il0[]) X.clone();
    }
}
