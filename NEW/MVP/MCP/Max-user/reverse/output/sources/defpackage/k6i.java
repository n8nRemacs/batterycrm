package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class k6i {
    public static final k6i b;
    public zo0 a;

    static {
        k6i k6iVar = new k6i();
        k6iVar.a = null;
        b = k6iVar;
    }

    public static zo0 a(Context context) {
        zo0 zo0Var;
        k6i k6iVar = b;
        synchronized (k6iVar) {
            try {
                if (k6iVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    k6iVar.a = new zo0(context);
                }
                zo0Var = k6iVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zo0Var;
    }
}
