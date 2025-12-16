package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import Y61.k;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.provider.Settings;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: IacRingingModeProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/d;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements com.avito.android.iac_dialer.impl_module.audio.ringtone.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f165858a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PL.i f165859b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f165860c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.audio.ringtone.a f165861d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165862e = C42727D.c(new b());

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165863f = C42727D.c(new c());

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d dVar = d.this;
            dVar.a().setValue(dVar.getMode());
        }
    }

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            if (Build.VERSION.SDK_INT >= 31) {
                return Boolean.TRUE;
            }
            Object systemService = d.this.f165858a.getSystemService("vibrator");
            Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            boolean z12 = false;
            if (vibrator != null && vibrator.hasVibrator()) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Z1<IacRingingMode>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<IacRingingMode> invoke() {
            return p2.a(d.this.getMode());
        }
    }

    @Inject
    public d(@k Context context, @k PL.i iVar, @k i iVar2, @k com.avito.android.iac_dialer.impl_module.audio.ringtone.a aVar) {
        this.f165858a = context;
        this.f165859b = iVar;
        this.f165860c = iVar2;
        this.f165861d = aVar;
        z.g0(iVar2.f165875d, aVar.f165852e).t0(new a());
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.c
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Z1<IacRingingMode> a() {
        return (Z1) this.f165863f.getValue();
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.c
    @k
    public final IacRingingMode getMode() {
        int ringerMode = this.f165860c.f165876e.getRingerMode();
        int currentInterruptionFilter = ((NotificationManager) this.f165861d.f165849b.getValue()).getCurrentInterruptionFilter();
        boolean z12 = false;
        boolean z13 = (currentInterruptionFilter == 0 || currentInterruptionFilter == 1) ? false : true;
        boolean z14 = ringerMode == 2 && !z13;
        h.a("shouldRinging", new Q[]{new Q("ringerMode", h.b(ringerMode)), new Q("isDndModeEnabled", Boolean.valueOf(z13))}, Boolean.valueOf(z14));
        if (((Boolean) this.f165862e.getValue()).booleanValue()) {
            Context context = this.f165858a;
            if (androidx.core.content.d.checkSelfPermission(context, "android.permission.VIBRATE") == 0) {
                boolean z15 = Settings.System.getInt(context.getContentResolver(), "vibrate_when_ringing", 0) == 1;
                Boolean boolA = this.f165859b.a();
                Boolean bool = Boolean.TRUE;
                if (L.f(boolA, bool)) {
                    boolean z16 = Settings.System.getInt(context.getContentResolver(), "vibrate_in_silent", 0) == 1;
                    boolean z17 = z13 ? z16 : z15;
                    h.a("shouldVibrate", new Q[]{new Q("isMiui", bool), new Q("isDndModeEnabled", Boolean.valueOf(z13)), new Q("vibrateInSilent", Boolean.valueOf(z16)), new Q("vibrateWhenRinging", Boolean.valueOf(z15))}, Boolean.valueOf(z17));
                    z15 = z17;
                } else {
                    if (ringerMode == 0) {
                        h.a("shouldVibrate", new Q[]{new Q("ringerMode", h.b(ringerMode))}, Boolean.FALSE);
                    } else if (ringerMode == 1) {
                        h.a("shouldVibrate", new Q[]{new Q("ringerMode", h.b(ringerMode))}, bool);
                        z15 = true;
                    } else if (ringerMode != 2) {
                        h.a("shouldVibrate", new Q[]{new Q("ringerMode", h.b(ringerMode))}, Boolean.FALSE);
                    } else {
                        h.a("shouldVibrate", new Q[]{new Q("ringerMode", h.b(ringerMode)), new Q("vibrateWhenRinging", Boolean.valueOf(z15))}, Boolean.valueOf(z15));
                    }
                    z15 = false;
                }
                if (z15) {
                    z12 = true;
                }
            }
        }
        IacRingingMode iacRingingMode = (z12 && z14) ? IacRingingMode.RINGTONE_AND_VIBRATION : z12 ? IacRingingMode.ONLY_VIBRATION : z14 ? IacRingingMode.ONLY_RINGTONE : IacRingingMode.SILENCE;
        h.a("getMode", new Q[]{new Q("ringtone", Boolean.valueOf(z14)), new Q("vibrate", Boolean.valueOf(z12))}, iacRingingMode);
        return iacRingingMode;
    }
}
