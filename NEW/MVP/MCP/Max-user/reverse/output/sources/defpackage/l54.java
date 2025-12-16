package defpackage;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class l54 {
    public static final /* synthetic */ yy7[] a;
    public static final dh4 b;

    static {
        soc socVar = new soc(nu1.NO_RECEIVER, l54.class, "methodRemoveViewReference", "getMethodRemoveViewReference()Ljava/lang/reflect/Method;", 1);
        vid.a.getClass();
        a = new yy7[]{socVar};
        b = new dh4(k54.b, "removeViewReference", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1));
    }

    public static final boolean a(c54 c54Var) {
        return c54Var.viewState != null;
    }
}
