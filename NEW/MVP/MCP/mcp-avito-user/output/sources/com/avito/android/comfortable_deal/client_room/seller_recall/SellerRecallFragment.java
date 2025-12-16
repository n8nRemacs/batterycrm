package com.avito.android.comfortable_deal.client_room.seller_recall;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.ComfortableDealSellerRecallScreen;
import com.avito.android.comfortable_deal.client_room.seller_recall.model.ReasonEntity;
import com.avito.android.comfortable_deal.client_room.seller_recall.model.SellerRecallArguments;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallState;
import com.avito.android.comfortable_deal.client_room.seller_recall.s;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import ip.InterfaceC42085a;
import ip.InterfaceC42086b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import z1.AbstractC50339a;

/* compiled from: SellerRecallFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/SellerRecallFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerRecallFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f119933t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public s.a f119934n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f119935o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f119936p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f119937q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f119938r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public r f119939s0;

    /* compiled from: SellerRecallFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/SellerRecallFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SellerRecallFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.client_room.seller_recall.SellerRecallFragment$a$a, reason: collision with other inner class name */
        public static final class C3523a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SellerRecallArguments f119940l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3523a(SellerRecallArguments sellerRecallArguments) {
                super(1);
                this.f119940l = sellerRecallArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("recall_arguments", this.f119940l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SellerRecallFragment a(@Y61.k SellerRecallArguments sellerRecallArguments) {
            SellerRecallFragment sellerRecallFragment = new SellerRecallFragment();
            C35966w1.a(sellerRecallFragment, -1, new C3523a(sellerRecallArguments));
            return sellerRecallFragment;
        }

        public a() {
        }
    }

    /* compiled from: SellerRecallFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/model/SellerRecallArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SellerRecallArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SellerRecallArguments invoke() {
            Parcelable parcelable = SellerRecallFragment.this.requireArguments().getParcelable("recall_arguments");
            SellerRecallArguments sellerRecallArguments = parcelable instanceof SellerRecallArguments ? (SellerRecallArguments) parcelable : null;
            if (sellerRecallArguments != null) {
                return sellerRecallArguments;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: SellerRecallFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements Y41.p<InterfaceC42085a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC42085a interfaceC42085a, Continuation<? super G0> continuation) {
            s sVar = (s) this.receiver;
            a aVar = SellerRecallFragment.f119933t0;
            sVar.accept(interfaceC42085a);
            return G0.f406611a;
        }
    }

    /* compiled from: SellerRecallFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC42086b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC42086b interfaceC42086b) {
            int[] iArr;
            InterfaceC42086b interfaceC42086b2 = interfaceC42086b;
            SellerRecallFragment sellerRecallFragment = (SellerRecallFragment) this.receiver;
            a aVar = SellerRecallFragment.f119933t0;
            sellerRecallFragment.getClass();
            if (interfaceC42086b2 instanceof InterfaceC42086b.a) {
                r rVar = sellerRecallFragment.f119939s0;
                if (rVar != null) {
                    ((InterfaceC42086b.a) interfaceC42086b2).getClass();
                    Input.f179303W.getClass();
                    rVar.f120029h.setState(Input.f179305b0);
                }
            } else if (interfaceC42086b2 instanceof InterfaceC42086b.C11536b) {
                r rVar2 = sellerRecallFragment.f119939s0;
                if (rVar2 != null) {
                    if (((InterfaceC42086b.C11536b) interfaceC42086b2).f405244a) {
                        Input.f179303W.getClass();
                        iArr = Input.f179305b0;
                    } else {
                        Input.f179303W.getClass();
                        iArr = Input.f179304a0;
                    }
                    rVar2.f120030i.setState(iArr);
                }
            } else if (L.f(interfaceC42086b2, InterfaceC42086b.c.f405245a)) {
                sellerRecallFragment.getParentFragmentManager().Y();
            } else {
                if (interfaceC42086b2 instanceof InterfaceC42086b.d) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = sellerRecallFragment.f119937q0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, new WebViewLink.OnlyAvitoDomain(Uri.parse(((InterfaceC42086b.d) interfaceC42086b2).f405246a), null, null, 6, null), null, null, 6);
                } else if (interfaceC42086b2 instanceof InterfaceC42086b.e) {
                    ActivityC22955m activityC22955mRequireActivity = sellerRecallFragment.requireActivity();
                    com.avito.android.ui.activity.a aVar3 = activityC22955mRequireActivity instanceof com.avito.android.ui.activity.a ? (com.avito.android.ui.activity.a) activityC22955mRequireActivity : null;
                    if (aVar3 != null) {
                        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, aVar3.K1(), ((InterfaceC42086b.e) interfaceC42086b2).f405247a, null, null, null, null, 0, null, null, false, false, null, null, 4094);
                    }
                    sellerRecallFragment.getParentFragmentManager().Y();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SellerRecallFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<SellerRecallState, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SellerRecallState sellerRecallState) {
            SellerRecallState sellerRecallState2 = sellerRecallState;
            r rVar = SellerRecallFragment.this.f119939s0;
            if (rVar != null) {
                r.b(rVar.f120029h, sellerRecallState2.f119997b, false);
                r.b(rVar.f120031j, sellerRecallState2.f119998c, true);
                r.b(rVar.f120030i, sellerRecallState2.f119999d, true);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f119944m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.l lVar) {
            super(0);
            this.f119944m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(SellerRecallFragment.this, this.f119944m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SellerRecallFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f119946l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f119946l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f119946l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f119947l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f119947l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f119947l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f119948l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f119948l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f119948l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SellerRecallFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/s;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/comfortable_deal/client_room/seller_recall/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<C23060r0, s> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final s invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            s.a aVar = SellerRecallFragment.this.f119934n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public SellerRecallFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f119935o0 = new O0(m0.f406844a.b(s.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f119938r0 = C42727D.c(new b());
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        ReasonEntity reasonEntity;
        String str3;
        if (str.equals("reason_id")) {
            Iterator it = list.iterator();
            do {
                reasonEntity = null;
                if (!it.hasNext()) {
                    break;
                }
                ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
                if (parcelableEntity instanceof ReasonEntity) {
                    reasonEntity = (ReasonEntity) parcelableEntity;
                }
            } while (reasonEntity == null);
            if (reasonEntity == null || (str3 = reasonEntity.f119974b) == null) {
                return;
            }
            ((s) this.f119935o0.getValue()).accept(new InterfaceC42085a.d(str3));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f119936p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.seller_recall_fragment, viewGroup, false);
        r rVar = new r(viewInflate, this, getLifecycle(), C22984Q.a(getViewLifecycleOwner()));
        InterfaceC43160i<InterfaceC42085a> interfaceC43160i = rVar.f120027f;
        O0 o02 = this.f119935o0;
        C43175k.K(new C43197r1(new c(2, (s) o02.getValue(), s.class, "accept", "accept(Ljava/lang/Object;)V", 4), interfaceC43160i), C22984Q.a(getViewLifecycleOwner()));
        this.f119939s0 = rVar;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f119936p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (s) o02.getValue(), new d(1, this, SellerRecallFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallOneTimeEvent;)V", 0), new e());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f119939s0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f119936p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.client_room.seller_recall.di.a.a().a((com.avito.android.comfortable_deal.di.a) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.di.a.class), cv.c.b(this), new C28478k(ComfortableDealSellerRecallScreen.f119746d, com.avito.android.analytics.screens.s.c(this), null, 4, null), (SellerRecallArguments) this.f119938r0.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f119936p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
