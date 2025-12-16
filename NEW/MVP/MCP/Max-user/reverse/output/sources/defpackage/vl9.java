package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vl9 {
    public static final vl9 b;
    public static final /* synthetic */ vl9[] c;
    public static final /* synthetic */ zg5 d;
    public final int a;

    static {
        vl9 vl9Var = new vl9("EMOJI", 0, 0);
        b = vl9Var;
        vl9[] vl9VarArr = {vl9Var, new vl9("STICKER", 1, 1)};
        c = vl9VarArr;
        d = new zg5(vl9VarArr);
    }

    public vl9(String str, int i, int i2) {
        this.a = i2;
    }

    public static vl9 valueOf(String str) {
        return (vl9) Enum.valueOf(vl9.class, str);
    }

    public static vl9[] values() {
        return (vl9[]) c.clone();
    }
}
