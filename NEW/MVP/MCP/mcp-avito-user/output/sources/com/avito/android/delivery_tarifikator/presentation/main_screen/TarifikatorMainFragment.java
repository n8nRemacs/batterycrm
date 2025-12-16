package com.avito.android.delivery_tarifikator.presentation.main_screen;

import Cd.C13243a;
import Qv.InterfaceC14937a;
import Sv.i;
import Tv.AbstractC15411b;
import Tv.C15410a;
import Tv.C15414e;
import Tv.InterfaceC15412c;
import Tv.InterfaceC15413d;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import androidx.view.y;
import com.akita.view.component.pull_to_refresh.PullToRefresh;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.delivery_tarifikator.analytics.DeliveryTarifikatorMainScreen;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.p;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.q;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: TarifikatorMainFragment.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/TarifikatorMainFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/deep_linking/links/w;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/d;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/e;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/regioninfo/d;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/e;", "<init>", "()V", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TarifikatorMainFragment extends BaseFragment implements InterfaceC28477j.b, w, com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.d, com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.e, com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo.d, com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f135523E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f135524F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.a f135525A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.a f135526B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.a f135527C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.b f135528D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f135529n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f135530o0;

    /* renamed from: p0, reason: collision with root package name */
    public ScreenPerformanceTracker f135531p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f135532q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135533r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135534s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135535t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135536u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47312b f135537v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f135538w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f135539x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final b f135540y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.a f135541z0;

    /* compiled from: TarifikatorMainFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/TarifikatorMainFragment$a;", "", "<init>", "()V", "", "TARIFIKATOR_MAIN_PARAMS_KEY", "Ljava/lang/String;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static TarifikatorMainFragment a(@Y61.k DeliveryTarifikatorParams deliveryTarifikatorParams) {
            TarifikatorMainFragment tarifikatorMainFragment = new TarifikatorMainFragment();
            C35966w1.a(tarifikatorMainFragment, 1, new com.avito.android.delivery_tarifikator.presentation.main_screen.c(deliveryTarifikatorParams));
            return tarifikatorMainFragment;
        }

        public a() {
        }
    }

    /* compiled from: TarifikatorMainFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/delivery_tarifikator/presentation/main_screen/TarifikatorMainFragment$b", "Landroidx/activity/x;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            TarifikatorMainFragment tarifikatorMainFragment = TarifikatorMainFragment.this;
            a aVar = TarifikatorMainFragment.f135523E0;
            tarifikatorMainFragment.r5().accept(InterfaceC15412c.f.f15989a);
        }
    }

    /* compiled from: TarifikatorMainFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTv/d;", "it", "Lkotlin/G0;", "invoke", "(LTv/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<InterfaceC15413d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f135543l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC15413d interfaceC15413d) {
            return G0.f406611a;
        }
    }

    /* compiled from: TarifikatorMainFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C15414e, G0> {
        public final void f(@Y61.k C15414e c15414e) {
            TarifikatorMainFragment tarifikatorMainFragment = (TarifikatorMainFragment) this.receiver;
            a aVar = TarifikatorMainFragment.f135523E0;
            C47313c c47313c = tarifikatorMainFragment.f135533r0;
            kotlin.reflect.n<Object>[] nVarArr = TarifikatorMainFragment.f135524F0;
            kotlin.reflect.n<Object> nVar = nVarArr[0];
            ((NavBar) c47313c.a()).setState(c15414e.f16013b);
            boolean zY2 = D6.y(tarifikatorMainFragment.q5());
            AbstractC15411b abstractC15411b = c15414e.f16014c;
            if (zY2 && !L.f(abstractC15411b, AbstractC15411b.c.f15983a)) {
                tarifikatorMainFragment.q5().d();
            }
            ShimmerLayout shimmerLayoutQ5 = tarifikatorMainFragment.q5();
            AbstractC15411b.c cVar = AbstractC15411b.c.f15983a;
            shimmerLayoutQ5.setVisibility(L.f(abstractC15411b, cVar) ? 0 : 8);
            C47313c c47313c2 = tarifikatorMainFragment.f135536u0;
            kotlin.reflect.n<Object> nVar2 = nVarArr[3];
            boolean z12 = abstractC15411b instanceof AbstractC15411b.a;
            ((PullToRefresh) c47313c2.a()).setVisibility(z12 ? 0 : 8);
            if (!z12) {
                boolean zF2 = L.f(abstractC15411b, AbstractC15411b.C1087b.f15982a);
                C47313c c47313c3 = tarifikatorMainFragment.f135535t0;
                if (zF2) {
                    kotlin.reflect.n<Object> nVar3 = nVarArr[2];
                    ((C42670a) c47313c3.a()).c(null, new com.avito.android.delivery_tarifikator.presentation.main_screen.g(tarifikatorMainFragment));
                    return;
                } else {
                    if (L.f(abstractC15411b, cVar)) {
                        tarifikatorMainFragment.q5().c();
                        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
                        ((C42670a) c47313c3.a()).b();
                        return;
                    }
                    return;
                }
            }
            kotlin.reflect.n<Object> nVar5 = nVarArr[3];
            AbstractC15411b.a aVar2 = (AbstractC15411b.a) abstractC15411b;
            ((PullToRefresh) c47313c2.a()).setState(new com.akita.view.component.pull_to_refresh.state.a(aVar2.f15980b, false, new com.avito.android.delivery_tarifikator.presentation.main_screen.f(tarifikatorMainFragment)));
            com.avito.konveyor.adapter.d dVar = tarifikatorMainFragment.f135532q0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(aVar2.f15979a, null);
            C15410a c15410a = aVar2.f15981c;
            if (c15410a == null) {
                com.avito.android.lib.design.modal.a aVar3 = tarifikatorMainFragment.f135538w0;
                if (aVar3 != null) {
                    aVar3.dismiss();
                    return;
                }
                return;
            }
            com.avito.android.lib.design.modal.a aVar4 = tarifikatorMainFragment.f135538w0;
            if (aVar4 == null || !aVar4.isShowing()) {
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, tarifikatorMainFragment.requireContext(), new com.avito.android.delivery_tarifikator.presentation.main_screen.l(c15410a, tarifikatorMainFragment));
                tarifikatorMainFragment.f135538w0 = aVarC;
                com.avito.android.lib.util.g.a(aVarC);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C15414e c15414e) {
            f(c15414e);
            return G0.f406611a;
        }
    }

    /* compiled from: TarifikatorMainFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC15413d, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC15413d interfaceC15413d) {
            InterfaceC14937a interfaceC14937a;
            InterfaceC15413d interfaceC15413d2 = interfaceC15413d;
            TarifikatorMainFragment tarifikatorMainFragment = (TarifikatorMainFragment) this.receiver;
            a aVar = TarifikatorMainFragment.f135523E0;
            tarifikatorMainFragment.getClass();
            if (L.f(interfaceC15413d2, InterfaceC15413d.a.f16007a)) {
                androidx.core.content.j jVarL1 = tarifikatorMainFragment.l1();
                interfaceC14937a = jVarL1 instanceof InterfaceC14937a ? (InterfaceC14937a) jVarL1 : null;
                if (interfaceC14937a != null) {
                    interfaceC14937a.close();
                }
            } else if (interfaceC15413d2 instanceof InterfaceC15413d.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, tarifikatorMainFragment, ((InterfaceC15413d.c) interfaceC15413d2).f16009a, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
            } else if (interfaceC15413d2 instanceof InterfaceC15413d.C1089d) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, tarifikatorMainFragment, ((InterfaceC15413d.C1089d) interfaceC15413d2).f16010a, null, null, null, 0, null, 1022);
            } else if (interfaceC15413d2 instanceof InterfaceC15413d.b) {
                androidx.core.content.j jVarL12 = tarifikatorMainFragment.l1();
                interfaceC14937a = jVarL12 instanceof InterfaceC14937a ? (InterfaceC14937a) jVarL12 : null;
                if (interfaceC14937a != null) {
                    interfaceC14937a.e1(((InterfaceC15413d.b) interfaceC15413d2).f16008a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TarifikatorMainFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTv/e;", "it", "Lkotlin/G0;", "invoke", "(LTv/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<C15414e, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f135544l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C15414e c15414e) {
            return G0.f406611a;
        }
    }

    /* compiled from: TarifikatorMainFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/delivery_tarifikator/DeliveryTarifikatorParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<DeliveryTarifikatorParams> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final DeliveryTarifikatorParams invoke() {
            Bundle bundleRequireArguments = TarifikatorMainFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("TARIFIKATOR_MAIN_PARAMS", DeliveryTarifikatorParams.class) : bundleRequireArguments.getParcelable("TARIFIKATOR_MAIN_PARAMS");
            if (parcelable != null) {
                return (DeliveryTarifikatorParams) parcelable;
            }
            throw new IllegalArgumentException("TarifikatorParams missing");
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f135546l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f135546l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f135546l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TarifikatorMainFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f135548l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f135548l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f135548l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f135549l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f135549l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f135549l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f135550l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f135550l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f135550l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TarifikatorMainFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/delivery_tarifikator/presentation/main_screen/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<n> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = TarifikatorMainFragment.this.f135529n0;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    static {
        Y y12 = new Y(TarifikatorMainFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f135524F0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TarifikatorMainFragment.class, "skeletonShimmer", "getSkeletonShimmer()Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TarifikatorMainFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay2/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TarifikatorMainFragment.class, "pullToRefresh", "getPullToRefresh()Lcom/akita/view/component/pull_to_refresh/PullToRefresh;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TarifikatorMainFragment.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f135523E0 = new a(null);
    }

    public TarifikatorMainFragment() {
        super(R.layout.fragment_tarifikator_main);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f135530o0 = new O0(m0.f406844a.b(n.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f135533r0 = new C47313c(null, 1, null);
        this.f135534s0 = new C47313c(null, 1, null);
        this.f135535t0 = new C47313c(null, 1, null);
        this.f135536u0 = new C47313c(null, 1, null);
        this.f135537v0 = new C47312b(null, 1, null);
        this.f135539x0 = C42727D.c(new g());
        this.f135540y0 = new b();
        this.f135541z0 = new com.avito.android.delivery_tarifikator.presentation.main_screen.a(this, 0);
        this.f135525A0 = new com.avito.android.delivery_tarifikator.presentation.main_screen.a(this, 1);
        this.f135526B0 = new com.avito.android.delivery_tarifikator.presentation.main_screen.a(this, 2);
        this.f135527C0 = new com.avito.android.delivery_tarifikator.presentation.main_screen.a(this, 3);
        this.f135528D0 = new com.avito.android.delivery_tarifikator.presentation.main_screen.b(this, 0);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final p O0() {
        return this.f135527C0;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final q O3() {
        return this.f135541z0;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo.d
    public final void R4(@Y61.k String str) {
        r5().accept(InterfaceC15412c.m.a(str));
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final p S4() {
        return this.f135525A0;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final p T2() {
        return this.f135526B0;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.d
    public final void U2(long j12, @Y61.k String str) {
        r5().accept(new InterfaceC15412c.p(j12, str));
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        r5().accept(InterfaceC15412c.C1088c.a(deepLink));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f135531p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.lib.design.modal.a aVar = this.f135538w0;
        if (aVar != null) {
            aVar.setOnDismissListener(null);
        }
        com.avito.android.lib.design.modal.a aVar2 = this.f135538w0;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
        this.f135538w0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tarifikator_main_navbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        C47313c c47313c = this.f135533r0;
        kotlin.reflect.n<Object>[] nVarArr = f135524F0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, (NavBar) viewFindViewById);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        NavBar navBar = (NavBar) c47313c.a();
        com.avito.android.delivery_tarifikator.presentation.main_screen.d dVar = new com.avito.android.delivery_tarifikator.presentation.main_screen.d(this);
        int i12 = NavBar.f179818g;
        navBar.c(R.attr.ic_arrowBack24, dVar);
        View viewFindViewById2 = view.findViewById(R.id.tarifikator_main_progress_overlay);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById2, null, 0, 6, null);
        C47313c c47313c2 = this.f135535t0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c2.b(this, c42670a);
        View viewFindViewById3 = view.findViewById(R.id.tarifikator_main_swipe_refresh);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.akita.view.component.pull_to_refresh.PullToRefresh");
        }
        C47313c c47313c3 = this.f135536u0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c3.b(this, (PullToRefresh) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.tarifikator_main_recycler);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        C47312b c47312b = this.f135537v0;
        c47312b.b(this, (RecyclerView) viewFindViewById4);
        kotlin.reflect.n<Object> nVar6 = nVarArr[4];
        ((RecyclerView) c47312b.a()).o(new com.avito.android.delivery_tarifikator.presentation.main_screen.e(this));
        kotlin.reflect.n<Object> nVar7 = nVarArr[4];
        RecyclerView recyclerView = (RecyclerView) c47312b.a();
        com.avito.konveyor.adapter.d dVar2 = this.f135532q0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        recyclerView.setAdapter(dVar2);
        View viewFindViewById5 = view.findViewById(R.id.tarifikator_main_skeleton);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        C47313c c47313c4 = this.f135534s0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[1];
        c47313c4.b(this, (ShimmerLayout) viewFindViewById5);
        ScreenPerformanceTracker screenPerformanceTracker = this.f135531p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, r5(), c.f135543l, new d(1, this, TarifikatorMainFragment.class, "render", "render(Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainState;)V", 0));
        com.avito.android.arch.mvi.android.f.a(r5(), getViewLifecycleOwner(), Lifecycle.State.f46681d, new e(1, this, TarifikatorMainFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainOneTimeEvent;)V", 0), f.f135544l);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f135540y0);
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f135531p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        this.f135531p0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(DeliveryTarifikatorMainScreen.f135222d, s.c(this), null, 4, null));
        i.a aVarXf = ((i.b) C29972i.a(C29972i.b(this), i.b.class)).Xf();
        DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) this.f135539x0.getValue();
        ScreenPerformanceTracker screenPerformanceTracker = this.f135531p0;
        aVarXf.a(deliveryTarifikatorParams, screenPerformanceTracker == null ? null : screenPerformanceTracker, this, this, this, this, this, cv.c.d(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f135531p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f135531p0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).c(this, g5());
    }

    public final ShimmerLayout q5() {
        C47313c c47313c = this.f135534s0;
        kotlin.reflect.n<Object> nVar = f135524F0[1];
        return (ShimmerLayout) c47313c.a();
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final View.OnClickListener r3() {
        return this.f135528D0;
    }

    public final n r5() {
        return (n) this.f135530o0.getValue();
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.d
    public final void z(long j12) {
        r5().accept(InterfaceC15412c.d.a(j12));
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.e
    public final void z1() {
        r5().accept(InterfaceC15412c.b.f15985a);
    }
}
