package com.avito.android.extended_profile_universal_widget_edit.create;

import Cd.C13243a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
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
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.extended_profile_universal_widget_edit.ExtendedProfileUniversalWidgetActivity;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import hB.C40800c;
import hB.InterfaceC40798a;
import hB.InterfaceC40799b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: UniversalWidgetCreateFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/UniversalWidgetCreateFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetCreateFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f153661t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_universal_widget_edit.create.h f153662n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f153663o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f153664p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f153665q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f153666r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.extended_profile_universal_widget_edit.create.e f153667s0;

    /* compiled from: UniversalWidgetCreateFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/UniversalWidgetCreateFragment$a;", "", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UniversalWidgetCreateFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.create.UniversalWidgetCreateFragment$a$a, reason: collision with other inner class name */
        public static final class C4480a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UniversalWidgetCreateArguments f153668l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4480a(UniversalWidgetCreateArguments universalWidgetCreateArguments) {
                super(1);
                this.f153668l = universalWidgetCreateArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("universal_widget_create_arguments", this.f153668l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static UniversalWidgetCreateFragment a(@Y61.k UniversalWidgetCreateArguments universalWidgetCreateArguments) {
            UniversalWidgetCreateFragment universalWidgetCreateFragment = new UniversalWidgetCreateFragment();
            C35966w1.a(universalWidgetCreateFragment, -1, new C4480a(universalWidgetCreateArguments));
            return universalWidgetCreateFragment;
        }

        public a() {
        }
    }

    /* compiled from: UniversalWidgetCreateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_universal_widget_edit/UniversalWidgetCreateArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<UniversalWidgetCreateArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalWidgetCreateArguments invoke() {
            return (UniversalWidgetCreateArguments) UniversalWidgetCreateFragment.this.requireArguments().getParcelable("universal_widget_create_arguments");
        }
    }

    /* compiled from: UniversalWidgetCreateFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC40799b, G0> {
        public final void f(@Y61.k InterfaceC40799b interfaceC40799b) {
            UniversalWidgetCreateFragment universalWidgetCreateFragment = (UniversalWidgetCreateFragment) this.receiver;
            a aVar = UniversalWidgetCreateFragment.f153661t0;
            universalWidgetCreateFragment.getClass();
            if (interfaceC40799b instanceof InterfaceC40799b.C11246b) {
                ActivityC22955m activityC22955mRequireActivity = universalWidgetCreateFragment.requireActivity();
                activityC22955mRequireActivity.setResult(-1, activityC22955mRequireActivity.getIntent());
                ExtendedProfileUniversalWidgetActivity.a aVar2 = ExtendedProfileUniversalWidgetActivity.f153646m;
                Context contextRequireContext = universalWidgetCreateFragment.requireContext();
                UniversalWidgetEditArguments universalWidgetEditArguments = ((InterfaceC40799b.C11246b) interfaceC40799b).f397096b;
                aVar2.getClass();
                Intent intentPutExtra = new Intent(contextRequireContext, (Class<?>) ExtendedProfileUniversalWidgetActivity.class).putExtra("extended_profile.universal_widget.edit_section_args", universalWidgetEditArguments).putExtra("extended_profile.universal_widget.screen_name", "extended_profile.universal_widget.edit_section_screen");
                intentPutExtra.setFlags(603979776);
                universalWidgetCreateFragment.startActivity(intentPutExtra);
                return;
            }
            if (interfaceC40799b instanceof InterfaceC40799b.c) {
                com.avito.android.extended_profile_universal_widget_edit.create.e eVar = universalWidgetCreateFragment.f153667s0;
                if (eVar != null) {
                    InterfaceC40799b.c cVar = (InterfaceC40799b.c) interfaceC40799b;
                    p.c(p.f153373a, eVar.f153718a, cVar.f397097a, eVar.f153719b, new com.avito.android.extended_profile_universal_widget_edit.create.f(eVar, cVar.f397098b));
                    return;
                }
                return;
            }
            if (!(interfaceC40799b instanceof InterfaceC40799b.d)) {
                if (interfaceC40799b instanceof InterfaceC40799b.a) {
                    universalWidgetCreateFragment.requireActivity().finish();
                    return;
                }
                return;
            }
            com.avito.android.extended_profile_universal_widget_edit.create.e eVar2 = universalWidgetCreateFragment.f153667s0;
            if (eVar2 != null) {
                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                ((InterfaceC40799b.d) interfaceC40799b).getClass();
                PrintableText printableTextF = com.avito.android.printable_text.b.f(null);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar2, eVar2.f153718a, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC40799b interfaceC40799b) {
            f(interfaceC40799b);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetCreateFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C40800c, G0> {
        @Override // Y41.l
        public final G0 invoke(C40800c c40800c) {
            C40800c c40800c2 = c40800c;
            com.avito.android.extended_profile_universal_widget_edit.create.e eVar = (com.avito.android.extended_profile_universal_widget_edit.create.e) this.receiver;
            D6.G(eVar.f153722e, c40800c2.f397099b);
            eVar.f153720c.l(c40800c2.f397100c, null);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetCreateFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC40798a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40798a interfaceC40798a) {
            ((com.avito.android.extended_profile_universal_widget_edit.create.g) this.receiver).accept(interfaceC40798a);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetCreateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LhB/a;", "it", "Lkotlin/G0;", "invoke", "(LhB/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC40798a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40798a interfaceC40798a) {
            a aVar = UniversalWidgetCreateFragment.f153661t0;
            ((com.avito.android.extended_profile_universal_widget_edit.create.g) UniversalWidgetCreateFragment.this.f153663o0.getValue()).accept(interfaceC40798a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f153671l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f153671l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f153671l);
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
            return UniversalWidgetCreateFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f153673l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f153673l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f153673l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153674l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153674l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f153674l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153675l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153675l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f153675l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UniversalWidgetCreateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_universal_widget_edit/create/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.extended_profile_universal_widget_edit.create.g> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.extended_profile_universal_widget_edit.create.g invoke() {
            com.avito.android.extended_profile_universal_widget_edit.create.h hVar = UniversalWidgetCreateFragment.this.f153662n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.extended_profile_universal_widget_edit.create.g) hVar.get();
        }
    }

    public UniversalWidgetCreateFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f153663o0 = new O0(m0.f406844a.b(com.avito.android.extended_profile_universal_widget_edit.create.g.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f153666r0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f153664p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.universal_widget_create_fragment, viewGroup, false);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f153664p0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        com.avito.konveyor.adapter.d dVar = this.f153665q0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        UniversalWidgetCreateArguments universalWidgetCreateArguments = (UniversalWidgetCreateArguments) this.f153666r0.getValue();
        O0 o02 = this.f153663o0;
        com.avito.android.extended_profile_universal_widget_edit.create.e eVar = new com.avito.android.extended_profile_universal_widget_edit.create.e(viewInflate, screenPerformanceTracker3, dVar2, universalWidgetCreateArguments, new e(1, (com.avito.android.extended_profile_universal_widget_edit.create.g) o02.getValue(), com.avito.android.extended_profile_universal_widget_edit.create.g.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        this.f153667s0 = eVar;
        com.avito.android.arch.mvi.android.f.a((com.avito.android.extended_profile_universal_widget_edit.create.g) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, UniversalWidgetCreateFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateOneTimeEvent;)V", 0), new d(1, eVar, com.avito.android.extended_profile_universal_widget_edit.create.e.class, "render", "render(Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f153667s0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f153664p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.extended_profile_universal_widget_edit.create.di.a.a().a((UniversalWidgetCreateArguments) this.f153666r0.getValue(), new C28478k(ProfileManagementUniversalWidgetCreateScreen.f153660d, s.c(this), null, 4, null), this, new f(), (com.avito.android.extended_profile_universal_widget_edit.create.di.c) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_universal_widget_edit.create.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f153664p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
