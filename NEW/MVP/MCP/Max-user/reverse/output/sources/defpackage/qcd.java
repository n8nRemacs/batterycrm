package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qcd {
    public static final /* synthetic */ zg5 X;
    public static final qcd b;
    public static final qcd c;
    public static final qcd d;
    public static final /* synthetic */ qcd[] o;
    public final String a;

    static {
        qcd qcdVar = new qcd("UNKNOWN", 0, "UNKNOWN");
        b = qcdVar;
        qcd qcdVar2 = new qcd("EMOJI", 1, "EMOJI");
        c = qcdVar2;
        qcd qcdVar3 = new qcd("ANIMOJI", 2, "ANIMOJI");
        d = qcdVar3;
        qcd[] qcdVarArr = {qcdVar, qcdVar2, qcdVar3};
        o = qcdVarArr;
        X = new zg5(qcdVarArr);
    }

    public qcd(String str, int i, String str2) {
        this.a = str2;
    }

    public static qcd valueOf(String str) {
        return (qcd) Enum.valueOf(qcd.class, str);
    }

    public static qcd[] values() {
        return (qcd[]) o.clone();
    }
}
