package com.avito.android.service_orders.list;

import Cd.C13243a;
import Ju.InterfaceC14249c;
import Mu0.InterfaceC14531a;
import Mu0.InterfaceC14532b;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingConfirmLink;
import com.avito.android.service_orders.ServiceOrdersArguments;
import com.avito.android.service_orders.list.l;
import com.avito.android.service_orders.list.perf_screen.ServiceOrdersListScreen;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import com.avito.android.service_orders.mvi.entity.a;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V;
import com.avito.android.util.V2;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: ServiceOrdersListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_orders/list/ServiceOrdersListFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceOrdersListFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f279189B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.i f279190A0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public l.e f279191t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f279192u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f279193v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_orders.mvi.i f279194w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public V f279195x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final O0 f279196y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.service_orders.list.l f279197z0;

    /* compiled from: ServiceOrdersListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/ServiceOrdersListFragment$a;", "", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceOrdersListFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_orders/list/ServiceOrdersListFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            ViewGroup viewGroup;
            com.avito.android.service_orders.list.l lVar = ServiceOrdersListFragment.this.f279197z0;
            return (lVar == null || (viewGroup = lVar.f279402q) == null) ? super.a() : viewGroup;
        }
    }

    /* compiled from: ServiceOrdersListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof ServiceBookingConfirmLink.b.a;
            ServiceOrdersListFragment serviceOrdersListFragment = ServiceOrdersListFragment.this;
            if (z12) {
                a aVar = ServiceOrdersListFragment.f279189B0;
                serviceOrdersListFragment.D5().accept(new InterfaceC14531a.l(((ServiceBookingConfirmLink.b.a) interfaceC14249c).f276595b));
            } else if (interfaceC14249c instanceof ServiceBookingCancelLink.b.a) {
                a aVar2 = ServiceOrdersListFragment.f279189B0;
                serviceOrdersListFragment.D5().accept(new InterfaceC14531a.l(((ServiceBookingCancelLink.b.a) interfaceC14249c).f276570b));
            }
        }
    }

    /* compiled from: ServiceOrdersListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f279200b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.c("ServiceOrdersListFragment", "deeplink result error: " + ((Throwable) obj), null);
        }
    }

    /* compiled from: ServiceOrdersListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC14532b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14532b interfaceC14532b) {
            String str;
            InterfaceC14532b interfaceC14532b2 = interfaceC14532b;
            ServiceOrdersListFragment serviceOrdersListFragment = (ServiceOrdersListFragment) this.receiver;
            a aVar = ServiceOrdersListFragment.f279189B0;
            serviceOrdersListFragment.getClass();
            if (interfaceC14532b2 instanceof InterfaceC14532b.d) {
                InterfaceC14532b.d dVar = (InterfaceC14532b.d) interfaceC14532b2;
                DeepLink deepLink = dVar.f11078a;
                boolean z12 = deepLink instanceof UxFeedbackStartCampaignLink;
                Bundle bundle = dVar.f11079b;
                if (z12) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = serviceOrdersListFragment.f279192u0;
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = aVar2 != null ? aVar2 : null;
                    Lifecycle lifecycle = serviceOrdersListFragment.getLifecycle();
                    lifecycle.a(new com.avito.android.service_orders.list.a(aVar3, deepLink, bundle, lifecycle));
                } else {
                    com.avito.android.deeplink_handler.handler.composite.a aVar4 = serviceOrdersListFragment.f279192u0;
                    if (aVar4 == null) {
                        aVar4 = null;
                    }
                    b.a.a(aVar4, deepLink, null, bundle, 2);
                }
            } else if (interfaceC14532b2 instanceof InterfaceC14532b.e) {
                com.avito.android.service_orders.list.l lVar = serviceOrdersListFragment.f279197z0;
                if (lVar != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, lVar.f279402q, ((InterfaceC14532b.e) interfaceC14532b2).f11080a, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                }
            } else if (interfaceC14532b2 instanceof InterfaceC14532b.f) {
                com.avito.android.service_orders.list.l lVar2 = serviceOrdersListFragment.f279197z0;
                if (lVar2 != null) {
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, lVar2.f279402q, com.avito.android.printable_text.b.f(((InterfaceC14532b.f) interfaceC14532b2).f11081a), null, null, null, null, 0, ToastBarPosition.f181047e, null, false, false, null, null, 4030);
                }
            } else if (L.f(interfaceC14532b2, InterfaceC14532b.g.f11082a)) {
                com.avito.android.service_orders.list.l lVar3 = serviceOrdersListFragment.f279197z0;
                if (lVar3 != null) {
                    lVar3.f279395j.a();
                }
            } else if (interfaceC14532b2 instanceof InterfaceC14532b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = serviceOrdersListFragment.f279192u0;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                b.a.a(aVar5, ((InterfaceC14532b.c) interfaceC14532b2).f11077a, null, null, 6);
            } else if (interfaceC14532b2 instanceof InterfaceC14532b.a) {
                serviceOrdersListFragment.B5(0, null);
                serviceOrdersListFragment.r5();
            } else if ((interfaceC14532b2 instanceof InterfaceC14532b.C0705b) && (str = ((InterfaceC14532b.C0705b) interfaceC14532b2).f11075a) != null && str.length() != 0) {
                V v12 = serviceOrdersListFragment.f279195x0;
                (v12 != null ? v12 : null).a(str);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrdersListFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<ServiceOrdersListState, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ServiceOrdersListState serviceOrdersListState) {
            final com.avito.android.service_orders.list.l lVar;
            com.avito.android.service_orders.list.l lVar2;
            ServiceOrdersListState serviceOrdersListState2 = serviceOrdersListState;
            ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar = serviceOrdersListState2.f279576b;
            ServiceOrdersListFragment serviceOrdersListFragment = ServiceOrdersListFragment.this;
            if (serviceOrdersListToolbar != null && (lVar2 = serviceOrdersListFragment.f279197z0) != null) {
                lVar2.f279401p.setTitle(serviceOrdersListToolbar.f279582a.k0(lVar2.f279387b.getContext()));
                List list = serviceOrdersListToolbar.f279583b;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                lVar2.f279389d.c(new UV0.c(list));
                lVar2.f279390e.notifyDataSetChanged();
            }
            if (serviceOrdersListState2.f279577c) {
                com.avito.android.service_orders.list.l lVar3 = serviceOrdersListFragment.f279197z0;
                if (lVar3 != null) {
                    D6.H(lVar3.f279399n);
                    D6.w(lVar3.f279397l.f279412a);
                    l.c cVar = lVar3.f279398m;
                    D6.w(cVar.f279405a);
                    l.b bVar = lVar3.f279400o;
                    D6.w(bVar.f279403a);
                    cVar.f279409e.setRefreshing(false);
                    bVar.f279404b.setRefreshing(false);
                }
            } else {
                a.b bVar2 = serviceOrdersListState2.f279580f;
                if (bVar2 != null) {
                    com.avito.android.service_orders.list.l lVar4 = serviceOrdersListFragment.f279197z0;
                    if (lVar4 != null) {
                        l.d dVar = lVar4.f279397l;
                        D6.H(dVar.f279412a);
                        D6.w(lVar4.f279399n);
                        l.c cVar2 = lVar4.f279398m;
                        D6.w(cVar2.f279405a);
                        l.b bVar3 = lVar4.f279400o;
                        D6.w(bVar3.f279403a);
                        cVar2.f279409e.setRefreshing(false);
                        bVar3.f279404b.setRefreshing(false);
                        dVar.f279414c.setText(bVar2.f279595a);
                        String string = bVar2.f279596b;
                        if (string == null) {
                            string = lVar4.f279402q.getContext().getString(R.string.srv_orders_list_default_error_title);
                        }
                        dVar.f279413b.setText(string);
                        D6.G(dVar.f279415d, bVar2.f279597c);
                    }
                } else {
                    a.C8311a c8311a = serviceOrdersListState2.f279579e;
                    if (c8311a != null) {
                        final com.avito.android.service_orders.list.l lVar5 = serviceOrdersListFragment.f279197z0;
                        if (lVar5 != null) {
                            D6.w(lVar5.f279399n);
                            D6.w(lVar5.f279397l.f279412a);
                            l.c cVar3 = lVar5.f279398m;
                            D6.H(cVar3.f279405a);
                            l.b bVar4 = lVar5.f279400o;
                            D6.w(bVar4.f279403a);
                            bVar4.f279404b.setRefreshing(false);
                            SwipeRefreshLayout swipeRefreshLayout = cVar3.f279409e;
                            swipeRefreshLayout.setRefreshing(c8311a.f279589c);
                            final int i12 = 0;
                            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: com.avito.android.service_orders.list.h
                                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                public final void j0() {
                                    switch (i12) {
                                        case 0:
                                            lVar5.f279388c.accept(InterfaceC14531a.t.f11072a);
                                            break;
                                        default:
                                            lVar5.f279388c.accept(InterfaceC14531a.u.f11073a);
                                            break;
                                    }
                                }
                            });
                            I5.a(cVar3.f279407c, c8311a.f279587a, false);
                            I5.a(cVar3.f279408d, c8311a.f279588b, false);
                            ListItem listItem = cVar3.f279406b;
                            String str = c8311a.f279592f;
                            if (str == null || c8311a.f279593g == null) {
                                D6.w(listItem);
                            } else {
                                D6.G(listItem, true);
                                listItem.setTitle(str);
                                listItem.setOnClickListener(new com.avito.android.service_orders.list.i(lVar5, c8311a));
                            }
                            com.avito.android.service_orders.list.blueprints.management_panels.j jVar = cVar3.f279411g;
                            com.avito.android.service_orders.list.blueprints.f fVar = c8311a.f279594h;
                            if (fVar == null) {
                                D6.G(jVar.f279325b, false);
                            } else {
                                D6.G(jVar.f279325b, true);
                                jVar.Oo(fVar.f279304d);
                                jVar.tM(fVar.f279306f);
                                jVar.t40(fVar.f279305e);
                                jVar.E40(new m(lVar5, fVar));
                                jVar.yC(new n(lVar5, fVar));
                                jVar.ZM(new o(lVar5, fVar));
                            }
                            String str2 = c8311a.f279590d;
                            Button button = cVar3.f279410f;
                            com.avito.android.lib.design.button.b.a(button, str2, false);
                            button.setOnClickListener(new com.avito.android.service_orders.list.i(c8311a, lVar5));
                        }
                    } else {
                        a.c cVar4 = serviceOrdersListState2.f279578d;
                        if (cVar4 != null && (lVar = serviceOrdersListFragment.f279197z0) != null) {
                            l.b bVar5 = lVar.f279400o;
                            D6.H(bVar5.f279403a);
                            D6.w(lVar.f279399n);
                            D6.w(lVar.f279397l.f279412a);
                            l.c cVar5 = lVar.f279398m;
                            D6.w(cVar5.f279405a);
                            cVar5.f279409e.setRefreshing(false);
                            SwipeRefreshLayout swipeRefreshLayout2 = bVar5.f279404b;
                            swipeRefreshLayout2.setRefreshing(cVar4.f279600c);
                            final int i13 = 1;
                            swipeRefreshLayout2.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: com.avito.android.service_orders.list.h
                                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                public final void j0() {
                                    switch (i13) {
                                        case 0:
                                            lVar.f279388c.accept(InterfaceC14531a.t.f11072a);
                                            break;
                                        default:
                                            lVar.f279388c.accept(InterfaceC14531a.u.f11073a);
                                            break;
                                    }
                                }
                            });
                            lVar.f279393h.c(new UV0.c(cVar4.f279598a));
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f279202l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f279202l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f279202l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ServiceOrdersListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f279204l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f279204l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f279204l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f279205l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f279205l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f279205l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f279206l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f279206l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f279206l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ServiceOrdersListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_orders/mvi/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.service_orders.mvi.h> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.service_orders.mvi.h invoke() {
            com.avito.android.service_orders.mvi.i iVar = ServiceOrdersListFragment.this.f279194w0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.service_orders.mvi.h) iVar.get();
        }
    }

    public ServiceOrdersListFragment() {
        super(R.layout.service_orders_list_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f279196y0 = new O0(m0.f406844a.b(com.avito.android.service_orders.mvi.h.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f279190A0 = new io.reactivex.rxjava3.disposables.i(0);
    }

    public final com.avito.android.service_orders.mvi.h D5() {
        return (com.avito.android.service_orders.mvi.h) this.f279196y0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new b(requireActivity());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        D5().accept(InterfaceC14531a.r.f11070a);
        final com.avito.android.service_orders.list.l lVar = this.f279197z0;
        if (lVar == null || lVar.f279394i.a()) {
            return;
        }
        l.c cVar = lVar.f279398m;
        if (cVar.f279405a.isShown()) {
            cVar.f279406b.postDelayed(new Runnable() { // from class: com.avito.android.service_orders.list.j
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = l.f279386r;
                    l lVar2 = lVar;
                    l.c cVar2 = lVar2.f279398m;
                    com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(cVar2.f279406b.getContext(), 0, 0, 6, null);
                    com.avito.android.lib.design.tooltip.p.a(kVar, p.f279422l);
                    kVar.f181224j = new r.a(null, 1, null);
                    kVar.f(cVar2.f279406b);
                    lVar2.f279394i.b();
                }
            }, 100L);
            return;
        }
        Iterator<T> it = lVar.f279391f.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.service_orders.list.blueprints.calendar_button_item.c) {
                ((com.avito.android.service_orders.list.blueprints.calendar_button_item.c) dVar).S5();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f279192u0;
        if (aVar == null) {
            aVar = null;
        }
        z<C43501a> zVarV9 = aVar.V9();
        c cVar = new c();
        l41.g<? super Throwable> gVar = d.f279200b;
        zVarV9.getClass();
        this.f279190A0.a(zVarV9.v0(cVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f279190A0.a(null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f279193v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        l.e eVar = this.f279191t0;
        if (eVar == null) {
            eVar = null;
        }
        this.f279197z0 = eVar.a(view, D5(), this);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f279193v0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, D5(), new e(1, this, ServiceOrdersListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListOneTimeEvent;)V", 0), new f());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f279193v0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        ServiceOrdersArguments serviceOrdersArguments;
        new D();
        F f12 = new F();
        f12.c();
        Bundle arguments = getArguments();
        if (arguments != null) {
            serviceOrdersArguments = (ServiceOrdersArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arg.orders_arguments", ServiceOrdersArguments.class) : arguments.getParcelable("arg.orders_arguments"));
        } else {
            serviceOrdersArguments = null;
        }
        com.avito.android.service_orders.di.a.a().a(this, cv.c.b(this), (com.avito.android.service_orders.di.i) C29972i.a(C29972i.b(this), com.avito.android.service_orders.di.i.class), new C28478k(ServiceOrdersListScreen.f279423d, s.c(this), "serviceOrdersList"), serviceOrdersArguments, getF42820b()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f279193v0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(f12.b());
    }
}
