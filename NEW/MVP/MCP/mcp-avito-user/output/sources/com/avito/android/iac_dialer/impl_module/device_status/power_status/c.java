package com.avito.android.iac_dialer.impl_module.device_status.power_status;

import Y61.k;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kM.AbstractC42597a;
import kM.AbstractC42598b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.K;

/* compiled from: IacPowerStatusProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/c;", "Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class c implements com.avito.android.iac_dialer.impl_module.device_status.power_status.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f165986a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC42598b f165987b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC42597a f165988c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165989d = C42727D.c(new a());

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165990e = C42727D.c(new b());

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AtomicBoolean f165991f = new AtomicBoolean(false);

    /* compiled from: IacPowerStatusProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/PowerManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<PowerManager> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final PowerManager invoke() {
            return (PowerManager) c.this.f165986a.getSystemService("power");
        }
    }

    /* compiled from: IacPowerStatusProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Z1<IacPowerStatus>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<IacPowerStatus> invoke() {
            return p2.a(c.this.getStatus());
        }
    }

    @Inject
    public c(@k Context context, @k AbstractC42598b abstractC42598b, @k AbstractC42597a abstractC42597a) {
        this.f165986a = context;
        this.f165987b = abstractC42598b;
        this.f165988c = abstractC42597a;
    }

    @Override // com.avito.android.iac_dialer.impl_module.device_status.power_status.a
    @k
    public final Z1 a() {
        if (!this.f165991f.getAndSet(true)) {
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            C43259k.d(U.a(K.f411877a), null, null, new com.avito.android.iac_dialer.impl_module.device_status.power_status.b(this, null), 3);
        }
        return b();
    }

    public final Z1<IacPowerStatus> b() {
        return (Z1) this.f165990e.getValue();
    }

    @Override // com.avito.android.iac_dialer.impl_module.device_status.power_status.a
    @k
    public final IacPowerStatus getStatus() {
        InterfaceC42726C interfaceC42726C = this.f165989d;
        boolean zIsDeviceIdleMode = ((PowerManager) interfaceC42726C.getValue()).isDeviceIdleMode();
        int i12 = Build.VERSION.SDK_INT;
        return new IacPowerStatus(zIsDeviceIdleMode, i12 >= 33 ? ((PowerManager) interfaceC42726C.getValue()).isDeviceLightIdleMode() : false, ((PowerManager) interfaceC42726C.getValue()).isPowerSaveMode(), i12 >= 33 ? ((PowerManager) interfaceC42726C.getValue()).isLowPowerStandbyEnabled() : false, this.f165987b.b() == IacProblem.f169093f, this.f165988c.b() == IacProblem.f169094g);
    }
}
