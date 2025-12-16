package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dtd {
    public static final dtd a;
    public static final /* synthetic */ dtd[] b;

    static {
        dtd dtdVar = new dtd("OVAL", 0);
        a = dtdVar;
        b = new dtd[]{dtdVar, new dtd("RECT", 1)};
    }

    public static dtd valueOf(String str) {
        return (dtd) Enum.valueOf(dtd.class, str);
    }

    public static dtd[] values() {
        return (dtd[]) b.clone();
    }
}
