package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class n20 extends BroadcastReceiver implements Runnable {
    public final xl5 a;
    public final Handler b;
    public final /* synthetic */ vd c;

    public n20(vd vdVar, Handler handler, xl5 xl5Var) {
        this.c = vdVar;
        this.b = handler;
        this.a = xl5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.b) {
            this.a.a.a1(-1, 3, false);
        }
    }
}
