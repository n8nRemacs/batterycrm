package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w82 {
    public static final w82 a;
    public static final w82 b;
    public static final /* synthetic */ w82[] c;
    public static final /* synthetic */ zg5 d;

    static {
        w82 w82Var = new w82("PUBLIC", 0);
        a = w82Var;
        w82 w82Var2 = new w82("PRIVATE", 1);
        b = w82Var2;
        w82[] w82VarArr = {w82Var, w82Var2};
        c = w82VarArr;
        d = new zg5(w82VarArr);
    }

    public static w82 valueOf(String str) {
        return (w82) Enum.valueOf(w82.class, str);
    }

    public static w82[] values() {
        return (w82[]) c.clone();
    }
}
