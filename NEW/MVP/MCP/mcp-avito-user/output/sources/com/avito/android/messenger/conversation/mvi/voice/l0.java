package com.avito.android.messenger.conversation.mvi.voice;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.avito.android.util.X2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldRegisterListener", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SensorManager f195173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f195174c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sensor f195175d;

    public l0(SensorManager sensorManager, a0 a0Var, Sensor sensor) {
        this.f195173b = sensorManager;
        this.f195174c = a0Var;
        this.f195175d = sensor;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a0 a0Var = this.f195174c;
        if (!zBooleanValue) {
            Y41.a<G0> aVar = a0Var.f195141b0.get();
            if (aVar != null) {
                aVar.invoke();
            }
            a0Var.f195141b0.set(null);
            a0Var.me();
            G0 g02 = G0.f406611a;
            X2.f318778a.c("VoicePlayerPresenter", "ProximitySensorEventListening: got shouldRegisterListener = false => acquireProximityWakeLock()    ", null);
            return;
        }
        SensorManager sensorManager = this.f195173b;
        sensorManager.registerListener(a0Var, this.f195175d, 3);
        X2 x22 = X2.f318778a;
        x22.c("VoicePlayerPresenter", "ProximitySensorEventListening: got shouldRegisterListener = true => registered proximity sensor events listener", null);
        a0Var.f195141b0.set(new k0(sensorManager, a0Var));
        a0Var.f195136W.acquire();
        x22.c("VoicePlayerPresenter", "proximityWakeLock acquired", null);
        G0 g03 = G0.f406611a;
        x22.c("VoicePlayerPresenter", "ProximitySensorEventListening: got shouldRegisterListener = true => acquireProximityWakeLock()    ", null);
    }
}
