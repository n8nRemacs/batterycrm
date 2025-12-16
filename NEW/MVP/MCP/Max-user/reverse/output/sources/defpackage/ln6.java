package defpackage;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ln6 implements Comparator {
    public static final ln6 a;
    public static final /* synthetic */ ln6[] b;

    static {
        ln6 ln6Var = new ln6("INSTANCE", 0);
        a = ln6Var;
        b = new ln6[]{ln6Var};
    }

    public static ln6 valueOf(String str) {
        return (ln6) Enum.valueOf(ln6.class, str);
    }

    public static ln6[] values() {
        return (ln6[]) b.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }
}
