package com.avito.android.edit_basic_info;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
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
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.edit_seller_type.EditSellerTypeResult;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ky.InterfaceC43512a;
import ky.InterfaceC43513b;
import z1.AbstractC50339a;

/* compiled from: EditBasicInfoFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/edit_basic_info/EditBasicInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditBasicInfoFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f146014u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public t f146015n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f146016o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f146017p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.edit_basic_info.a f146018q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f146019r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f146020s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public o f146021t0;

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/EditBasicInfoFragment$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/edit_basic_info/model/EditBasicInfoArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<EditBasicInfoArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final EditBasicInfoArguments invoke() {
            return (EditBasicInfoArguments) EditBasicInfoFragment.this.requireArguments().getParcelable("edit_basic_info_arguments");
        }
    }

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "args", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<String, Bundle, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            EditSellerTypeResult editSellerTypeResult = (EditSellerTypeResult) bundle.getParcelable("seller_type_result");
            if (editSellerTypeResult != null) {
                a aVar = EditBasicInfoFragment.f146014u0;
                ((s) EditBasicInfoFragment.this.f146016o0.getValue()).accept(new InterfaceC43512a.g(editSellerTypeResult));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC43513b, G0> {
        public final void f(@Y61.k InterfaceC43513b interfaceC43513b) {
            EditBasicInfoFragment editBasicInfoFragment = (EditBasicInfoFragment) this.receiver;
            a aVar = EditBasicInfoFragment.f146014u0;
            editBasicInfoFragment.getClass();
            if (interfaceC43513b instanceof InterfaceC43513b.a) {
                editBasicInfoFragment.q5().b();
                return;
            }
            boolean z12 = interfaceC43513b instanceof InterfaceC43513b.e;
            InterfaceC42726C interfaceC42726C = editBasicInfoFragment.f146020s0;
            if (z12) {
                FragmentManager parentFragmentManager = editBasicInfoFragment.getParentFragmentManager();
                String str = ((EditBasicInfoArguments) interfaceC42726C.getValue()).f146102c;
                ((InterfaceC43513b.e) interfaceC43513b).getClass();
                parentFragmentManager.o0(C22777e.b(new Q("edit_basic_info_result", new EditBasicInfoResult(true, null))), str);
                return;
            }
            if (interfaceC43513b instanceof InterfaceC43513b.C11766b) {
                editBasicInfoFragment.getParentFragmentManager().o0(C22777e.b(new Q("edit_basic_info_result", new EditBasicInfoResult(true, ((InterfaceC43513b.C11766b) interfaceC43513b).f413313a))), ((EditBasicInfoArguments) interfaceC42726C.getValue()).f146102c);
                editBasicInfoFragment.q5().b();
                return;
            }
            if (interfaceC43513b instanceof InterfaceC43513b.f) {
                o oVar = editBasicInfoFragment.f146021t0;
                if (oVar != null) {
                    InterfaceC43513b.f fVar = (InterfaceC43513b.f) interfaceC43513b;
                    com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, oVar.f146177a, fVar.f413317a, oVar.f146179c, new r(oVar, fVar.f413318b));
                    return;
                }
                return;
            }
            if (interfaceC43513b instanceof InterfaceC43513b.g) {
                o oVar2 = editBasicInfoFragment.f146021t0;
                if (oVar2 != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(null);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, oVar2.f146177a, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                    return;
                }
                return;
            }
            if (interfaceC43513b instanceof InterfaceC43513b.c) {
                com.avito.android.edit_basic_info.a aVar2 = editBasicInfoFragment.f146018q0;
                (aVar2 != null ? aVar2 : null).a();
            } else if (interfaceC43513b instanceof InterfaceC43513b.d) {
                InterfaceC43513b.d dVar = (InterfaceC43513b.d) interfaceC43513b;
                editBasicInfoFragment.q5().a(dVar.f413315a, dVar.f413316b);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC43513b interfaceC43513b) {
            f(interfaceC43513b);
            return G0.f406611a;
        }
    }

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<ky.c, G0> {
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(ky.c r14) {
            /*
                Method dump skipped, instructions count: 432
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_basic_info.EditBasicInfoFragment.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<InterfaceC43512a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC43512a interfaceC43512a) {
            ((s) this.receiver).accept(interfaceC43512a);
            return G0.f406611a;
        }
    }

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lky/a;", "it", "Lkotlin/G0;", "invoke", "(Lky/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC43512a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC43512a interfaceC43512a) {
            a aVar = EditBasicInfoFragment.f146014u0;
            ((s) EditBasicInfoFragment.this.f146016o0.getValue()).accept(interfaceC43512a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f146025l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f146025l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f146025l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return EditBasicInfoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f146027l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f146027l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f146027l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146028l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146028l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f146028l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146029l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f146029l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EditBasicInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/edit_basic_info/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/edit_basic_info/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<s> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            t tVar = EditBasicInfoFragment.this.f146015n0;
            if (tVar == null) {
                tVar = null;
            }
            return (s) tVar.get();
        }
    }

    public EditBasicInfoFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f146016o0 = new O0(m0.f406844a.b(s.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f146020s0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().b();
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "type_edit_success", new c());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f146017p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.ext_profile_edit_basic_info, viewGroup, false);
        com.avito.android.edit_basic_info.h hVarQ5 = q5();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f146017p0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        EditBasicInfoArguments editBasicInfoArguments = (EditBasicInfoArguments) this.f146020s0.getValue();
        com.avito.android.util.text.a aVar = this.f146019r0;
        com.avito.android.util.text.a aVar2 = aVar != null ? aVar : null;
        O0 o02 = this.f146016o0;
        o oVar = new o(viewInflate, hVarQ5, screenPerformanceTracker3, editBasicInfoArguments, aVar2, new f(1, (s) o02.getValue(), s.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        this.f146021t0 = oVar;
        com.avito.android.arch.mvi.android.f.a((s) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new d(1, this, EditBasicInfoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoOneTimeEvent;)V", 0), new e(1, oVar, o.class, "render", "render(Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f146021t0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f146017p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.edit_basic_info.di.a.a().a((EditBasicInfoArguments) this.f146020s0.getValue(), new C28478k(ProfileManagementEditBasicInfoScreen.f146033d, com.avito.android.analytics.screens.s.c(this), null, 4, null), this, new g(), (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f146017p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.edit_basic_info.h q5() {
        com.avito.android.edit_basic_info.h hVarI4;
        InterfaceC23487e parentFragment = getParentFragment();
        com.avito.android.edit_basic_info.l lVar = parentFragment instanceof com.avito.android.edit_basic_info.l ? (com.avito.android.edit_basic_info.l) parentFragment : null;
        if (lVar == null || (hVarI4 = lVar.i4()) == null) {
            throw new IllegalStateException("Parent fragment must implement EditBasicInfoRouter!");
        }
        return hVarI4;
    }
}
