package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qq7 {
    public static final qq7 a;
    public static final qq7 b;
    public static final /* synthetic */ qq7[] c;

    static {
        qq7 qq7Var = new qq7("INVITE_BY_PHONE", 0);
        a = qq7Var;
        qq7 qq7Var2 = new qq7("INVITE_BY_LINK", 1);
        b = qq7Var2;
        c = new qq7[]{qq7Var, qq7Var2};
    }

    public static qq7 valueOf(String str) {
        return (qq7) Enum.valueOf(qq7.class, str);
    }

    public static qq7[] values() {
        return (qq7[]) c.clone();
    }
}
