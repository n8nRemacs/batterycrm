package defpackage;

import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public abstract class ug4 {
    public static final boolean a;
    public static final vn3 b;
    public static final /* synthetic */ tg4 c;

    static {
        Object ipdVar;
        a7j.a(new Exception(), a8i.class.getSimpleName());
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        new vn3(false);
        a = true;
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            uog.d(1, objNewInstance);
            ipdVar = (em6) objNewInstance;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        b = new vn3(true);
        c = new tg4();
    }
}
