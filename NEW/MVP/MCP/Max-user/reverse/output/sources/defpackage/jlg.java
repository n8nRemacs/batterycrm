package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jlg {
    public static final jlg a;
    public static final jlg b;
    public static final jlg c;
    public static final /* synthetic */ jlg[] d;

    static {
        jlg jlgVar = new jlg("CREATE", 0);
        a = jlgVar;
        jlg jlgVar2 = new jlg("EDIT", 1);
        b = jlgVar2;
        jlg jlgVar3 = new jlg("RESTORE", 2);
        c = jlgVar3;
        d = new jlg[]{jlgVar, jlgVar2, jlgVar3};
    }

    public static jlg valueOf(String str) {
        return (jlg) Enum.valueOf(jlg.class, str);
    }

    public static jlg[] values() {
        return (jlg[]) d.clone();
    }
}
