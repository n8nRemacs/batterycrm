package com.avito.android.publish.screen.wrongcategory;

import Qe0.InterfaceC14887a;
import Qe0.InterfaceC14889c;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.publish.premoderation.r;
import com.avito.android.publish.screen.wrongcategory.d;
import com.avito.android.publish.screen.wrongcategory.di.b;
import com.avito.android.publish.screen.wrongcategory.mvi.entity.WrongCategoryState;
import com.avito.android.publish.screen.wrongcategory.ui.SelectListWidget;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: WrongCategoryFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/WrongCategoryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WrongCategoryFragment extends BaseFragment implements Id0.c, InterfaceC28477j.a {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final b f242558s0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public d.a f242559n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f242560o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public Q1 f242561p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public r f242562q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public Hf0.b f242563r0;

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/WrongCategoryFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.blueprints.publish.header.l f242564a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SelectListWidget f242565b;

        public a(@Y61.k C33862g0 c33862g0, @Y61.k com.avito.android.blueprints.publish.header.l lVar, @Y61.k SelectListWidget selectListWidget) {
            this.f242564a = lVar;
            this.f242565b = selectListWidget;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/WrongCategoryFragment$b;", "", "<init>", "()V", "", "KEY_WRONG_CATEGORY_SUGGEST", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* compiled from: WrongCategoryFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AdvertProactiveModerationResult.WrongCategorySuggest f242566l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
                super(1);
                this.f242566l = wrongCategorySuggest;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_wrong_category_suggest", this.f242566l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static WrongCategoryFragment a(@Y61.k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
            WrongCategoryFragment wrongCategoryFragment = new WrongCategoryFragment();
            C35966w1.a(wrongCategoryFragment, 1, new a(wrongCategorySuggest));
            return wrongCategoryFragment;
        }

        public b() {
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = WrongCategoryFragment.f242558s0;
            WrongCategoryFragment.this.q5().accept(InterfaceC14887a.c.f13951a);
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f242568l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = WrongCategoryFragment.f242558s0;
            WrongCategoryFragment.this.q5().accept(InterfaceC14887a.C0920a.f13948a);
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends C42801a implements Y41.l<InterfaceC14889c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14889c interfaceC14889c) {
            InterfaceC14889c interfaceC14889c2 = interfaceC14889c;
            WrongCategoryFragment wrongCategoryFragment = (WrongCategoryFragment) this.receiver;
            b bVar = WrongCategoryFragment.f242558s0;
            wrongCategoryFragment.getClass();
            if (interfaceC14889c2 instanceof InterfaceC14889c.a) {
                r rVar = wrongCategoryFragment.f242562q0;
                if (rVar != null) {
                    rVar.U0(((InterfaceC14889c.a) interfaceC14889c2).f13960a);
                    G0 g02 = G0.f406611a;
                }
            } else if (L.f(interfaceC14889c2, InterfaceC14889c.b.f13961a)) {
                r rVar2 = wrongCategoryFragment.f242562q0;
                if (rVar2 != null) {
                    rVar2.H();
                    G0 g03 = G0.f406611a;
                }
            } else {
                if (!L.f(interfaceC14889c2, InterfaceC14889c.C0922c.f13962a)) {
                    throw new NoWhenBranchMatchedException();
                }
                r rVar3 = wrongCategoryFragment.f242562q0;
                if (rVar3 != null) {
                    rVar3.d1();
                    G0 g04 = G0.f406611a;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/mvi/entity/WrongCategoryState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/screen/wrongcategory/mvi/entity/WrongCategoryState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<WrongCategoryState, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f242571m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar) {
            super(1);
            this.f242571m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(WrongCategoryState wrongCategoryState) {
            WrongCategoryState wrongCategoryState2 = wrongCategoryState;
            b bVar = WrongCategoryFragment.f242558s0;
            WrongCategoryFragment wrongCategoryFragment = WrongCategoryFragment.this;
            com.avito.android.publish.screen.wrongcategory.a aVar = new com.avito.android.publish.screen.wrongcategory.a(1, wrongCategoryFragment.q5(), com.avito.android.publish.screen.wrongcategory.d.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            Hf0.b bVar2 = wrongCategoryFragment.f242563r0;
            if (bVar2 != null) {
                boolean z12 = wrongCategoryState2.f242601d;
                Button button = bVar2.f7601a;
                if (z12) {
                    if (button != null) {
                        D6.k(button);
                    }
                } else if (button != null) {
                    D6.h(button);
                }
            }
            a aVar2 = this.f242571m;
            com.avito.android.blueprints.publish.header.l lVar = aVar2.f242564a;
            lVar.Ap(wrongCategoryFragment.getString(R.string.wrong_category_title), null);
            Context context = wrongCategoryFragment.getContext();
            lVar.f(context != null ? wrongCategoryState2.f242602e.k0(context) : null);
            lVar.qK(false);
            aVar2.f242565b.a(wrongCategoryState2.f242599b, wrongCategoryState2.f242600c, new com.avito.android.publish.screen.wrongcategory.b(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f242573m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.l lVar) {
            super(0);
            this.f242573m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(WrongCategoryFragment.this, this.f242573m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return WrongCategoryFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f242575l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f242575l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f242575l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242576l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242576l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f242576l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242577l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f242577l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/publish/screen/wrongcategory/d;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/publish/screen/wrongcategory/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<C23060r0, com.avito.android.publish.screen.wrongcategory.d> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.publish.screen.wrongcategory.d invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            d.a aVar = WrongCategoryFragment.this.f242559n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public WrongCategoryFragment() {
        super(R.layout.fragment_wrong_category);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f242560o0 = new O0(m0.f406844a.b(com.avito.android.publish.screen.wrongcategory.d.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // Id0.c
    public final int K1() {
        Q1 q12 = this.f242561p0;
        if (q12 == null) {
            q12 = null;
        }
        return q12.B().invoke().booleanValue() ? R.layout.publish_button_re23 : R.layout.publish_button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f242562q0 = context instanceof r ? (r) context : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C33862g0 c33862g0 = new C33862g0(requireView().getRootView(), null, 2, 0 == true ? 1 : 0);
        a aVar = new a(c33862g0, new com.avito.android.blueprints.publish.header.l(false, null, view, 3, null), (SelectListWidget) view.findViewById(R.id.categories));
        c33862g0.b(d.f242568l, new e());
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new f(1, this, WrongCategoryFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/wrongcategory/mvi/entity/WrongCategoryOneTimeEvent;)Lkotlin/Unit;", 8), new g(aVar));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.publish.screen.wrongcategory.di.a.a();
        Bundle arguments = getArguments();
        AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest = arguments != null ? (AdvertProactiveModerationResult.WrongCategorySuggest) arguments.getParcelable("key_wrong_category_suggest") : null;
        if (wrongCategorySuggest == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVarA.a(wrongCategorySuggest, (InterfaceC33816g) C29972i.a(C29972i.b(this), InterfaceC33816g.class)).a(this);
    }

    public final com.avito.android.publish.screen.wrongcategory.d q5() {
        return (com.avito.android.publish.screen.wrongcategory.d) this.f242560o0.getValue();
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        Hf0.b bVar = new Hf0.b(view);
        bVar.d(getString(R.string.wrong_category_continue));
        bVar.b(new c());
        boolean z12 = q5().getState().getValue().f242601d;
        Button button = bVar.f7601a;
        if (z12) {
            if (button != null) {
                D6.k(button);
            }
        } else if (button != null) {
            D6.h(button);
        }
        this.f242563r0 = bVar;
    }

    @Override // Id0.c
    public final void g2() {
    }
}
