package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class o20 extends BroadcastReceiver {
    public final yl5 a;
    public final wwf b;
    public final /* synthetic */ dl6 c;

    public o20(dl6 dl6Var, wwf wwfVar, yl5 yl5Var) {
        this.c = dl6Var;
        this.b = wwfVar;
        this.a = yl5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new o3(13, this));
        }
    }
}
