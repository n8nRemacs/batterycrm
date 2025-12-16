package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u81 {
    public static final u81 a;
    public static final u81 b;
    public static final u81 c;
    public static final u81 d;
    public static final /* synthetic */ u81[] o;

    static {
        u81 u81Var = new u81("ADD_PARTICIPANT", 0);
        a = u81Var;
        u81 u81Var2 = new u81("RECORD", 1);
        b = u81Var2;
        u81 u81Var3 = new u81("MOVIE_SHARE", 2);
        c = u81Var3;
        u81 u81Var4 = new u81("ASR_RECORD", 3);
        d = u81Var4;
        o = new u81[]{u81Var, u81Var2, u81Var3, u81Var4};
    }

    public static u81 valueOf(String str) {
        return (u81) Enum.valueOf(u81.class, str);
    }

    public static u81[] values() {
        return (u81[]) o.clone();
    }
}
