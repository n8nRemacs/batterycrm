package com.avito.android.publish.input_vin.mvi;

import Cd.C13243a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23069w;
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
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.analytics.E;
import com.avito.android.publish.input_vin.di.b;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.validation.InterfaceC36014j;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import me0.InterfaceC44074c;
import ne0.C44387d;
import ne0.InterfaceC44384a;
import ne0.InterfaceC44386c;
import oe0.InterfaceC44764a;
import z1.AbstractC50339a;

/* compiled from: InputVinMviFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/InputVinMviFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InputVinMviFragment extends BaseFragment implements com.avito.android.ui.fragments.c, Id0.c, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final O0 f236603A0;

    /* renamed from: B0, reason: collision with root package name */
    public C33862g0 f236604B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public InterfaceC44074c f236605C0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.progress_overlay.b f236606n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f236607o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f236608p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f236609q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public E f236610r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public C0 f236611s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC44764a f236612t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f236613u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC36030r0 f236614v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC36014j f236615w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.input_vin.mvi.mvi.p f236616x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public Q1 f236617y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public y f236618z0;

    /* compiled from: InputVinMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            InputVinMviFragment.this.q5().accept(InterfaceC44384a.f.f415227a);
            return G0.f406611a;
        }
    }

    /* compiled from: InputVinMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<String, Bundle, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            InputVinMviFragment inputVinMviFragment = InputVinMviFragment.this;
            inputVinMviFragment.q5().accept(InterfaceC44384a.h.f415228a);
            C0 c02 = inputVinMviFragment.f236611s0;
            if (c02 == null) {
                c02 = null;
            }
            Bundle arguments = inputVinMviFragment.getArguments();
            if (arguments == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            inputVinMviFragment.r5(c02.pe(arguments.getInt("step_index")));
            return G0.f406611a;
        }
    }

    /* compiled from: InputVinMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC44386c, G0> {
        public final void f(@Y61.k InterfaceC44386c interfaceC44386c) {
            InputVinMviFragment inputVinMviFragment = (InputVinMviFragment) this.receiver;
            inputVinMviFragment.getClass();
            boolean z12 = interfaceC44386c instanceof InterfaceC44386c.h;
            if (!z12) {
                K2.e(inputVinMviFragment);
            }
            if (L.f(interfaceC44386c, InterfaceC44386c.a.f415248a)) {
                InterfaceC44074c interfaceC44074c = inputVinMviFragment.f236605C0;
                if (interfaceC44074c != null) {
                    interfaceC44074c.h();
                    return;
                }
                return;
            }
            if (interfaceC44386c instanceof InterfaceC44386c.d) {
                InterfaceC44386c.d dVar = (InterfaceC44386c.d) interfaceC44386c;
                InterfaceC35845m2 interfaceC35845m2 = inputVinMviFragment.f236607o0;
                C35966w1.g(inputVinMviFragment, (interfaceC35845m2 != null ? interfaceC35845m2 : null).u(dVar.f415251a, (6 & 2) == 0, (6 & 4) == 0), new com.avito.android.publish.input_vin.mvi.c(inputVinMviFragment));
                return;
            }
            if (interfaceC44386c instanceof InterfaceC44386c.e) {
                InterfaceC44764a interfaceC44764a = inputVinMviFragment.f236612t0;
                (interfaceC44764a != null ? interfaceC44764a : null).a(inputVinMviFragment.requireContext(), ((InterfaceC44386c.e) interfaceC44386c).f415252a);
                return;
            }
            if (interfaceC44386c instanceof InterfaceC44386c.f) {
                InterfaceC44074c interfaceC44074c2 = inputVinMviFragment.f236605C0;
                if (interfaceC44074c2 != null) {
                    InterfaceC44386c.f fVar = (InterfaceC44386c.f) interfaceC44386c;
                    interfaceC44074c2.P(fVar.f415253a, fVar.f415254b);
                    return;
                }
                return;
            }
            if (interfaceC44386c instanceof InterfaceC44386c.g) {
                InterfaceC44074c interfaceC44074c3 = inputVinMviFragment.f236605C0;
                if (interfaceC44074c3 != null) {
                    InterfaceC44386c.g gVar = (InterfaceC44386c.g) interfaceC44386c;
                    interfaceC44074c3.n0(gVar.f415255a, gVar.f415256b, gVar.f415257c);
                    return;
                }
                return;
            }
            if (interfaceC44386c instanceof InterfaceC44386c.i) {
                C33862g0 c33862g0 = inputVinMviFragment.f236604B0;
                (c33862g0 != null ? c33862g0 : null).d(((InterfaceC44386c.i) interfaceC44386c).f415259a);
                return;
            }
            if (z12) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, inputVinMviFragment, com.avito.android.printable_text.b.f(((InterfaceC44386c.h) interfaceC44386c).f415258a), null, null, null, 0, null, 1022);
                return;
            }
            if (L.f(interfaceC44386c, InterfaceC44386c.b.f415249a)) {
                C0 c02 = inputVinMviFragment.f236611s0;
                if (c02 == null) {
                    c02 = null;
                }
                c02.xe(null);
                return;
            }
            if (L.f(interfaceC44386c, InterfaceC44386c.C11868c.f415250a)) {
                C0 c03 = inputVinMviFragment.f236611s0;
                (c03 != null ? c03 : null).ye();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC44386c interfaceC44386c) {
            f(interfaceC44386c);
            return G0.f406611a;
        }
    }

    /* compiled from: InputVinMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lne0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lne0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C44387d, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C44387d c44387d) {
            C44387d c44387d2 = c44387d;
            InputVinMviFragment inputVinMviFragment = InputVinMviFragment.this;
            if (c44387d2.f415265d) {
                com.avito.android.progress_overlay.b bVar = inputVinMviFragment.f236606n0;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.a();
            } else {
                com.avito.android.progress_overlay.b bVar2 = inputVinMviFragment.f236606n0;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                bVar2.C0();
            }
            if (c44387d2.f415266e) {
                com.avito.android.recycler.data_aware.c cVar = inputVinMviFragment.f236609q0;
                (cVar != null ? cVar : null).c(c44387d2.f415263b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f236622l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f236622l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f236622l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return InputVinMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f236624l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f236624l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f236624l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f236625l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f236625l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f236625l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f236626l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f236626l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f236626l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: InputVinMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/x;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/input_vin/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<x> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final x invoke() {
            y yVar = InputVinMviFragment.this.f236618z0;
            if (yVar == null) {
                yVar = null;
            }
            return (x) yVar.get();
        }
    }

    public InputVinMviFragment() {
        super(R.layout.input_vin_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f236603A0 = new O0(m0.f406844a.b(x.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // Id0.c
    public final int K1() {
        Q1 q12 = this.f236617y0;
        if (q12 == null) {
            q12 = null;
        }
        return q12.B().invoke().booleanValue() ? R.layout.publish_button_re23 : R.layout.publish_button;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(InterfaceC44384a.b.f415223a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f236605C0 = context instanceof InterfaceC44074c ? (InterfaceC44074c) context : null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC36014j interfaceC36014j = this.f236615w0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.e(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC36014j interfaceC36014j = this.f236615w0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC36030r0 interfaceC36030r0 = this.f236614v0;
        if (interfaceC36030r0 == null) {
            interfaceC36030r0 = null;
        }
        interfaceC36030r0.a();
        E e12 = this.f236610r0;
        (e12 != null ? e12 : null).a();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC36030r0 interfaceC36030r0 = this.f236614v0;
        if (interfaceC36030r0 == null) {
            interfaceC36030r0 = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.publish.input_vin.mvi.e(this, null), new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(interfaceC36030r0.getF319332k()), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e), new com.avito.android.publish.input_vin.mvi.d(3, null))), C22984Q.a(getViewLifecycleOwner()));
        C0 c02 = this.f236611s0;
        C0 c03 = c02 != null ? c02 : null;
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        r5(c03.pe(arguments.getInt("step_index")));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View rootView = requireView().getRootView();
        C0 c02 = this.f236611s0;
        if (c02 == null) {
            c02 = null;
        }
        C33862g0 c33862g0 = new C33862g0(rootView, c02.qe());
        c33862g0.b(new C33868a(this), new com.avito.android.publish.input_vin.mvi.b(this));
        c33862g0.c(R.drawable.ic_back_24_black);
        this.f236604B0 = c33862g0;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        requireContext();
        recyclerView.setLayoutManager(new UnpredictiveLinearLayoutManager());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 500L;
        }
        recyclerView.l(new com.avito.android.blueprints.publish.header.a(recyclerView.getResources()), -1);
        RecyclerView.Adapter<?> adapter = this.f236608p0;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        com.avito.android.progress_overlay.b bVar = this.f236606n0;
        com.avito.android.progress_overlay.b bVar2 = bVar != null ? bVar : null;
        ViewGroup viewGroup = (ViewGroup) view;
        Context context = getContext();
        bVar2.d(viewGroup, R.id.recycler_view, R.layout.publish_progress_overlay_black, context != null ? Integer.valueOf(C35835l0.d(R.attr.transparentBlack, context)) : null, false);
        E e12 = this.f236610r0;
        if (e12 == null) {
            e12 = null;
        }
        e12.b();
        InterfaceC36030r0 interfaceC36030r0 = this.f236614v0;
        if (interfaceC36030r0 == null) {
            interfaceC36030r0 = null;
        }
        Set<TV0.d<?, ?>> set = this.f236613u0;
        if (set == null) {
            set = null;
        }
        interfaceC36030r0.i(set);
        Set<TV0.d<?, ?>> set2 = this.f236613u0;
        if (set2 == null) {
            set2 = null;
        }
        Iterator<T> it = set2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Lifecycle.State state = Lifecycle.State.f46682e;
            if (!zHasNext) {
                C22960s.b(this, "SCANNER_SUCCESS_REQUEST_KEY", new b());
                com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), state, new c(1, this, InputVinMviFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/input_vin/mvi/mvi/entity/InputVinMviOneTimeEvent;)V", 0), new d());
                return;
            }
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.publish.input_vin.items.scan_button.d) {
                com.avito.android.publish.input_vin.items.scan_button.d dVar2 = (com.avito.android.publish.input_vin.items.scan_button.d) dVar;
                C43175k.K(new C43197r1(new l(this, null), new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(dVar2.getF236593e()), getViewLifecycleOwner().getLifecycle(), state), new k(3, null))), C22984Q.a(getViewLifecycleOwner()));
                C43175k.K(new C43197r1(new n(this, null), new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(dVar2.getF236592d()), getViewLifecycleOwner().getLifecycle(), state), new m(3, null))), C22984Q.a(getViewLifecycleOwner()));
            } else if (dVar instanceof com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g) {
                C43175k.K(new C43197r1(new p(this, null), new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(((com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g) dVar).getF245189e()), getViewLifecycleOwner().getLifecycle(), state), new o(3, null))), C22984Q.a(getViewLifecycleOwner()));
            } else if (dVar instanceof com.avito.android.blueprints.input.d) {
                com.avito.android.blueprints.input.d dVar3 = (com.avito.android.blueprints.input.d) dVar;
                C43175k.K(new C43197r1(new r(this, null), new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(dVar3.getF105960r()), getViewLifecycleOwner().getLifecycle(), state), new q(3, null))), C22984Q.a(getViewLifecycleOwner()));
                C43175k.K(new C43197r1(new com.avito.android.publish.input_vin.mvi.f(this, null), new t(new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(dVar3.b()), getViewLifecycleOwner().getLifecycle(), state), new s(3, null)))), C22984Q.a(getViewLifecycleOwner()));
            } else if (dVar instanceof com.avito.android.blueprint.input.c) {
                com.avito.android.blueprint.input.c cVar = (com.avito.android.blueprint.input.c) dVar;
                C43175k.K(new C43197r1(new com.avito.android.publish.input_vin.mvi.h(this, null), new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(cVar.getF105548n()), getViewLifecycleOwner().getLifecycle(), state), new com.avito.android.publish.input_vin.mvi.g(3, null))), C22984Q.a(getViewLifecycleOwner()));
                C43175k.K(new C43197r1(new com.avito.android.publish.input_vin.mvi.j(this, null), new u(new C43152f0(C23069w.a(kotlinx.coroutines.rx3.y.a(cVar.b()), getViewLifecycleOwner().getLifecycle(), state), new com.avito.android.publish.input_vin.mvi.i(3, null)))), C22984Q.a(getViewLifecycleOwner()));
            }
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i12 = arguments.getInt("step_index");
        b.a aVarA = com.avito.android.publish.input_vin.di.a.a();
        aVarA.a((com.avito.android.publish.input_vin.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.input_vin.di.c.class));
        aVarA.b(getResources());
        aVarA.c(this);
        aVarA.d(i12);
        aVarA.e(bundle != null);
        aVarA.build().a(this);
    }

    public final x q5() {
        return (x) this.f236603A0.getValue();
    }

    public final void r5(ParametersTree parametersTree) {
        InterfaceC36030r0 interfaceC36030r0 = this.f236614v0;
        if (interfaceC36030r0 == null) {
            interfaceC36030r0 = null;
        }
        C0 c02 = this.f236611s0;
        if (c02 == null) {
            c02 = null;
        }
        interfaceC36030r0.f(parametersTree, c02.f231873k0);
        InterfaceC36030r0 interfaceC36030r02 = this.f236614v0;
        if (interfaceC36030r02 == null) {
            interfaceC36030r02 = null;
        }
        com.jakewharton.rxrelay3.b f319331j = interfaceC36030r02.getF319331j();
        com.avito.android.publish.input_vin.mvi.mvi.p pVar = this.f236616x0;
        f319331j.accept((pVar != null ? pVar : null).a(parametersTree));
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) throws Resources.NotFoundException {
        Hf0.b bVar = new Hf0.b(view);
        Q1 q12 = this.f236617y0;
        if (q12 == null) {
            q12 = null;
        }
        if (!q12.B().invoke().booleanValue()) {
            int iJ2 = C35835l0.j(R.attr.buttonPrimaryLarge, requireContext());
            Theme.Companion companion = Theme.INSTANCE;
            C0 c02 = this.f236611s0;
            bVar.c(iJ2, companion.isAvitoRe23((c02 != null ? c02 : null).ve()));
        }
        bVar.d(getString(R.string.continue_string));
        bVar.b(new a());
    }

    @Override // Id0.c
    public final void g2() {
    }
}
