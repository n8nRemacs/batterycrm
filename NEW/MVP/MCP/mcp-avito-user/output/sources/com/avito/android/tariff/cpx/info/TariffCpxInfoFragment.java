package com.avito.android.tariff.cpx.info;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff.cpx.info.TariffCpxInfoFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47312b;
import qK0.C47313c;
import wB0.C49483c;
import wB0.InterfaceC49481a;
import wB0.InterfaceC49482b;
import z1.AbstractC50339a;

/* compiled from: TariffCpxInfoFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/TariffCpxInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCpxInfoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f296232A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f296233B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.info.h f296234n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f296235o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f296236p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f296237q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f296238r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f296239s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f296240t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296241u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296242v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296243w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296244x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47312b f296245y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final GridLayoutManager f296246z0;

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpx/info/TariffCpxInfoFragment$a;", "", "<init>", "()V", "", "FULL_SIZE_SPAN_COUNT", "I", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/info/TariffCpxInfoFragment$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends GridLayoutManager.c {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int f(int i12) {
            com.avito.konveyor.adapter.d dVar = TariffCpxInfoFragment.this.f296238r0;
            if (dVar == null) {
                dVar = null;
            }
            TV0.a aVar = (TV0.a) C42745f0.K(i12, dVar.f53650c.f53994f);
            if (aVar instanceof com.avito.android.tariff.cpx.info.items.card.a) {
                return ((com.avito.android.tariff.cpx.info.items.card.a) aVar).f296431c;
            }
            return 2;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC49481a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49481a interfaceC49481a) {
            ((com.avito.android.tariff.cpx.info.g) this.receiver).accept(interfaceC49481a);
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC49482b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49482b interfaceC49482b) {
            InterfaceC49482b interfaceC49482b2 = interfaceC49482b;
            TariffCpxInfoFragment tariffCpxInfoFragment = (TariffCpxInfoFragment) this.receiver;
            a aVar = TariffCpxInfoFragment.f296232A0;
            tariffCpxInfoFragment.getClass();
            if (interfaceC49482b2 instanceof InterfaceC49482b.a) {
                ActivityC22955m activityC22955mL1 = tariffCpxInfoFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (interfaceC49482b2 instanceof InterfaceC49482b.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                ApiError apiError = ((InterfaceC49482b.c) interfaceC49482b2).f441320a;
                com.avito.android.component.toast.c.c(cVar, tariffCpxInfoFragment, com.avito.android.printable_text.b.f(apiError.getF244063c()), null, null, new f.c(apiError), 0, ToastBarPosition.f181046d, 942);
            } else if (interfaceC49482b2 instanceof InterfaceC49482b.C12812b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffCpxInfoFragment.f296240t0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC49482b.C12812b) interfaceC49482b2).f441319a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LwB0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LwB0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<C49483c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C49483c c49483c) {
            C49483c c49483c2 = c49483c;
            TariffCpxInfoFragment tariffCpxInfoFragment = TariffCpxInfoFragment.this;
            com.avito.konveyor.adapter.d dVar = tariffCpxInfoFragment.f296238r0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(c49483c2.f441323b, null);
            C47313c c47313c = tariffCpxInfoFragment.f296243w0;
            kotlin.reflect.n<Object>[] nVarArr = TariffCpxInfoFragment.f296233B0;
            kotlin.reflect.n<Object> nVar = nVarArr[2];
            ((SwipeRefreshLayout) c47313c.a()).setRefreshing(false);
            C47313c c47313c2 = tariffCpxInfoFragment.f296242v0;
            C47313c c47313c3 = tariffCpxInfoFragment.f296244x0;
            ApiError apiError = c49483c2.f441325d;
            if (apiError != null) {
                D6.w(tariffCpxInfoFragment.q5());
                kotlin.reflect.n<Object> nVar2 = nVarArr[3];
                D6.w((View) c47313c3.a());
                kotlin.reflect.n<Object> nVar3 = nVarArr[1];
                ((xZ.e) c47313c2.a()).d(z.k(apiError));
            } else if (c49483c2.f441326e) {
                D6.w(tariffCpxInfoFragment.q5());
                kotlin.reflect.n<Object> nVar4 = nVarArr[3];
                D6.H((View) c47313c3.a());
                kotlin.reflect.n<Object> nVar5 = nVarArr[1];
                ((xZ.e) c47313c2.a()).c();
            } else {
                D6.H(tariffCpxInfoFragment.q5());
                kotlin.reflect.n<Object> nVar6 = nVarArr[3];
                D6.w((View) c47313c3.a());
                kotlin.reflect.n<Object> nVar7 = nVarArr[1];
                ((xZ.e) c47313c2.a()).b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffCpxInfoFragment.f296232A0;
            TariffCpxInfoFragment.this.r5().accept(new InterfaceC49481a.b(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<DeepLink, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffCpxInfoFragment.f296232A0;
            TariffCpxInfoFragment.this.r5().accept(new InterfaceC49481a.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<String, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = TariffCpxInfoFragment.f296232A0;
            TariffCpxInfoFragment.this.r5().accept(new InterfaceC49481a.d(str));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<DeepLink, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffCpxInfoFragment.f296232A0;
            TariffCpxInfoFragment.this.r5().accept(new InterfaceC49481a.c(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f296253l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f296253l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f296253l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TariffCpxInfoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f296255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f296255l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f296255l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296256l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296256l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f296256l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296257l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296257l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f296257l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCpxInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/info/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.tariff.cpx.info.g> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.info.g invoke() {
            com.avito.android.tariff.cpx.info.h hVar = TariffCpxInfoFragment.this.f296234n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.tariff.cpx.info.g) hVar.get();
        }
    }

    static {
        Y y12 = new Y(TariffCpxInfoFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0);
        n0 n0Var = m0.f406844a;
        f296233B0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxInfoFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/mnz_common/ui/MnzProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxInfoFragment.class, "refreshLayout", "getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxInfoFragment.class, "shimmer", "getShimmer()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxInfoFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f296232A0 = new a(null);
    }

    public TariffCpxInfoFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f296235o0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.info.g.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f296241u0 = new C47313c(null, 1, null);
        this.f296242v0 = new C47313c(null, 1, null);
        this.f296243w0 = new C47313c(null, 1, null);
        this.f296244x0 = new C47313c(null, 1, null);
        this.f296245y0 = new C47312b(null, 1, null);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.f53667M = new b();
        this.f296246z0 = gridLayoutManager;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f296236p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.tariff_cpx_info_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tariff_cpx_info_recycler_view);
        kotlin.reflect.n<Object>[] nVarArr = f296233B0;
        kotlin.reflect.n<Object> nVar = nVarArr[4];
        this.f296245y0.b(this, recyclerView);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.tariff_cpx_info_toolbar);
        C47313c c47313c = this.f296241u0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        c47313c.b(this, toolbar);
        View viewFindViewById = view.findViewById(R.id.tariff_cpx_info_shimmer_layout);
        C47313c c47313c2 = this.f296244x0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[3];
        c47313c2.b(this, viewFindViewById);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.tariff_cpx_info_swipe_refresh_layout);
        C47313c c47313c3 = this.f296243w0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c3.b(this, swipeRefreshLayout);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.progress_placeholder);
        final int i12 = 0;
        xZ.e eVar = new xZ.e(viewGroup, new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.info.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffCpxInfoFragment f296355c;

            {
                this.f296355c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffCpxInfoFragment tariffCpxInfoFragment = this.f296355c;
                switch (i12) {
                    case 0:
                        TariffCpxInfoFragment.a aVar = TariffCpxInfoFragment.f296232A0;
                        tariffCpxInfoFragment.r5().accept(InterfaceC49481a.f.f441317a);
                        break;
                    default:
                        TariffCpxInfoFragment.a aVar2 = TariffCpxInfoFragment.f296232A0;
                        tariffCpxInfoFragment.r5().accept(InterfaceC49481a.C12811a.f441312a);
                        break;
                }
            }
        }, null, 4, null);
        C47313c c47313c4 = this.f296242v0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[1];
        c47313c4.b(this, eVar);
        kotlin.reflect.n<Object> nVar6 = nVarArr[0];
        Toolbar toolbar2 = (Toolbar) c47313c.a();
        final int i13 = 1;
        toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.info.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffCpxInfoFragment f296355c;

            {
                this.f296355c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffCpxInfoFragment tariffCpxInfoFragment = this.f296355c;
                switch (i13) {
                    case 0:
                        TariffCpxInfoFragment.a aVar = TariffCpxInfoFragment.f296232A0;
                        tariffCpxInfoFragment.r5().accept(InterfaceC49481a.f.f441317a);
                        break;
                    default:
                        TariffCpxInfoFragment.a aVar2 = TariffCpxInfoFragment.f296232A0;
                        tariffCpxInfoFragment.r5().accept(InterfaceC49481a.C12811a.f441312a);
                        break;
                }
            }
        });
        RecyclerView recyclerViewQ5 = q5();
        com.avito.konveyor.adapter.d dVar = this.f296238r0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerViewQ5.setAdapter(dVar);
        q5().setLayoutManager(this.f296246z0);
        RecyclerView recyclerViewQ52 = q5();
        com.avito.konveyor.a aVar = this.f296237q0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerViewQ52.l(new com.avito.android.tariff.cpx.info.items.a(aVar), -1);
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        ((SwipeRefreshLayout) c47313c3.a()).setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 2));
        C22960s.b(this, "SF_TERMS_DIALOG_REQUEST_KEY", new com.avito.android.tariff.cpx.info.c(new c(1, r5(), com.avito.android.tariff.cpx.info.g.class, "accept", "accept(Ljava/lang/Object;)V", 0)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f296236p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, r5(), new d(1, this, TariffCpxInfoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoOneTimeEvent;)V", 0), new e());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f296236p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff.cpx.info.di.a.a().a(s.c(this), (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), new f(), new g(), new h(), new i()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f296236p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final RecyclerView q5() {
        kotlin.reflect.n<Object> nVar = f296233B0[4];
        return (RecyclerView) this.f296245y0.a();
    }

    public final com.avito.android.tariff.cpx.info.g r5() {
        return (com.avito.android.tariff.cpx.info.g) this.f296235o0.getValue();
    }
}
