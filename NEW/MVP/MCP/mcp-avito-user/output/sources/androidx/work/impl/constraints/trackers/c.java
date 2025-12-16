package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import kotlin.Metadata;

/* compiled from: BatteryNotLowTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/c;", "Landroidx/work/impl/constraints/trackers/e;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class c extends e<Boolean> {
    @Override // androidx.work.impl.constraints.trackers.g
    public final Object a() {
        Intent intentRegisterReceiver = this.f55717b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            G gA2 = G.a();
            int i12 = d.f55712a;
            gA2.getClass();
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z12 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }

    @Override // androidx.work.impl.constraints.trackers.e
    @Y61.k
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final void f(@Y61.k Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        G gA2 = G.a();
        int i12 = d.f55712a;
        intent.getAction();
        gA2.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    b(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                b(Boolean.FALSE);
            }
        }
    }
}
