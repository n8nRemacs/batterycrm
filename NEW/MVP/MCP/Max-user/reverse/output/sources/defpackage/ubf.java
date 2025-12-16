package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ubf {
    public static final ubf a;
    public static final ubf b;
    public static final /* synthetic */ ubf[] c;

    static {
        ubf ubfVar = new ubf("EXPANDED", 0);
        a = ubfVar;
        ubf ubfVar2 = new ubf("COLLAPSED", 1);
        b = ubfVar2;
        c = new ubf[]{ubfVar, ubfVar2};
    }

    public static ubf valueOf(String str) {
        return (ubf) Enum.valueOf(ubf.class, str);
    }

    public static ubf[] values() {
        return (ubf[]) c.clone();
    }
}
