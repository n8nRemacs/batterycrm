package R3;

import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import kotlin.Metadata;

/* compiled from: BatterySaveModeProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR3/b;", "LR3/a;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements R3.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14085a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PowerManager f14086b;

    /* compiled from: BatterySaveModeProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"R3/b$a", "Landroid/content/BroadcastReceiver;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@k Context context, @l Intent intent) {
            b bVar = b.this;
            PowerManager powerManager = bVar.f14086b;
            bVar.f14085a = powerManager != null ? powerManager.isPowerSaveMode() : false;
        }
    }

    public b(@k Context context) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        this.f14086b = powerManager;
        a aVar = new a();
        this.f14085a = powerManager != null ? powerManager.isPowerSaveMode() : false;
        context.registerReceiver(aVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
    }

    @Override // R3.a
    /* renamed from: a, reason: from getter */
    public final boolean getF14085a() {
        return this.f14085a;
    }
}
