package com.avito.android.select_field;

import Cd.C13243a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.select.Arguments;
import com.avito.android.select.p;
import com.avito.android.select_field.model.SelectFieldArguments;
import com.avito.android.ui.fragments.BaseFragment;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import sq0.C48401c;
import sq0.InterfaceC48399a;
import sq0.InterfaceC48400b;
import z1.AbstractC50339a;

/* compiled from: SelectFieldFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/select_field/SelectFieldFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectFieldFragment extends BaseFragment implements InterfaceC28477j.b, p, com.avito.android.ui.fragments.c {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f267123s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public n f267124n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f267125o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f267126p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f267127q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public l f267128r0;

    /* compiled from: SelectFieldFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_field/SelectFieldFragment$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectFieldFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/select_field/model/SelectFieldArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SelectFieldArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SelectFieldArguments invoke() {
            return (SelectFieldArguments) SelectFieldFragment.this.requireArguments().getParcelable("select_field_arguments");
        }
    }

    /* compiled from: SelectFieldFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC48399a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC48399a interfaceC48399a) {
            ((m) this.receiver).accept(interfaceC48399a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectFieldFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC48400b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC48400b interfaceC48400b) {
            l lVar;
            InterfaceC48400b interfaceC48400b2 = interfaceC48400b;
            SelectFieldFragment selectFieldFragment = (SelectFieldFragment) this.receiver;
            a aVar = SelectFieldFragment.f267123s0;
            selectFieldFragment.getClass();
            if (interfaceC48400b2 instanceof InterfaceC48400b.a) {
                selectFieldFragment.getParentFragmentManager().o0(C22777e.b(new Q("edit_text_field_result_has_changed", Boolean.valueOf(((InterfaceC48400b.a) interfaceC48400b2).f438883a))), ((SelectFieldArguments) selectFieldFragment.f267127q0.getValue()).f267180c);
                selectFieldFragment.q5().a();
            } else if (interfaceC48400b2 instanceof InterfaceC48400b.C12647b) {
                com.avito.android.select.bottom_sheet.c.a(selectFieldFragment, ((InterfaceC48400b.C12647b) interfaceC48400b2).f438884a).show(selectFieldFragment.getParentFragmentManager(), "COUNT_REQUEST_TAG");
            } else if (interfaceC48400b2 instanceof InterfaceC48400b.c) {
                l lVar2 = selectFieldFragment.f267128r0;
                if (lVar2 != null) {
                    com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, lVar2.f267173a, ((InterfaceC48400b.c) interfaceC48400b2).f438885a, lVar2.f267175c, null);
                }
            } else if ((interfaceC48400b2 instanceof InterfaceC48400b.d) && (lVar = selectFieldFragment.f267128r0) != null) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(((InterfaceC48400b.d) interfaceC48400b2).f438886a);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, lVar.f267173a, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectFieldFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<C48401c, G0> {
        @Override // Y41.l
        public final G0 invoke(C48401c c48401c) {
            C48401c c48401c2 = c48401c;
            SelectFieldFragment selectFieldFragment = (SelectFieldFragment) this.receiver;
            l lVar = selectFieldFragment.f267128r0;
            if (lVar != null) {
                SelectItem.Option option = c48401c2.f438888b;
                Input.t(lVar.f267177e, option != null ? option.f229826b : null, false, 6);
            }
            l lVar2 = selectFieldFragment.f267128r0;
            if (lVar2 != null) {
                lVar2.f267178f.setLoading(c48401c2.f438890d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f267130l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f267130l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f267130l);
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
            return SelectFieldFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f267132l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f267132l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f267132l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267133l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267133l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f267133l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267134l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267134l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f267134l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectFieldFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/select_field/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/select_field/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<m> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = SelectFieldFragment.this.f267124n0;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    public SelectFieldFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f267126p0 = new O0(m0.f406844a.b(m.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f267127q0 = C42727D.c(new b());
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().a();
        return true;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        m mVar = (m) this.f267126p0.getValue();
        Object objG = C42745f0.G(list);
        mVar.accept(new InterfaceC48399a.C12646a(objG instanceof SelectItem.Option ? (SelectItem.Option) objG : null));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f267125o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.ext_profile_select_item, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f267128r0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.select_field.e eVarQ5 = q5();
        SelectFieldArguments selectFieldArguments = (SelectFieldArguments) this.f267127q0.getValue();
        ScreenPerformanceTracker screenPerformanceTracker = this.f267125o0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
        O0 o02 = this.f267126p0;
        this.f267128r0 = new l(view, eVarQ5, selectFieldArguments, screenPerformanceTracker2, new c(1, (m) o02.getValue(), m.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        com.avito.android.arch.mvi.android.f.a((m) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new d(1, this, SelectFieldFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/select_field/mvi/entity/SelectFieldOneTimeEvent;)V", 0), new e(1, this, SelectFieldFragment.class, "render", "render(Lcom/avito/android/select_field/mvi/entity/SelectFieldState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f267125o0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.select_field.di.a.a().a((SelectFieldArguments) this.f267127q0.getValue(), new C28478k(ProfileManagementSelectFieldScreen.f267122d, s.c(this), null, 4, null), (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f267125o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.select_field.e q5() {
        com.avito.android.select_field.e eVarG0;
        InterfaceC23487e parentFragment = getParentFragment();
        com.avito.android.select_field.i iVar = parentFragment instanceof com.avito.android.select_field.i ? (com.avito.android.select_field.i) parentFragment : null;
        if (iVar == null || (eVarG0 = iVar.G0()) == null) {
            throw new IllegalStateException("Parent fragment must implement SelectFieldRouter!");
        }
        return eVarG0;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
