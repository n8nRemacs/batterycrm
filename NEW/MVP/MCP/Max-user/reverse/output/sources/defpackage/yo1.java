package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yo1 {
    public static final /* synthetic */ yo1[] X;
    public static final /* synthetic */ zg5 Y;
    public static final yo1 a;
    public static final yo1 b;
    public static final yo1 c;
    public static final yo1 d;
    public static final yo1 o;

    static {
        yo1 yo1Var = new yo1("CALL", 0);
        a = yo1Var;
        yo1 yo1Var2 = new yo1("STOP", 1);
        b = yo1Var2;
        yo1 yo1Var3 = new yo1("UPDATE_ACTIVE_NOTIFICATION", 2);
        yo1 yo1Var4 = new yo1("RESTART_FOREGROUND", 3);
        c = yo1Var4;
        yo1 yo1Var5 = new yo1("UPDATE_INCOMING_NOTIFICATION", 4);
        yo1 yo1Var6 = new yo1("RESTART_FOREGROUND_SCREENSHARING", 5);
        d = yo1Var6;
        yo1 yo1Var7 = new yo1("HIDE_INCOMING_NOTIFICATION", 6);
        o = yo1Var7;
        yo1[] yo1VarArr = {yo1Var, yo1Var2, yo1Var3, yo1Var4, yo1Var5, yo1Var6, yo1Var7};
        X = yo1VarArr;
        Y = new zg5(yo1VarArr);
    }

    public static yo1 valueOf(String str) {
        return (yo1) Enum.valueOf(yo1.class, str);
    }

    public static yo1[] values() {
        return (yo1[]) X.clone();
    }
}
