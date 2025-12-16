package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kwe {
    public static final kwe a;
    public static final kwe b;
    public static final kwe c;
    public static final kwe d;
    public static final /* synthetic */ kwe[] o;

    static {
        kwe kweVar = new kwe("DEFAULT", 0);
        a = kweVar;
        kwe kweVar2 = new kwe("INCOMING", 1);
        b = kweVar2;
        kwe kweVar3 = new kwe("ACTIVE", 2);
        c = kweVar3;
        kwe kweVar4 = new kwe("NO_CONNECTION", 3);
        d = kweVar4;
        o = new kwe[]{kweVar, kweVar2, kweVar3, kweVar4};
    }

    public static kwe valueOf(String str) {
        return (kwe) Enum.valueOf(kwe.class, str);
    }

    public static kwe[] values() {
        return (kwe[]) o.clone();
    }
}
