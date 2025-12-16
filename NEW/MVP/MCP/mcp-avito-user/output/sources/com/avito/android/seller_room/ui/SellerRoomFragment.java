package com.avito.android.seller_room.ui;

import Cd.C13243a;
import Vq0.InterfaceC15708a;
import Vq0.b;
import Vq0.c;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
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
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.seller_room.mvi.m;
import com.avito.android.seller_room.mvi.n;
import com.avito.android.seller_room.perf_screen_const.SellerRoomBeduinV2Screen;
import com.avito.android.util.C35968w3;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Collection;
import java.util.Set;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SellerRoomFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_room/ui/SellerRoomFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SellerRoomFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public n f268219o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f268220p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f268221q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public C42670a f268222r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public SwipeRefreshLayout f268223s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public BeduinView f268224t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f268225u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public ScreenPerformanceTracker f268226v0;

    /* renamed from: w0, reason: collision with root package name */
    public s f268227w0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f268218y0 = {m0.f406844a.e(new Y(SellerRoomFragment.class, "openParams", "getOpenParams()Lcom/avito/android/seller_room/ui/SellerRoomOpenParams;", 0))};

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f268217x0 = new a(null);

    /* compiled from: SellerRoomFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_room/ui/SellerRoomFragment$a;", "", "<init>", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SellerRoomFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f268228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f268228l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f268228l.findViewById(R.id.beduin);
        }
    }

    /* compiled from: SellerRoomFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<b.f, G0> {
        @Override // Y41.l
        public final G0 invoke(b.f fVar) {
            b.f fVar2 = fVar;
            SellerRoomFragment sellerRoomFragment = (SellerRoomFragment) this.receiver;
            a aVar = SellerRoomFragment.f268217x0;
            sellerRoomFragment.getClass();
            if (fVar2 instanceof b.g) {
                com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                BeduinView beduinView = sellerRoomFragment.f268224t0;
                if (beduinView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                BeduinOneTimeEvent.ShowToastBar showToastBar = ((b.g) fVar2).f17419a;
                bVar.getClass();
                com.avito.android.lib.beduin_v2.ui_messages.b.a(beduinView, showToastBar);
            } else if (fVar2 instanceof b.d) {
                sellerRoomFragment.t5().accept(new InterfaceC15708a.b());
            } else if (!(fVar2 instanceof b.c) && (fVar2 instanceof b.C1202b)) {
                BeduinView beduinView2 = sellerRoomFragment.f268224t0;
                if (beduinView2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                beduinView2.c(((b.C1202b) fVar2).f17416a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SellerRoomFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVq0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LVq0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Vq0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Vq0.c cVar) {
            C42670a c42670a;
            a aVar = SellerRoomFragment.f268217x0;
            SellerRoomFragment sellerRoomFragment = SellerRoomFragment.this;
            c.b bVar = cVar.f17422b;
            if (bVar instanceof c.b.C1204c) {
                if (((c.b.C1204c) bVar).f17424a && (c42670a = sellerRoomFragment.f268222r0) != null) {
                    C42670a.d(c42670a);
                }
            } else if (bVar instanceof c.b.a) {
                BeduinView beduinView = sellerRoomFragment.f268224t0;
                if (beduinView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                beduinView.b(((c.b.a) bVar).f17423a);
                C42670a c42670a2 = sellerRoomFragment.f268222r0;
                if (c42670a2 != null) {
                    c42670a2.b();
                }
                SwipeRefreshLayout swipeRefreshLayout = sellerRoomFragment.f268223s0;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
            } else if (bVar instanceof c.b.C1203b) {
                C42670a c42670a3 = sellerRoomFragment.f268222r0;
                if (c42670a3 != null) {
                    c42670a3.c(Integer.valueOf(R.style.Theme_DesignSystem_Re23), new com.avito.android.seller_room.ui.b(sellerRoomFragment));
                }
                SwipeRefreshLayout swipeRefreshLayout2 = sellerRoomFragment.f268223s0;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SellerRoomFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Set<FV0.h>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = SellerRoomFragment.f268217x0;
            return SellerRoomFragment.this.t5().f268160E;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f268231l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f268231l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f268231l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SellerRoomFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f268233l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f268233l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f268233l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f268234l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f268234l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f268234l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f268235l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f268235l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f268235l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SellerRoomFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/seller_room/mvi/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/seller_room/mvi/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<m> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = SellerRoomFragment.this.f268219o0;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    public SellerRoomFragment() {
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f268220p0 = new O0(m0.f406844a.b(m.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f268221q0 = new C35968w3(this);
        this.f268225u0 = C42727D.c(new e());
    }

    @Override // FV0.d
    public final void close() {
        requireActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        s5().e();
        View viewInflate = layoutInflater.inflate(R.layout.seller_room_layout, viewGroup, false);
        BeduinView beduinView = (BeduinView) viewInflate.findViewById(R.id.beduin);
        s sVar = this.f268227w0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f268227w0;
        com.avito.beduin.v2.theme.k kVarA = (sVar2 != null ? sVar2 : null).a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f268224t0 = beduinView;
        this.f268222r0 = new C42670a((ViewGroup) viewInflate.findViewById(R.id.progress_container), new b(viewInflate), 0, 4, null);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 21));
        this.f268223s0 = swipeRefreshLayout;
        com.avito.android.analytics.screens.mvi.a.g(this, s5(), t5(), new c(1, this, SellerRoomFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/seller_room/mvi/entity/SellerRoomOneTimeEvent$Public;)V", 0), new d());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        s5().d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        SellerRoomBeduinV2Screen sellerRoomBeduinV2Screen = SellerRoomBeduinV2Screen.f268215d;
        this.f268226v0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(sellerRoomBeduinV2Screen, com.avito.android.analytics.screens.s.c(this), "sellerRoomBeduinV2ContentType"));
        com.avito.android.seller_room.di.a.a().a(s5(), (SellerRoomOpenParams) this.f268221q0.getValue(this, f268218y0[0]), new C31138n0(K.a(((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed(), s5(), new ZS.b(sellerRoomBeduinV2Screen, Owners.f210526p1, (String) null, 4, (C42822w) null), cv.c.d(this), null, null, null, 56)), (com.avito.android.seller_room.di.c) C29972i.a(C29972i.b(this), com.avito.android.seller_room.di.c.class), cv.c.b(this)).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTrackerS5 = s5();
        m mVarT5 = t5();
        m mVarT52 = t5();
        this.f268227w0 = aVarFd.a(contextRequireContext, screenPerformanceTrackerS5, mVarT5.f268164M, v.f57891a, mVarT52.f268163L);
        s5().a(fA2.b());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final s q5() {
        s sVar = this.f268227w0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f268225u0.getValue();
    }

    public final ScreenPerformanceTracker s5() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f268226v0;
        if (screenPerformanceTracker != null) {
            return screenPerformanceTracker;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final m t5() {
        return (m) this.f268220p0.getValue();
    }
}
