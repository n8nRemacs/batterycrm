package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zn3 {
    public static final zn3 a;
    public static final zn3 b;
    public static final zn3 c;
    public static final zn3 d;
    public static final /* synthetic */ zn3[] o;

    static {
        zn3 zn3Var = new zn3("ALWAYS_OVERRIDE", 0);
        a = zn3Var;
        zn3 zn3Var2 = new zn3("HIGH_PRIORITY_REQUIRED", 1);
        b = zn3Var2;
        zn3 zn3Var3 = new zn3("REQUIRED", 2);
        c = zn3Var3;
        zn3 zn3Var4 = new zn3("OPTIONAL", 3);
        d = zn3Var4;
        o = new zn3[]{zn3Var, zn3Var2, zn3Var3, zn3Var4};
    }

    public static zn3 valueOf(String str) {
        return (zn3) Enum.valueOf(zn3.class, str);
    }

    public static zn3[] values() {
        return (zn3[]) o.clone();
    }
}
