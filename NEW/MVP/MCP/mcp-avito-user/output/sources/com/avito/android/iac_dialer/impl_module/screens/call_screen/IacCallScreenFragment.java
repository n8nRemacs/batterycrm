package com.avito.android.iac_dialer.impl_module.screens.call_screen;

import Y41.l;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import com.avito.android.ui.fragments.BaseFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import xK.InterfaceC49851a;
import xK.InterfaceC49852b;

/* compiled from: IacCallScreenFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "LOK/a;", "<init>", "()V", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacCallScreenFragment extends BaseFragment implements InterfaceC28477j.b, OK.a {

    /* renamed from: y0, reason: collision with root package name */
    @k
    public static final a f166225y0 = new a(null);

    /* renamed from: z0, reason: collision with root package name */
    @k
    public static final AtomicInteger f166226z0 = new AtomicInteger(0);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f166227n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer.impl_module.screens.call_screen.view.a f166228o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC49851a f166229p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.b f166230q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public z f166231r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f166232s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f166233t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f166234u0;

    /* renamed from: v0, reason: collision with root package name */
    public final int f166235v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final AtomicBoolean f166236w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final String f166237x0;

    /* compiled from: IacCallScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenFragment$a;", "", "<init>", "()V", "", "EXTRA_IAC_ARGUMENT", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacCallScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<IacCallScreenArgument> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final IacCallScreenArgument invoke() {
            Bundle arguments = IacCallScreenFragment.this.getArguments();
            if (arguments != null) {
                IacCallScreenArgument iacCallScreenArgument = (IacCallScreenArgument) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("iac_argument", IacCallScreenArgument.class) : arguments.getParcelable("iac_argument"));
                if (iacCallScreenArgument != null) {
                    return iacCallScreenArgument;
                }
            }
            return IacCallScreenArgument.EmptyArgument.INSTANCE;
        }
    }

    /* compiled from: IacCallScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<IacUICallScreenState.IdleModeContent.LaunchedAction, G0> {
        @Override // Y41.l
        public final G0 invoke(IacUICallScreenState.IdleModeContent.LaunchedAction launchedAction) {
            IacUICallScreenState.IdleModeContent.LaunchedAction launchedAction2 = launchedAction;
            IacCallScreenFragment iacCallScreenFragment = (IacCallScreenFragment) this.receiver;
            a aVar = IacCallScreenFragment.f166225y0;
            iacCallScreenFragment.getClass();
            if (launchedAction2 instanceof IacUICallScreenState.IdleModeContent.LaunchedAction.CloseCallScreenActivity) {
                ActivityC22955m activityC22955mL1 = iacCallScreenFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            } else if (launchedAction2 instanceof IacUICallScreenState.IdleModeContent.LaunchedAction.OpenLinkInCallScreenActivityTask) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = iacCallScreenFragment.f166232s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((IacUICallScreenState.IdleModeContent.LaunchedAction.OpenLinkInCallScreenActivityTask) launchedAction2).getLink().unwrap(), null, null, 6);
            }
            return G0.f406611a;
        }
    }

    public IacCallScreenFragment() {
        super(0, 1, null);
        this.f166233t0 = new io.reactivex.rxjava3.disposables.c();
        this.f166234u0 = C42727D.c(new b());
        int andIncrement = f166226z0.getAndIncrement();
        this.f166235v0 = andIncrement;
        this.f166236w0 = new AtomicBoolean(false);
        this.f166237x0 = AK.c.g(andIncrement, "IacCallScreenFragment_");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        String str = "onCreate: " + ((IacCallScreenArgument) this.f166234u0.getValue());
        String str2 = this.f166237x0;
        bVar.d(str2, str, null);
        InterfaceC49851a interfaceC49851a = this.f166229p0;
        (interfaceC49851a != null ? interfaceC49851a : null).a(new InterfaceC49852b.r(this.f166235v0), str2);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.iac_dialer.impl_module.screens.call_screen.view.a aVar = this.f166228o0;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.a(requireContext(), C22981N.a(getLifecycle()), new c(1, this, IacCallScreenFragment.class, "onIdleLaunchedAction", "onIdleLaunchedAction(Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction;)V", 0), "IacCallScreenUI_" + this.f166235v0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        String str = this.f166237x0;
        bVar.d(str, "onDestroy", null);
        com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.b bVar2 = this.f166230q0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.f166270d.e();
        InterfaceC49851a interfaceC49851a = this.f166229p0;
        (interfaceC49851a != null ? interfaceC49851a : null).a(new InterfaceC49852b.s(this.f166235v0), str);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f166236w0.getAndSet(true)) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d(this.f166237x0, "onResume: argument was already consumed", null);
        } else {
            y((IacCallScreenArgument) this.f166234u0.getValue(), "from framgent onResume()");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        String str = this.f166237x0;
        bVar.d(str, "onStart", null);
        InterfaceC49851a interfaceC49851a = this.f166229p0;
        if (interfaceC49851a == null) {
            interfaceC49851a = null;
        }
        z zVar = this.f166231r0;
        if (zVar == null) {
            zVar = null;
        }
        PermissionState permissionStateB = zVar.b("android.permission.RECORD_AUDIO");
        z zVar2 = this.f166231r0;
        if (zVar2 == null) {
            zVar2 = null;
        }
        interfaceC49851a.a(new InterfaceC49852b.t(this.f166235v0, permissionStateB, zVar2.b("android.permission.CAMERA")), str);
        ScreenPerformanceTracker screenPerformanceTracker = this.f166227n0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        String str = this.f166237x0;
        bVar.d(str, "onStop", null);
        InterfaceC49851a interfaceC49851a = this.f166229p0;
        (interfaceC49851a != null ? interfaceC49851a : null).a(new InterfaceC49852b.u(this.f166235v0), str);
        this.f166233t0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.iac_dialer.impl_module.screens.call_screen.a(this, null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.iac_dialer.impl_module.screens.call_screen.di.a.a().a(this, requireActivity(), getResources(), s.c(this), (com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f166227n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f166227n0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).e();
    }

    @Override // OK.a
    public final boolean u(@k Parcelable parcelable) {
        return parcelable instanceof IacCallScreenArgument;
    }

    @Override // OK.a
    public final void y(@k Parcelable parcelable, @k String str) {
        InterfaceC49852b.i.a aVar;
        String str2 = this.f166237x0;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d(str2, "handleArgument " + str + ": argument=" + parcelable, null);
        if (parcelable instanceof IacCallScreenArgument.Answer) {
            IacCallScreenArgument.Answer.From from = ((IacCallScreenArgument.Answer) parcelable).getFrom();
            if (L.f(from, IacCallScreenArgument.Answer.From.CallNotification.f166219c)) {
                aVar = InterfaceC49852b.i.a.C12861a.f442351a;
            } else {
                if (!L.f(from, IacCallScreenArgument.Answer.From.ReserveNotification.f166220c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = InterfaceC49852b.i.a.c.f442353a;
            }
            InterfaceC49851a interfaceC49851a = this.f166229p0;
            (interfaceC49851a != null ? interfaceC49851a : null).a(new InterfaceC49852b.i(aVar), str2);
            return;
        }
        if (parcelable instanceof IacCallScreenArgument.EmptyArgument) {
            InterfaceC49851a interfaceC49851a2 = this.f166229p0;
            (interfaceC49851a2 != null ? interfaceC49851a2 : null).a(InterfaceC49852b.p.f442362a, str2);
        } else if (parcelable instanceof IacCallScreenArgument.WithoutAction) {
            InterfaceC49851a interfaceC49851a3 = this.f166229p0;
            (interfaceC49851a3 != null ? interfaceC49851a3 : null).a(new InterfaceC49852b.q((IacCallScreenArgument.WithoutAction) parcelable), str2);
        } else if (parcelable instanceof IacCallScreenArgument.OpenAudioDeviceSettings) {
            InterfaceC49851a interfaceC49851a4 = this.f166229p0;
            (interfaceC49851a4 != null ? interfaceC49851a4 : null).a(new InterfaceC49852b.c(true), str2);
        }
    }
}
