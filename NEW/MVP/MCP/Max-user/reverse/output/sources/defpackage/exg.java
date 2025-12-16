package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class exg {
    public static final exg a;
    public static final exg b;
    public static final exg c;
    public static final exg d;
    public static final /* synthetic */ exg[] o;

    static {
        exg exgVar = new exg("ALL", 0);
        a = exgVar;
        exg exgVar2 = new exg("USER_FOLDER", 1);
        b = exgVar2;
        exg exgVar3 = new exg("CREATE_FOLDER", 2);
        c = exgVar3;
        exg exgVar4 = new exg("RECOMMENDED_FOLDER", 3);
        d = exgVar4;
        o = new exg[]{exgVar, exgVar2, exgVar3, exgVar4};
    }

    public static exg valueOf(String str) {
        return (exg) Enum.valueOf(exg.class, str);
    }

    public static exg[] values() {
        return (exg[]) o.clone();
    }
}
