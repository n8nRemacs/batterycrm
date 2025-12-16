package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i88 {
    public static final i88 X;
    public static final /* synthetic */ i88[] Y;
    public static final /* synthetic */ zg5 Z;
    public static final i88 a;
    public static final i88 b;
    public static final i88 c;
    public static final i88 d;
    public static final i88 o;

    static {
        i88 i88Var = new i88("URL", 0);
        a = i88Var;
        i88 i88Var2 = new i88("HASH_TAG", 1);
        b = i88Var2;
        i88 i88Var3 = new i88("BOT_COMMAND", 2);
        c = i88Var3;
        i88 i88Var4 = new i88("PROFILE_TAG", 3);
        d = i88Var4;
        i88 i88Var5 = new i88("MENTION", 4);
        o = i88Var5;
        i88 i88Var6 = new i88("ML_ENTRY", 5);
        i88 i88Var7 = new i88("MARKDOWN_LINK", 6);
        X = i88Var7;
        i88[] i88VarArr = {i88Var, i88Var2, i88Var3, i88Var4, i88Var5, i88Var6, i88Var7};
        Y = i88VarArr;
        Z = new zg5(i88VarArr);
    }

    public static i88 valueOf(String str) {
        return (i88) Enum.valueOf(i88.class, str);
    }

    public static i88[] values() {
        return (i88[]) Y.clone();
    }
}
