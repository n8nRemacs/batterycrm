package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class zp4 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static boolean c(Handler handler, p32 p32Var, long j) {
        return handler.postDelayed(p32Var, "retry_token", j);
    }
}
