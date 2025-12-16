package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cwe {
    public static final cwe a;
    public static final cwe b;
    public static final /* synthetic */ cwe[] c;

    static {
        cwe cweVar = new cwe("NONE", 0);
        a = cweVar;
        cwe cweVar2 = new cwe("SURFACE", 1);
        b = cweVar2;
        c = new cwe[]{cweVar, cweVar2};
    }

    public static cwe valueOf(String str) {
        return (cwe) Enum.valueOf(cwe.class, str);
    }

    public static cwe[] values() {
        return (cwe[]) c.clone();
    }
}
