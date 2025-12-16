package com.avito.android.messenger.channels.mvi.view;

import Cd.C13243a;
import HY.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.ui.fragment.g;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.analytics.C31658n;
import com.avito.android.messenger.channels.mvi.di.C31748p;
import com.avito.android.messenger.channels.mvi.list_feature.o1;
import com.avito.android.messenger.channels.mvi.list_feature.p1;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import y30.InterfaceC50050d;
import z1.AbstractC50339a;

/* compiled from: ChannelsListFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/ChannelsListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class ChannelsListFragment extends BaseFragment implements com.avito.android.bottom_navigation.ui.fragment.g, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f188628A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f188629n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.channels.analytics.d f188630o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public p1 f188631p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f188632q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f188633r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f188634s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C31748p f188635t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public C30277e1 f188636u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC50050d f188637v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public H f188638w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.avito.android.messenger.channels.a f188639x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188640y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f188641z0;

    /* compiled from: ChannelsListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/ChannelsListFragment$a;", "", "<init>", "()V", "", "KEY_ENABLE_UNREAD_FILTER", "Ljava/lang/String;", "KEY_FROM_PAGE", "KEY_MAIN_EXCLUDE_TAGS", "KEY_MAIN_INCLUDE_TAGS", "KEY_MERGED_EXCLUDE_TAGS", "KEY_MERGED_INCLUDE_TAGS", "KEY_PINNED_EXCLUDE_TAGS", "KEY_PINNED_INCLUDE_TAGS", "TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ChannelsListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/o1;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/messenger/channels/mvi/list_feature/o1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<o1> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final o1 invoke() {
            p1 p1Var = ChannelsListFragment.this.f188631p0;
            if (p1Var == null) {
                p1Var = null;
            }
            return (o1) p1Var.get();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f188643l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f188643l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f188643l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ChannelsListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f188645l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f188645l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f188645l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f188646l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f188646l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f188646l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f188647l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f188647l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f188647l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public ChannelsListFragment() {
        super(0, 1, null);
        c cVar = new c(new b());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f188632q0 = new O0(m0.f406844a.b(o1.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f188640y0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        H h12 = this.f188638w0;
        if (h12 != null) {
            h12.K3();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            InterfaceC50050d interfaceC50050d = this.f188637v0;
            if (interfaceC50050d == null) {
                interfaceC50050d = null;
            }
            interfaceC50050d.b(m0.f406844a.b(NotificationOpenAtTab.Messenger.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.messenger_channels_list, viewGroup, false);
        ((FrameLayout) viewGroup2.findViewById(R.id.content_holder)).setForeground(null);
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && !activityC22955mL1.isChangingConfigurations()) {
            com.avito.android.lib.design.toast_bar.k kVar = this.f188641z0;
            if (kVar != null) {
                kVar.f();
            }
            this.f188641z0 = null;
        }
        H h12 = this.f188638w0;
        if (h12 != null) {
            h12.f188684w.b();
            h12.f188663b.post(new L(h12));
            com.avito.android.lib.design.bottom_sheet.o oVar = h12.f188680s;
            if (oVar != null) {
                N0.a(oVar);
            }
            h12.f188669h.setAdapter(null);
            getLifecycle().c(h12);
        }
        this.f188638w0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f188634s0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("ChannelsListFragment");
        this.f188640y0.e();
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC28373a interfaceC28373a = this.f188629n0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new C31658n());
        InterfaceC32572u interfaceC32572u = this.f188634s0;
        (interfaceC32572u != null ? interfaceC32572u : null).a("ChannelsListFragment");
        q5().accept(c.e.f.f7170a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((g.a) getParentFragment()).B4(this);
        q5().accept(c.e.C0415e.f7169a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        InterfaceC28373a interfaceC28373a = this.f188629n0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.android.messenger.channels.analytics.d dVar = this.f188630o0;
        com.avito.android.messenger.channels.analytics.d dVar2 = dVar != null ? dVar : null;
        com.avito.konveyor.adapter.d dVar3 = this.f188633r0;
        com.avito.konveyor.adapter.d dVar4 = dVar3 != null ? dVar3 : null;
        C31748p c31748p = this.f188635t0;
        C31748p c31748p2 = c31748p != null ? c31748p : null;
        C30277e1 c30277e1 = this.f188636u0;
        if (c30277e1 == null) {
            c30277e1 = null;
        }
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[84];
        H h12 = new H(view, c31748p2, interfaceC28373a2, dVar2, dVar4, ((Boolean) c30277e1.f144956E0.a().invoke()).booleanValue());
        this.f188638w0 = h12;
        getLifecycle().a(h12);
        H h13 = this.f188638w0;
        if (h13 != null) {
            o1 o1VarQ5 = q5();
            C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new C31889s(o1VarQ5, this, h13, null), 3);
            h13.f188657E = new C31890t(o1VarQ5);
            h13.f188658F = new C31891u(o1VarQ5);
            h13.f188659G = new C31892v(o1VarQ5);
            h13.f188660H = new C31893w(o1VarQ5);
            h13.f188661I = new C31894x(o1VarQ5);
        }
        super.onViewCreated(view, bundle);
        com.avito.android.messenger.channels.analytics.d dVar5 = this.f188630o0;
        (dVar5 != null ? dVar5 : null).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    @Override // com.avito.android.ui.fragments.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p5(@Y61.l android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.view.ChannelsListFragment.p5(android.os.Bundle):void");
    }

    public final o1 q5() {
        return (o1) this.f188632q0.getValue();
    }
}
