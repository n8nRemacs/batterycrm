package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class noe {
    public static final noe a;
    public static final noe b;
    public static final /* synthetic */ noe[] c;

    static {
        noe noeVar = new noe("NONE", 0);
        a = noeVar;
        noe noeVar2 = new noe("DARK", 1);
        b = noeVar2;
        c = new noe[]{noeVar, noeVar2};
    }

    public static noe valueOf(String str) {
        return (noe) Enum.valueOf(noe.class, str);
    }

    public static noe[] values() {
        return (noe[]) c.clone();
    }
}
