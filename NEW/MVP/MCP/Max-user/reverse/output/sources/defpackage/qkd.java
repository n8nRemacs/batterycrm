package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qkd {
    public static final qkd b;
    public static final /* synthetic */ qkd[] c;
    public static final /* synthetic */ zg5 d;
    public final int a;

    static {
        qkd qkdVar = new qkd("UNKNOWN", 0, 0);
        b = qkdVar;
        qkd[] qkdVarArr = {qkdVar, new qkd("HIGH", 1, 1), new qkd("NORMAL", 2, 2)};
        c = qkdVarArr;
        d = new zg5(qkdVarArr);
    }

    public qkd(String str, int i, int i2) {
        this.a = i2;
    }

    public static qkd valueOf(String str) {
        return (qkd) Enum.valueOf(qkd.class, str);
    }

    public static qkd[] values() {
        return (qkd[]) c.clone();
    }
}
