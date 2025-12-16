package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ghf {
    public static final /* synthetic */ zg5 X;
    public static final ghf b;
    public static final ghf c;
    public static final ghf d;
    public static final /* synthetic */ ghf[] o;
    public final String a;

    static {
        ghf ghfVar = new ghf("RECENT", 0, "recent");
        b = ghfVar;
        ghf ghfVar2 = new ghf("FAVORITE", 1, "favorite");
        c = ghfVar2;
        ghf ghfVar3 = new ghf("SET", 2, "set");
        d = ghfVar3;
        ghf[] ghfVarArr = {ghfVar, ghfVar2, ghfVar3};
        o = ghfVarArr;
        X = new zg5(ghfVarArr);
    }

    public ghf(String str, int i, String str2) {
        this.a = str2;
    }

    public static ghf valueOf(String str) {
        return (ghf) Enum.valueOf(ghf.class, str);
    }

    public static ghf[] values() {
        return (ghf[]) o.clone();
    }
}
