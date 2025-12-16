package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bf2 {
    public static final bf2 a;
    public static final bf2 b;
    public static final bf2 c;
    public static final bf2 d;
    public static final /* synthetic */ bf2[] o;

    static {
        bf2 bf2Var = new bf2("TITLE", 0);
        a = bf2Var;
        bf2 bf2Var2 = new bf2("ICON", 1);
        b = bf2Var2;
        bf2 bf2Var3 = new bf2("CHANGE_PARTICIPANT", 2);
        c = bf2Var3;
        bf2 bf2Var4 = new bf2("PIN_MESSAGE", 3);
        d = bf2Var4;
        o = new bf2[]{bf2Var, bf2Var2, bf2Var3, bf2Var4};
    }

    public static bf2 valueOf(String str) {
        return (bf2) Enum.valueOf(bf2.class, str);
    }

    public static bf2[] values() {
        return (bf2[]) o.clone();
    }
}
