package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rp7 {
    public static final rp7 a;
    public static final rp7 b;
    public static final /* synthetic */ rp7[] c;

    static {
        rp7 rp7Var = new rp7("AUTH", 0);
        a = rp7Var;
        rp7 rp7Var2 = new rp7("SETTINGS", 1);
        b = rp7Var2;
        c = new rp7[]{rp7Var, rp7Var2};
    }

    public static rp7 valueOf(String str) {
        return (rp7) Enum.valueOf(rp7.class, str);
    }

    public static rp7[] values() {
        return (rp7[]) c.clone();
    }
}
