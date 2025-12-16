package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bne {
    public static final bne b;
    public static final /* synthetic */ bne[] c;
    public static final /* synthetic */ zg5 d;
    public final int a;

    static {
        bne bneVar = new bne("LEFT", 0, 1);
        b = bneVar;
        bne[] bneVarArr = {bneVar, new bne("CENTER", 1, 2)};
        c = bneVarArr;
        d = new zg5(bneVarArr);
    }

    public bne(String str, int i, int i2) {
        this.a = i2;
    }

    public static bne valueOf(String str) {
        return (bne) Enum.valueOf(bne.class, str);
    }

    public static bne[] values() {
        return (bne[]) c.clone();
    }
}
