package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hz3 {
    public static final hz3 a;
    public static final hz3 b;
    public static final /* synthetic */ hz3[] c;

    static {
        hz3 hz3Var = new hz3("CALL", 0);
        a = hz3Var;
        hz3 hz3Var2 = new hz3("CONTACT", 1);
        b = hz3Var2;
        c = new hz3[]{hz3Var, hz3Var2};
    }

    public static hz3 valueOf(String str) {
        return (hz3) Enum.valueOf(hz3.class, str);
    }

    public static hz3[] values() {
        return (hz3[]) c.clone();
    }
}
