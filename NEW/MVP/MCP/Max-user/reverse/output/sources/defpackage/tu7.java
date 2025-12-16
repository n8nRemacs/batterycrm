package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public abstract class tu7 {
    public static final Symbol a = new Symbol("COMPLETING_ALREADY");
    public static final Symbol b = new Symbol("COMPLETING_WAITING_CHILDREN");
    public static final Symbol c = new Symbol("COMPLETING_RETRY");
    public static final Symbol d = new Symbol("TOO_LATE_TO_CANCEL");
    public static final Symbol e = new Symbol("SEALED");
    public static final yc5 f = new yc5(false);
    public static final yc5 g = new yc5(true);

    public static final Object a(Object obj) {
        jj7 jj7Var;
        kj7 kj7Var = obj instanceof kj7 ? (kj7) obj : null;
        return (kj7Var == null || (jj7Var = kj7Var.a) == null) ? obj : jj7Var;
    }
}
