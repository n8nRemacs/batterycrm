package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ahb {
    public static final /* synthetic */ ahb[] X;
    public static final ahb a;
    public static final ahb b;
    public static final ahb c;
    public static final ahb d;
    public static final ahb o;

    static {
        ahb ahbVar = new ahb("SOURCE", 0);
        a = ahbVar;
        ahb ahbVar2 = new ahb("RENDERER", 1);
        b = ahbVar2;
        ahb ahbVar3 = new ahb("UNEXPECTED", 2);
        c = ahbVar3;
        ahb ahbVar4 = new ahb("REMOTE", 3);
        d = ahbVar4;
        ahb ahbVar5 = new ahb("UNKNOWN", 4);
        o = ahbVar5;
        X = new ahb[]{ahbVar, ahbVar2, ahbVar3, ahbVar4, ahbVar5};
    }

    public static ahb valueOf(String str) {
        return (ahb) Enum.valueOf(ahb.class, str);
    }

    public static ahb[] values() {
        return (ahb[]) X.clone();
    }
}
