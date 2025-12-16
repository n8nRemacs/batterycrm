package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jza {
    public static final jza a;
    public static final jza b;
    public static final jza c;
    public static final /* synthetic */ jza[] d;

    static {
        jza jzaVar = new jza("SMALL", 0);
        a = jzaVar;
        jza jzaVar2 = new jza("MEDIUM", 1);
        b = jzaVar2;
        jza jzaVar3 = new jza("LARGE", 2);
        c = jzaVar3;
        d = new jza[]{jzaVar, jzaVar2, jzaVar3};
    }

    public static jza valueOf(String str) {
        return (jza) Enum.valueOf(jza.class, str);
    }

    public static jza[] values() {
        return (jza[]) d.clone();
    }
}
