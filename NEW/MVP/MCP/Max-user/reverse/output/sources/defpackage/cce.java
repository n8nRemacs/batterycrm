package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cce {
    public static final cce a;
    public static final cce b;
    public static final /* synthetic */ cce[] c;

    static {
        cce cceVar = new cce("START", 0);
        a = cceVar;
        cce cceVar2 = new cce("FINISH", 1);
        b = cceVar2;
        c = new cce[]{cceVar, cceVar2};
    }

    public static cce valueOf(String str) {
        return (cce) Enum.valueOf(cce.class, str);
    }

    public static cce[] values() {
        return (cce[]) c.clone();
    }
}
