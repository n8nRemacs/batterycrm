package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mdg {
    public static final mdg a;
    public static final mdg b;
    public static final mdg c;
    public static final /* synthetic */ mdg[] d;

    static {
        mdg mdgVar = new mdg("DUMMY", 0);
        a = mdgVar;
        mdg mdgVar2 = new mdg("DIRECT", 1);
        b = mdgVar2;
        mdg mdgVar3 = new mdg("SERVER", 2);
        c = mdgVar3;
        d = new mdg[]{mdgVar, mdgVar2, mdgVar3};
    }

    public static final mdg a(String str) {
        return str.equals("DIRECT") ? b : str.equals("SERVER") ? c : a;
    }

    public static mdg valueOf(String str) {
        return (mdg) Enum.valueOf(mdg.class, str);
    }

    public static mdg[] values() {
        return (mdg[]) d.clone();
    }
}
