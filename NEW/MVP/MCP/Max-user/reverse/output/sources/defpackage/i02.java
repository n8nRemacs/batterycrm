package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i02 {
    public static final i02 a;
    public static final i02 b;
    public static final i02 c;
    public static final /* synthetic */ i02[] d;

    static {
        i02 i02Var = new i02("OFF", 0);
        a = i02Var;
        i02 i02Var2 = new i02("ON", 1);
        b = i02Var2;
        i02 i02Var3 = new i02("AUTO", 2);
        c = i02Var3;
        d = new i02[]{i02Var, i02Var2, i02Var3, new i02("TORCH", 3)};
    }

    public static i02 valueOf(String str) {
        return (i02) Enum.valueOf(i02.class, str);
    }

    public static i02[] values() {
        return (i02[]) d.clone();
    }
}
