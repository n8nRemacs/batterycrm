package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lb3 {
    public static final lb3 a;
    public static final /* synthetic */ lb3[] b;

    /* JADX INFO: Fake field, exist only in values array */
    lb3 EF0;

    static {
        lb3 lb3Var = new lb3("UNKNOWN", 0);
        lb3 lb3Var2 = new lb3("ANDROID_FIREBASE", 1);
        a = lb3Var2;
        b = new lb3[]{lb3Var, lb3Var2};
    }

    public static lb3 valueOf(String str) {
        return (lb3) Enum.valueOf(lb3.class, str);
    }

    public static lb3[] values() {
        return (lb3[]) b.clone();
    }
}
