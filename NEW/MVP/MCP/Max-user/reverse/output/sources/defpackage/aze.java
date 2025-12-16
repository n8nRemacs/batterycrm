package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aze {
    public static final aze a;
    public static final aze b;
    public static final aze c;
    public static final aze d;
    public static final /* synthetic */ aze[] o;

    static {
        aze azeVar = new aze("LOADING", 0);
        a = azeVar;
        aze azeVar2 = new aze("CONTENT", 1);
        b = azeVar2;
        aze azeVar3 = new aze("CONTENT_SEARCH", 2);
        c = azeVar3;
        aze azeVar4 = new aze("EMPTY_SEARCH", 3);
        d = azeVar4;
        o = new aze[]{azeVar, azeVar2, azeVar3, azeVar4};
    }

    public static aze valueOf(String str) {
        return (aze) Enum.valueOf(aze.class, str);
    }

    public static aze[] values() {
        return (aze[]) o.clone();
    }
}
