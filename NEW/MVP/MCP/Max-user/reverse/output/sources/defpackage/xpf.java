package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xpf {
    public static final /* synthetic */ xpf[] X;
    public static final xpf a;
    public static final xpf b;
    public static final xpf c;
    public static final xpf d;
    public static final xpf o;

    static {
        xpf xpfVar = new xpf("TAGS", 0);
        a = xpfVar;
        xpf xpfVar2 = new xpf("CONTACT_TAGS", 1);
        b = xpfVar2;
        xpf xpfVar3 = new xpf("COMMANDS", 2);
        c = xpfVar3;
        xpf xpfVar4 = new xpf("DESCRIPTION", 3);
        d = xpfVar4;
        xpf xpfVar5 = new xpf("UNKNOWN", 4);
        o = xpfVar5;
        X = new xpf[]{xpfVar, xpfVar2, xpfVar3, xpfVar4, xpfVar5};
    }

    public static xpf valueOf(String str) {
        return (xpf) Enum.valueOf(xpf.class, str);
    }

    public static xpf[] values() {
        return (xpf[]) X.clone();
    }
}
