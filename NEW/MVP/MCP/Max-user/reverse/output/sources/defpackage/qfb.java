package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qfb {
    public static final qfb a;
    public static final qfb b;
    public static final qfb c;
    public static final /* synthetic */ qfb[] d;

    static {
        qfb qfbVar = new qfb("Compact", 0);
        a = qfbVar;
        qfb qfbVar2 = new qfb("Main", 1);
        b = qfbVar2;
        qfb qfbVar3 = new qfb("Chat", 2);
        c = qfbVar3;
        d = new qfb[]{qfbVar, qfbVar2, qfbVar3};
    }

    public static qfb valueOf(String str) {
        return (qfb) Enum.valueOf(qfb.class, str);
    }

    public static qfb[] values() {
        return (qfb[]) d.clone();
    }
}
