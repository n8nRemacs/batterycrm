package com.avito.android.iac_dialer.impl_module.device_status.gsm;

import Y61.k;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import org.webrtc.MediaStreamTrack;

/* compiled from: IacGsmCallStateProviderImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/gsm/b;", "LPK/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements PK.a {

    /* renamed from: f, reason: collision with root package name */
    public static com.avito.android.iac_dialer.impl_module.device_status.gsm.c f165970f;

    /* renamed from: g, reason: collision with root package name */
    public static com.avito.android.iac_dialer.impl_module.device_status.gsm.a f165971g;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f165972a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Z1<Boolean> f165973b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<Boolean> f165974c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165975d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165976e;

    /* compiled from: IacGsmCallStateProviderImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/gsm/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/media/AudioManager$OnModeChangedListener;", "onAudioModeChangeListener", "Landroid/media/AudioManager$OnModeChangedListener;", "Landroid/telephony/PhoneStateListener;", "phoneStateListener", "Landroid/telephony/PhoneStateListener;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacGsmCallStateProviderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/AudioManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.device_status.gsm.b$b, reason: collision with other inner class name */
    public static final class C4919b extends N implements Y41.a<AudioManager> {
        public C4919b() {
            super(0);
        }

        @Override // Y41.a
        public final AudioManager invoke() {
            return (AudioManager) b.this.f165972a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
    }

    /* compiled from: IacGsmCallStateProviderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/telephony/TelephonyManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<TelephonyManager> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final TelephonyManager invoke() {
            return (TelephonyManager) b.this.f165972a.getSystemService("phone");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k Context context) {
        this.f165972a = context;
        Boolean bool = Boolean.FALSE;
        this.f165973b = p2.a(bool);
        this.f165974c = com.jakewharton.rxrelay3.b.N0(bool).M0();
        this.f165975d = C42727D.c(new c());
        this.f165976e = C42727D.c(new C4919b());
        new Handler(Looper.getMainLooper()).post(new com.avito.android.app.coldstart.d(this, 28));
    }

    @Override // PK.a
    public final z a() {
        return this.f165974c;
    }

    @Override // PK.a
    public final n2 b() {
        return this.f165973b;
    }

    @Override // PK.a
    public final boolean c() {
        return this.f165973b.getValue().booleanValue();
    }

    public final void d(boolean z12) {
        Z1<Boolean> z13 = this.f165973b;
        if (z12 != z13.getValue().booleanValue()) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacGsmCallStateProviderImpl", "New GSM call state: isBusy=" + z12, null);
            z13.setValue(Boolean.valueOf(z12));
            this.f165974c.accept(Boolean.valueOf(z12));
        }
    }
}
