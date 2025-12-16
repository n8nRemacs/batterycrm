package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gwa {
    public static final gwa a;
    public static final /* synthetic */ gwa[] b;

    static {
        gwa gwaVar = new gwa("DISABLED", 0);
        a = gwaVar;
        b = new gwa[]{gwaVar, new gwa("SOFT", 1), new gwa("HARD", 2)};
    }

    public static gwa valueOf(String str) {
        return (gwa) Enum.valueOf(gwa.class, str);
    }

    public static gwa[] values() {
        return (gwa[]) b.clone();
    }
}
