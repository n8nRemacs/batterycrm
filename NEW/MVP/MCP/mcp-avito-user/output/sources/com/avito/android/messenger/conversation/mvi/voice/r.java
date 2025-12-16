package com.avito.android.messenger.conversation.mvi.voice;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.avito.android.util.X2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldRegisterListener", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SensorManager f195192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32306a f195193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sensor f195194d;

    public r(SensorManager sensorManager, C32306a c32306a, Sensor sensor) {
        this.f195192b = sensorManager;
        this.f195193c = c32306a;
        this.f195194d = sensor;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C32306a c32306a = this.f195193c;
        if (zBooleanValue) {
            SensorManager sensorManager = this.f195192b;
            sensorManager.registerListener(c32306a, this.f195194d, 3);
            X2.f318778a.c("LegacyVoicePlayerPresenterImpl", "ProximitySensorEventListening: got shouldRegisterListener = true => registered proximity sensor events listener", null);
            c32306a.f195119f0.set(new C32322q(sensorManager, c32306a));
            return;
        }
        Y41.a<G0> aVar = c32306a.f195119f0.get();
        if (aVar != null) {
            aVar.invoke();
        }
        c32306a.f195119f0.set(null);
    }
}
