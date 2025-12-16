package com.avito.android.user_address.suggest;

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
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
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
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.suggest.di.e;
import com.avito.android.user_address.suggest.h;
import com.avito.android.user_address.suggest.mvi.f;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import com.avito.android.util.P5;
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
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: UserAddressSuggestFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/suggest/UserAddressSuggestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAddressSuggestFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c {

    /* renamed from: z0, reason: collision with root package name */
    @k
    public static final a f307999z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_address.g f308000n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public h.a f308001o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final O0 f308002p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f308003q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f308004r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_address.suggest.e f308005s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f308006t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public Toolbar f308007u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.user_address.suggest.view.g f308008v0;

    /* renamed from: w0, reason: collision with root package name */
    public UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests f308009w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public DeepLink f308010x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f308011y0;

    /* compiled from: UserAddressSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_address/suggest/UserAddressSuggestFragment$a;", "", "<init>", "()V", "", "SUGGEST_PARAMS_KEY", "Ljava/lang/String;", "TAG", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UserAddressSuggestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_address.suggest.UserAddressSuggestFragment$a$a, reason: collision with other inner class name */
        public static final class C9455a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests f308012l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9455a(UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests suggests) {
                super(1);
                this.f308012l = suggests;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("suggest_open_params", this.f308012l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static UserAddressSuggestFragment a(@k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests suggests) {
            UserAddressSuggestFragment userAddressSuggestFragment = new UserAddressSuggestFragment();
            C35966w1.a(userAddressSuggestFragment, -1, new C9455a(suggests));
            return userAddressSuggestFragment;
        }

        public a() {
        }
    }

    /* compiled from: UserAddressSuggestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f308013a;

        static {
            int[] iArr = new int[JobMultiGeoLink.FlowType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JobMultiGeoLink.FlowType flowType = JobMultiGeoLink.FlowType.f206967b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f308013a = iArr;
            int[] iArr2 = new int[UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow flow = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.f307147b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: UserAddressSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Integer, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = UserAddressSuggestFragment.f307999z0;
            ((com.avito.android.user_address.suggest.h) UserAddressSuggestFragment.this.f308002p0.getValue()).accept(new f.c(iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f308016m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f308016m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(UserAddressSuggestFragment.this, this.f308016m);
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
            return UserAddressSuggestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f308018l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f308018l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f308018l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f308019l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f308019l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f308019l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f308020l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f308020l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f308020l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserAddressSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/user_address/suggest/h;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/user_address/suggest/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, com.avito.android.user_address.suggest.h> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.user_address.suggest.h invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            h.a aVar = UserAddressSuggestFragment.this.f308001o0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public UserAddressSuggestFragment() {
        super(R.layout.fragment_user_address_suggest);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f308002p0 = new O0(m0.f406844a.b(com.avito.android.user_address.suggest.h.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f308011y0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        com.avito.android.user_address.g gVar = this.f308000n0;
        if (gVar == null) {
            gVar = null;
        }
        gVar.K();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f308006t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f308011y0.e();
        View view = getView();
        if (view != null) {
            K2.d(view, true);
        }
        this.f308008v0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        String f308065f;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f308007u0 = toolbar;
        P5.c(toolbar, R.attr.black);
        toolbar.setNavigationOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 23));
        View viewFindViewById2 = toolbar.findViewById(R.id.toolbar_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests suggests = this.f308009w0;
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests suggests2 = suggests == null ? null : suggests;
        if (suggests2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Create) {
            com.avito.android.user_address.suggest.e eVar = this.f308005s0;
            if (eVar == null) {
                eVar = null;
            }
            f308065f = eVar.getF308065f();
        } else if (suggests2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Edit) {
            com.avito.android.user_address.suggest.e eVar2 = this.f308005s0;
            if (eVar2 == null) {
                eVar2 = null;
            }
            f308065f = eVar2.getF308066g();
        } else if (suggests2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo) {
            if (suggests == null) {
                suggests = null;
            }
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo multiGeo = suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo ? (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo) suggests : null;
            JobMultiGeoLink.FlowType flowType = multiGeo != null ? multiGeo.f307170f : null;
            int i12 = flowType == null ? -1 : b.f308013a[flowType.ordinal()];
            if (i12 == 1) {
                com.avito.android.user_address.suggest.e eVar3 = this.f308005s0;
                if (eVar3 == null) {
                    eVar3 = null;
                }
                f308065f = eVar3.getF308067h();
            } else if (i12 != 2) {
                com.avito.android.user_address.suggest.e eVar4 = this.f308005s0;
                if (eVar4 == null) {
                    eVar4 = null;
                }
                f308065f = eVar4.getF308067h();
            } else {
                com.avito.android.user_address.suggest.e eVar5 = this.f308005s0;
                if (eVar5 == null) {
                    eVar5 = null;
                }
                f308065f = eVar5.getF308068i();
            }
        } else {
            if (!(suggests2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow) suggests2).f307181j.ordinal();
            if (iOrdinal == 0) {
                com.avito.android.user_address.suggest.e eVar6 = this.f308005s0;
                if (eVar6 == null) {
                    eVar6 = null;
                }
                f308065f = eVar6.getF308065f();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                com.avito.android.user_address.suggest.e eVar7 = this.f308005s0;
                if (eVar7 == null) {
                    eVar7 = null;
                }
                f308065f = eVar7.getF308066g();
            }
        }
        textView.setText(f308065f);
        o5(this.f308007u0);
        C35966w1.c(this).w("");
        com.avito.konveyor.adapter.j jVar = this.f308003q0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f308004r0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.user_address.suggest.e eVar8 = this.f308005s0;
        if (eVar8 == null) {
            eVar8 = null;
        }
        com.avito.android.user_address.suggest.view.g gVar = new com.avito.android.user_address.suggest.view.g(view, jVar, aVar, eVar8);
        this.f308008v0 = gVar;
        O0 o02 = this.f308002p0;
        gVar.a((com.avito.android.user_address.suggest.h) o02.getValue());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.user_address.suggest.a(2, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f308006t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, (com.avito.android.user_address.suggest.h) o02.getValue(), new com.avito.android.user_address.suggest.b(1, this, UserAddressSuggestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviOneTimeEvent;)V", 0), new com.avito.android.user_address.suggest.c(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f308006t0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        String str;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests suggests = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("suggest_open_params", UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.class) : arguments.getParcelable("suggest_open_params"));
            if (suggests != null) {
                this.f308009w0 = suggests;
                this.f308010x0 = suggests.getF307179h();
                if (suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Create) {
                    str = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Create) suggests).f307157b;
                    if (str == null) {
                        str = "";
                    }
                } else if (suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Edit) {
                    str = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Edit) suggests).f307162c;
                } else if (suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo) {
                    str = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo) suggests).f307167c;
                } else {
                    if (!(suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow) suggests).f307175d;
                }
                String str2 = str;
                e.a aVarA = com.avito.android.user_address.suggest.di.a.a();
                Resources resources = getResources();
                c cVar = new c();
                com.avito.android.user_address.g gVar = (com.avito.android.user_address.g) requireActivity();
                com.avito.android.analytics.screens.r rVarC = s.c(this);
                com.avito.android.user_address.suggest.di.f fVar = (com.avito.android.user_address.suggest.di.f) C29972i.a(C29972i.b(this), com.avito.android.user_address.suggest.di.f.class);
                com.avito.android.user_address.di.b bVar = ((UserAddressActivity) requireActivity()).f307104n;
                aVarA.a(resources, cVar, gVar, str2, rVarC, fVar, bVar == null ? null : bVar).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f308006t0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
                return;
            }
        }
        throw new IllegalStateException("Arguments is not specified");
    }
}
