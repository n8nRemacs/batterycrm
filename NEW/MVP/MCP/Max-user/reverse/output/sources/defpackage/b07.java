package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b07 extends h0e {
    public final Handler a;
    public volatile boolean b;

    public b07(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.h0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        cd5 cd5Var = cd5.a;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.b) {
            return cd5Var;
        }
        Handler handler = this.a;
        c07 c07Var = new c07(handler, runnable);
        Message messageObtain = Message.obtain(handler, c07Var);
        messageObtain.obj = this;
        messageObtain.setAsynchronous(true);
        this.a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.b) {
            return c07Var;
        }
        this.a.removeCallbacks(c07Var);
        return cd5Var;
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b;
    }
}
