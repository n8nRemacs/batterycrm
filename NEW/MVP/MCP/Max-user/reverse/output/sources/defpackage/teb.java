package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class teb {
    public static final teb a;
    public static final teb b;
    public static final /* synthetic */ teb[] c;

    static {
        teb tebVar = new teb("DEFAULT", 0);
        a = tebVar;
        teb tebVar2 = new teb("PASSWORD", 1);
        b = tebVar2;
        c = new teb[]{tebVar, tebVar2};
    }

    public static teb valueOf(String str) {
        return (teb) Enum.valueOf(teb.class, str);
    }

    public static teb[] values() {
        return (teb[]) c.clone();
    }
}
