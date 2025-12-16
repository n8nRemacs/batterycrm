package com.avito.android.messenger.conversation.mvi.voice;

import android.hardware.SensorManager;
import com.avito.android.util.X2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SensorManager f195170l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f195171m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(SensorManager sensorManager, a0 a0Var) {
        super(0);
        this.f195170l = sensorManager;
        this.f195171m = a0Var;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f195170l.unregisterListener(this.f195171m);
        G0 g02 = G0.f406611a;
        X2.f318778a.c("VoicePlayerPresenter", "ProximitySensorEventListening: got shouldRegisterListener = false => unregistered proximity sensor events listener", null);
        return G0.f406611a;
    }
}
