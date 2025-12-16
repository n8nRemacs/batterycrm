package defpackage;

/* loaded from: classes2.dex */
public final class wd5 {
    public static final yk8 a = new yk8(8);

    public static String a(yeb yebVar, kwe kweVar, Integer num) {
        String name = yebVar.getName();
        String strName = kweVar.name();
        String strF = num != null ? ho7.f(num.intValue(), "_") : null;
        if (strF == null) {
            strF = "";
        }
        return name + "_" + strName + strF;
    }
}
