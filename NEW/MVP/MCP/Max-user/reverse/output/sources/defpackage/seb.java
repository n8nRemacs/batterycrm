package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class seb {
    public static final seb a;
    public static final seb b;
    public static final seb c;
    public static final /* synthetic */ seb[] d;

    static {
        seb sebVar = new seb("ERROR", 0);
        a = sebVar;
        seb sebVar2 = new seb("HINT", 1);
        b = sebVar2;
        seb sebVar3 = new seb("DESCRIPTION", 2);
        c = sebVar3;
        d = new seb[]{sebVar, sebVar2, sebVar3};
    }

    public static seb valueOf(String str) {
        return (seb) Enum.valueOf(seb.class, str);
    }

    public static seb[] values() {
        return (seb[]) d.clone();
    }
}
