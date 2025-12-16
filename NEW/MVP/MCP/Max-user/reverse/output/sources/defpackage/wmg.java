package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wmg {
    public static final wmg a;
    public static final wmg b;
    public static final /* synthetic */ wmg[] c;

    static {
        wmg wmgVar = new wmg("START", 0);
        a = wmgVar;
        wmg wmgVar2 = new wmg("FINISH", 1);
        b = wmgVar2;
        c = new wmg[]{wmgVar, wmgVar2};
    }

    public static wmg valueOf(String str) {
        return (wmg) Enum.valueOf(wmg.class, str);
    }

    public static wmg[] values() {
        return (wmg[]) c.clone();
    }
}
