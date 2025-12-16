package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class sw6 extends BroadcastReceiver {
    public final /* synthetic */ tw6 a;

    public sw6(tw6 tw6Var) {
        this.a = tw6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = extras != null ? (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            tw6 tw6Var = this.a;
            if (status != null && status.a == 0) {
                svi.e(tw6Var.d, null, null, new rw6(tw6Var, extras, null), 3);
                return;
            }
            wqi.g(tw6Var.e, new l84("onMessageReceived: error; status = " + status + ", " + (extras != null ? extras.keySet() : null)), null, new Object[0]);
        }
    }
}
