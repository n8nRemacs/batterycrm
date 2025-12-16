package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.os.Build;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacVibrationPlayer.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/s;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/k;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class s implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<l> f165902a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<n> f165903b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<p> f165904c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f165905d = C42727D.c(new a());

    /* compiled from: IacVibrationPlayer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<k> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final k invoke() {
            int i12 = Build.VERSION.SDK_INT;
            s sVar = s.this;
            return i12 >= 33 ? sVar.f165904c.get() : i12 >= 31 ? sVar.f165903b.get() : sVar.f165902a.get();
        }
    }

    @Inject
    public s(@Y61.k h31.e<l> eVar, @Y61.k h31.e<n> eVar2, @Y61.k h31.e<p> eVar3) {
        this.f165902a = eVar;
        this.f165903b = eVar2;
        this.f165904c = eVar3;
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void a() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(c().getName(), "start one short vibration", null);
        c().a();
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void b() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(c().getName(), "start ringing vibration", null);
        c().b();
    }

    public final k c() {
        return (k) this.f165905d.getValue();
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    @Y61.k
    public final String getName() {
        return "IacVibrationPlayerSplitter";
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void stop() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(c().getName(), "Stop vibration", null);
        c().stop();
    }
}
