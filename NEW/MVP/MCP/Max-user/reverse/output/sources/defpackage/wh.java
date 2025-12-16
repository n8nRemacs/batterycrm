package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class wh {
    public static final v17 a = th.a;
    public static final boolean b;
    public static final vj c;
    public static final Object d = null;

    static {
        Boolean boolB0;
        String property = System.getProperty("animoji.debug", "false");
        b = (property == null || (boolB0 = vmf.b0(property)) == null) ? false : boolB0.booleanValue();
        vj vjVar = new vj();
        vjVar.a = new AtomicReference(kk4.c);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        vjVar.b = new HashMap();
        c = vjVar;
        ipi.b(3, new l(5));
    }

    public static void a(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        a.getClass();
        Log.d(str, str2);
    }
}
