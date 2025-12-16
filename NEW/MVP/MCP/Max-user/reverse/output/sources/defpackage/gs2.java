package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gs2 {
    public static final /* synthetic */ gs2[] X;
    public static final /* synthetic */ zg5 Y;
    public static final gs2 a;
    public static final gs2 b;
    public static final gs2 c;
    public static final gs2 d;
    public static final gs2 o;

    static {
        gs2 gs2Var = new gs2("NONE", 0);
        a = gs2Var;
        gs2 gs2Var2 = new gs2("IN_PROGRESS", 1);
        b = gs2Var2;
        gs2 gs2Var3 = new gs2("SENT", 2);
        c = gs2Var3;
        gs2 gs2Var4 = new gs2("READ", 3);
        d = gs2Var4;
        gs2 gs2Var5 = new gs2("ERROR", 4);
        o = gs2Var5;
        gs2[] gs2VarArr = {gs2Var, gs2Var2, gs2Var3, gs2Var4, gs2Var5};
        X = gs2VarArr;
        Y = new zg5(gs2VarArr);
    }

    public static gs2 valueOf(String str) {
        return (gs2) Enum.valueOf(gs2.class, str);
    }

    public static gs2[] values() {
        return (gs2[]) X.clone();
    }
}
