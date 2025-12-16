package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ecb {
    public static final /* synthetic */ ecb[] X;
    public static final ecb a;
    public static final ecb b;
    public static final ecb c;
    public static final ecb d;
    public static final ecb o;

    static {
        ecb ecbVar = new ecb("TIMEOUT", 0);
        a = ecbVar;
        ecb ecbVar2 = new ecb("SWIPE", 1);
        b = ecbVar2;
        ecb ecbVar3 = new ecb("MANUAL", 2);
        c = ecbVar3;
        ecb ecbVar4 = new ecb("ROOT_VIEW_DETACHED", 3);
        d = ecbVar4;
        ecb ecbVar5 = new ecb("RIGHT_ELEMENT_CLICK", 4);
        o = ecbVar5;
        X = new ecb[]{ecbVar, ecbVar2, ecbVar3, ecbVar4, ecbVar5};
    }

    public static ecb valueOf(String str) {
        return (ecb) Enum.valueOf(ecb.class, str);
    }

    public static ecb[] values() {
        return (ecb[]) X.clone();
    }
}
