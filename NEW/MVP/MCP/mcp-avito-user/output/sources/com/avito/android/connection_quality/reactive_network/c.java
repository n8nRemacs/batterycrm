package com.avito.android.connection_quality.reactive_network;

import Y61.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.avito.android.connection_quality.reactive_network.a;
import com.avito.android.connection_quality.reactive_network.b;
import kotlin.Metadata;

/* compiled from: MarshmallowNetworkObservingStrategy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/connection_quality/reactive_network/c;", "Landroid/content/BroadcastReceiver;", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f125727a;

    public c(b bVar) {
        this.f125727a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@k Context context, @k Intent intent) {
        b.a aVar = b.f125721d;
        b bVar = this.f125727a;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean zIsIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
        if (!powerManager.isDeviceIdleMode() || zIsIgnoringBatteryOptimizations) {
            a.f125715f.getClass();
            bVar.c(a.C3733a.a(context));
        } else {
            a.f125715f.getClass();
            bVar.c(new a(null, null, 0, null, null, 31, null));
        }
    }
}
