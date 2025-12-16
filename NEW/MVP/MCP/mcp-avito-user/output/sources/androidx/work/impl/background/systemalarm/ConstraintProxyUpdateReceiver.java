package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.G;
import androidx.work.impl.Y;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C23609t;
import j.N;
import j.P;

/* loaded from: classes10.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55599a = 0;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f55600b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f55601c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f55602d;

        public a(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
            this.f55600b = intent;
            this.f55601c = context;
            this.f55602d = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f55602d;
            Context context = this.f55601c;
            Intent intent = this.f55600b;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                G gA2 = G.a();
                int i12 = ConstraintProxyUpdateReceiver.f55599a;
                gA2.getClass();
                C23609t.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C23609t.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C23609t.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C23609t.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    static {
        G.b("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@N Context context, @P Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            Y.f(context).f55560e.b(new a(goAsync(), context, intent));
        } else {
            G.a().getClass();
        }
    }
}
