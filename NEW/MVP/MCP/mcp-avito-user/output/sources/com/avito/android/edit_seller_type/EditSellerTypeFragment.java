package com.avito.android.edit_seller_type;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.EditSellerTypeScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.edit_seller_type.mvi.entity.c;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EditSellerTypeFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/EditSellerTypeFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lcom/avito/android/edit_seller_type/mvi/entity/c;", VoiceInfo.STATE, "Lcom/avito/android/edit_seller_type/mvi/entity/c$a;", "confirmDialogState", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditSellerTypeFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f146675s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public M f146676n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f146677o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f146678p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f146679q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f146680r0;

    /* compiled from: EditSellerTypeFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/edit_seller_type/EditSellerTypeFragment$a;", "", "<init>", "()V", "", "SELLER_SUBTYPE_ID", "Ljava/lang/String;", "SELLER_TYPE_CHANGED", "SELLER_TYPE_ID", "SELLER_TYPE_RESULT", "TAG", "TOAST_MESSAGE", "TYPE_EDIT_SUCCESS", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: EditSellerTypeFragment.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.edit_seller_type.EditSellerTypeFragment$a$a, reason: collision with other inner class name */
        public static final class C4264a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Integer f146681l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Integer f146682m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4264a(Integer num, Integer num2) {
                super(1);
                this.f146681l = num;
                this.f146682m = num2;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                Integer num = this.f146681l;
                if (num != null) {
                    bundle2.putInt("seller_type_id", num.intValue());
                }
                Integer num2 = this.f146682m;
                if (num2 != null) {
                    bundle2.putInt("seller_subtype_id", num2.intValue());
                }
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static EditSellerTypeFragment a(@Y61.l Integer num, @Y61.l Integer num2) {
            EditSellerTypeFragment editSellerTypeFragment = new EditSellerTypeFragment();
            C35966w1.a(editSellerTypeFragment, -1, new C4264a(num, num2));
            return editSellerTypeFragment;
        }

        public a() {
        }
    }

    /* compiled from: EditSellerTypeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = EditSellerTypeFragment.this.f146678p0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f146684l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f146684l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f146684l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return EditSellerTypeFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f146686l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f146686l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f146686l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146687l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146687l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f146687l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146688l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146688l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f146688l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EditSellerTypeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/edit_seller_type/L;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/edit_seller_type/L;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<L> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final L invoke() {
            M m12 = EditSellerTypeFragment.this.f146676n0;
            if (m12 == null) {
                m12 = null;
            }
            return (L) m12.get();
        }
    }

    public EditSellerTypeFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f146677o0 = new O0(m0.f406844a.b(L.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f146680r0 = C42727D.c(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q5(EditSellerTypeFragment editSellerTypeFragment, com.akita.compose.component.toast_bar.u uVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-783921520);
        bE2.C(1855073340);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(null);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        com.akita.compose.component.toast_bar.J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        c.a aVar = (c.a) interfaceC22204y1.getF42167b();
        bE2.C(1855079351);
        if (aVar != null) {
            L lR5 = editSellerTypeFragment.r5();
            bE2.C(1787962925);
            boolean zB2 = bE2.B(lR5);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == c1651a) {
                objT2 = new C30316e(editSellerTypeFragment);
                bE2.H(objT2);
            }
            bE2.X(false);
            C30312a.a(aVar, (Y41.l) objT2, bE2, 8);
            G0 g02 = G0.f406611a;
        }
        bE2.X(false);
        C22187u0.d(new C30317f(editSellerTypeFragment, interfaceC22204y1, uVar, jP2, null), bE2, G0.f406611a);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C30318g(editSellerTypeFragment, uVar, i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        ScreenPerformanceTracker screenPerformanceTracker = this.f146678p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        composeView.setContent(new C22096n(947414640, new C30322k(this), true));
        return composeView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        Integer numValueOf = (arguments == null || !arguments.containsKey("seller_type_id")) ? null : Integer.valueOf(arguments.getInt("seller_type_id"));
        Bundle arguments2 = getArguments();
        Integer numValueOf2 = (arguments2 == null || !arguments2.containsKey("seller_subtype_id")) ? null : Integer.valueOf(arguments2.getInt("seller_subtype_id"));
        com.avito.android.edit_seller_type.di.a.a().a((com.avito.android.edit_seller_type.di.c) C29972i.a(C29972i.b(this), com.avito.android.edit_seller_type.di.c.class), cv.c.b(this), new C28478k(EditSellerTypeScreen.f90348d, com.avito.android.analytics.screens.s.c(this), null, 4, null), numValueOf != null ? new c.f(numValueOf.intValue(), numValueOf2) : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f146678p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final L r5() {
        return (L) this.f146677o0.getValue();
    }
}
