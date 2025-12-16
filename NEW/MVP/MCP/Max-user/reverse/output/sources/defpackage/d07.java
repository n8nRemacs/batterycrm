package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d07 extends j0e {
    public final Handler c;

    public d07(Handler handler) {
        this.c = handler;
    }

    @Override // defpackage.j0e
    public final h0e a() {
        return new b07(this.c);
    }

    @Override // defpackage.j0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.c;
        c07 c07Var = new c07(handler, runnable);
        Message messageObtain = Message.obtain(handler, c07Var);
        messageObtain.setAsynchronous(true);
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return c07Var;
    }
}
