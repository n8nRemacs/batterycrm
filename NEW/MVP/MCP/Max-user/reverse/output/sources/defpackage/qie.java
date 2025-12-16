package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qie {
    public static final qie a;
    public static final qie b;
    public static final qie c;
    public static final qie d;
    public static final /* synthetic */ qie[] o;

    static {
        qie qieVar = new qie("CREATED", 0);
        a = qieVar;
        qie qieVar2 = new qie("OPEN", 1);
        b = qieVar2;
        qie qieVar3 = new qie("CLOSING", 2);
        c = qieVar3;
        qie qieVar4 = new qie("CLOSED", 3);
        d = qieVar4;
        o = new qie[]{qieVar, qieVar2, qieVar3, qieVar4};
    }

    public static qie valueOf(String str) {
        return (qie) Enum.valueOf(qie.class, str);
    }

    public static qie[] values() {
        return (qie[]) o.clone();
    }
}
