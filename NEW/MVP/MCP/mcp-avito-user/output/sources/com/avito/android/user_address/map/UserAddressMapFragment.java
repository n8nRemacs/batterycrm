package com.avito.android.user_address.map;

import Cd.r;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.button.Button;
import com.avito.android.location.find.o;
import com.avito.android.permissions.q;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.di.b;
import com.avito.android.user_address.map.e;
import com.avito.android.user_address.map.view.j;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: UserAddressMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/map/UserAddressMapFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAddressMapFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c {

    /* renamed from: A0, reason: collision with root package name */
    @k
    public static final a f307488A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_address.g f307489n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public e.a f307490o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public AvitoMapAttachHelper f307491p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f307492q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public q f307493r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f307494s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public o f307495t0;

    /* renamed from: u0, reason: collision with root package name */
    public UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map f307496u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public DeepLink f307497v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final O0 f307498w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.avito.android.user_address.map.view.d f307499x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public Toolbar f307500y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public ViewGroup f307501z0;

    /* compiled from: UserAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/user_address/map/UserAddressMapFragment$a;", "", "<init>", "()V", "", "DEFAULT_LATITUDE", "D", "DEFAULT_LONGITUDE", "", "MAP_PARAMS_KEY", "Ljava/lang/String;", "TAG", "", "ZOOM_BUILDING_VISIBLE", "F", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UserAddressMapFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_address.map.UserAddressMapFragment$a$a, reason: collision with other inner class name */
        public static final class C9448a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map f307502l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9448a(UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map) {
                super(1);
                this.f307502l = map;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("map_open_params", this.f307502l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static UserAddressMapFragment a(@k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map) {
            UserAddressMapFragment userAddressMapFragment = new UserAddressMapFragment();
            C35966w1.a(userAddressMapFragment, -1, new C9448a(map));
            return userAddressMapFragment;
        }

        public a() {
        }
    }

    /* compiled from: UserAddressMapFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow flow = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.f307147b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UserAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_address/map/UserAddressMapFragment$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f307503b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f307504c;

        public c(View view, ViewGroup viewGroup) {
            this.f307503b = viewGroup;
            this.f307504c = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup viewGroup = this.f307503b;
            if (viewGroup.isLaidOut()) {
                View view = this.f307504c;
                AvitoMapView avitoMapView = view != null ? (AvitoMapView) view.findViewById(R.id.map) : null;
                if (avitoMapView != null) {
                    D6.c(avitoMapView, null, null, null, Integer.valueOf(viewGroup.getHeight() - y6.b(35)), 7);
                }
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f307506m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f307506m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(UserAddressMapFragment.this, this.f307506m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserAddressMapFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f307508l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f307508l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f307508l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f307509l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f307509l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f307509l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f307510l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f307510l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f307510l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/user_address/map/e;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/user_address/map/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, com.avito.android.user_address.map.e> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.user_address.map.e invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            e.a aVar = UserAddressMapFragment.this.f307490o0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public UserAddressMapFragment() {
        super(R.layout.fragment_user_address_map);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f307498w0 = new O0(m0.f406844a.b(com.avito.android.user_address.map.e.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        com.avito.android.user_address.g gVar = this.f307489n0;
        if (gVar == null) {
            gVar = null;
        }
        gVar.O();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f307494s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = viewOnCreateView != null ? (ViewGroup) viewOnCreateView.findViewById(R.id.content_container) : null;
        this.f307501z0 = viewGroup2;
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307496u0;
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map2 = map != null ? map : null;
        if (map2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short ? true : map2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo ? true : map2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) {
            getLayoutInflater().inflate(R.layout.fragment_user_address_add_new_address_add_mode, viewGroup2);
        } else {
            getLayoutInflater().inflate(R.layout.fragment_user_address_add_new_address_edit_mode, viewGroup2);
        }
        ViewGroup viewGroup3 = this.f307501z0;
        if (viewGroup3 != null) {
            viewGroup3.getViewTreeObserver().addOnGlobalLayoutListener(new c(viewOnCreateView, viewGroup3));
        }
        return viewOnCreateView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        o oVar = this.f307495t0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.c(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o oVar = this.f307495t0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.a(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q qVar = this.f307493r0;
        if (qVar == null) {
            qVar = null;
        }
        qVar.g(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        q qVar = this.f307493r0;
        if (qVar == null) {
            qVar = null;
        }
        qVar.a();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        com.avito.android.user_address.map.view.d jVar;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f307500y0 = toolbar;
        o5(toolbar);
        C35966w1.c(this).w("");
        Toolbar toolbar2 = this.f307500y0;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 22));
        }
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307496u0;
        if (map == null) {
            map = null;
        }
        if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress ? true : map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById ? true : map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) {
            jVar = new com.avito.android.user_address.map.view.i(view, map.getF307155f());
        } else if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short) {
            jVar = new com.avito.android.user_address.map.view.l(view, ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short) map).f307155f);
        } else if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) {
            jVar = new j(view, ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) map).f307133g);
        } else {
            if (!(map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            com.avito.android.user_address.map.view.k kVar = new com.avito.android.user_address.map.view.k(view, false);
            kVar.f307985r = (Button) view.findViewById(R.id.button);
            jVar = kVar;
        }
        this.f307499x0 = jVar;
        O0 o02 = this.f307498w0;
        jVar.c((com.avito.android.user_address.map.e) o02.getValue());
        AvitoMapAttachHelper avitoMapAttachHelper = this.f307491p0;
        if (avitoMapAttachHelper == null) {
            avitoMapAttachHelper = null;
        }
        com.avito.android.user_address.map.view.d dVar = this.f307499x0;
        if (dVar == null) {
            dVar = null;
        }
        avitoMapAttachHelper.setMapAttachedListener(dVar);
        AvitoMapAttachHelper avitoMapAttachHelper2 = this.f307491p0;
        if (avitoMapAttachHelper2 == null) {
            avitoMapAttachHelper2 = null;
        }
        avitoMapAttachHelper2.attachView(R.id.map, view.findViewById(R.id.user_address_map_root), getChildFragmentManager());
        com.avito.android.arch.mvi.android.f.a((com.avito.android.user_address.map.e) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new com.avito.android.user_address.map.b(1, this, UserAddressMapFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/user_address/map/mvi/UserAddressMapMviOneTimeEvent;)V", 0), new com.avito.android.user_address.map.c(this));
        ScreenPerformanceTracker screenPerformanceTracker = this.f307494s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("map_open_params", UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.class) : arguments.getParcelable("map_open_params"));
            if (map != null) {
                this.f307496u0 = map;
                this.f307497v0 = map.getF307154e();
                b.a aVarA = com.avito.android.user_address.map.di.a.a();
                com.avito.android.user_address.g gVar = (com.avito.android.user_address.g) requireActivity();
                ActivityC22955m activityC22955mRequireActivity = requireActivity();
                Resources resources = requireActivity().getResources();
                InterfaceC29971h interfaceC29971hA = C29972i.a(C29972i.b(this), Object.class);
                com.avito.android.analytics.screens.r rVarC = s.c(this);
                com.avito.android.user_address.di.b bVar = ((UserAddressActivity) requireActivity()).f307104n;
                aVarA.a(map, gVar, activityC22955mRequireActivity, this, resources, rVarC, (com.avito.android.user_address.map.di.c) interfaceC29971hA, bVar == null ? null : bVar, cv.c.b(this)).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f307494s0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
                return;
            }
        }
        throw new IllegalStateException("Arguments is not specified");
    }

    public final void q5(UserAddressLink.Result.Success success) {
        DeepLink deepLink = this.f307497v0;
        if (deepLink != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f307492q0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
            return;
        }
        com.avito.android.user_address.g gVar = this.f307489n0;
        if (gVar == null) {
            gVar = null;
        }
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307496u0;
        gVar.z0(success, (map != null ? map : null) instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress ? UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b : UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c);
    }
}
