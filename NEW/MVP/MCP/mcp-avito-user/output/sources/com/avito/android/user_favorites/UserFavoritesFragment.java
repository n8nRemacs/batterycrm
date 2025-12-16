package com.avito.android.user_favorites;

import Cd.C13243a;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bxcontent.BxContentIntentFactory;
import com.avito.android.bxcontent.N1;
import com.avito.android.di.C29972i;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import com.avito.android.user_favorites.di.C35717a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.Kundle;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.n2;
import vE0.AbstractC49202b;
import z1.AbstractC50339a;
import zE0.C50447b;
import zE0.C50449d;

/* compiled from: UserFavoritesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/user_favorites/UserFavoritesFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/l;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lcom/avito/android/user_favorites/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserFavoritesFragment extends TabBaseFragment implements com.avito.android.bottom_navigation.ui.fragment.l, com.avito.android.bottom_navigation.ui.fragment.g, InterfaceC35724i, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final O0 f316803A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public L f316804B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f316805C0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public B f316806t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_favorites.adapter.a<FavoritesTab> f316807u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public TabPagerAdapter f316808v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public BxContentIntentFactory f316809w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public H f316810x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public FavoritesSpace f316811y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f316812z0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f316802E0 = {m0.f406844a.e(new Y(UserFavoritesFragment.class, "openParams", "getOpenParams()Lcom/avito/android/user_favorites/UserFavoritesOpenParams;", 0))};

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f316801D0 = new a(null);

    /* compiled from: UserFavoritesFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_favorites/UserFavoritesFragment$a;", "", "<init>", "()V", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserFavoritesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f316813a;

        static {
            int[] iArr = new int[FavoritesSpace.values().length];
            try {
                iArr[FavoritesSpace.f156264f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FavoritesSpace.f156265g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FavoritesSpace.f156266h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f316813a = iArr;
        }
    }

    /* compiled from: UserFavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Bundle, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            B b12 = UserFavoritesFragment.this.f316806t0;
            if (b12 == null) {
                b12 = null;
            }
            b12.getClass();
            Kundle kundle = new Kundle();
            kundle.i(Integer.valueOf(b12.f316782p), "selected_tab");
            com.avito.android.util.G.c(bundle2, "presenter_state", kundle);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f316815l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f316815l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f316815l);
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
            return UserFavoritesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f316817l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f316817l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f316817l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f316818l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f316818l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f316818l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f316819l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f316819l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f316819l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserFavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_favorites/M;", "invoke", "()Lcom/avito/android/user_favorites/M;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<M> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f316820l = new i();

        public i() {
            super(0);
        }

        @Override // Y41.a
        public final M invoke() {
            return new M();
        }
    }

    public UserFavoritesFragment() {
        super(R.layout.user_favorites_tab);
        this.f316812z0 = new C35968w3(this);
        d dVar = new d(i.f316820l);
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f316803A0 = new O0(m0.f406844a.b(M.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f316805C0 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null), 1, null);
    }

    public final UserFavoritesOpenParams D5() {
        return (UserFavoritesOpenParams) this.f316812z0.getValue(this, f316802E0[0]);
    }

    @Override // com.avito.android.user_favorites.InterfaceC35724i
    public final void I4(@Y61.l String str) {
        ((M) this.f316803A0.getValue()).f316797J.setValue(str != null ? new BeduinV2(str) : null);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        L l12 = this.f316804B0;
        if (l12 != null) {
            InterfaceC23487e interfaceC23487e = l12.f316790b.f178129l;
            com.avito.android.bottom_navigation.ui.fragment.g gVar = interfaceC23487e instanceof com.avito.android.bottom_navigation.ui.fragment.g ? (com.avito.android.bottom_navigation.ui.fragment.g) interfaceC23487e : null;
            if (gVar != null) {
                gVar.K3();
            }
        }
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.l
    public final boolean b0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return navigationTabSetItem == NavigationTab.f106971g;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        if (i12 != 1000) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        L l12 = this.f316804B0;
        if (l12 != null) {
            l12.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        B b12 = this.f316806t0;
        if (b12 == null) {
            b12 = null;
        }
        b12.f316779m.e();
        Q0.d(b12.f316780n.f411905b);
        b12.f316778l = null;
        this.f316804B0 = null;
        com.avito.android.user_favorites.adapter.a<FavoritesTab> aVar = this.f316807u0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.f178155d.unregisterAll();
        o5(null);
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        B b12 = this.f316806t0;
        if (b12 == null) {
            b12 = null;
        }
        b12.c(b12.f316782p);
        if (!b12.f316777k.v().invoke().booleanValue()) {
            N1 n12 = b12.f316775i;
            n12.d("PRICE_LOWERED_TIMESTAMP_POSTFIX");
            n12.a("FAVORITES_ADD_TIMESTAMP_POSTFIX");
        } else {
            C50449d.f443980a.getClass();
            AbstractC49202b.AbstractC12751b.C12752b c12752b = C50449d.f443981b;
            com.avito.android.timestamp_storage.domain.d dVar = b12.f316776j;
            dVar.a(c12752b);
            C50447b.f443974a.getClass();
            dVar.d(C50447b.f443976c);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        int i12 = 8;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        boolean zV5 = v5();
        materialToolbar.setVisibility(!zV5 ? 0 : 8);
        if (!zV5) {
            o5(materialToolbar);
            materialToolbar.setOverflowIcon(C35835l0.h(R.attr.ic_more20, materialToolbar.getContext()));
            Drawable overflowIcon = materialToolbar.getOverflowIcon();
            if (overflowIcon != null) {
                overflowIcon.setTint(C35835l0.d(R.attr.black, materialToolbar.getContext()));
            }
            FavoritesSpace favoritesSpace = this.f316811y0;
            if (favoritesSpace == null) {
                favoritesSpace = null;
            }
            int i13 = b.f316813a[favoritesSpace.ordinal()];
            if (i13 == 1) {
                ActivityC22955m activityC22955mL1 = l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.setTitle(R.string.favorites);
                }
            } else if (i13 == 2) {
                ActivityC22955m activityC22955mL12 = l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.setTitle(R.string.favorites_business360);
                }
                Context contextRequireContext = requireContext();
                int iJ2 = C35835l0.j(R.attr.textH5, requireContext());
                materialToolbar.f22400m = iJ2;
                AppCompatTextView appCompatTextView = materialToolbar.f22390c;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(contextRequireContext, iJ2);
                }
                materialToolbar.setTitleCentered(true);
            } else if (i13 == 3) {
                ActivityC22955m activityC22955mL13 = l1();
                if (activityC22955mL13 != null) {
                    activityC22955mL13.setTitle(R.string.favorites);
                }
                Context contextRequireContext2 = requireContext();
                int iJ3 = C35835l0.j(R.attr.textH5, requireContext());
                materialToolbar.f22400m = iJ3;
                AppCompatTextView appCompatTextView2 = materialToolbar.f22390c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(contextRequireContext2, iJ3);
                }
                materialToolbar.setTitleCentered(true);
                materialToolbar.setPadding(0, 0, 0, 0);
            }
        }
        com.avito.android.user_favorites.adapter.a<FavoritesTab> aVar = this.f316807u0;
        if (aVar == null) {
            aVar = null;
        }
        TabPagerAdapter tabPagerAdapter = this.f316808v0;
        if (tabPagerAdapter == null) {
            tabPagerAdapter = null;
        }
        H h12 = this.f316810x0;
        if (h12 == null) {
            h12 = null;
        }
        L l12 = new L(view, aVar, tabPagerAdapter, h12);
        this.f316804B0 = l12;
        B b12 = this.f316806t0;
        if (b12 == null) {
            b12 = null;
        }
        b12.f316778l = l12;
        q qVar = b12.f316767a;
        List<FavoritesTab> listA = qVar.a("", "", "");
        b12.f316781o = listA;
        b12.a(listA);
        l12.c();
        FavoritesSpace favoritesSpace2 = qVar.f316930f;
        io.reactivex.rxjava3.disposables.d dVarV0 = io.reactivex.rxjava3.core.z.j(favoritesSpace2.f156269b ? io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(q.b(qVar.f316927c.q())), qVar.f316929e.getF15686a().d0(new r(qVar))) : io.reactivex.rxjava3.core.z.c0(""), favoritesSpace2.f156269b ? io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(""), qVar.f316928d.getF123751f().d0(new s(qVar))) : io.reactivex.rxjava3.core.z.c0(""), kotlinx.coroutines.rx3.y.b(C43175k.G(new u(qVar, null))), new t(qVar)).j0(b12.f316768b.e()).v0(new x(b12, l12), y.f316945b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        io.reactivex.rxjava3.disposables.c cVar = b12.f316779m;
        cVar.b(dVarV0);
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.str_seller_orders.orders_seller.d(l12, i12)).t0(new z(b12)));
        l12.d(b12.b(b12.f316782p));
        C43175k.K(new C43197r1(new A(2, l12, J.class, "showTopWidget", "showTopWidget(Lcom/avito/android/remote/model/BeduinV2;)V", 4), b12.f316773g.f316799L), b12.f316780n);
        String str = D5().f316827c;
        if (str != null) {
            BxContentIntentFactory bxContentIntentFactory = this.f316809w0;
            if (bxContentIntentFactory == null) {
                bxContentIntentFactory = null;
            }
            startActivityForResult(bxContentIntentFactory.a(str), 1000);
            UserFavoritesOpenParams userFavoritesOpenParamsD5 = D5();
            this.f316812z0.setValue(this, f316802E0[0], new UserFavoritesOpenParams(userFavoritesOpenParamsD5.f316826b, userFavoritesOpenParamsD5.f316828d, null));
        }
    }

    @Override // com.avito.android.user_favorites.InterfaceC35724i
    @Y61.k
    public final n2<Boolean> p4() {
        return ((M) this.f316803A0.getValue()).f316798K;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundleT5 = t5(bundle);
        C35717a.a().a((com.avito.android.user_favorites.di.h) C29972i.a(C29972i.b(this), com.avito.android.user_favorites.di.h.class), x5(), com.avito.android.analytics.screens.s.c(this), bundleT5 != null ? com.avito.android.util.G.a(bundleT5, "presenter_state") : null, this, (M) this.f316803A0.getValue(), D5().f316826b, D5().f316828d).a(this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF264114B0() {
        return this.f316805C0;
    }
}
