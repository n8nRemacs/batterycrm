package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y5a {
    public static final y5a a;
    public static final y5a b;
    public static final /* synthetic */ y5a[] c;

    static {
        y5a y5aVar = new y5a("PRIMARY", 0);
        a = y5aVar;
        y5a y5aVar2 = new y5a("SECONDARY", 1);
        b = y5aVar2;
        c = new y5a[]{y5aVar, y5aVar2};
    }

    public static y5a valueOf(String str) {
        return (y5a) Enum.valueOf(y5a.class, str);
    }

    public static y5a[] values() {
        return (y5a[]) c.clone();
    }
}
