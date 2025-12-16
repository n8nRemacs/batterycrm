package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m07 {
    public static final m07 X;
    public static final m07 Y;
    public static final /* synthetic */ m07[] Z;
    public static final m07 a;
    public static final m07 b;
    public static final m07 c;
    public static final m07 d;
    public static final m07 o;

    static {
        m07 m07Var = new m07("TIMEOUT", 0);
        a = m07Var;
        m07 m07Var2 = new m07("BUSY", 1);
        b = m07Var2;
        m07 m07Var3 = new m07("MISSED", 2);
        m07 m07Var4 = new m07("REJECTED", 3);
        c = m07Var4;
        m07 m07Var5 = new m07("FAILED", 4);
        m07 m07Var6 = new m07("HUNGUP", 5);
        d = m07Var6;
        m07 m07Var7 = new m07("CANCELED", 6);
        o = m07Var7;
        m07 m07Var8 = new m07("CALL_TIMEOUT", 7);
        m07 m07Var9 = new m07("REMOVED", 8);
        m07 m07Var10 = new m07("SERVICE_UNAVAILABLE", 9);
        X = m07Var10;
        m07 m07Var11 = new m07("OBSOLETE_CLIENT", 10);
        Y = m07Var11;
        Z = new m07[]{m07Var, m07Var2, m07Var3, m07Var4, m07Var5, m07Var6, m07Var7, m07Var8, m07Var9, m07Var10, m07Var11};
    }

    public static m07 valueOf(String str) {
        return (m07) Enum.valueOf(m07.class, str);
    }

    public static m07[] values() {
        return (m07[]) Z.clone();
    }
}
