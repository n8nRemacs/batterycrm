package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class flc {
    public static final /* synthetic */ zg5 X;
    public static final flc b;
    public static final flc c;
    public static final flc d;
    public static final /* synthetic */ flc[] o;
    public final int a;

    static {
        flc flcVar = new flc("ESIA_CONNECTION", 0, 1);
        b = flcVar;
        flc flcVar2 = new flc("SECOND_FACTOR_PASSWORD_ENABLED", 1, 2);
        c = flcVar2;
        flc flcVar3 = new flc("SECOND_FACTOR_HAS_EMAIL", 2, 3);
        d = flcVar3;
        flc[] flcVarArr = {flcVar, flcVar2, flcVar3, new flc("SECOND_FACTOR_HAS_HINT", 3, 4)};
        o = flcVarArr;
        X = new zg5(flcVarArr);
    }

    public flc(String str, int i, int i2) {
        this.a = i2;
    }

    public static flc valueOf(String str) {
        return (flc) Enum.valueOf(flc.class, str);
    }

    public static flc[] values() {
        return (flc[]) o.clone();
    }
}
