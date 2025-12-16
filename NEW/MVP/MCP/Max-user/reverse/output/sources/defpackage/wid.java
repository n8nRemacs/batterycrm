package defpackage;

/* loaded from: classes.dex */
public final class wid {
    public static String a(fn6 fn6Var) {
        String string = fn6Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
