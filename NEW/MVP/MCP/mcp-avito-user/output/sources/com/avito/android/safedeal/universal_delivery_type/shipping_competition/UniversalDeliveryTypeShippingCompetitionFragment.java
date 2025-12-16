package com.avito.android.safedeal.universal_delivery_type.shipping_competition;

import Cd.C13243a;
import Vn0.C15698d;
import Vn0.InterfaceC15697c;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import gj.m;
import gj.o;
import javax.inject.Inject;
import kj.InterfaceC42698a;
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
import kotlin.reflect.n;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/UniversalDeliveryTypeShippingCompetitionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lgj/i;", "<init>", "()V", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UniversalDeliveryTypeShippingCompetitionFragment extends BaseFragment implements InterfaceC28477j.a, gj.i {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f256744A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f256745B0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final Object f256746n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f256747o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.universal_delivery_type.shipping_competition.g f256748p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f256749q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public gj.n f256750r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final Object f256751s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.universal_delivery_type.l f256752t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.universal_delivery_type.shipping_competition.c f256753u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47312b f256754v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final Object f256755w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f256756x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f256757y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public String f256758z0;

    /* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/UniversalDeliveryTypeShippingCompetitionFragment$a;", "", "<init>", "()V", "", "INITIAL_CONTENT_EXTRA", "Ljava/lang/String;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<gj.k> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            UniversalDeliveryTypeShippingCompetitionFragment universalDeliveryTypeShippingCompetitionFragment = UniversalDeliveryTypeShippingCompetitionFragment.this;
            gj.n nVar = universalDeliveryTypeShippingCompetitionFragment.f256750r0;
            if (nVar == null) {
                nVar = null;
            }
            return m.a(nVar, universalDeliveryTypeShippingCompetitionFragment);
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$ShippingCompetition;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<UniversalDeliveryTypeContent.Tab.ShippingCompetition> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalDeliveryTypeContent.Tab.ShippingCompetition invoke() {
            Bundle arguments = UniversalDeliveryTypeShippingCompetitionFragment.this.getArguments();
            if (arguments != null) {
                UniversalDeliveryTypeContent.Tab.ShippingCompetition shippingCompetition = (UniversalDeliveryTypeContent.Tab.ShippingCompetition) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("initial_content_extra", UniversalDeliveryTypeContent.Tab.ShippingCompetition.class) : arguments.getParcelable("initial_content_extra"));
                if (shippingCompetition != null) {
                    return shippingCompetition;
                }
            }
            throw new IllegalStateException("Need initial content extra argument");
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbj/a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "invoke", "()Lbj/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC25658a<? extends RecyclerView.C>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC25658a<? extends RecyclerView.C> invoke() throws Resources.NotFoundException {
            UniversalDeliveryTypeShippingCompetitionFragment universalDeliveryTypeShippingCompetitionFragment = UniversalDeliveryTypeShippingCompetitionFragment.this;
            int dimensionPixelSize = universalDeliveryTypeShippingCompetitionFragment.getResources().getDimensionPixelSize(R.dimen.horizontal_padding_re23);
            InterfaceC25659b interfaceC25659b = universalDeliveryTypeShippingCompetitionFragment.f256747o0;
            if (interfaceC25659b == null) {
                interfaceC25659b = null;
            }
            return interfaceC25659b.b(Integer.valueOf(dimensionPixelSize));
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC15697c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC15697c interfaceC15697c) {
            InterfaceC15697c interfaceC15697c2 = interfaceC15697c;
            UniversalDeliveryTypeShippingCompetitionFragment universalDeliveryTypeShippingCompetitionFragment = (UniversalDeliveryTypeShippingCompetitionFragment) this.receiver;
            a aVar = UniversalDeliveryTypeShippingCompetitionFragment.f256744A0;
            universalDeliveryTypeShippingCompetitionFragment.getClass();
            if (interfaceC15697c2 instanceof InterfaceC15697c.b) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, universalDeliveryTypeShippingCompetitionFragment, com.avito.android.printable_text.b.f(z.k(((InterfaceC15697c.b) interfaceC15697c2).f17377a)), null, null, null, 0, null, 1022);
            } else if (interfaceC15697c2 instanceof InterfaceC15697c.a) {
                ((com.avito.android.safedeal.universal_delivery_type.di.j) universalDeliveryTypeShippingCompetitionFragment.requireActivity()).l1(((InterfaceC15697c.a) interfaceC15697c2).f17376a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<C15698d, G0> {
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(C15698d c15698d) {
            UniversalDeliveryTypeShippingCompetitionFragment universalDeliveryTypeShippingCompetitionFragment = (UniversalDeliveryTypeShippingCompetitionFragment) this.receiver;
            a aVar = UniversalDeliveryTypeShippingCompetitionFragment.f256744A0;
            universalDeliveryTypeShippingCompetitionFragment.getClass();
            C15698d.a aVar2 = c15698d.f17378a;
            if (aVar2 instanceof C15698d.a.C1198a) {
                C15698d.a.C1198a c1198a = (C15698d.a.C1198a) aVar2;
                com.avito.android.safedeal.universal_delivery_type.shipping_competition.c cVar = universalDeliveryTypeShippingCompetitionFragment.f256753u0;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.c();
                universalDeliveryTypeShippingCompetitionFragment.q5(true);
                universalDeliveryTypeShippingCompetitionFragment.f256758z0 = c1198a.f17379a;
                ((AbstractC25658a) universalDeliveryTypeShippingCompetitionFragment.f256755w0.getValue()).m(c1198a.f17380b);
                com.avito.android.safedeal.universal_delivery_type.shipping_competition.c cVar2 = universalDeliveryTypeShippingCompetitionFragment.f256753u0;
                (cVar2 != null ? cVar2 : null).b();
            } else if (L.f(aVar2, C15698d.a.b.f17382a)) {
                universalDeliveryTypeShippingCompetitionFragment.q5(false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f256762l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f256762l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f256762l);
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
            return UniversalDeliveryTypeShippingCompetitionFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f256764l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f256764l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f256764l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256765l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256765l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f256765l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256766l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256766l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f256766l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.safedeal.universal_delivery_type.shipping_competition.f> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.f invoke() {
            com.avito.android.safedeal.universal_delivery_type.shipping_competition.g gVar = UniversalDeliveryTypeShippingCompetitionFragment.this.f256748p0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.safedeal.universal_delivery_type.shipping_competition.f) gVar.get();
        }
    }

    static {
        Y y12 = new Y(UniversalDeliveryTypeShippingCompetitionFragment.class, "mainRecyclerView", "getMainRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f256745B0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(UniversalDeliveryTypeShippingCompetitionFragment.class, "content", "getContent()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(UniversalDeliveryTypeShippingCompetitionFragment.class, "progressView", "getProgressView()Landroid/widget/ProgressBar;", 0, n0Var)};
        f256744A0 = new a(null);
    }

    public UniversalDeliveryTypeShippingCompetitionFragment() {
        super(R.layout.fragment_universal_delivery_type_shipping_competition);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f256746n0 = C42727D.b(lazyThreadSafetyMode, new c());
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new i(new h()));
        this.f256749q0 = new O0(m0.f406844a.b(com.avito.android.safedeal.universal_delivery_type.shipping_competition.f.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f256751s0 = C42727D.b(lazyThreadSafetyMode, new b());
        this.f256754v0 = new C47312b(null, 1, null);
        this.f256755w0 = C42727D.b(lazyThreadSafetyMode, new d());
        this.f256756x0 = new C47313c(null, 1, null);
        this.f256757y0 = new C47313c(null, 1, null);
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        if (!str.equals(m0())) {
            return null;
        }
        n<Object> nVar = f256745B0[0];
        return (RecyclerView) this.f256754v0.a();
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.l
    public final o c1() {
        return null;
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        String str = this.f256758z0;
        return str == null ? "main" : str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.shipping_competition_main_items);
        n<Object>[] nVarArr = f256745B0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f256754v0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        ((RecyclerView) c47312b.a()).setAdapter((AbstractC25658a) this.f256755w0.getValue());
        View viewFindViewById = view.findViewById(R.id.shipping_competition_content);
        C47313c c47313c = this.f256756x0;
        n<Object> nVar3 = nVarArr[1];
        c47313c.b(this, viewFindViewById);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.shipping_competition_progress);
        C47313c c47313c2 = this.f256757y0;
        n<Object> nVar4 = nVarArr[2];
        c47313c2.b(this, progressBar);
        gj.k kVar = (gj.k) this.f256751s0.getValue();
        O0 o02 = this.f256749q0;
        kVar.l(((com.avito.android.safedeal.universal_delivery_type.shipping_competition.f) o02.getValue()).f256816N);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.safedeal.universal_delivery_type.shipping_competition.f) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new e(1, this, UniversalDeliveryTypeShippingCompetitionFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/mvi/entity/UniversalDeliveryTypeShippingCompetitionOneTimeEvent;)V", 0), new f(1, this, UniversalDeliveryTypeShippingCompetitionFragment.class, "render", "render(Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/mvi/entity/UniversalDeliveryTypeShippingCompetitionState;)V", 0));
        com.avito.android.safedeal.universal_delivery_type.l lVar = this.f256752t0;
        if (lVar == null) {
            lVar = null;
        }
        lVar.g();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.a.a().a(new r(this, Long.valueOf(((com.avito.android.safedeal.universal_delivery_type.di.j) requireActivity()).t1()), (String) null, 4, (C42822w) null), (UniversalDeliveryTypeContent.Tab.ShippingCompetition) this.f256746n0.getValue(), (com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c) C29972i.a(C29972i.b(this), com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c.class), cv.c.a((androidx.appcompat.app.m) requireActivity()), (com.avito.android.safedeal.universal_delivery_type.di.j) requireActivity(), (InterfaceC42698a) C29972i.a(C29972i.b(this), InterfaceC42698a.class)).a(this);
        com.avito.android.safedeal.universal_delivery_type.shipping_competition.c cVar = this.f256753u0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.a(fA2.b());
    }

    public final void q5(boolean z12) {
        C47313c c47313c = this.f256757y0;
        n<Object>[] nVarArr = f256745B0;
        n<Object> nVar = nVarArr[2];
        D6.G((ProgressBar) c47313c.a(), !z12);
        C47313c c47313c2 = this.f256756x0;
        n<Object> nVar2 = nVarArr[1];
        D6.G((View) c47313c2.a(), z12);
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }
}
