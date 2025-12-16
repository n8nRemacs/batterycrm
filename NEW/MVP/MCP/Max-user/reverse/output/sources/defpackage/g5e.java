package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g5e {
    public static final g5e a;
    public static final g5e b;
    public static final /* synthetic */ g5e[] c;

    /* JADX INFO: Fake field, exist only in values array */
    g5e EF0;

    static {
        g5e g5eVar = new g5e("hash", 0);
        g5e g5eVar2 = new g5e("app-update-type", 1);
        a = g5eVar2;
        g5e g5eVar3 = new g5e("has-phone", 2);
        g5e g5eVar4 = new g5e("esia-verify-botId", 3);
        b = g5eVar4;
        c = new g5e[]{g5eVar, g5eVar2, g5eVar3, g5eVar4};
    }

    public static g5e valueOf(String str) {
        return (g5e) Enum.valueOf(g5e.class, str);
    }

    public static g5e[] values() {
        return (g5e[]) c.clone();
    }
}
