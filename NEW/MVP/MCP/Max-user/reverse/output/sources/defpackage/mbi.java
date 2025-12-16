package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class mbi extends y1a {
    public final Context b;
    public final /* synthetic */ tv6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbi(tv6 tv6Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = tv6Var;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.y1a, android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = uv6.a;
        tv6 tv6Var = this.c;
        Context context = this.b;
        int iC = tv6Var.c(context, i2);
        int i3 = lw6.e;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = tv6Var.b(context, "n", iC);
            tv6Var.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
