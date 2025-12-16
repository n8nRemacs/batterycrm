package com.avito.android.iac_dialer.impl_module.device_status.connection_status;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: IacConnectionStatusProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/b;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer.impl_module.device_status.connection_status.a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f165939j = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.device_status.power_status.a f165940a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f165941b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f165942c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.app_foreground_provider.util_module.a f165943d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BL.a f165944e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165945f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165946g = C42727D.c(new c());

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AtomicBoolean f165947h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    @l
    public N0 f165948i;

    /* compiled from: IacConnectionStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/b$a;", "", "<init>", "()V", "", "IN_CALL_CHECK_PERIOD_MILLIS", "J", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacConnectionStatusProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/net/ConnectivityManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.device_status.connection_status.b$b, reason: collision with other inner class name */
    public static final class C4918b extends N implements Y41.a<ConnectivityManager> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f165949l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4918b(Context context) {
            super(0);
            this.f165949l = context;
        }

        @Override // Y41.a
        public final ConnectivityManager invoke() {
            return (ConnectivityManager) this.f165949l.getApplicationContext().getSystemService("connectivity");
        }
    }

    /* compiled from: IacConnectionStatusProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Z1<IacConnectionStatus>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<IacConnectionStatus> invoke() {
            return p2.a(b.this.getStatus());
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k Context context, @k com.avito.android.iac_dialer.impl_module.device_status.power_status.a aVar, @k R0 r02, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.app_foreground_provider.util_module.a aVar2, @k BL.a aVar3) {
        this.f165940a = aVar;
        this.f165941b = r02;
        this.f165942c = interfaceC35745a5;
        this.f165943d = aVar2;
        this.f165944e = aVar3;
        this.f165945f = C42727D.c(new C4918b(context));
    }

    public static final void b(b bVar, IacConnectionStatus iacConnectionStatus) {
        if (L.f(((Z1) bVar.f165946g.getValue()).getValue(), iacConnectionStatus)) {
            return;
        }
        ((Z1) bVar.f165946g.getValue()).setValue(iacConnectionStatus);
    }

    public static IacConnectionStatus c(Network network, NetworkCapabilities networkCapabilities) {
        try {
            if (networkCapabilities == null) {
                return IacConnectionStatus.NoCapabilitiesInActiveNetwork.INSTANCE;
            }
            return new IacConnectionStatus.Known(networkCapabilities.hasTransport(4), networkCapabilities.hasTransport(0) ? IacConnectionStatus.Transport.CELLULAR : networkCapabilities.hasTransport(1) ? IacConnectionStatus.Transport.WIFI : IacConnectionStatus.Transport.UNKNOWN);
        } catch (Exception e12) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacConnectionStatusProvider", "Unexpected exception during connection status acquiring", e12);
            return IacConnectionStatus.Error.INSTANCE;
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.device_status.connection_status.a
    @k
    public final Z1 a() {
        if (!this.f165947h.getAndSet(true)) {
            ((ConnectivityManager) this.f165945f.getValue()).registerDefaultNetworkCallback(new com.avito.android.iac_dialer.impl_module.device_status.connection_status.c(this));
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            C43238h c43238hA = U.a(emptyCoroutineContext);
            R0 r02 = this.f165941b;
            C43259k.d(c43238hA, r02.a(), null, new d(this, null), 2);
            C43259k.d(U.a(emptyCoroutineContext), r02.a(), null, new e(this, null), 2);
            io.reactivex.rxjava3.internal.operators.observable.L f168152e = this.f165944e.getF168152e();
            InterfaceC35745a5 interfaceC35745a5 = this.f165942c;
            f168152e.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.a()).d0(f.f165958b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new h(this));
        }
        return (Z1) this.f165946g.getValue();
    }

    @Override // com.avito.android.iac_dialer.impl_module.device_status.connection_status.a
    @k
    public final IacConnectionStatus getStatus() {
        InterfaceC42726C interfaceC42726C = this.f165945f;
        try {
            Network activeNetwork = ((ConnectivityManager) interfaceC42726C.getValue()).getActiveNetwork();
            return activeNetwork == null ? IacConnectionStatus.NoActiveNetwork.INSTANCE : c(activeNetwork, ((ConnectivityManager) interfaceC42726C.getValue()).getNetworkCapabilities(activeNetwork));
        } catch (Exception unused) {
            return IacConnectionStatus.Error.INSTANCE;
        }
    }
}
