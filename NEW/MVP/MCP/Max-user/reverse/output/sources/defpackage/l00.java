package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l00 {
    public static final l00 a;
    public static final l00 b;
    public static final /* synthetic */ l00[] c;

    static {
        l00 l00Var = new l00("Media", 0);
        a = l00Var;
        l00 l00Var2 = new l00("Files", 1);
        b = l00Var2;
        c = new l00[]{l00Var, l00Var2};
    }

    public static l00 valueOf(String str) {
        return (l00) Enum.valueOf(l00.class, str);
    }

    public static l00[] values() {
        return (l00[]) c.clone();
    }
}
