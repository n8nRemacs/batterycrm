package com.avito.android.rating_form.pseudo_done;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.step.w;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import eh0.InterfaceC40105a;
import eh0.InterfaceC40106b;
import java.util.List;
import javax.inject.Inject;
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
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: RatingFormPseudoDoneFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/RatingFormPseudoDoneFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormPseudoDoneFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f248827s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f248828t0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating_form.pseudo_done.c f248829n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f248830o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating_form.interactor.i f248831p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final C47313c f248832q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final C47313c f248833r0;

    /* compiled from: RatingFormPseudoDoneFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/RatingFormPseudoDoneFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RatingFormPseudoDoneFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating_form.pseudo_done.RatingFormPseudoDoneFragment$a$a, reason: collision with other inner class name */
        public static final class C7471a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingFormPseudoDoneArguments f248834l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7471a(RatingFormPseudoDoneArguments ratingFormPseudoDoneArguments) {
                super(1);
                this.f248834l = ratingFormPseudoDoneArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f248834l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static RatingFormPseudoDoneFragment a(@k RatingFormPseudoDoneArguments ratingFormPseudoDoneArguments) {
            RatingFormPseudoDoneFragment ratingFormPseudoDoneFragment = new RatingFormPseudoDoneFragment();
            C35966w1.a(ratingFormPseudoDoneFragment, -1, new C7471a(ratingFormPseudoDoneArguments));
            return ratingFormPseudoDoneFragment;
        }

        public a() {
        }
    }

    /* compiled from: RatingFormPseudoDoneFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC40106b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40106b interfaceC40106b) {
            RatingFormPseudoDoneFragment ratingFormPseudoDoneFragment = (RatingFormPseudoDoneFragment) this.receiver;
            a aVar = RatingFormPseudoDoneFragment.f248827s0;
            ratingFormPseudoDoneFragment.getClass();
            if (interfaceC40106b instanceof InterfaceC40106b.a) {
                ((com.avito.android.rating_form.pseudo_done.b) ratingFormPseudoDoneFragment.f248830o0.getValue()).accept(InterfaceC40105a.C11101a.f395316a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormPseudoDoneFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f248835l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f248836l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f248836l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f248836l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return RatingFormPseudoDoneFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f248838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f248838l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f248838l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f248839l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f248839l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f248839l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f248840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f248840l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f248840l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RatingFormPseudoDoneFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating_form/pseudo_done/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.rating_form.pseudo_done.b> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.rating_form.pseudo_done.b invoke() {
            com.avito.android.rating_form.pseudo_done.c cVar = RatingFormPseudoDoneFragment.this.f248829n0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.rating_form.pseudo_done.b) cVar.get();
        }
    }

    static {
        Y y12 = new Y(RatingFormPseudoDoneFragment.class, "contentView", "getContentView()Landroid/widget/TextView;", 0);
        n0 n0Var = m0.f406844a;
        f248828t0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(RatingFormPseudoDoneFragment.class, "buttonList", "getButtonList()Landroid/widget/LinearLayout;", 0, n0Var)};
        f248827s0 = new a(null);
    }

    public RatingFormPseudoDoneFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f248830o0 = new O0(m0.f406844a.b(com.avito.android.rating_form.pseudo_done.b.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f248832q0 = new C47313c(null, 1, null);
        this.f248833r0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.arch.mvi.android.f.a((com.avito.android.rating_form.pseudo_done.b) this.f248830o0.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new b(1, this, RatingFormPseudoDoneFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneOneTimeEvent;)V", 0), c.f248835l);
        return layoutInflater.inflate(q5().f248824b ? R.layout.rating_form_fragment_done_pseudo_step_modal : R.layout.rating_form_fragment_done_pseudo_step, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rating_form_pseudo_step_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c = this.f248832q0;
        n<Object>[] nVarArr = f248828t0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, (TextView) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.rating_form_pseudo_step_button_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        C47313c c47313c2 = this.f248833r0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, (LinearLayout) viewFindViewById2);
        RatingFormPseudoDoneArguments ratingFormPseudoDoneArgumentsQ5 = q5();
        n<Object> nVar3 = nVarArr[0];
        j.a((TextView) c47313c.a(), ratingFormPseudoDoneArgumentsQ5.f248825c, null);
        List<RatingFormAddValueType.DoneButton> list = ratingFormPseudoDoneArgumentsQ5.f248826d;
        if (list != null) {
            for (RatingFormAddValueType.DoneButton doneButton : list) {
                n<Object> nVar4 = nVarArr[1];
                LinearLayout linearLayout = (LinearLayout) c47313c2.a();
                Button button = new Button(requireContext(), null, 0, 0, 14, null);
                button.setAppearanceFromAttr(w.a(doneButton.getPreset()));
                com.avito.android.lib.design.button.b.a(button, doneButton.getTitle(), false);
                button.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(12, this, doneButton));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(layoutParams.getMarginStart(), y6.b(3), layoutParams.getMarginEnd(), y6.b(3));
                button.setLayoutParams(layoutParams);
                linearLayout.addView(button);
            }
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.rating_form.pseudo_done.di.a.a().a((com.avito.android.rating_form.di.e) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.e.class)).a(this);
    }

    public final RatingFormPseudoDoneArguments q5() {
        Bundle bundleRequireArguments = requireArguments();
        RatingFormPseudoDoneArguments ratingFormPseudoDoneArguments = (RatingFormPseudoDoneArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_arguments", RatingFormPseudoDoneArguments.class) : bundleRequireArguments.getParcelable("key_arguments"));
        if (ratingFormPseudoDoneArguments != null) {
            return ratingFormPseudoDoneArguments;
        }
        throw new IllegalArgumentException("RatingFormPseudoDoneArguments not set");
    }
}
