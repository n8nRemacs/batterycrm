package com.avito.android.messenger.conversation.mvi.voice;

import android.app.Application;
import android.content.ComponentName;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.media3.common.B;
import androidx.media3.common.H;
import androidx.media3.common.z;
import androidx.media3.session.J;
import androidx.media3.session.P1;
import androidx.view.InterfaceC22983P;
import androidx.view.M0;
import com.avito.android.C30277e1;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.conversation.mvi.voice.r0;
import com.avito.android.messenger.di.w2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.ChatAvatar;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.PublicProfile;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.X2;
import com.google.common.util.concurrent.D0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: VoicePlayerPresenterImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/a0;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/messenger/conversation/mvi/voice/Q;", "Landroid/hardware/SensorEventListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a0 extends M0 implements Q, SensorEventListener {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195122E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final P f195123J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.f0 f195124K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final LY.b f195125L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final String f195126M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public androidx.media3.session.J f195127N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public D0<androidx.media3.session.J> f195128O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<r0> f195129P = new com.jakewharton.rxrelay3.b<>();

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<r0> f195130Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195131R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195132S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f195133T;

    /* renamed from: U, reason: collision with root package name */
    public final boolean f195134U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f195135V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final PowerManager.WakeLock f195136W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f195137X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f195138Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Integer> f195139Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Float> f195140a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Y41.a<G0>> f195141b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final a f195142c0;

    /* compiled from: VoicePlayerPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/conversation/mvi/voice/a0$a", "Landroidx/media3/common/H$g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements H.g {
        public a() {
        }

        @Override // androidx.media3.common.H.g
        public final void onIsPlayingChanged(boolean z12) {
            Boolean boolValueOf = Boolean.valueOf(z12);
            a0 a0Var = a0.this;
            androidx.media3.session.J j12 = a0Var.f195127N;
            a0.ke(a0Var, boolValueOf, j12 != null ? Integer.valueOf(j12.getPlaybackState()) : null);
        }

        @Override // androidx.media3.common.H.g
        public final void onPlaybackStateChanged(int i12) {
            a0 a0Var = a0.this;
            androidx.media3.session.J j12 = a0Var.f195127N;
            a0.ke(a0Var, j12 != null ? Boolean.valueOf(j12.k()) : null, Integer.valueOf(i12));
        }
    }

    @Inject
    public a0(@Y61.k Application application, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k P p12, @Y61.k com.avito.android.messenger.channels.mvi.data.f0 f0Var, @Y61.k LY.b bVar, @w2 @Y61.k String str, @Y61.k C30277e1 c30277e1) {
        this.f195122E = interfaceC35745a5;
        this.f195123J = p12;
        this.f195124K = f0Var;
        this.f195125L = bVar;
        this.f195126M = str;
        com.jakewharton.rxrelay3.b<r0> bVar2 = new com.jakewharton.rxrelay3.b<>();
        this.f195130Q = bVar2;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f195131R = cVar;
        this.f195132S = new io.reactivex.rxjava3.disposables.c();
        this.f195133T = bVar2;
        boolean zBooleanValue = c30277e1.x().invoke().booleanValue();
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar = nVarArr[46];
        boolean zBooleanValue2 = ((Boolean) c30277e1.f144985T.a().invoke()).booleanValue();
        this.f195134U = zBooleanValue2;
        kotlin.reflect.n<Object> nVar2 = nVarArr[49];
        this.f195135V = ((Boolean) c30277e1.f144991W.a().invoke()).booleanValue();
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) application.getSystemService("power")).newWakeLock(32, "VoicePlayerPresenter:ProximityWakeLock");
        wakeLockNewWakeLock.setReferenceCounted(false);
        this.f195136W = wakeLockNewWakeLock;
        Boolean bool = Boolean.FALSE;
        this.f195137X = com.jakewharton.rxrelay3.b.N0(bool);
        this.f195138Y = com.jakewharton.rxrelay3.b.N0(bool);
        this.f195139Z = com.jakewharton.rxrelay3.b.N0(3);
        this.f195140a0 = com.jakewharton.rxrelay3.b.N0(Float.valueOf(Float.MAX_VALUE));
        this.f195141b0 = new AtomicReference<>(null);
        this.f195142c0 = new a();
        if (zBooleanValue) {
            D0<androidx.media3.session.J> d0A = new J.a(application, new P1(application, new ComponentName(application, (Class<?>) com.avito.android.messenger.service.media_session.a.class))).a();
            this.f195128O = d0A;
            cVar.b(new C42006d(new androidx.camera.core.impl.utils.futures.e(d0A)).s(interfaceC35745a5.e()).o(new Y(this)).v(new com.avito.android.advert_core.task.a(10), Z.f195095b));
            if (zBooleanValue2) {
                try {
                    SensorManager sensorManager = (SensorManager) application.getSystemService("sensor");
                    Sensor defaultSensor = sensorManager.getDefaultSensor(8);
                    if (defaultSensor == null) {
                        X2.f318778a.j("VoicePlayerPresenter", "Failed to setup proximity monitoring. Cause sensor was null", null);
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
                    X2.f318778a.a("VoicePlayerPresenter", "Failed to setup proximity monitoring", th2);
                }
            }
        }
    }

    public static final void ke(a0 a0Var, Boolean bool, Integer num) {
        androidx.media3.common.z zVarB;
        androidx.media3.session.J j12 = a0Var.f195127N;
        String str = null;
        if (j12 != null && (zVarB = j12.B()) != null) {
            str = zVarB.f47978b;
        }
        String str2 = str;
        com.jakewharton.rxrelay3.b<r0> bVar = a0Var.f195129P;
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 1)) {
            bVar.accept(r0.c.f195202a);
            return;
        }
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE) && str2 != null) {
            bVar.accept(new r0.b(str2, a0Var.qe(), null, null, null, 28, null));
        } else {
            if (!kotlin.jvm.internal.L.f(bool, Boolean.FALSE) || str2 == null) {
                return;
            }
            bVar.accept(new r0.a(str2, a0Var.qe()));
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.Q
    @Y61.k
    public final io.reactivex.rxjava3.core.z<r0> M0() {
        return this.f195133T;
    }

    public final androidx.media3.common.z le(String str, Uri uri, LocalMessage localMessage, User user) {
        String name;
        Size size;
        PublicProfile publicProfile;
        ChatAvatar avatar;
        Image image;
        Bundle bundle = new Bundle();
        bundle.putString("localId", localMessage.getLocalId());
        bundle.putString("channelId", localMessage.getChannelId());
        O.a().b(new dZ.e(bundle), com.avito.android.messenger.util.i.c(localMessage));
        z.i.a aVar = new z.i.a();
        aVar.f48085a = uri;
        aVar.f48087c = bundle;
        z.i iVarA = aVar.a();
        B.b bVar = new B.b();
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        bVar.f47186a = String.format(this.f195126M, Arrays.copyOf(new Object[]{this.f195125L.a(Long.valueOf(MessengerTimestamp.INSTANCE.toMillis(localMessage.getCreated())))}, 1));
        Uri uri2 = null;
        Map<Size, Uri> variants = (user == null || (publicProfile = user.getPublicProfile()) == null || (avatar = publicProfile.getAvatar()) == null || (image = avatar.getImage()) == null) ? null : image.getVariants();
        if (variants != null && (size = (Size) C42745f0.G(C42745f0.B0(variants.keySet(), new T()))) != null) {
            uri2 = variants.get(size);
        }
        if (uri2 != null) {
            bVar.f47197l = uri2;
        }
        if (user != null && (name = user.getName()) != null) {
            bVar.f47187b = name;
        }
        androidx.media3.common.B bA2 = bVar.a();
        z.c cVar = new z.c();
        cVar.f47998k = bA2;
        cVar.f48000m = iVarA;
        cVar.f47988a = str;
        return cVar.a();
    }

    public final void me() {
        PowerManager.WakeLock wakeLock = this.f195136W;
        if (wakeLock.isHeld()) {
            wakeLock.release();
            X2.f318778a.c("VoicePlayerPresenter", "proximityWakeLock released", null);
        }
    }

    @j.S
    public final void ne(float f12, hu.akarnokd.rxjava3.schedulers.c cVar) {
        I0 i0J0 = this.f195137X.j0(cVar);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        io.reactivex.rxjava3.core.z<R> zVarY0 = i0J0.D(oVar).y0(new e0(this, cVar, f12));
        zVarY0.getClass();
        this.f195131R.b(zVarY0.D(oVar).x0(cVar).j0(this.f195122E.e()).t0(new f0(this)));
    }

    public final void oe(hu.akarnokd.rxjava3.schedulers.c cVar) {
        this.f195131R.b(this.f195129P.j0(cVar).d0(g0.f195159b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(h0.f195161b).x0(cVar).j0(this.f195122E.e()).t0(new i0(this)));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(@Y61.l Sensor sensor, int i12) {
        this.f195139Z.accept(Integer.valueOf(i12));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f195132S.e();
        androidx.media3.session.J j12 = this.f195127N;
        if (j12 != null) {
            j12.E(this.f195142c0);
        }
        androidx.media3.session.J j13 = this.f195127N;
        if (j13 != null) {
            j13.release();
        }
        this.f195127N = null;
        D0<androidx.media3.session.J> d02 = this.f195128O;
        if (d02 != null) {
            androidx.media3.session.J.Z(d02);
        }
        this.f195128O = null;
        me();
        this.f195131R.e();
        if (this.f195134U) {
            AtomicReference<Y41.a<G0>> atomicReference = this.f195141b0;
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
        this.f195138Y.accept(Boolean.FALSE);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f195138Y.accept(Boolean.TRUE);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(@Y61.k SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        Float fValueOf = fArr.length == 0 ? null : Float.valueOf(fArr[0]);
        if (fValueOf != null) {
            this.f195140a0.accept(Float.valueOf(fValueOf.floatValue()));
        }
    }

    public final void pe(SensorManager sensorManager, Sensor sensor, hu.akarnokd.rxjava3.schedulers.c cVar) {
        I0 i0J0 = this.f195137X.j0(cVar);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        this.f195131R.b(io.reactivex.rxjava3.core.z.k(i0J0.D(oVar), this.f195138Y.j0(cVar).D(oVar), new j0()).D(oVar).x0(cVar).j0(this.f195122E.e()).t0(new l0(sensorManager, this, sensor)));
    }

    public final M qe() {
        androidx.media3.session.J j12 = this.f195127N;
        if (j12 == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(j12.getDuration());
        if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        androidx.media3.session.J j13 = this.f195127N;
        if (j13 == null) {
            return null;
        }
        Long lValueOf2 = Long.valueOf(j13.getCurrentPosition());
        if (lValueOf2.longValue() == -9223372036854775807L) {
            lValueOf2 = null;
        }
        if (lValueOf2 == null) {
            return null;
        }
        long jLongValue2 = lValueOf2.longValue();
        if (jLongValue == 0 && this.f195135V) {
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
