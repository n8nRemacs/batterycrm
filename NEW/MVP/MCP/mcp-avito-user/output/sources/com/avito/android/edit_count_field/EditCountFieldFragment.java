package com.avito.android.edit_count_field;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.C22977J;
import androidx.view.C22981N;
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
import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.I5;
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
import uy.C49127c;
import uy.InterfaceC49125a;
import uy.InterfaceC49126b;
import z1.AbstractC50339a;

/* compiled from: EditCountFieldFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/edit_count_field/EditCountFieldFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditCountFieldFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f146568s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public q f146569n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f146570o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f146571p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f146572q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public o f146573r0;

    /* compiled from: EditCountFieldFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_count_field/EditCountFieldFragment$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditCountFieldFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/edit_count_field/model/EditCountFieldArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<EditCountFieldArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final EditCountFieldArguments invoke() {
            return (EditCountFieldArguments) EditCountFieldFragment.this.requireArguments().getParcelable("edit_count_field_arguments");
        }
    }

    /* compiled from: EditCountFieldFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC49125a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49125a interfaceC49125a) {
            ((p) this.receiver).accept(interfaceC49125a);
            return G0.f406611a;
        }
    }

    /* compiled from: EditCountFieldFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC49126b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49126b interfaceC49126b) {
            o oVar;
            InterfaceC49126b interfaceC49126b2 = interfaceC49126b;
            EditCountFieldFragment editCountFieldFragment = (EditCountFieldFragment) this.receiver;
            a aVar = EditCountFieldFragment.f146568s0;
            editCountFieldFragment.getClass();
            if (interfaceC49126b2 instanceof InterfaceC49126b.a) {
                editCountFieldFragment.getParentFragmentManager().o0(C22777e.b(new Q("edit_text_field_result_has_changed", Boolean.valueOf(((InterfaceC49126b.a) interfaceC49126b2).f440352a))), ((EditCountFieldArguments) editCountFieldFragment.f146572q0.getValue()).f146624c);
                editCountFieldFragment.q5().b();
            } else if (interfaceC49126b2 instanceof InterfaceC49126b.C12737b) {
                o oVar2 = editCountFieldFragment.f146573r0;
                if (oVar2 != null) {
                    com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, oVar2.f146657a, ((InterfaceC49126b.C12737b) interfaceC49126b2).f440353a, oVar2.f146659c, null);
                }
            } else if ((interfaceC49126b2 instanceof InterfaceC49126b.c) && (oVar = editCountFieldFragment.f146573r0) != null) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(((InterfaceC49126b.c) interfaceC49126b2).f440354a);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, oVar.f146657a, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EditCountFieldFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<C49127c, G0> {
        @Override // Y41.l
        public final G0 invoke(C49127c c49127c) {
            C49127c c49127c2 = c49127c;
            o oVar = ((EditCountFieldFragment) this.receiver).f146573r0;
            if (oVar != null) {
                PrintableText printableText = c49127c2.f440359e;
                String str = null;
                I5.a(oVar.f146662f, printableText != null ? printableText.k0(oVar.f146657a.getContext()) : null, false);
                String str2 = c49127c2.f440356b;
                int length = str2.length();
                Input input = oVar.f146661e;
                if (length > 0 && !str2.equals(input.getDeformattedText())) {
                    str = str2;
                }
                if (str != null) {
                    Input.t(input, str, false, 6);
                }
                Button button = oVar.f146663g;
                button.setEnabled(c49127c2.f440361g);
                button.setLoading(c49127c2.f440360f);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f146575l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f146575l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f146575l);
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
            return EditCountFieldFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f146577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f146577l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f146577l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146578l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f146578l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146579l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146579l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f146579l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EditCountFieldFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/edit_count_field/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/edit_count_field/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<p> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = EditCountFieldFragment.this.f146569n0;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    public EditCountFieldFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f146570o0 = new O0(m0.f406844a.b(p.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f146572q0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().b();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f146571p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.ext_profile_edit_count, viewGroup, false);
        com.avito.android.edit_count_field.d dVarQ5 = q5();
        Lifecycle lifecycle = getLifecycle();
        C22977J c22977jA = C22981N.a(getLifecycle());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f146571p0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        EditCountFieldArguments editCountFieldArguments = (EditCountFieldArguments) this.f146572q0.getValue();
        O0 o02 = this.f146570o0;
        this.f146573r0 = new o(viewInflate, dVarQ5, lifecycle, c22977jA, screenPerformanceTracker3, editCountFieldArguments, new c(1, (p) o02.getValue(), p.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        com.avito.android.arch.mvi.android.f.a((p) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new d(1, this, EditCountFieldFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldOneTimeEvent;)V", 0), new e(1, this, EditCountFieldFragment.class, "render", "render(Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f146573r0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f146571p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.edit_count_field.di.a.a().a((EditCountFieldArguments) this.f146572q0.getValue(), new C28478k(ProfileManagementEditCountFieldScreen.f146581d, s.c(this), null, 4, null), (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f146571p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.edit_count_field.d q5() {
        com.avito.android.edit_count_field.d dVarC4;
        InterfaceC23487e parentFragment = getParentFragment();
        com.avito.android.edit_count_field.h hVar = parentFragment instanceof com.avito.android.edit_count_field.h ? (com.avito.android.edit_count_field.h) parentFragment : null;
        if (hVar == null || (dVarC4 = hVar.c4()) == null) {
            throw new IllegalStateException("Parent fragment must implement EditCountFieldRouter!");
        }
        return dVarC4;
    }
}
