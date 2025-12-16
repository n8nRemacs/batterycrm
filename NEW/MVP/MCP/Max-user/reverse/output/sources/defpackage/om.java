package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class om {
    public static final om a;
    public static final om b;
    public static final /* synthetic */ om[] c;

    static {
        om omVar = new om("SAME", 0);
        a = omVar;
        om omVar2 = new om("NO_SESSION", 1);
        om omVar3 = new om("ANONYMOUS_SESSION", 2);
        b = omVar3;
        c = new om[]{omVar, omVar2, omVar3, new om("SESSION", 3)};
    }

    public static om valueOf(String str) {
        return (om) Enum.valueOf(om.class, str);
    }

    public static om[] values() {
        return (om[]) c.clone();
    }
}
