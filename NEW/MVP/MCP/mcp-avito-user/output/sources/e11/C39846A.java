package e11;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: e11.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39846A extends AbstractC39860d0 {
    @j.l0
    public final synchronized void g(@j.N Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            e();
            return;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("status", 1);
        if (intExtra >= 0 && intExtra2 > 0) {
            a("bl", String.valueOf((intExtra * 100) / intExtra2));
        }
        a("bs", String.valueOf(intExtra3));
    }
}
