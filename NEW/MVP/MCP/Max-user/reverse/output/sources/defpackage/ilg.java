package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ilg {
    public static final ilg a;
    public static final ilg b;
    public static final /* synthetic */ ilg[] c;

    static {
        ilg ilgVar = new ilg("CREATE_PASSWORD", 0);
        a = ilgVar;
        ilg ilgVar2 = new ilg("CREATE_HINT", 1);
        ilg ilgVar3 = new ilg("ADD_EMAIL", 2);
        ilg ilgVar4 = new ilg("VERIFY_EMAIL", 3);
        b = ilgVar4;
        c = new ilg[]{ilgVar, ilgVar2, ilgVar3, ilgVar4};
    }

    public static ilg valueOf(String str) {
        return (ilg) Enum.valueOf(ilg.class, str);
    }

    public static ilg[] values() {
        return (ilg[]) c.clone();
    }
}
