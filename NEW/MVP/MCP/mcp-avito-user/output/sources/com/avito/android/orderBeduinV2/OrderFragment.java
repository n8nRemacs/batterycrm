package com.avito.android.orderBeduinV2;

import Cd.C13243a;
import U40.a;
import U40.b;
import U40.c;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import cU.v;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.orderBeduinV2.di.b;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.V2;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import j.InterfaceC42156l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import sK0.C48063a;
import z1.AbstractC50339a;

/* compiled from: OrderFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/orderBeduinV2/OrderFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "LFV0/c;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "<init>", "()V", "a", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrderFragment extends TabBaseFragment implements InterfaceC28477j.b, FV0.c, com.avito.beduin.v2.interaction.detached.flow.b {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f209724F0;

    /* renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f209725G0;

    /* renamed from: A0, reason: collision with root package name */
    public ScreenPerformanceTracker f209726A0;

    /* renamed from: B0, reason: collision with root package name */
    public s f209727B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public UniversalColor f209728C0;

    /* renamed from: D0, reason: collision with root package name */
    @InterfaceC42156l
    public int f209729D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209730E0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.orderBeduinV2.e f209731t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f209732u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209733v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209734w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f209735x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f209736y0;

    /* renamed from: z0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f209737z0;

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/orderBeduinV2/OrderFragment$a;", "", "<init>", "()V", "", "KEY_ORDER_ID", "Ljava/lang/String;", "KEY_SEGMENT", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static OrderFragment a(@Y61.k String str, @Y61.k OrderScreenSegment orderScreenSegment) {
            OrderFragment orderFragment = new OrderFragment();
            orderFragment.setArguments(C22777e.b(new Q("key_order_id", str), new Q("key_segment", orderScreenSegment)));
            return orderFragment;
        }

        public a() {
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = OrderFragment.f209724F0;
            OrderFragment.this.E5().accept(a.e.f16164a);
            return G0.f406611a;
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<b.d, G0> {
        @Override // Y41.l
        public final G0 invoke(b.d dVar) {
            b.d dVar2 = dVar;
            OrderFragment orderFragment = (OrderFragment) this.receiver;
            a aVar = OrderFragment.f209724F0;
            orderFragment.getClass();
            if (dVar2 instanceof b.a) {
                BeduinOneTimeEvent beduinOneTimeEvent = ((b.a) dVar2).f16168a;
                boolean z12 = beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar;
                C47313c c47313c = orderFragment.f209736y0;
                if (z12) {
                    com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                    kotlin.reflect.n<Object> nVar = OrderFragment.f209725G0[1];
                    bVar.getClass();
                    com.avito.android.lib.beduin_v2.ui_messages.b.a((BeduinView) c47313c.a(), (BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent);
                } else if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.b) {
                    V2.f318762a.e("Unsupported event " + beduinOneTimeEvent, null);
                } else if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                    kotlin.reflect.n<Object> nVar2 = OrderFragment.f209725G0[1];
                    ((BeduinView) c47313c.a()).c(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
                } else if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.d) && (beduinOneTimeEvent instanceof BeduinOneTimeEvent.c)) {
                    orderFragment.E5().accept(a.e.f16164a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<U40.c, G0> {
        @Override // Y41.l
        public final G0 invoke(U40.c cVar) {
            U40.c cVar2 = cVar;
            OrderFragment orderFragment = (OrderFragment) this.receiver;
            a aVar = OrderFragment.f209724F0;
            orderFragment.getClass();
            c.b bVar = cVar2.f16172b;
            if (bVar instanceof c.b.a) {
                com.avito.android.progress_overlay.l lVar = orderFragment.f209737z0;
                (lVar != null ? lVar : null).j();
                C47313c c47313c = orderFragment.f209736y0;
                kotlin.reflect.n<Object> nVar = OrderFragment.f209725G0[1];
                ((BeduinView) c47313c.a()).b(((c.b.a) bVar).f16177a);
                UniversalColor universalColor = orderFragment.f209728C0;
                UniversalColor universalColor2 = cVar2.f16176f;
                if (!L.f(universalColor, universalColor2)) {
                    orderFragment.f209728C0 = universalColor2;
                    orderFragment.D5();
                }
            } else if (bVar instanceof c.b.C1098b) {
                com.avito.android.progress_overlay.l lVar2 = orderFragment.f209737z0;
                (lVar2 != null ? lVar2 : null).a(((c.b.C1098b) bVar).f16178a.getF244063c());
            } else if (L.f(bVar, c.b.C1099c.f16179a)) {
                com.avito.android.progress_overlay.l lVar3 = orderFragment.f209737z0;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                lVar3.k(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OrderFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<String> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = OrderFragment.this.requireArguments().getString("key_order_id");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Order id required parameter");
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/order/OrderScreenSegment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<OrderScreenSegment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final OrderScreenSegment invoke() {
            Parcelable parcelable = OrderFragment.this.requireArguments().getParcelable("key_segment");
            OrderScreenSegment orderScreenSegment = parcelable instanceof OrderScreenSegment ? (OrderScreenSegment) parcelable : null;
            return orderScreenSegment == null ? new OrderScreenSegment(null) : orderScreenSegment;
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Set<FV0.h>> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = OrderFragment.f209724F0;
            return OrderFragment.this.E5().f209753J;
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f209742l = new h();

        public h() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f209743l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f209743l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f209743l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return OrderFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f209745l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f209745l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f209745l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209746l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209746l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f209746l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209747l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209747l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f209747l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/orderBeduinV2/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/orderBeduinV2/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.orderBeduinV2.d> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.orderBeduinV2.d invoke() {
            com.avito.android.orderBeduinV2.e eVar = OrderFragment.this.f209731t0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.orderBeduinV2.d) eVar.get();
        }
    }

    static {
        Y y12 = new Y(OrderFragment.class, "rootContainerView", "getRootContainerView()Landroid/view/ViewGroup;", 0);
        n0 n0Var = m0.f406844a;
        f209725G0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(OrderFragment.class, "beduinView", "getBeduinView()Lcom/avito/beduin/v2/render/android_view/BeduinView;", 0, n0Var)};
        f209724F0 = new a(null);
    }

    public OrderFragment() {
        super(R.layout.order_redesigned_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f209732u0 = new O0(m0.f406844a.b(com.avito.android.orderBeduinV2.d.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f209733v0 = C42727D.c(new e());
        this.f209734w0 = C42727D.c(new f());
        this.f209735x0 = new C47313c(null, 1, null);
        this.f209736y0 = new C47313c(null, 1, null);
        this.f209730E0 = C42727D.c(new g());
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    public final void D5() {
        UniversalColor universalColor;
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e || !isResumed() || (universalColor = this.f209728C0) == null) {
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        Window window = activityC22955mL1 != null ? activityC22955mL1.getWindow() : null;
        if (window == null) {
            return;
        }
        window.setStatusBarColor(C48063a.f437606a.a(requireContext(), universalColor));
    }

    public final com.avito.android.orderBeduinV2.d E5() {
        return (com.avito.android.orderBeduinV2.d) this.f209732u0.getValue();
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<G0> aVar3) {
        s sVar = this.f209727B0;
        if (sVar == null) {
            sVar = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar.a();
        com.avito.android.beduin.v2.page.modal.a aVar4 = com.avito.android.beduin.v2.page.modal.a.f105171a;
        Context contextRequireContext = requireContext();
        aVar4.getClass();
        com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(contextRequireContext, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new com.avito.android.orderBeduinV2.a(aVarA, 0);
    }

    @Override // FV0.d
    public final void close() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        FV0.i.a((Collection) this.f209730E0.getValue(), this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f209726A0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FV0.i.b((Collection) this.f209730E0.getValue());
        super.onDestroy();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        Window window = activityC22955mL1 != null ? activityC22955mL1.getWindow() : null;
        if (window == null) {
            return;
        }
        window.setStatusBarColor(this.f209729D0);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        D5();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.order_fragment_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C47313c c47313c = this.f209735x0;
        kotlin.reflect.n<Object>[] nVarArr = f209725G0;
        int statusBarColor = 0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, (ViewGroup) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.order_beduin);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.beduin.v2.render.android_view.BeduinView");
        }
        BeduinView beduinView = (BeduinView) viewFindViewById2;
        s sVar = this.f209727B0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f209727B0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        C47313c c47313c2 = this.f209736y0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, beduinView);
        View viewFindViewById3 = view.findViewById(R.id.order_overlay_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById3, R.id.order_beduin, null, 0, 0, 28, null);
        this.f209737z0 = lVar;
        lVar.f231600j = new b();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (window = activityC22955mL1.getWindow()) != null) {
            statusBarColor = window.getStatusBarColor();
        }
        this.f209729D0 = statusBarColor;
        ScreenPerformanceTracker screenPerformanceTracker = this.f209726A0;
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker == null ? null : screenPerformanceTracker, E5(), new c(1, this, OrderFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/orderBeduinV2/mvi/entity/OrderOneTimeEvent$Public;)V", 0), new d(1, this, OrderFragment.class, "render", "render(Lcom/avito/android/orderBeduinV2/mvi/entity/OrderState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f209726A0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        OrderScreen orderScreen = OrderScreen.f209749d;
        C28478k c28478k = new C28478k(orderScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        this.f209726A0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(c28478k);
        ZS.b bVar = new ZS.b(orderScreen, Owners.f210399D3, (String) null, 4, (C42822w) null);
        b.a aVarA = com.avito.android.orderBeduinV2.di.a.a();
        com.avito.android.orderBeduinV2.di.c cVar = (com.avito.android.orderBeduinV2.di.c) C29972i.a(C29972i.b(this), com.avito.android.orderBeduinV2.di.c.class);
        String str = (String) this.f209733v0.getValue();
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f209726A0;
        aVarA.a(str, c28478k, cVar, new C31138n0(K.a(aVarEd, screenPerformanceTracker == null ? null : screenPerformanceTracker, bVar, cv.c.d(this), null, null, null, 56)), (OrderScreenSegment) this.f209734w0.getValue()).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f209726A0;
        this.f209727B0 = aVarFd.a(contextRequireContext, screenPerformanceTracker2 == null ? null : screenPerformanceTracker2, E5().f209754K, v.f57891a, E5().f209752E);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f209726A0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f209726A0;
        (screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null).c(this, g5());
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        BaseBeduinHostFragment.DetachedBottomSheet.a aVar2 = BaseBeduinHostFragment.DetachedBottomSheet.f104752l0;
        s sVar = this.f209727B0;
        if (sVar == null) {
            sVar = null;
        }
        aVar2.getClass();
        BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheetA = BaseBeduinHostFragment.DetachedBottomSheet.a.a(sVar, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getParentFragmentManager(), "bottom-sheet");
        return new com.avito.android.orderBeduinV2.a(detachedBottomSheetA, 1);
    }

    @Override // FV0.c
    public final Fragment j1() {
        return this;
    }
}
