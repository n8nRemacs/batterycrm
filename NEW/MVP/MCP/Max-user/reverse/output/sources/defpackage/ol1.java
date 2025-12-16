package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ol1 {
    public static final /* synthetic */ ol1[] a;
    public static final /* synthetic */ zg5 b;

    static {
        ol1[] ol1VarArr = {new ol1("LINK", 0), new ol1("CHAT", 1), new ol1("ONE_TO_ONE", 2), new ol1("ACTIVE", 3)};
        a = ol1VarArr;
        b = new zg5(ol1VarArr);
    }

    public static ol1 valueOf(String str) {
        return (ol1) Enum.valueOf(ol1.class, str);
    }

    public static ol1[] values() {
        return (ol1[]) a.clone();
    }
}
