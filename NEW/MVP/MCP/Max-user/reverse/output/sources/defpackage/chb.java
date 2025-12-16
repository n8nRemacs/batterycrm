package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class chb {
    public static final chb X;
    public static final chb Y;
    public static final /* synthetic */ chb[] Z;
    public static final chb a;
    public static final chb b;
    public static final chb c;
    public static final chb d;
    public static final chb o;

    static {
        chb chbVar = new chb("AUTO_TRANSITION", 0);
        a = chbVar;
        chb chbVar2 = new chb("SEEK", 1);
        b = chbVar2;
        chb chbVar3 = new chb("SEEK_ADJUSTMENT", 2);
        c = chbVar3;
        chb chbVar4 = new chb("SKIP", 3);
        d = chbVar4;
        chb chbVar5 = new chb("REMOVE", 4);
        o = chbVar5;
        chb chbVar6 = new chb("INTERNAL", 5);
        X = chbVar6;
        chb chbVar7 = new chb("UNKNOWN", 6);
        Y = chbVar7;
        Z = new chb[]{chbVar, chbVar2, chbVar3, chbVar4, chbVar5, chbVar6, chbVar7};
    }

    public static chb valueOf(String str) {
        return (chb) Enum.valueOf(chb.class, str);
    }

    public static chb[] values() {
        return (chb[]) Z.clone();
    }
}
