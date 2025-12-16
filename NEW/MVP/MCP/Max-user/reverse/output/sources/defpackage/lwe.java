package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lwe {
    public static final lwe a;
    public static final lwe b;
    public static final /* synthetic */ lwe[] c;

    static {
        lwe lweVar = new lwe("CLOCKWISE", 0);
        a = lweVar;
        lwe lweVar2 = new lwe("COUNTERCLOCKWISE", 1);
        b = lweVar2;
        c = new lwe[]{lweVar, lweVar2};
    }

    public static lwe valueOf(String str) {
        return (lwe) Enum.valueOf(lwe.class, str);
    }

    public static lwe[] values() {
        return (lwe[]) c.clone();
    }
}
