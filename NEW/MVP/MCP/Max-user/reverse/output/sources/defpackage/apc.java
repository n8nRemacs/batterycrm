package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class apc {
    public static final apc a;
    public static final /* synthetic */ apc[] b;

    static {
        apc apcVar = new apc("DEFAULT", 0);
        a = apcVar;
        b = new apc[]{apcVar, new apc("SIGNED", 1), new apc("FIXED", 2)};
    }

    public static apc valueOf(String str) {
        return (apc) Enum.valueOf(apc.class, str);
    }

    public static apc[] values() {
        return (apc[]) b.clone();
    }
}
