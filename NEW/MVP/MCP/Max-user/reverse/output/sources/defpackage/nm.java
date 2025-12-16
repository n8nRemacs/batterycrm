package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nm {
    public static final nm a;
    public static final nm b;
    public static final nm c;
    public static final nm d;
    public static final /* synthetic */ nm[] o;

    static {
        nm nmVar = new nm("NONE", 0);
        a = nmVar;
        nm nmVar2 = new nm("APPLICATION", 1);
        b = nmVar2;
        nm nmVar3 = new nm("OPT_SESSION", 2);
        c = nmVar3;
        nm nmVar4 = new nm("SESSION", 3);
        d = nmVar4;
        o = new nm[]{nmVar, nmVar2, nmVar3, nmVar4};
    }

    public static nm valueOf(String str) {
        return (nm) Enum.valueOf(nm.class, str);
    }

    public static nm[] values() {
        return (nm[]) o.clone();
    }
}
