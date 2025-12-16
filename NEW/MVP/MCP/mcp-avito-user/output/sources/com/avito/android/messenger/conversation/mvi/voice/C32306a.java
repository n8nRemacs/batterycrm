package com.avito.android.messenger.conversation.mvi.voice;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.media3.common.AbstractC23093g;
import androidx.media3.common.B;
import androidx.media3.common.C23091e;
import androidx.media3.common.H;
import androidx.media3.common.z;
import androidx.media3.exoplayer.InterfaceC23144m;
import androidx.view.InterfaceC22983P;
import androidx.view.M0;
import com.avito.android.C30277e1;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.voice.r0;
import com.avito.android.messenger.di.F0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.X2;
import com.avito.android.util.rx3.C35896f0;
import dZ.C39685c;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/a;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/messenger/conversation/mvi/voice/Q;", "Landroid/hardware/SensorEventListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32306a extends M0 implements Q, SensorEventListener {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Application f195096E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195097J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f195098K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f195099L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final String f195100M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public InterfaceC23144m f195101N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<r0> f195102O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<r0> f195103P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195104Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195105R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f195106S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f195107T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f195108U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f195109V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f195110W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f195111X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23091e f195112Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23091e f195113Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final PowerManager.WakeLock f195114a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f195115b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f195116c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Integer> f195117d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Float> f195118e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Y41.a<G0>> f195119f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C5763a f195120g0;

    /* compiled from: LegacyVoicePlayerPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/conversation/mvi/voice/a$a", "Landroidx/media3/common/H$g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.voice.a$a, reason: collision with other inner class name */
    public static final class C5763a implements H.g {
        public C5763a() {
        }

        @Override // androidx.media3.common.H.g
        public final void onIsPlayingChanged(boolean z12) {
            Boolean boolValueOf = Boolean.valueOf(z12);
            C32306a c32306a = C32306a.this;
            InterfaceC23144m interfaceC23144m = c32306a.f195101N;
            C32306a.ke(c32306a, boolValueOf, interfaceC23144m != null ? Integer.valueOf(interfaceC23144m.getPlaybackState()) : null);
        }

        @Override // androidx.media3.common.H.g
        public final void onPlaybackStateChanged(int i12) {
            C32306a c32306a = C32306a.this;
            androidx.media3.common.H h12 = c32306a.f195101N;
            C32306a.ke(c32306a, h12 != null ? Boolean.valueOf(((AbstractC23093g) h12).k()) : null, Integer.valueOf(i12));
        }
    }

    @Inject
    public C32306a(@Y61.k Application application, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k P p12, @Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC32024m interfaceC32024m, @F0 @Y61.k String str, @Y61.k C30277e1 c30277e1) {
        this.f195096E = application;
        this.f195097J = interfaceC35745a5;
        this.f195098K = w0Var;
        this.f195099L = interfaceC32024m;
        this.f195100M = str;
        com.jakewharton.rxrelay3.b<r0> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f195102O = bVar;
        com.jakewharton.rxrelay3.b<r0> bVar2 = new com.jakewharton.rxrelay3.b<>();
        this.f195103P = bVar2;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f195104Q = cVar;
        this.f195105R = new io.reactivex.rxjava3.disposables.c();
        this.f195106S = bVar2;
        this.f195107T = new AtomicBoolean(false);
        this.f195108U = new AtomicBoolean(false);
        boolean zBooleanValue = c30277e1.x().invoke().booleanValue();
        this.f195109V = zBooleanValue;
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar = nVarArr[46];
        boolean zBooleanValue2 = ((Boolean) c30277e1.f144985T.a().invoke()).booleanValue();
        this.f195110W = zBooleanValue2;
        kotlin.reflect.n<Object> nVar2 = nVarArr[50];
        boolean zBooleanValue3 = ((Boolean) c30277e1.f144993X.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar3 = nVarArr[49];
        this.f195111X = ((Boolean) c30277e1.f144991W.a().invoke()).booleanValue();
        C23091e.C1816e c1816e = new C23091e.C1816e();
        c1816e.f47660c = 2;
        c1816e.f47658a = 1;
        this.f195112Y = c1816e.a();
        C23091e.C1816e c1816e2 = new C23091e.C1816e();
        c1816e2.f47660c = 1;
        c1816e2.f47658a = 1;
        this.f195113Z = c1816e2.a();
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) application.getSystemService("power")).newWakeLock(32, "LegacyVoicePlayerPresenterImpl:ProximityWakeLock");
        wakeLockNewWakeLock.setReferenceCounted(false);
        this.f195114a0 = wakeLockNewWakeLock;
        Boolean bool = Boolean.FALSE;
        this.f195115b0 = com.jakewharton.rxrelay3.b.N0(bool);
        this.f195116c0 = com.jakewharton.rxrelay3.b.N0(bool);
        this.f195117d0 = com.jakewharton.rxrelay3.b.N0(3);
        this.f195118e0 = com.jakewharton.rxrelay3.b.N0(Float.valueOf(Float.MAX_VALUE));
        this.f195119f0 = new AtomicReference<>(null);
        this.f195120g0 = new C5763a();
        if (zBooleanValue) {
            cVar.b(new io.reactivex.rxjava3.internal.operators.observable.Z(p12.f195086a.j0(interfaceC35745a5.e()), new C32325u(this)).u());
            if (zBooleanValue3) {
                cVar.b(new io.reactivex.rxjava3.internal.operators.observable.Z(io.reactivex.rxjava3.core.z.g0(w0Var.g().q0(1L).D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(C32308c.f195146b), C35896f0.e(bVar, C32309d.f195148l).y0(new C32312g(this))).x0(interfaceC35745a5.a()).j0(io.reactivex.rxjava3.android.schedulers.b.b()), new C32307b(this)).u());
            }
            if (zBooleanValue2) {
                try {
                    SensorManager sensorManager = (SensorManager) application.getSystemService("sensor");
                    Sensor defaultSensor = sensorManager.getDefaultSensor(8);
                    if (defaultSensor == null) {
                        X2.f318778a.j("LegacyVoicePlayerPresenterImpl", "Failed to setup proximity monitoring. Cause sensor was null", null);
                    } else {
                        float maximumRange = defaultSensor.getMaximumRange();
                        if (maximumRange > 0.0f) {
                            hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a());
                            cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
                            ne(maximumRange, cVar2);
                            pe(sensorManager, defaultSensor, cVar2);
                            oe(cVar2);
                        }
                    }
                } catch (Throwable th2) {
                    X2.f318778a.a("LegacyVoicePlayerPresenterImpl", "Failed to setup proximity monitoring", th2);
                }
            }
        }
    }

    public static final void ke(C32306a c32306a, Boolean bool, Integer num) {
        String str;
        androidx.media3.common.z zVarB;
        androidx.media3.common.B b12;
        androidx.media3.common.H h12 = c32306a.f195101N;
        if (h12 != null) {
            androidx.media3.common.z zVarB2 = ((AbstractC23093g) h12).B();
            str = zVarB2 != null ? zVarB2.f47978b : null;
        } else {
            str = null;
        }
        androidx.media3.common.H h13 = c32306a.f195101N;
        Bundle bundle = (h13 == null || (zVarB = ((AbstractC23093g) h13).B()) == null || (b12 = zVarB.f47981e) == null) ? null : b12.f47153I;
        String string = bundle != null ? bundle.getString("localId") : null;
        String string2 = bundle != null ? bundle.getString("channelId") : null;
        MessengerUserHashInfo messengerUserHashInfo = bundle != null ? (MessengerUserHashInfo) O.a().a(new C39685c(bundle)) : null;
        com.jakewharton.rxrelay3.b<r0> bVar = c32306a.f195102O;
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 1)) {
            bVar.accept(r0.c.f195202a);
            return;
        }
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE) && str != null) {
            bVar.accept(new r0.b(str, c32306a.qe(), string, string2, messengerUserHashInfo));
        } else {
            if (!kotlin.jvm.internal.L.f(bool, Boolean.FALSE) || str == null) {
                return;
            }
            bVar.accept(new r0.a(str, c32306a.qe()));
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.Q
    @Y61.k
    public final io.reactivex.rxjava3.core.z<r0> M0() {
        return this.f195106S;
    }

    public final androidx.media3.common.z le(String str, Uri uri, LocalMessage localMessage) {
        Bundle bundle = new Bundle();
        bundle.putString("localId", localMessage.getLocalId());
        bundle.putString("channelId", localMessage.getChannelId());
        O.a().b(new dZ.e(bundle), com.avito.android.messenger.util.i.c(localMessage));
        B.b bVar = new B.b();
        bVar.f47186a = this.f195100M;
        bVar.f47185G = bundle;
        androidx.media3.common.B bA2 = bVar.a();
        z.c cVar = new z.c();
        cVar.f47998k = bA2;
        cVar.f47989b = uri;
        cVar.f47988a = str;
        return cVar.a();
    }

    public final void me() {
        PowerManager.WakeLock wakeLock = this.f195114a0;
        if (wakeLock.isHeld()) {
            wakeLock.release();
            X2.f318778a.c("LegacyVoicePlayerPresenterImpl", "proximityWakeLock released", null);
        }
    }

    public final void ne(float f12, hu.akarnokd.rxjava3.schedulers.c cVar) {
        I0 i0J0 = this.f195115b0.j0(cVar);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        io.reactivex.rxjava3.core.z<R> zVarY0 = i0J0.D(oVar).y0(new C32316k(this, cVar, f12));
        zVarY0.getClass();
        this.f195104Q.b(zVarY0.D(oVar).x0(cVar).j0(this.f195097J.e()).t0(new C32317l(this)));
    }

    public final void oe(hu.akarnokd.rxjava3.schedulers.c cVar) {
        this.f195104Q.b(this.f195102O.j0(cVar).d0(C32318m.f195176b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(C32319n.f195179b).x0(cVar).j0(this.f195097J.e()).t0(new C32320o(this)));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(@Y61.l Sensor sensor, int i12) {
        this.f195117d0.accept(Integer.valueOf(i12));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f195105R.e();
        InterfaceC23144m interfaceC23144m = this.f195101N;
        if (interfaceC23144m != null) {
            interfaceC23144m.E(this.f195120g0);
        }
        InterfaceC23144m interfaceC23144m2 = this.f195101N;
        if (interfaceC23144m2 != null) {
            interfaceC23144m2.release();
        }
        this.f195101N = null;
        me();
        this.f195104Q.e();
        if (this.f195110W) {
            AtomicReference<Y41.a<G0>> atomicReference = this.f195119f0;
            Y41.a<G0> aVar = atomicReference.get();
            if (aVar != null) {
                aVar.invoke();
            }
            atomicReference.set(null);
            me();
        }
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onPause(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f195116c0.accept(Boolean.FALSE);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f195116c0.accept(Boolean.TRUE);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(@Y61.k SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        Float fValueOf = fArr.length == 0 ? null : Float.valueOf(fArr[0]);
        if (fValueOf != null) {
            this.f195118e0.accept(Float.valueOf(fValueOf.floatValue()));
        }
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStart(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f195108U.set(true);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@Y61.k InterfaceC22983P interfaceC22983P) {
        InterfaceC23144m interfaceC23144m;
        this.f195108U.set(false);
        if (!this.f195109V || (interfaceC23144m = this.f195101N) == null) {
            return;
        }
        interfaceC23144m.pause();
    }

    public final void pe(SensorManager sensorManager, Sensor sensor, hu.akarnokd.rxjava3.schedulers.c cVar) {
        I0 i0J0 = this.f195115b0.j0(cVar);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        this.f195104Q.b(io.reactivex.rxjava3.core.z.k(i0J0.D(oVar), this.f195116c0.j0(cVar).D(oVar), new C32321p()).D(oVar).x0(cVar).j0(this.f195097J.e()).t0(new r(sensorManager, this, sensor)));
    }

    public final M qe() {
        InterfaceC23144m interfaceC23144m = this.f195101N;
        if (interfaceC23144m == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(interfaceC23144m.getDuration());
        if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        InterfaceC23144m interfaceC23144m2 = this.f195101N;
        if (interfaceC23144m2 == null) {
            return null;
        }
        Long lValueOf2 = Long.valueOf(interfaceC23144m2.getCurrentPosition());
        if (lValueOf2.longValue() == -9223372036854775807L) {
            lValueOf2 = null;
        }
        if (lValueOf2 == null) {
            return null;
        }
        long jLongValue2 = lValueOf2.longValue();
        if (jLongValue == 0 && this.f195111X) {
            return null;
        }
        int iG2 = 0;
        try {
            iG2 = kotlin.ranges.s.g((int) ((jLongValue2 / jLongValue) * 1000), 0, 1000);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return new M(jLongValue - jLongValue2, iG2);
    }
}
